package com.jzx.nanjing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jzx.**.dao")
public class NanjingApplication {

    public static void main(String[] args) {
        SpringApplication.run(NanjingApplication.class, args);
    }

}
