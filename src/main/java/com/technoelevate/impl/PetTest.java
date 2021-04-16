package com.technoelevate.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.technoelevate.interfaces.Pet;

public class PetTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AllConfig.class);
				Pet pet=context.getBean(Pet.class);
		       
		       System.out.println(pet.getName()); 
		       pet.getAnimal().eat();
		       pet.getAnimal().speak();
			
	}
}
