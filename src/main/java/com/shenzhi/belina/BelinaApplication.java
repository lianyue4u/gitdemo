package com.shenzhi.belina;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shenzhi.belina.mapper")
public class BelinaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BelinaApplication.class, args);
    }

}
