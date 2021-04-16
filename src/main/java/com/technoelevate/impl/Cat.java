package com.technoelevate.impl;

import com.technoelevate.interfaces.Animal;

public class Cat implements Animal{

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("meow meow");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("milk");
	}

}
