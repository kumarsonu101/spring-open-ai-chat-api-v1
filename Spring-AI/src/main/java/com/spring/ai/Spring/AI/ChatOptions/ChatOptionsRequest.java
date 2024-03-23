package com.spring.ai.Spring.AI.chatOptions;

import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ChatOptionsRequest {


   //Use below uri to test direct call to gpt api not in local
   @Value("${spring.ai.openai.uri}")
    private String apiUrl;

    public OpenAiChatOptions getRequestBody() {
       return new OpenAiChatOptions.Builder()
        .withModel("gpt-3.5-turbo")
        .withTemperature(1f)
        .withMaxTokens(255)
        .withTopP(1f)
        .withFrequencyPenalty(0f)
        .withPresencePenalty(0f)
        .build();
    }
}
