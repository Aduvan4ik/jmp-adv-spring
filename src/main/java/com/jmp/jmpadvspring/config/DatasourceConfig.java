package com.jmp.jmpadvspring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
@Profile({"!customDS & !DEV & !QA"})
public class DatasourceConfig {

    @Bean(name = "defaultDS")
    @ConfigurationProperties(prefix = "datasource.default")
    public DataSource h2Datasource() {
        return DataSourceBuilder.create().build();
    }
}
