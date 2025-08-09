package com.example.springaichatclient.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.openai.api.OpenAiApi;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class ChatConfig {

    @Bean
    public ChatClient chatClient(ChatModel chatModel) {
        return ChatClient.builder(chatModel)
                .defaultSystem("你是一个有帮助的AI助手")
                .build();
    }

    // 配置 ChatModel Bean（示例使用 OpenAI）
//    @Bean
//    public ChatModel chatModel() {
//        OpenAiApi api = new OpenAiApi("https://api.deepseek.com/v1","sk-79ecf29fe42343919ee1be793c11b119");
//        return new OpenAiChatModel(api);
//    }
}
