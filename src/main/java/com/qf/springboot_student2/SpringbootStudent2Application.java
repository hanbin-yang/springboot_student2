package com.qf.springboot_student2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
@MapperScan("com.qf.mapper")
public class SpringbootStudent2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudent2Application.class, args);
    }
}
