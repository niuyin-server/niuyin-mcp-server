package com.niuyin.mcp.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

/**
 * VideoService
 *
 * @AUTHOR: roydon
 * @DATE: 2025/4/11
 **/
@Service
public class VideoService {

    @Tool(description = "根据视频id获取视频信息")
    public String getVideoInfo(String videoId) {
        return "视频信息";
    }

}
