package com.ivy.ai.robot.model.vo.chat;

import com.ivy.ai.robot.model.common.BasePageQuery;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @Author: Ivy
 * @Date: 2026/1/20 20:02
 * @Version 1.00
 * @Description：查询对话历史信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindChatHistoryMessagePageListReqVO extends BasePageQuery {

    @NotBlank(message = "对话 ID 不能为空")
    private String chatId;
}
