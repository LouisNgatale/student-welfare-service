package com.louisngatale.studentwelfareservice.DBConfigurations;

import com.louisngatale.studentwelfareservice.entities.Welfare.Suggestions;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "com.louisngatale.studentwelfareservice.repositories.Welfare",
        entityManagerFactoryRef = "welfareEntityManagerFactory",
        transactionManagerRef = "welfareTransactionManager"
)
public class WelfareDBConfig {
    //    Datasource methods
    @Bean
    @Primary
    @ConfigurationProperties("app.datasource.welfare")
    public DataSourceProperties welfareDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    @ConfigurationProperties("app.datasource.welfare.configuration")
    public DataSource welfareDataSource() {
        return welfareDataSourceProperties().initializeDataSourceBuilder()
                .type(HikariDataSource.class).build();
    }

    //    LocalContainerEntityManagerFactoryBean
    @Primary
    @Bean(name = "welfareEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean welfareEntityManagerFactory(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(welfareDataSource())
                .packages(Suggestions.class)
                .build();
    }

    //    PlatformTransactionManager
    @Primary
    @Bean
    public PlatformTransactionManager welfareTransactionManager(
            final @Qualifier("welfareEntityManagerFactory") LocalContainerEntityManagerFactoryBean welfareEntityManagerFactory) {
        return new JpaTransactionManager(welfareEntityManagerFactory.getObject());
    }

}

