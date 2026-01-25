package com.ivy.ai.robot.event;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @Author: Ivy
 * @Date: 2026/1/25 19:41
 * @Version 1.00
 * @Description：客服文档上传事件
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AiCustomerServiceMdUploadedEvent {

    /**
     * 存储路径
     */
    private String filePath;

    /**
     * t_ai_customer_service_md_storage 表记录主键 ID
     */
    private Long id;

    /**
     * 元数据
     */
    private Map<String, Object> metadatas;
}
