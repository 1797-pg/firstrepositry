package com.technoelevate.phases;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.technoelevate.dto.MsgBean;

public class MsgTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Message.class);
		MsgBean bean=context.getBean(MsgBean.class);
		System.out.println(bean.getMsg());
		((AbstractApplicationContext)context).close();
	}
}
