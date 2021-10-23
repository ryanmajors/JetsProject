package com.skilldistillery.jets.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Jet;

public class JetsApplication {

	public JetsApplication() {

	}

	public static void main(String[] args) {
		JetsApplication jetApp = new JetsApplication();
		Scanner sc = new Scanner(System.in);
		ArrayList<Jet> planesInAirfield = new ArrayList<>();

		// launches program from within main
		jetApp.launch(sc, planesInAirfield);
	}

	public void launch(Scanner sc, ArrayList<Jet> planesInAirfield) {
		AirField af = new AirField(planesInAirfield);
		
		// adds 5 jets at start of program
		af.populateAirfield(planesInAirfield);

		// menu of options for user to chose from
		displayUserMenu();
		userMenuChoiceSelector(sc, planesInAirfield);
	}

	public void displayUserMenu() {
		System.out.println("Welcome to Majors International Airport (MIA) \n");
		System.out.println("Please choose an option from the menu below.\n");
		System.out.println("1. List planes currently in the fleet");
		System.out.println("2. Fly all jets in the fleet");
		System.out.println("3. View the fastest plane in the fleet");
		System.out.println("4. View farthest flying plane in the fleet");
		System.out.println("5. Load cargo onto all planes in the fleet");
		System.out.println("6. Engage in a Dogfight!");
		System.out.println("7. Add a plane to the fleet");
		System.out.println("8. Remove a plane from the fleet");
		System.out.println("9. Leave the airfield and quit the program");

	}

	public void userMenuChoiceSelector(Scanner sc, ArrayList<Jet> planesInAirfield) {
		boolean keepGoing = true;
		ArrayList<Jet> planes = new ArrayList<>();
		AirField af = new AirField(planesInAirfield);
		while (keepGoing) {
			System.out.print("\nEnter the number of the option you would like to perform: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				af.viewAllJets(planesInAirfield);
				break;
			case 2:
				af.flyAllJets();
				break;
			case 3:
				af.veiwFastestJet();
				break;
			case 4:
				af.veiwLongestRangeJet();
				break;
			case 5:
				af.loadAllCargo();
				break;
			case 6:
				af.dogFight();
				break;
			case 7:
				af.addJetToFleet();
				break;
			case 8:
				af.removeJetFromFleet();
				break;
			case 9:
				System.out.println("\nYou have chosen to leave the airfield and quit the program."
						+ "\nPlease have a wonderful day and come back soon!");
				keepGoing = false;

			}
		}
	}

}
