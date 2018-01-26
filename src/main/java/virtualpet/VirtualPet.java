package virtualpet;

public class VirtualPet {
	// 1) Create a tick() method that represents the passage of time.
	// 2) Create at least three instance variables (aka attributes aka properties
	// aka fields).
	// 3) Create at least three methods (messages you send to your pet).

	// instance data
	private int hunger;
	private int thirst;
	private int bathroom;
	private int energy;

	// Constructor
	public VirtualPet(int hunger, int thirst, int bathroom, int energy) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.bathroom = bathroom;
		this.energy = energy;
	}

	// Accessor method --> gives public user ability to access method for private
	// data
	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBathroom() {
		return bathroom;
	}

	public int getEnergy() {
		return energy;
	}

	// Modifier Method
	public void feed(int amountToFeed) {
		// hunger = hunger - amountToFeed; AKA below line
		if (hunger >= amountToFeed) {
			hunger -= amountToFeed;
		} else {
			hunger -= hunger;
		}
	}

	public void water(int amountToWater) {
		if (amountToWater > 0) {
			thirst -= amountToWater;
		} else {
			thirst -= 0;
		}
	}

	public void letOut(int amountToBathroom) {
		if (amountToBathroom > 0) {
			bathroom -= amountToBathroom;
		} else {
			bathroom -= 0;
		}
	}

	public void play(int amountToEnergy) {
		if (amountToEnergy > 0) {
			energy -= amountToEnergy;
		} else {
			energy -= 0;
		}
	}

	public void tick() {
		hunger += 1;
		thirst += 1;
		bathroom += 1;
		energy += 1;

	}
}
