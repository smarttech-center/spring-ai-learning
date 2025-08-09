package com.example.springaichatclient.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ChatController {


    @Autowired
    private ChatModel chatModel;


    @PostMapping("/chat")
    public String generate(@RequestBody String userMessage) {
        return ChatClient.builder(chatModel)
                .build()
                .prompt()
                .user(userMessage)
                .call()
                .content();
    }

    @PostMapping("/system-chat")
    public String systemChat(@RequestBody String userInput) {
        return ChatClient.builder(chatModel)
                .defaultSystem("你是一个有帮助的AI助手")
                .build()
                .prompt()
                .system("You are a helpful AI assistant")
                .user(userInput)
                .call()
                .content();
    }

//    // Example with function calling (requires additional setup)
//    @PostMapping("/function-chat")
//    public String functionChat(@RequestBody String userInput) {
//        return functionChatClient.prompt() // 使用预配置的函数客户端
//                .user(userInput)
//                .call()
//                .content();
//    }
}
