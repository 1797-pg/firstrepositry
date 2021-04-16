package com.technoelevate.phases;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.technoelevate.dto.MsgBean;
import com.technoelevate.initphase.MyBeanFactory;
import com.technoelevate.initphase.MyBeanPP;

@Configuration
public class Message {

	@Bean(name="msgBean")
	public MsgBean getMsg() {
		MsgBean bean=new MsgBean();
		bean.setMsg("Msg created");
		return bean;
	}
	@Bean
	public MyBeanFactory getBFPP() {
		return new MyBeanFactory();
	}
	@Bean
	public MyBeanPP getBPP() {
		return new MyBeanPP();
	}
}
