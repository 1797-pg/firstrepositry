package com.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MsgTest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("phases.xml");
		((AbstractApplicationContext) context).close();//don't put it here
		
		MsgBean m1=(MsgBean)context.getBean("msg");
	    System.out.println(m1.getMsg());
	    
	    
	    //((ConfigurableApplicationContext)context).registerShutdownHook();
	    
	}
	
}
