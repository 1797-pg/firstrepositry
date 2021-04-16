package com.technoelevate.dto;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.Data;

@Data
public class MsgBean {

	
	
	private String msg;
	
	public MsgBean() {
		System.out.println("insta phase");
	}
	@PostConstruct
	public void init() {
		System.out.println("init phase");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy phase");
	}
}
