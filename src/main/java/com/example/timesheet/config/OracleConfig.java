package com.example.timesheet.config;

import oracle.jdbc.pool.OracleDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@Profile("oracle")
public class OracleConfig {
    @Bean
    public DataSource dataSource() throws SQLException {
        OracleDataSource dataSource = new OracleDataSource();
        dataSource.setUser("xxx");
        dataSource.setPassword("xxxx");
        dataSource.setURL("jdbc:oracle:thin:@//localhost/db");
        dataSource.setFastConnectionFailoverEnabled(true);
        dataSource.setImplicitCachingEnabled(true);
        dataSource.setConnectionCachingEnabled(true);
        return dataSource;
    }
}
