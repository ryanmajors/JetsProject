package com.skilldistillery.jets.entities;

public abstract class Jet {
	private String model = "";
	private double speed = 0;
	private int range = 0;
	private long price = 0;
	
	public Jet(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
	public void fly() {
		
	}
	
	public double getSpeedInMach() {
		return speed;
	}

	@Override
	public String toString() {
		return "Jet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}
	
	
}
