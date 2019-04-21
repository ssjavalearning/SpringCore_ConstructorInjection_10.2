package com.suraj.spring.beans;

public class Traveler {
	
	private Vehicle vehicle;

	public Traveler(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}
	
	public void go() {
		vehicle.journey();
	}

}
