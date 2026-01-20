package com.ivy.ai.robot.model.vo.chat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @Author: Ivy
 * @Date: 2026/1/20 20:27
 * @Version 1.00
 * @Description：对话重命名
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RenameChatReqVO {

    @NotNull(message = "对话 ID 不能为空")
    private Long id;

    @NotBlank(message = "对话摘要不能为空")
    private String summary;

}
