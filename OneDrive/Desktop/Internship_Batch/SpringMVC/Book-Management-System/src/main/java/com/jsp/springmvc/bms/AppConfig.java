package com.jsp.springmvc.bms;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = {"com.jsp.springmvc.bms"})
@EnableWebMvc
public class AppConfig  implements WebMvcConfigurer{

	public void configureViewResolvers(ViewResolverRegistry registry) {
		InternalResourceViewResolver resolver=new  InternalResourceViewResolver("/WEb-INF/views",".jsp");
		registry.viewResolver(resolver);
	}
	
	@Bean
	EntityManagerFactory factory() {
		return Persistence.createEntityManagerFactory("mysql-config");
	}
	
}
