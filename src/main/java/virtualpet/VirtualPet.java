package virtualpet;

public class VirtualPet {
	// 1) Create a tick() method that represents the passage of time.
	// 2) Create at least three instance variables (aka attributes)
	// 3) Create at least three methods (messages you send to your pet).

	// Instance Data
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

	// Accessor Method: gives public user ability to access method for private data
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
		hunger -= amountToFeed;
	}

	public void water(int amountToWater) {
		thirst -= amountToWater;
	}

	public void letOut(int amountToBathroom) {
		bathroom -= amountToBathroom;
	}

	public void play(int amountToEnergy) {
		energy -= amountToEnergy;
	}

	public void tick() {
		hunger += 1;
		thirst += 1;
		bathroom += 1;
		energy += 1;
	}
}
