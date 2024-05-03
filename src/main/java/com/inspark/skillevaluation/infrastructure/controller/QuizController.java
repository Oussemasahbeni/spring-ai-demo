package com.inspark.skillevaluation.infrastructure.controller;

import com.inspark.skillevaluation.dto.response.OutputDto;
import com.inspark.skillevaluation.dto.response.RequestBodyDto;
import org.springframework.ai.chat.ChatClient;
import org.springframework.ai.chat.Generation;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.parser.BeanOutputParser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class QuizController {

    private final ChatClient chatClient;

    @Value("classpath:/prompts/quiz-prompt.st")
    private Resource quizPrompt;

    public QuizController(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @GetMapping("/ai/generate-question")
    public OutputDto promptGeneration(
            @RequestParam(value = "skill", defaultValue = "Angular") String skill,
            @RequestParam(value = "numberOfQuestions", defaultValue = "5") int numberOfQuestions,
            @RequestBody RequestBodyDto requestBodyDto){
        var outputParser = new BeanOutputParser<>(OutputDto.class);
        PromptTemplate promptTemplate = new PromptTemplate(quizPrompt, Map.of(
                "skill", skill,
                "numberOfQuestions", numberOfQuestions,
                "educations", requestBodyDto.educations(),
                "experiences", requestBodyDto.experiences(),
                "projects", requestBodyDto.projects()
        ));
        Prompt prompt = promptTemplate.create();
        Generation generation = chatClient.call(prompt).getResult();
        String content = generation.getOutput().getContent();
        OutputDto outputDto = outputParser.parse(content);
        return outputParser.parse(generation.getOutput().getContent());
    }

    @GetMapping("/ai/generate")
    public Map<String, String> generation(
            @RequestParam(
                    value = "message",
                    defaultValue = "Give me the content of this website: https://github.com/Ebazhanov/linkedin-skill-assessments-quizzes/blob/main/spring-framework/spring-framework-quiz.md") String message) {
        return Map.of("generation", chatClient.call(message));
    }
}