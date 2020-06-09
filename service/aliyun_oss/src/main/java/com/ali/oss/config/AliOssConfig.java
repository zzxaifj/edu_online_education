package com.ali.oss.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @description:
 * @author: zzx
 * @createDate: 2020/6/8
 * @version: 1.0
 */
@Configuration
@ComponentScan(basePackages = {"com.ali.oss"})
@EnableSwagger2
public class AliOssConfig {
}
