package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class AirField {
	protected ArrayList<String> planesInAirfield = new ArrayList<>();
	protected int currentJet = 0;

	public AirField(ArrayList<String> planesInAirfield, int currentJet) {
		super();
		this.planesInAirfield = planesInAirfield;
		this.currentJet = currentJet;
	}

	public void addPlaneToAirfield() {
				
	}
	
	

}
