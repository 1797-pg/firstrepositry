package com.te.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.technoelevate.dto.Car;

public class MainTest {

	public static void main(String[] args) {
	 ApplicationContext context=new ClassPathXmlApplicationContext("car.xml");	
	 
	 Car car=(Car)context.getBean("car");
	 System.out.println(car.getBrand());
	 
	 System.out.println(car.getModel());
	 System.out.println(car.getEngine().getCc());
	 System.out.println(car.getEngine().getEngineType());
	 
	}
}
