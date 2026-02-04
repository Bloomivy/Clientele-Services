package com.ivy.ai.robot.model.vo.customerService;

import com.ivy.ai.robot.model.common.BasePageQuery;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;


/**
 * @Author: Ivy
 * @Date: 2026/1/25 20:24
 * @Version 1.00
 * @Description：查询问答文件markdown列表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindMarkdownFilePageListReqVO extends BasePageQuery {

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 起始日期
     */
    private LocalDate startDate;

    /**
     * 结束日期
     */
    private LocalDate endDate;
}
