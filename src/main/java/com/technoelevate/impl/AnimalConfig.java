package com.technoelevate.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration

public class AnimalConfig {

	@Bean
	@Primary
	public Cat getCat() {
		return new Cat();
	}
	
	public Dog getDog() {
		return new Dog();
	}
	
}
