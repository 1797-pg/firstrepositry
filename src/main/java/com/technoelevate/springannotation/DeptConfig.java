package com.technoelevate.springannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.technoelevate.dto.DepartmentBean;

@Configuration
public class DeptConfig {

	@Bean(name="dev")
	public DepartmentBean getDeptDev() {
		DepartmentBean dept=new DepartmentBean();
		dept.setDid(100);
		dept.setDname("developer");
		return dept;
	}
	@Bean(name="test")
	public DepartmentBean getDeptTest() {
		DepartmentBean dept=new DepartmentBean();
		dept.setDid(200);
		dept.setDname("Testing");
		return dept;
	}
	@Bean(name="hr")
	public DepartmentBean getDeptHr() {
		DepartmentBean dept=new DepartmentBean();
		dept.setDid(300);
		dept.setDname("hr");
		return dept;
	}
}
