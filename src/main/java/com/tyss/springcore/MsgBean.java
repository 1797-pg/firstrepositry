package com.tyss.springcore;

import java.io.Serializable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Data;

@Data
public class MsgBean implements Serializable,InitializingBean,DisposableBean{

	public MsgBean() {
		System.out.println("insta phase");
	}
	String msg;
	@Override
	public void destroy() throws Exception {
		System.out.println("inside destroy phase");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("inside init phase");
		
	}
	
	
}
