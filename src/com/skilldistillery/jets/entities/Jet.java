package com.skilldistillery.jets.entities;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Jet {
	private String model = "";
	private double speed = 0;
	private int range = 0;
	private long price = 0;

	ArrayList<Jet> planesInAirfield;

	public Jet(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public double getSpeed() {
		return speed;
	}

	public int getRange() {
		return range;
	}

	public long getPrice() {
		return price;
	}

	public double getSpeedInMach() {
		return range / 767.269;
	}

	public double getRangeHours() {
		return range / speed;
	}

	@Override
	public int hashCode() {
		return Objects.hash(model, planesInAirfield, price, range, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		return Objects.equals(model, other.model) && Objects.equals(planesInAirfield, other.planesInAirfield)
				&& price == other.price && range == other.range
				&& Double.doubleToLongBits(speed) == Double.doubleToLongBits(other.speed);
	}

	@Override
	public String toString() {
		return " " + model + ", which flies at " + speed + " MPH, has a range of " + range + "\nmiles and costs $"
				+ price + ".";
	}

}
