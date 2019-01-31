package virtual.pet.shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {
	static PetShelter myShelter = new PetShelter();
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Pet garry = new Pet("Garry", "Is a Snail", 1);
		Pet larry = new Pet("Larry", "The Lobster", 1);
		Pet hal9000 = new Pet("Hall9000","The most reliable computer ever made",2);		
		myShelter.addPet(garry);
		myShelter.addPet(larry);
		myShelter.addPet(hal9000);

		while (true) {
		System.out.println("   ___          _                 _______ __         ____               ");
		System.out.println("   /   |  ____  (_)___ ___  ____ _/ / ___// /_  ___  / / /____  _____");
		System.out.println("  / /| | / __ \\/ / __ `__ \\/ __ `/ /\\__ \\/ __ \\/ _ \\/ / __/ _ \\/ ___/");
		System.out.println(" / ___ |/ / / / / / / / / / /_/ / /___/ / / / /  __/ / /_/  __/ /    ");
		System.out.println("/_/  |_/_/ /_/_/_/ /_/ /_/\\__,_/_//____/_/ /_/\\___/_/\\__/\\___/_/    ");
			System.out.println("Here is a list of our current pets and their needs ");
			System.out.println("     Name:      Robot?  Health  Thirst  Boredom");
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
		System.out.println("2. Oil all of the robot animals");
		System.out.println("3. Give the pets something to drink");
		System.out.println("4. Play with one of the pets");
		System.out.println("5. Give a pet up for adpotion");
		System.out.println("6. Admit another pet to the shelter");
		System.out.println("7. Quit");
	}

	private static void elvaulateChoice(int choice) {
		if (choice == 1) {
			myShelter.feed();
		} else if (choice == 2) {
			myShelter.oil();
		} else if(choice == 3) {
			myShelter.giveWater();
		} else if (choice == 4) {
			System.out.println("Which Pet would you like to play with");
			myShelter.getPetNames();
			String petAskedFor = input.nextLine();
			petAskedFor = input.nextLine();
			Pet petToPlay = myShelter.getPet(petAskedFor);
			petToPlay.play();
		} else if (choice == 5) {
			System.out.println("Which pet is luck enough to get adopted?");
			myShelter.getPetNames();
			String adopt = input.nextLine();
			adopt = input.nextLine();
			Pet petAdopted = myShelter.getPet(adopt);
			myShelter.adopt(petAdopted);
		} else if (choice == 6) {
			System.out.println("What is the new pets name?");
			String name = input.nextLine();
			name = input.nextLine();
			System.out.println("Describe this pet ");
			String description = input.nextLine();
			System.out.println("Press 1 if the pet is not a robot, press 2 if it is a robot");
			int isOrganic = input.nextInt();
			Pet aPet = new Pet(name, description,isOrganic);
			myShelter.addPet(aPet);
		} else {
			System.exit(0);
		}

	}
}
