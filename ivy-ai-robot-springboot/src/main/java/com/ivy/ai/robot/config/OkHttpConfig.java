package com.ivy.ai.robot.config;

import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * @Author: Ivy
 * @Date: 2026/1/19 21:24
 * @Version 1.00
 * @Description：OkHttp 客户端配置类
 */
@Configuration
public class OkHttpConfig {

    @Bean
    public OkHttpClient okHttpClient(
            @Value("${okhttp.connect-timeout}") int connectTimeout,
            @Value("${okhttp.read-timeout}") int readTimeout,
            @Value("${okhttp.write-timeout}") int writeTimeout,
            @Value("${okhttp.max-idle-connections}") int maxIdleConnections,
            @Value("${okhttp.keep-alive-duration}") int keepAliveDuration) {


        return new OkHttpClient.Builder()
                .connectTimeout(connectTimeout, TimeUnit.MILLISECONDS)
                .readTimeout(readTimeout, TimeUnit.MILLISECONDS)
                .writeTimeout(writeTimeout, TimeUnit.MILLISECONDS)
                .connectionPool(new ConnectionPool(maxIdleConnections, keepAliveDuration, TimeUnit.MINUTES))
                .build();
    }

}

