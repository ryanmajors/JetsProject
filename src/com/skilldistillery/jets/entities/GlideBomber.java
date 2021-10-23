package com.skilldistillery.jets.entities;

// class to allow jet creation
public class GlideBomber extends Jet implements GlideMode {

	public GlideBomber(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void glide() {

	}

}
