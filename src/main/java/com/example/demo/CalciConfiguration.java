package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.calcientity.CalciEntity;

@Configuration
public class CalciConfiguration 
{
	
	@Bean
	public CalciEntity method()
	{
		return new CalciEntity();
	}
	

}
