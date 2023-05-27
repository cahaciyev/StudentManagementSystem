package com.studentmanagementsys.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;

@Configuration
public class DBConfig {

    @Value("${spring.datasource.url}")
    static String URL;
    @Value("${spring.datasource.name}")
    static String userName;
    @Value("${spring.datasource.password}")
    static String password;

    public DataSource DBConnection() {
        return new DriverManagerDataSource(URL, userName, password);
    }
}
