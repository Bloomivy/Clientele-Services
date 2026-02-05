package com.ivy.ai.robot.model.vo.chat;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Ivy
 * @Date: 2026/2/5 21:49
 * @Version 1.00
 * @Description：文件检查
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CheckFileReqVO {

    @NotBlank(message = "文件 MD5 不能为空")
    private String fileMd5;

}