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

	public Pet getPet(String input) {
		Pet petToReturn = null;
		for (Pet allPets : pets) {
			String name = allPets.getName();
			if(name.equals(input)) {
				petToReturn = allPets;
			}
		}
		return petToReturn;
	}

	public void feed() {
		for (Pet allPets : pets) {
			if (allPets.isOrganic() == 1) {
				allPets.feedPet();
			}
		}
	}

	public void oil() {
		for (Pet allPets : pets) {
			if (allPets.isOrganic() == 2) {
				allPets.feedPet();
			}
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
			System.out.format("%10s %10s %5d %5d %5d",
					allPets.getName(), allPets.isRobot(), allPets.getHealth(), allPets.getThirst(), allPets.getBoredom());
			System.out.println("");
		}

	}

	public void getPetNames() {
		for (Pet allPets : pets) {
			System.out.println(allPets.getName() + " " + allPets.getDescription());
		}
	}

}
