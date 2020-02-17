package com.zb.src;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication()
@EnableEurekaClient
@MapperScan("com.zb.src.dao")
public class SrcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SrcApplication.class, args);
    }

}
