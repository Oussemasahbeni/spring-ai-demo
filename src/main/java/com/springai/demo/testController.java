package com.springai.demo;

import org.springframework.ai.chat.ChatClient;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ai")
public class testController {
    private final ChatClient aiClient;

    public testController(ChatClient aiClient) {
        this.aiClient = aiClient;
    }

    @GetMapping("/booker/{year}")
    public String getBookerPrize(@PathVariable("year") int year) {
        String prompt = "Which book won the Booker Prize in {year}?";
        PromptTemplate template = new PromptTemplate(prompt);
        template.add("year", year);
        return aiClient.call(template.render());
    }
}
