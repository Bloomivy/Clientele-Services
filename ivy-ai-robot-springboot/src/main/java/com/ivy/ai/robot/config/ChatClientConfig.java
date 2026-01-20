package com.ivy.ai.robot.config;

import jakarta.annotation.Resource;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Author: Ivy
 * @Date: 2025/5/28 20:03
 * @Version 1.00
 * @Description
 */
@Configuration
public class ChatClientConfig {

    @Resource
    private ChatMemory chatMemory;
    
    /**
    * @Description: 初始化ChatClient客户端
    * @Param: [deepSeekChatModel]
    * @return: org.springframework.ai.chat.client.ChatClient
    * @Author: Ivy
    * @Date: 2025/5/28
    */
    @Bean
    public ChatClient chatClient(OpenAiChatModel chatModel) {
        return ChatClient.builder(chatModel)
                .build();
    }

}
