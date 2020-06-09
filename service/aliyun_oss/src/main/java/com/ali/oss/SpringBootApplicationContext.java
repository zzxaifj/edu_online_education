package com.ali.oss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description:
 * @author: zzx
 * @createDate: 2020/6/8
 * @version: 1.0
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringBootApplicationContext {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationContext.class, args);
    }
}
