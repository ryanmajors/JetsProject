package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AirField {
	private ArrayList<Jet> planesInAirfield = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	private AirField airfield;

	public AirField(ArrayList<Jet> planesInAirfield) {
		super();
		this.planesInAirfield = planesInAirfield;
	}

	// populates airfield form Jets.txt
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
	}

	// cycles through airfield and prints out each jet's toString
	public void viewAllJets(ArrayList<Jet> planesInAirfield) {
		System.out.println("\nViewing all jets...");
		int count = 1;
		if (planesInAirfield != null) {
			for (Jet jet : planesInAirfield) {
				System.out.printf("\nHangar-" + count + "" + jet + "");
				count++;
				System.out.println("");
			}
		}
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	// cycles through airfield and flies all jets and displays fight time before
	// refueling
	public void flyAllJets() {
		int count = 1;
		System.out.println("\nFlying all jets...\n");
		for (Jet jet : planesInAirfield) {
			System.out.printf(
					"The " + jet.getModel() + " took off and flew for %.2f hours before circling back to refuel.\n",
					jet.getRangeHours());
			count++;
		}
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	// displays fastest jet in airfield
	public void veiwFastestJet() {
		Jet fastestJet = null;
		for (Jet jet : planesInAirfield) {
			if (fastestJet == null || jet.getSpeed() > fastestJet.getSpeed()) {
				fastestJet = jet;
			}
		}
		System.out.println("");
		System.out.printf("The fastest jet in the airfield is the %s. ", fastestJet.getModel());
		System.out.printf("It flies at %.2f MPH.\n", fastestJet.getSpeed());
		System.out.println("This jet costs $" + fastestJet.getPrice() + " and has a range of " + fastestJet.getRange()
				+ " miles.");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	// displays farthest flying
	public void veiwLongestRangeJet() {
		Jet longestFlyingJet = null;
		for (Jet jet : planesInAirfield) {
			if (longestFlyingJet == null || jet.getRange() > (longestFlyingJet.getRange())) {
				longestFlyingJet = jet;
			}
		}
		System.out.printf("\nThe farthest flying jet in the airfield is the %s.\n", longestFlyingJet.getModel());
		System.out.println("It travels " + longestFlyingJet.getRange() + " miles before having to refuel.\nThis "
				+ "jet costs $" + longestFlyingJet.getPrice() + " and has a top speed of " + longestFlyingJet.getSpeed()
				+ "MPH.");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	// loads only cargoplanes with cargo
	public void loadAllCargo() {
		System.out.println("\nCargo is staged and ready to be loaded.");
		for (Jet jet : planesInAirfield) {
			if (jet instanceof CargoPlane) {
				((CargoPlane) jet).loadCargo();
			}
		}
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	// postions only fighterplanes for attack
	public void dogFight() {
		System.out.println("\nFighters to your positions...\n");
		for (Jet jet : planesInAirfield) {
			if (jet instanceof FighterJet) {
				((FighterJet) jet).fight();
			}
		}
		System.out.println("All Fighters ATTACK!!!\n");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	// allows user to add new plane to the airfield for use
	public void addJetToFleet() {
		String[] jet = new String[5];
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println("What type of jet would you like to add(FighterJet, GlideBomber, or CargoPlane): ");
			String type = sc.nextLine();
			if (type.equalsIgnoreCase("FighterJet")) {
				type = "FighterJet";
				jet[0] = type;
				keepGoing = false;
			} else if (type.equalsIgnoreCase("GlideBomber")) {
				type = "GlideBomber";
				jet[0] = type;
				keepGoing = false;
			} else if (type.equalsIgnoreCase("CargoPlane")) {
				type = "CargoPlane";
				jet[0] = type;
				keepGoing = false;
			} else {
				System.out.println("You may only add one of the 3 types listed. Please try again");
			}
		}
		System.out.println("What is the model of the jet you would like to add: ");
		jet[1] = sc.nextLine();
		System.out.println("What is the speed in MPH of the jet you would like to add: ");
		jet[2] = (String) sc.nextLine();
		System.out.println("What is the range in miles of the jet you would like to add: ");
		jet[3] = (String) sc.nextLine();
		System.out.println("What is the price of the jet you would like to add: ");
		jet[4] = (String) sc.nextLine();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
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

	// removes jet from airfield
	public void removeJetFromFleet(Scanner sc, ArrayList<Jet> planesInAirfield) {
		System.out.println("\nList of jets in airfield to remove from: ");
		int count = 1;
		for (Jet jet : planesInAirfield) {
			System.out.printf("\nJet# " + count + "" + jet + "\n");
			count++;
		}
		System.out.println("\nWhich jet number would you like to remove: \n");
		int choice = (sc.nextInt() - 1);
		if (planesInAirfield != null) {

			this.planesInAirfield.remove(choice);
		}
	}
}
