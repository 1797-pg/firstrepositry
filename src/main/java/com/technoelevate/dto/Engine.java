package com.technoelevate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Engine {
	 public Engine() {}

	private int cc;
	
	private String engineType;
}
