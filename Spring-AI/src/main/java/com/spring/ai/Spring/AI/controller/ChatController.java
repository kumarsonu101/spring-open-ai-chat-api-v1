package com.spring.ai.Spring.AI.controller;

import org.springframework.ai.chat.ChatResponse;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.spring.ai.Spring.AI.ChatOptions.ChatOptionsRequest;
import com.spring.ai.Spring.AI.client.Client;

@RestController
public class ChatController {

    @Autowired
    Client client;

    @Autowired
    ChatOptionsRequest chatOptionsRequest;

    @GetMapping("/v1/chat/completions")
    public ChatResponse getPromtResponse(@RequestParam("message") String message) {
        OpenAiChatOptions requestBody = chatOptionsRequest.getRequestBody();
               return client.getChatResponse(message,requestBody);
    }
    
}
