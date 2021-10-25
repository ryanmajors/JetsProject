package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void loadCargo() {
		// cargo loading statements
		System.out.println("\nLoading cargo onto the " + getModel() + "...");
		System.out.println("Cargoloading complete for the " + getModel() + ".");
		
	}

	@Override
	public String toString() {
		return "\nCargoPlane -" + super.toString();
	}
	

	
}
