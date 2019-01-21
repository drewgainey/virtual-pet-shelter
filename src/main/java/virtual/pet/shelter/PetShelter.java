package virtual.pet.shelter;

import java.util.ArrayList;

public class PetShelter {

	ArrayList<Pet> pets = new ArrayList<Pet>();

	public void addPet(Pet aPet) {
		pets.add(aPet);
	}

	public int getSize() {
		return pets.size();
	}

	public void adopt(Pet adoptedPet) {
		for (Pet allPets : pets) {
			if (allPets.equals(adoptedPet)) {
				pets.remove(allPets);
			}
		}
	}

	public Pet getPet(String askedForPet) {
		Pet petToReturn = null;
		for (Pet allPets : pets) {
			if (allPets.getName().equals(askedForPet)) {
				petToReturn = allPets;
			}
		}
		return petToReturn;
	}

	public void feed() {
		for (Pet allPets : pets) {
			allPets.feedPet();
		}
	}

	public void giveWater() {
		for (Pet allPets : pets) {
			allPets.waterPet();
		}
	}

	public void tick() {
		for (Pet allPets : pets) {
			allPets.tick();
		}

	}

	public void getAllPets() {
		for (Pet allPets : pets) {
			System.out.println(allPets.getName() + " " + allPets.getHunger() + " " + allPets.getThirst() + " "
					+ allPets.getBoredom());
		}

	}

	public void getPetNames() {
		for (Pet allPets : pets) {
			System.out.println(allPets.getName() + " " + allPets.getDescription());
		}
	}

}
