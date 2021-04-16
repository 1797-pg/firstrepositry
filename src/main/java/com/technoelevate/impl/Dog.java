package com.technoelevate.impl;

import com.technoelevate.interfaces.Animal;

public class Dog implements Animal{

	@Override
	public void speak() {
		System.out.println("bow bow");
		
	}

	@Override
	public void eat() {
		System.out.println("Dog eats meat");
		
	}

}
