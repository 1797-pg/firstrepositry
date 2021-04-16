package com.technoelevate.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.technoelevate.interfaces.Pet;

@Configuration
public class PetConfig {

	@Bean
	@Primary
	public Pet getPet() {
		Pet pet=new Pet();
		pet.setName("charlie");
//		pet.setAnimal(animal);
		return pet;
	}
}
