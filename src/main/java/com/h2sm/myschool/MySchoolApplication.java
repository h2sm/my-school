package com.h2sm.myschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class MySchoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySchoolApplication.class, args);
    }

}
