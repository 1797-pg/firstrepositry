package com.technoelevate.dto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EngineConfig {

	@Bean
	public Engine getEngine() {
		Engine engine=new Engine(2000,"Diesel");
//		engine.setCc(2000);
//		engine.setEngineType("Diesel");
		return engine;
	}
}
