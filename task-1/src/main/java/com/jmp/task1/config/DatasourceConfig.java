package com.jmp.task1.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfig {

    @Bean(name = "defaultDS")
    @ConfigurationProperties(prefix = "datasource.default")
    public DataSource h2Datasource() {
        return DataSourceBuilder.create().build();
    }
}
