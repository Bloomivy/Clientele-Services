package com.ivy.ai.robot.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import com.ivy.ai.robot.model.dto.SearchResultDTO;

/**
 * @Author: Ivy
 * @Date: 2026/1/19 21:28
 * @Version 1.00
 * @Description
 */
public interface SearchResultContentFetcherService {


    /**
     * 并发批量获取搜索结果页面的内容
     *
     * @param searchResults
     * @param timeout
     * @param unit
     * @return
     */
    CompletableFuture<List<SearchResultDTO>> batchFetch(List<SearchResultDTO> searchResults,
                                                        long timeout,
                                                        TimeUnit unit);
}
