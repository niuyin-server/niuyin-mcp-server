package com.niuyin.mcp;

import com.niuyin.mcp.service.CategoryService;
import com.niuyin.mcp.service.VideoService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * McpServerApplication
 *
 * @AUTHOR: roydon
 * @DATE: 2025/4/11
 **/
@SpringBootApplication
public class McpServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(McpServerApplication.class, args);
    }

    /**
     * 创建一个工具回调提供者
     *
     * @param categoryService
     * @return
     */
    @Bean
    public ToolCallbackProvider toolCallbackProvider(CategoryService categoryService,
                                                     VideoService videoService) {
        return MethodToolCallbackProvider.builder()
                .toolObjects(categoryService, videoService)
                .build();
    }

}
