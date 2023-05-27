package com.studentmanagementsys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class StudentManagementSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSysApplication.class, args);
    }

}
