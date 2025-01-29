package com.example.Repository;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.example.Service.AddDetails;
import com.example.Service.Applicant;

@Configuration
public class JavaConfig {

    // Define Applicant bean
    @Bean
    @Scope("prototype")
    public Applicant applicant() {
        return new Applicant();
    }

    // AddDetails bean, inject dependencies through constructor
    @Bean
    @Scope("prototype")
    public AddDetails addDetails() {
        AddDetails add = new AddDetails();
        add.setApplicant(applicant());
        add.setJdbc(jdbcClass());
        return add;
    }

    // DataSource bean
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost/m2302");
        dataSource.setUsername("postgres");
        dataSource.setPassword("google.com12345");
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    @Bean
    public JDBC jdbcClass(){
        JDBC jdbcClass = new JDBC();
        jdbcClass.setJdbc(jdbcTemplate());
        return jdbcClass;
    }

}
