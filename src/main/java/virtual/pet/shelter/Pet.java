package virtual.pet.shelter;

public class Pet {

	private String name;
	private String description;
	private int hunger;
	private int thirst;
	private int boredom;

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBoredom() {
		return boredom;
	}

	public Pet(String name, String description) {
		this.name = name;
		this.description = description;
		this.hunger = 50;
		this.thirst = 50;
		this.boredom = 50;
	}

	public void feedPet() {
		hunger = 0;
	}

	public void waterPet() {
		thirst = 0;
	}

	public void play() {
		boredom = 0;
	}

	public void tick() {
		hunger += 10;
		thirst += 10;
		boredom += 10;
	}

}
