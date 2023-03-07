package com.jmp.task2.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ConditionalOnMissingBean(DataSource.class)
public class DatasourceCustomConfig {

    @Bean(name = "customDS")
    @ConfigurationProperties(prefix = "datasource.custom")
    public DataSource h2Datasource() {
        return DataSourceBuilder.create().build();
    }
}
