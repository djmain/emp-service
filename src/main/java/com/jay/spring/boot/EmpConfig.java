package com.jay.spring.boot;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * created by Jay on 2019/7/8
 */
@Configuration
public class EmpConfig
{
    @Bean
    public EmpService empService()
    {
        return new EmpService();
    }
}
