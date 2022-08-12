package week02;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Rectangle r1 = new Rectangle(5, 10);
		Rectangle r2 = new Rectangle(15, 10);
		
		r1.displayInfo();
		
		
		System.out.print("Enter the new width : ");
		int newWidth = input.nextInt();
		r2.setWidth(newWidth);
		r2.displayInfo();
		
		Rectangle.compareAreas(r1, r2);
		
		compare(r1, r2);
		
		input.close();
	}

	
	public static void compare(Rectangle r1, Rectangle r2) {
		if(r1.getArea() > r2.getArea()) {
			System.out.println("First rectangle's area is bigger than the second.");
		}else if(r1.getArea() < r2.getArea()) {
			System.out.println("Second rectangle's area is bigger than the first.");
		}else {
			System.out.println("First rectangle's area is equal to second.");
		}
	}
}
