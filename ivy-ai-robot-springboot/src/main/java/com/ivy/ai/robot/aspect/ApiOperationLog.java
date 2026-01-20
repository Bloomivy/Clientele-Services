package com.ivy.ai.robot.aspect;

import java.lang.annotation.*;


/**
 * @Author: Ivy
 * @Date: 2026/1/18 22:15
 * @Version 1.00
 * @Description
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface ApiOperationLog {
    /**
     * API 功能描述
     *
     * @return
     */
    String description() default "";

}


