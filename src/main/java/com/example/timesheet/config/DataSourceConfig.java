package com.example.timesheet.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

//@Configuration
//@EnableTransactionManagement
public class DataSourceConfig {

//    @Autowired
//    private AppProperties appProperties;
//
//    @Value("${application.secret-key}")
//    private String secretKey;
//    @Value("${spring.profiles.active}")
//    private String env;
//
//    @Bean(name = "tsDataSouurce")
//    public DataSource getDataSource(){
//        DriverManagerDataSource dataSource = new DriverManagerDataSource(appProperties.getDataSource().getUrl());
//        dataSource.setDriverClassName(appProperties.getDataSource().getDriverClassName());
//        dataSource.setUsername(appProperties.getDataSource().getUsername());
//        if(!"local".equals(env) && !"dev".equals(env)){
//            dataSource.setPassword(null);
//        } else {
//            dataSource.setPassword(appProperties.getDataSource().getPassword());
//        }
//        dataSource.setUrl(appProperties.getDataSource().getUrl());
//        return dataSource;
//    }
}
