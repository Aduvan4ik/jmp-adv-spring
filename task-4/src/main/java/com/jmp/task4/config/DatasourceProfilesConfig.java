package com.jmp.task4.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
public class DatasourceProfilesConfig {

    @Bean(name = "devDS")
    @ConfigurationProperties(prefix = "datasource.dev")
    @Profile("DEV")
    public DataSource h2DevDatasource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "qaDS")
    @ConfigurationProperties(prefix = "datasource.qa")
    @Profile("QA")
    public DataSource h2QaDatasource() {
        return DataSourceBuilder.create().build();
    }
}
