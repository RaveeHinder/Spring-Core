package com.learn.spring.commonPackages;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.learn.spring.commonPackages")
@PropertySource("classpath:app.properties")
public class Config {
	
	@Bean
	public Principal principal() {
		return new Principal();
	}

	@Bean(name={"psg", "esec"})
	public College collegeBean() {
		return new College(principal());
	}
	
	public College collegeBeanDefaultMethodName() {
		return new College(principal());
	}
	
}
