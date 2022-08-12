package week02;

public class Room {
	
	private String roomNo;
	private int roomCapacity;
	private String roomType; //lab, lesson, amphi ...
	private int population;
	
	public Room() {}

	public Room(String roomNo, int roomCapacity, String roomType, int population) {
		this.roomNo = roomNo;
		this.roomCapacity = roomCapacity;
		this.roomType = roomType;
		this.population = population;
	}
	
	public Room(String roomNo) {
		this.roomNo = roomNo;
	}
	
	
	public boolean isEmpty() {
		if(population == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if((population == roomCapacity) || (population > roomCapacity)) {
			return true;
		}
		return false;
	}
	
	public void incrementPopulation(int people) {
		if((population + people) <= roomCapacity ) {
			this.population += people;
			System.out.println("Added " + people + " people. " + " new population is : " + getPopulation());
		}else if((population + people) > roomCapacity) {
			System.out.println("You can't add people!");
		}
	}
	
	public void displayInfo() {
		System.out.println("Room No : " + getRoomNo() +
				"\nRoom Capacity : " + getRoomCapacity() +
				"\nRoom Type : " + getRoomType() +
				"\nPopulation : " + getPopulation());
	}
	

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public int getRoomCapacity() {
		return roomCapacity;
	}

	public void setRoomCapacity(int roomCapacity) {
		this.roomCapacity = roomCapacity;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	
	
	
	
	
	
}
