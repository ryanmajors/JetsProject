package com.skilldistillery.jets.app;

import java.util.Scanner;

public class JetsApplication {

	public JetsApplication() {

	}

	public static void main(String[] args) {
		JetsApplication jetApp = new JetsApplication();
		Scanner sc = new Scanner(System.in);
		// launches program from within main
		jetApp.launch(sc);
	}

	private void launch(Scanner sc) {
		// adds 5 jets at start of program

		// menu of options for user to chose from
		displayUserMenu();
		userMenuChoiceSelector(sc);
	}

	private void displayUserMenu() {
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

	private void userMenuChoiceSelector(Scanner sc) {
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.print("\nEnter the number of the option you would like to perform: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				viewAllJets();
				break;
			case 2:
				flyAllJets();
				break;
			case 3:
				veiwFastestJet();
				break;
			case 4:
				veiwLongestRangeJet();
				break;
			case 5:
				loadAllCargo();
				break;
			case 6:
				dogFight();
				break;
			case 7:
				addJetToFleet();
				break;
			case 8:
				removeJetFromFleet();
				break;
			case 9:
				System.out.println("\nYou have chosen to leave the airfield and quit the program."
						+ "\nPlease have a wonderful day and come back soon!");
				keepGoing = false;

			}
		}
	}

	private void viewAllJets() {
		// Test print statement
		System.out.println("Viewing all jets");
		
		
	}

	private void flyAllJets() {
		// Test print statement
		System.out.println("All jets have begun flying!");

	}

	private void veiwFastestJet() {
		// Test print statement
		System.out.println("Viewing fastest jet.");

	}

	private void veiwLongestRangeJet() {
		// Test print statement
		System.out.println("Viewing longest ranged jet.");

	}

	private void loadAllCargo() {
		// Test print statement
		System.out.println("Viewing all jets");

	}

	private void dogFight() {
		// Test print statement
		System.out.println("Commencing dogfight!");

	}

	private void addJetToFleet() {
		// Test print statement
		System.out.println("Adding jet to fleet.");

	}

	private void removeJetFromFleet() {
		// Test print statement
		System.out.println("Removing jet from fleet.");

	}

}
