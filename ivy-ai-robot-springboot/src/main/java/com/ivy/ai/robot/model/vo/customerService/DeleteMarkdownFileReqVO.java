package com.ivy.ai.robot.model.vo.customerService;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Ivy
 * @Date: 2026/1/25 20:14
 * @Version 1.00
 * @Description：删除markdown问答文件
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteMarkdownFileReqVO {

    @NotNull(message = "问答文件 ID 不能为空")
    private Long id;

}
