package com.bloc.interfaces.people;

/************************************************
 *	ASSIGNMENT:
 *	Have John implement the Driver interface
/************************************************/

import com.bloc.interfaces.people.hobbies.Driver;

public class John extends Person implements Driver {
	public John() {
		super("Paul", "Walker", "Male", 1.7d, 69d, "Brown");
	}
	
	@Override
	public void getInCar() {
		
	}
	
	@Override
	public void startEngine() {
		
	}
	
	@Override
	public void driveFast() {
		
	}
}