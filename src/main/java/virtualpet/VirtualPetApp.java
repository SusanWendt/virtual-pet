package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		// Create a main method that…
		// 1) implements a game loop.
		// 2) asks for user input.
		// 3) writes output to the console.

		Scanner input = new Scanner(System.in);

		VirtualPet myPet = new VirtualPet(5, 5, 5, 5); // order is important

		System.out.println(
				"Welcome to SoozaPalooza's BitBuddies, your virtual pet emporium! Please give your pet a name:");
		String petName = input.nextLine();
		System.out.println("Your pet is named " + petName + ".");

		// for (int i = 0; i < 2; i++) {

		String optionEntered;
		do {
			System.out.println(
					petName + "'s current status: hunger=" + myPet.getHunger() + "/10, thirst=" + myPet.getThirst()
							+ "/10, bathroom=" + myPet.getBathroom() + "/10, and energy=" + myPet.getEnergy() + "/10.");
			System.out.println("What would you like to do with " + petName + "?");
			System.out.println(
					"Enter 1 to feed, enter 2 to water, enter 3 to let out to the bathroom, enter 4 to play, or enter 5 to quit.");
			optionEntered = input.nextLine();

			if (optionEntered.equals("1")) {
				myPet.feed(4);
				System.out
						.println("You have chosen to feed " + petName + ". " + petName + "'s hunger decreased.");

			} else if (optionEntered.equals("2")) {
				myPet.water(4);
				System.out.println(
						"You have chosen to water " + petName + ". " + petName + "'s thirst decreased.");

			} else if (optionEntered.equals("3")) {
				myPet.letOut(4);
				System.out.println("You have chosen to let " + petName + " out to go to the bathroom. " + petName
						+ "'s need to go to the bathroom decreased by one.");

			} else if (optionEntered.equals("4")) {
				myPet.play(4);
				System.out.println(
						"You have chosen to play with " + petName + ". " + petName + "'s energy decreased.");
			}
			myPet.tick();
			System.out.println("One hour has passed. " + petName + "'s needs have changed.");
		} while (!optionEntered.equals("5"));
		System.out.println("Goodbye, " + petName + "!");
		input.close();
	}
}
