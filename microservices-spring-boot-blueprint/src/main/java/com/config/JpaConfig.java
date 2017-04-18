package com.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = "com.hello.repository")
@EntityScan(basePackages="com.hello.entity")
@EnableTransactionManagement
public class JpaConfig {


    // No body needed, yet
    private static final String POOL_NAME = "backendSpringHikariCP";
    @Value("${spring.database.driverClassName}")
    private String driverClassName;
    @Value("${spring.datasource.url}")
    private String jdbcUrl;
    @Value("${spring.datasource.username}")
    private String jdbcUsername;
    @Value("${spring.datasource.password}")
    private String jdbcPassword;
    @Value("${hikari.maxPoolSize}")
    private int maxPoolSize;
    @Value("${hikari.minPoolSizeIdle}")
    private int minPoolSizeIdle;

    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName(driverClassName);
        hikariConfig.setJdbcUrl(jdbcUrl);
        hikariConfig.setUsername(jdbcUsername);
        hikariConfig.setPassword(jdbcPassword);

        hikariConfig.setMaximumPoolSize(maxPoolSize);
        hikariConfig.setMinimumIdle(minPoolSizeIdle);
        hikariConfig.setPoolName(POOL_NAME);

        return new HikariDataSource(hikariConfig);
    }

}
