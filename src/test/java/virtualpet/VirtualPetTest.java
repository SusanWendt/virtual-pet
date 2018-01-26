package virtualpet;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {
	@Test
	public void shouldDecreaseHungerBy4() {
		// arrange
		VirtualPet underTest = new VirtualPet(5, 5, 5, 5);

		// act
		underTest.feed(4);
		int hunger = underTest.getHunger();

		// assert
		Assert.assertEquals(1 , hunger);
	}
}
