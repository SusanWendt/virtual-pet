package virtualpet;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {
	@Test
	public void shouldDecreaseHungerBy4() {
		VirtualPet underTest = new VirtualPet(5, 5, 5, 5); // arrange
		underTest.feed(4); // act
		int hunger = underTest.getHunger();
		Assert.assertEquals(1, hunger); // assert
	}

	@Test
	public void shouldDecreaseThirstBy4() {
		VirtualPet underTest = new VirtualPet(5, 5, 5, 5);
		underTest.water(4);
		int thirst = underTest.getThirst();
		Assert.assertEquals(1, thirst);
	}

	@Test
	public void shouldDecreaseBathroomBy4() {
		VirtualPet underTest = new VirtualPet(5, 5, 5, 5);
		underTest.letOut(4);
		int bathroom = underTest.getBathroom();
		Assert.assertEquals(1, bathroom);
	}

	@Test
	public void shouldDecreaseEnergyBy4() {
		VirtualPet underTest = new VirtualPet(5, 5, 5, 5);
		underTest.play(4);
		int energy = underTest.getEnergy();
		Assert.assertEquals(1, energy);
	}
	@Test
	public void shouldIncreaseHungerBy1() {
		VirtualPet underTest = new VirtualPet(5, 5, 5, 5);
		underTest.tick();
		int hunger = underTest.getHunger();
		Assert.assertEquals(6, hunger);
	}
}