package com.niuyin.mcp.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * CategoryService
 *
 * @AUTHOR: roydon
 * @DATE: 2025/4/11
 **/
@Service
public class CategoryService {

    @Tool(description = "获取所有分类")
    public List<String> getAllCategories() {
        return List.of("Java", "Python", "C++", "JavaScript", "Ruby", "Swift", "Kotlin", "Go", "Rust", "PHP");
    }
}
