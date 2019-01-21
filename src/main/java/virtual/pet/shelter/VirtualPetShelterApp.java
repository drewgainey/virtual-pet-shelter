package virtual.pet.shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {
	static PetShelter myShelter = new PetShelter();
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Pet garry = new Pet("Gary", "Is a Snail");
		myShelter.addPet(garry);

		System.out.println("Welcome to the Virtual Pet Shelter");
		while (true) {
			System.out.println("Here is a list of our current pets and their needs ");
			myShelter.getAllPets();
			System.out.println("");
			System.out.println("What would you like to do with our pets?");
			getOptions();
			int choice = input.nextInt();
			elvaulateChoice(choice);
			myShelter.tick();
		}
	}

	public static void getOptions() {
		System.out.println("1. Feed all of the pets");
		System.out.println("2. Give the pets something to drink");
		System.out.println("3. Play with one of the pets");
		System.out.println("4. Give a pet up for adpotion");
		System.out.println("5. Admit another pet to the shelter");
		System.out.println("6. Quit");
	}

	private static void elvaulateChoice(int choice) {
		if (choice == 1) {
			myShelter.feed();
		} else if (choice == 2) {
			myShelter.giveWater();
		} else if (choice == 3) {
			System.out.println("Which Pet would you like to play with");
			myShelter.getPetNames();
			String petAskedFor = input.nextLine();
			petAskedFor = input.nextLine();
			Pet petToPlay = myShelter.getPet(petAskedFor);
			petToPlay.play();
		} else if (choice == 4) {
			System.out.println("Which pet is luck enough to get adopted?");
			myShelter.getPetNames();
			String adopt = input.nextLine();
			adopt = input.nextLine();
			Pet petAdopted = myShelter.getPet(adopt);
			myShelter.adopt(petAdopted);
		} else if (choice == 5) {
			System.out.println("What is the new pets name?");
			String name = input.nextLine();
			name = input.nextLine();
			System.out.println("Describe this pet ");
			String description = input.nextLine();
			Pet aPet = new Pet(name, description);
			myShelter.addPet(aPet);
		} 

	}
}
