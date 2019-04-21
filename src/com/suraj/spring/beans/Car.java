package com.suraj.spring.beans;

public class Car implements Vehicle {

	@Override
	public void journey() {
		System.out.println("journey is going by car...");
	}
}
