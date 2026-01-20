package com.ivy.ai.robot.service;

import com.ivy.ai.robot.model.dto.SearchResultDTO;

import java.util.List;

/**
 * @Author: Ivy
 * @Date: 2026/1/19 21:27
 * @Version 1.00
 * @Description
 */
public interface SearXNGService {

    /**
     * 调用 SearXNG Api, 获取搜索列表
     * @param query 搜索关键词
     * @return
     */
    List<SearchResultDTO> search(String query);
}