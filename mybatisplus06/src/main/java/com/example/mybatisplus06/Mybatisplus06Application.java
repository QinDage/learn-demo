package com.example.mybatisplus06;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//扫描mapper接口所在包
@MapperScan("com.example.mybatisplus06.mapper")
public class Mybatisplus06Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatisplus06Application.class, args);
    }

}
