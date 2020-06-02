package com.edu.eduservice.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: zzx
 * @createDate: 2020/6/1
 * @version: 1.0
 */
@Configuration
@ComponentScan(basePackages = {"com.edu.eduservice","com.edu.servicebase"})
@MapperScan(basePackages = {"com.edu.eduservice.mapper"})
public class myConfig {

    /**
     * 逻辑删除插件
     */
    @Bean
    public ISqlInjector sqlInjector() {
        return new LogicSqlInjector();
    }

}
