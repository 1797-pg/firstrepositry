package com.technoelevate.springannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import com.technoelevate.dto.DepartmentBean;
import com.technoelevate.dto.EmployeeBean;

@Import({DeptConfig.class})
@Configuration
public class EmpConfig {

	@Bean(name="two")
	public EmployeeBean getEmp() {
		EmployeeBean bean=new EmployeeBean();
		bean.setId(10);
		bean.setName("manja");
//		bean.setDept(new DepartmentBean());
		return bean;
	}
	@Bean(name="one")
	@Primary
	public EmployeeBean getEmpDiff() {
		EmployeeBean bean=new EmployeeBean();
		bean.setId(20);
		bean.setName("ranjha");
//		bean.setDept(new DepartmentBean());
		return bean;
	}
	
	
}
