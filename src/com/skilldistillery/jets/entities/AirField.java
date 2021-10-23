package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AirField {
	protected ArrayList<Jet> planesInAirfield = new ArrayList<>();

	public AirField(ArrayList<Jet> planesInAirfield) {
		super();
		this.planesInAirfield = planesInAirfield;

	}

	public void populateAirfield(ArrayList<Jet> planesInAirfield) {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("Jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jet = line.split(", ");
				if (jet[0].equals("GlideBomber")) {
					GlideBomber gb = new GlideBomber(jet[1], Double.parseDouble(jet[2]), Integer.parseInt(jet[3]),
							Integer.parseInt(jet[4]));
					planesInAirfield.add(gb);
				} else if (jet[0].equals("CargoPlane")) {
					CargoPlane cp = new CargoPlane(jet[1], Double.parseDouble(jet[2]), Integer.parseInt(jet[3]),
							Integer.parseInt(jet[4]));
					planesInAirfield.add(cp);

				} else if (jet[0].equals("FighterJet")) {
					FighterJet fj = new FighterJet(jet[1], Double.parseDouble(jet[2]), Integer.parseInt(jet[3]),
							Integer.parseInt(jet[4]));
					planesInAirfield.add(fj);

				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		System.out.println(planesInAirfield);
	}

	public void viewAllJets(ArrayList<Jet> planesInAirfield) {
		// Test print statement
		System.out.println("Viewing all jets");

//		for (Jet jet : planesInAirfield) {
			if (planesInAirfield != null) {
				System.out.println(planesInAirfield);
			}

		}

//	}

	public void flyAllJets() {
		// Test print statement
		System.out.println("All jets have begun flying!");

	}

	public void veiwFastestJet() {
		// Test print statement
		System.out.println("Viewing fastest jet.");

	}

	public void veiwLongestRangeJet() {
		// Test print statement
		System.out.println("Viewing longest ranged jet.");

	}

	public void loadAllCargo() {
		// Test print statement
		System.out.println("Viewing all jets");

	}

	public void dogFight() {
		// Test print statement
		System.out.println("Commencing dogfight!");

	}

	public void addJetToFleet() {
		// Test print statement
		System.out.println("Adding jet to fleet.");

	}

	public void removeJetFromFleet() {
		// Test print statement
		System.out.println("Removing jet from fleet.");

	}

}
