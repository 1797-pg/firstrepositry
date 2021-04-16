package com.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("allinfoconfig.xml");
      Employee employee=(Employee) context.getBean("emp");
      System.out.println(employee.getId());
      System.out.println(employee.getName());
      System.out.println(employee.getDept().getDid());
      System.out.println(employee.getDept().getDname());
    }
}
