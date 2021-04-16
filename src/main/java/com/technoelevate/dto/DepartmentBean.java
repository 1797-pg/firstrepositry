package com.technoelevate.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DepartmentBean implements Serializable {
	
	public DepartmentBean() {
		
	}

	private int did;
	
	private String dname;
	
}
