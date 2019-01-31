package virtual.pet.shelter;

public class Pet {

	private String name;
	private String description;
	private int health;
	private int thirst;
	private int boredom;
	private int isOrganic;

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHealth() {
		return health;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBoredom() {
		return boredom;
	}

	public String isRobot() {
		String robot = "Y";
		if (isOrganic == 1) {
			robot = "N";
		}
		return robot;
	}

	public Pet(String name, String description, int isOrganic) {
		this.name = name;
		this.description = description;
		this.health = 50;
		this.thirst = 50;
		this.boredom = 50;
		this.isOrganic = isOrganic;
	}

	public void feedPet() {
		health = 0;
	}

	public void waterPet() {
		thirst = 0;
	}

	public void play() {
		boredom = 0;
	}

	public void tick() {
		health += 10;
		thirst += 10;
		boredom += 10;
	}

	public int isOrganic() {
		return isOrganic;
	}

}
