package com.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
//@EnableConfigurationProperties
@EntityScan(basePackages = {"com.app.entity"}) 
@SpringBootApplication(scanBasePackages="com.app")
public class Application {
	//@ComponentScan({"com.app.service","com.app.repository","com.app.entity"})

	@Autowired
    private ApplicationContext appContext;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	public void run(String... args) throws Exception {

	        String[] beans = appContext.getBeanDefinitionNames();
	        Arrays.sort(beans);
	        for (String bean : beans) {
	            System.out.println("bean name"+bean);
	        }
 
	    }

}
