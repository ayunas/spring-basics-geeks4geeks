package com.geeks4geeks.springbasics;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
@Scope("singleton")
public class Config {

	@Bean
	public Hello getHello() {
		System.out.println("in method getHello()");
		Hello h = new Hello();
		System.out.println(h);
		return new Hello();
	}

}

