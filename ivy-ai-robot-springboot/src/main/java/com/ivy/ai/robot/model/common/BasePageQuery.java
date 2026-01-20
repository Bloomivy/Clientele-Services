package com.ivy.ai.robot.model.common;

import lombok.Data;

/**
 * @Author: Ivy
 * @Date: 2026/1/20 20:01
 * @Version 1.00
 * @Description
 */
@Data
public class BasePageQuery {
    /**
     * 当前页码, 默认第一页
     */
    private Long current = 1L;
    /**
     * 每页展示的数据数量，默认每页展示 10 条数据
     */
    private Long size = 10L;
}
