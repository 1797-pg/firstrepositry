package com.technoelevate.springannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.technoelevate.dto.EmployeeBean;

@Configuration
public class EmployeeConfig {

	@Bean
	@Primary
	public EmployeeBean getEmployee() {
		return new EmployeeBean();
	}
	
//	@Bean
//	//@Primary
//	public EmployeeBean getEmp() {
//		EmployeeBean bean=new EmployeeBean(20,"jack");
//		return bean;
//	}
	@Bean(name="one")
	public EmployeeBean getEmployeeBean() {
		EmployeeBean bean=new EmployeeBean();
		bean.setId(30);
		bean.setName("john");
		return bean;
		
	}
	
}
