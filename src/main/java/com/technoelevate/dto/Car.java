package com.technoelevate.dto;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
	
	public Car() {}

	private String brand;
	
	private String model;
	
	@Autowired(required=false)
	private Engine engine;
}
