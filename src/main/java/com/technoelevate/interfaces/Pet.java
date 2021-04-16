package com.technoelevate.interfaces;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pet {
	
	public Pet() {
		
	}

	private String name;
	
	@Autowired
	private Animal animal;
}
