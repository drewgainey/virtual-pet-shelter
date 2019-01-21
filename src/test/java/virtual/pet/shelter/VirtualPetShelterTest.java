package virtual.pet.shelter;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class VirtualPetShelterTest {

	PetShelter underTest = new PetShelter();
	Pet dog = new Pet("Larry","The Dog");
	Pet cat = new Pet("Garfield","The Cat");

	@SuppressWarnings("deprecation")
	@Test
	public void shouldBeAbleToAddPetToShelter() {
		underTest.addPet(dog);
		int numberOfPets = underTest.getSize();
		assertThat(numberOfPets, is(1));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void shouldReduceNumberOfPetsWithAdoption() {
		underTest.addPet(dog);
		underTest.addPet(cat);
		underTest.adopt(dog);
		int numberOfPets = underTest.getSize();
		assertThat(numberOfPets, is(1));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void shouldReturnDogWhenReturnMethodIsCalledOnDog() {
		underTest.addPet(dog);
		Pet returnedValue = underTest.getPet("Larry");
		assertThat(returnedValue.getName(), is("Larry"));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void petObjectsShouldGiveExpectedPropertiesWhenCalled() {
		underTest.addPet(dog);
		String name = dog.getName();
		String description = dog.getDescription();
		int hunger = dog.getHunger();
		int thirst = dog.getThirst();
		int boredom = dog.getBoredom();
		assertThat(name, is("Larry"));
		assertThat(description, is("The Dog"));
		assertThat(hunger, is(50));
		assertThat(thirst, is(50));
		assertThat(boredom, is(50));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void shouldDecreasAllPetsHungerToZeroWhenFed() {
		underTest.addPet(dog);
		underTest.addPet(cat);
		underTest.feed();
		int dogHunger = dog.getHunger();
		int catHunger = cat.getHunger();
		assertThat(dogHunger, is(0));
		assertThat(catHunger, is(0));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void shouldDecreasAllPetsThirstToZeroWhenGiveWater() {
		underTest.addPet(dog);
		underTest.addPet(cat);
		underTest.giveWater();
		int dogThirst = dog.getThirst();
		int catThirst = cat.getThirst();
		assertThat(dogThirst, is(0));
		assertThat(catThirst, is(0));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void shouldDecreasePetBoredomToZeroWhenPlayedWith() {
		underTest.addPet(dog);
		dog.play();
		int boredom = dog.getBoredom();
		assertThat(boredom, is(0));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void shouldIncreaseAllPetsAttributesBTenWhenTickMethodCalled() {
		underTest.addPet(dog);
		underTest.addPet(cat);
		underTest.tick();
		int dogHunger = dog.getHunger();
		int catHunger = cat.getHunger();
		int dogThirst = dog.getThirst();
		int catThirst = cat.getThirst();
		int dogBoredom = dog.getBoredom();
		int catBoredom = cat.getBoredom();
		assertThat(dogHunger, is(60));
		assertThat(catHunger, is(60));
		assertThat(dogThirst, is(60));
		assertThat(catThirst, is(60));
		assertThat(dogBoredom, is(60));
		assertThat(catBoredom, is(60));
	}

}
