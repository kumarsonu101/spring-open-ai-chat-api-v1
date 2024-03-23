package com.spring.ai.Spring.AI.client;

import org.springframework.ai.chat.ChatClient;
import org.springframework.ai.chat.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  
public class Client {


    @Autowired
    ChatClient chatClient;

    public ChatResponse getChatResponse (String message, OpenAiChatOptions options) {
         return chatClient.call(
                    new Prompt(
                        message,
                        options
                    )
                );
    }
    
}
