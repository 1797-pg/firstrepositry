package com.technoelevate.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.technoelevate.dto.EmployeeBean;

public class EmployeeTest {

	public static void main(String[] args) {
//		ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		ApplicationContext context=new AnnotationConfigApplicationContext(EmpConfig.class);
//		EmployeeBean bean=context.getBean(EmployeeBean.class);
//		System.out.println(bean);
//		bean.setId(10);
//		bean.setName("ram");
//		System.out.println(bean);
//		EmployeeBean bean=context.getBean("one",EmployeeBean.class);
//		System.out.println(bean);
//		EmployeeBean bean1=context.getBean(EmployeeBean.class);
//		System.out.println(bean1);
		EmployeeBean bean1=context.getBean("one",EmployeeBean.class);
		EmployeeBean bean2=context.getBean("two",EmployeeBean.class);
//		System.out.println(bean1);
		System.out.println(bean1.getId());
		System.out.println(bean1.getName());
		System.out.println(bean1.getDept().getDid());
		System.out.println(bean1.getDept().getDname());
		
		System.out.println(bean2.getId());
		System.out.println(bean2.getName());
		System.out.println(bean2.getDept().getDid());
		System.out.println(bean2.getDept().getDname());
		
	}
}
