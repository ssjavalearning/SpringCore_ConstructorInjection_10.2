package com.suraj.spring.beans;

public class Bus implements Vehicle {

	@Override
	public void journey() {
		System.out.println("journey is going by bus....");
	}
}
