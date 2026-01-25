package com.ivy.ai.robot.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: Ivy
 * @Date: 2026/1/25 19:19
 * @Version 1.00
 * @Description：客服 markdown 文档状态
 */
@Getter
@AllArgsConstructor
public enum AiCustomerServiceMdStatusEnum {

    PENDING(0, "待处理"),
    VECTORIZING(1, "向量化中"),
    COMPLETED(2, "已完成"),
    FAILED(3, "失败");

    private Integer code;
    private String description;

    /**
     * 根据 code 获取枚举
     * @param code
     * @return
     */
    public static AiCustomerServiceMdStatusEnum codeOf(Integer code) {
        if (code == null) {
            return null;
        }
        for (AiCustomerServiceMdStatusEnum status : values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }
        return null;
    }

}