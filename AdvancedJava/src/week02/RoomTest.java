package week02;

public class RoomTest {

	public static void main(String[] args) {
		
		
		Room r1 = new Room("SENG 206", 200, "Lab", 50);
		
		r1.displayInfo();
		
		System.out.println();
		
		
		r1.incrementPopulation(50);
		
		System.out.println();
		
		
		r1.incrementPopulation(99);
		
		System.out.println();
		
		
		r1.incrementPopulation(2);
		
		
		System.out.println(r1.isFull());
		
		
		r1.incrementPopulation(1);
		
		
		System.out.println(r1.isFull());
		
		
		System.out.println();
		
		r1.displayInfo();
		
	}

}
