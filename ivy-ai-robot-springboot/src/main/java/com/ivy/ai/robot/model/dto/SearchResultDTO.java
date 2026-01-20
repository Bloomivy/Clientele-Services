package com.ivy.ai.robot.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Ivy
 * @Date: 2026/1/19 21:23
 * @Version 1.00
 * @Description
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SearchResultDTO {

    /**
     * 页面访问链接
     */
    private String url;

    /**
     * 相关性评分
     */
    private Double score;

    /**
     * 页面内容
     */
    private String content;
}