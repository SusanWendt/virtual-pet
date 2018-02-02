package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		// Create a main method that…
		// 1) implements a game loop.
		// 2) asks for user input.
		// 3) writes output to the console.

		Scanner input = new Scanner(System.in);

		VirtualPet myPet = new VirtualPet(25, 25, 25, 25);

		System.out.println(
				"Welcome to SoozaPalooza's BitBuddies, your virtual pet emporium! Please give your pet a name:");
		String petName = input.nextLine().trim();
		String petType = "";
		if (petName.equalsIgnoreCase("Patrick"))
			petType = "Star";
		else if (petName.equalsIgnoreCase("Gary"))
			petType = "Snail";
		else if (petName.equalsIgnoreCase("Lassie"))
			petType = "Dog";
		else if (petName.equalsIgnoreCase("Garfield"))
			petType = "Cat";
		else if (petName.equalsIgnoreCase("Simba"))
			petType = "Lion";
		else if (petName.equalsIgnoreCase("Mickey"))
			petType = "Mouse";
		else if (petName.substring(0, 1).equalsIgnoreCase("a"))
			petType = "Ardvark";
		else if (petName.substring(0, 1).equalsIgnoreCase("b"))
			petType = "Bat";
		else if (petName.substring(0, 1).equalsIgnoreCase("c"))
			petType = "Crocodile";
		else if (petName.substring(0, 1).equalsIgnoreCase("d"))
			petType = "Dragon";
		else if (petName.substring(0, 1).equalsIgnoreCase("e"))
			petType = "Elephant";
		else if (petName.substring(0, 1).equalsIgnoreCase("f"))
			petType = "Furbie";
		else if (petName.substring(0, 1).equalsIgnoreCase("g"))
			petType = "Grasshopper";
		else if (petName.substring(0, 1).equalsIgnoreCase("h"))
			petType = "Hippo";
		else if (petName.substring(0, 1).equalsIgnoreCase("i"))
			petType = "Iguana";
		else if (petName.substring(0, 1).equalsIgnoreCase("j"))
			petType = "Jurrasic Creature of choice";
		else if (petName.substring(0, 1).equalsIgnoreCase("k"))
			petType = "Koala";
		else if (petName.substring(0, 1).equalsIgnoreCase("l"))
			petType = "Lemur";
		else if (petName.substring(0, 1).equalsIgnoreCase("m"))
			petType = "Monkey";
		else if (petName.substring(0, 1).equalsIgnoreCase("n"))
			petType = "Narwhal";
		else if (petName.substring(0, 1).equalsIgnoreCase("o"))
			petType = "Octopus";
		else if (petName.substring(0, 1).equalsIgnoreCase("p"))
			petType = "Platypus";
		else if (petName.substring(0, 1).equalsIgnoreCase("q"))
			petType = "Queen Bee";
		else if (petName.substring(0, 1).equalsIgnoreCase("r"))
			petType = "Reptile";
		else if (petName.substring(0, 1).equalsIgnoreCase("s"))
			petType = "Squid";
		else if (petName.substring(0, 1).equalsIgnoreCase("t"))
			petType = "T-Rex";
		else if (petName.substring(0, 1).equalsIgnoreCase("u"))
			petType = "Sea Sponge";
		else if (petName.substring(0, 1).equalsIgnoreCase("v"))
			petType = "Vines (some people are plant people)";
		else if (petName.substring(0, 1).equalsIgnoreCase("w"))
			petType = "Wombat";
		else if (petName.substring(0, 1).equalsIgnoreCase("x"))
			petType = "X-Men";
		else if (petName.substring(0, 1).equalsIgnoreCase("y"))
			petType = "Yak";
		else if (petName.substring(0, 1).equalsIgnoreCase("z"))
			petType = "Zebra";
		else
			petType = "Alien";
		System.out.println("Your BitBuddie is named " + petName + ". BitBuddie type: " + petType + ".");

		String optionEntered = "";
		while (!optionEntered.equals("5")) {
			System.out.println(
					petName + "'s current status: Hunger=" + myPet.getHunger() + "/50, Thirst=" + myPet.getThirst()
							+ "/50, Bathroom=" + myPet.getBathroom() + "/50, and Energy=" + myPet.getEnergy() + "/50.");
			System.out.println("What would you like to do with " + petName + "?");
			System.out.println(
					"Please enter a number: 1 to FEED, 2 to WATER, 3 to LET OUT to the bathroom, 4 to PLAY, or 5 to QUIT.");
			optionEntered = input.nextLine();

			if (optionEntered.equals("1")) {
				myPet.feed(11);
				myPet.water(-4);
				System.out.println("You have fed " + petName + ", but now thirst has increased.");
			}
			if (optionEntered.equals("2")) {
				myPet.water(11);
				myPet.letOut(-4);
				System.out.println("You have given water to " + petName
						+ ", but now the need to go to the bathroom has increaesd.");
			}
			if (optionEntered.equals("3")) {
				myPet.letOut(11);
				System.out.println("You have let " + petName + " out to go to the bathroom.");
			}
			if (optionEntered.equals("4")) {
				myPet.play(11);
				System.out.println("You have played with " + petName + ".");
			}
			if (optionEntered.equals("5")) {
				System.out.println("Goodbye, " + petName + " the " + petType + "!");
				input.close();
				System.exit(0);
			}
			myPet.tick();
			System.out.println("Half an hour has passed, so other needs have changed.");
		}
	}
}
