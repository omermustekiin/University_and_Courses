package week02;

public class Rectangle {
	
	//data members - class members
	private int width;
	private int height;
	
	// no arg constructor
	public Rectangle() {}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getArea() {
		return this.width*this.height;
	}
	
	public int getPerimeter() {
		return 2*(this.height + this.width);
	}
	
	public void displayInfo() {
		System.out.println("Width : " + this.width + "\nHeight : " + this.height + "\nArea : " + this.getArea() + "\nPerimeter : " + this.getPerimeter());
	}
	
	public static void compareAreas(Rectangle r1, Rectangle r2) {
		
		if(r1.getArea() > r2.getArea()) {
			System.out.println("First rectangle's area is bigger than the second.");
		}else if(r1.getArea() < r2.getArea()) {
			System.out.println("Second rectangle's area is bigger than the first.");
		}else {
			System.out.println("First rectangle's area is equal to second.");
		}
		
	}
	
	
}
