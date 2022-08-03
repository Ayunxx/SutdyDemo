package com.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
* 1、整合mybatis-plus
*   1）、导入依赖
*   2）、配置
*      1、配置数据源
*        1）、导入数据库驱动（依赖）
*        2）、在application.yml配置数据源相关信息
*      2、配置mybatis-plus
*        1）、使用@MapperScan注解指定dao位置
*        2）、配置application.yml指定mapper位置
* */
@MapperScan("com.gulimall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallproductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallproductApplication.class, args);
    }

}
