package com.skilldistillery.jets.entities;

// class to allow jet creation
public class GlideBomber extends Jet {

	public GlideBomber(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public String toString() {
		return "\nGlideBomber -" + super.toString();
	}

}
