package com.nicordesigns.insurance.admin.springconfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.nicordesigns.insurance.admin.service.AgentServiceImpl;
import com.nicordesigns.insurance.admin.service.AgentServiceInterface;


@Configuration
@ComponentScan
public class SpringJDBCConfig {
	
	@Bean
    public AgentServiceInterface agentService(){
    	AgentServiceImpl agentService = new AgentServiceImpl();
        agentService.setJdbcTemplate(jdbcTemplate());
        
        return agentService;
    }
	
	@Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }
	
	@Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
        dataSource.setUrl("jdbc:mariadb://localhost:3306/insurance_admin");
        dataSource.setUsername("root");
        dataSource.setPassword("secret");        
        return dataSource;
    }

}
