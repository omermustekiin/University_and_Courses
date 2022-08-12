package week04;

import java.util.Random;

public class GradeBookTest {

	public static void main(String[] args) {
		
		
		Random random = new Random();
		
		
		GradeBook course = new GradeBook("Java", null);
		
		
		int[] arr = new int[10];
		for(int i = 0; i<10; i++) {
			arr[i] = random.nextInt(101);
		}
		course.setGrades(arr);
		
		course.displayInfo();
		course.printGrades(arr);
		System.out.println("Average : " + course.findAverage());
		System.out.println("Minimum : " + course.getMinimum());
		System.out.println("Maximum : " + course.getMaximum());
		
	}

}
