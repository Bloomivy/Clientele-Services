package com.ivy.ai.robot.tools;

import jnr.constants.platform.Local;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.tool.annotation.Tool;

import java.time.LocalDateTime;

/**
 * @Author: Ivy
 * @Date: 2026/1/11 13:44
 * @Version 1.00
 * @Description：日期 tool
 */
@Slf4j
public class DateTimeTools {

    @Tool(description = "获取当前日期")
    String currentTimeAndDate() {
        return LocalDateTime.now().toString();
    }
}
