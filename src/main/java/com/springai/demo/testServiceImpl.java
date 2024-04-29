package com.springai.demo;

import org.springframework.ai.chat.ChatClient;
import org.springframework.ai.chat.ChatResponse;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.parser.BeanOutputParser;
import org.springframework.stereotype.Service;

@Service
public class testServiceImpl implements testService{

    private final ChatClient aiClient;

    public testServiceImpl(ChatClient aiClient) {
        this.aiClient = aiClient;
    }

    @Override
    public String getTest() {
        return null;
    }
}
