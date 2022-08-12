package week14;

public class Class {

	private String className;
	private int capacity;
	
	public Class(String className, int capacity) {
		this.className=className;
		this.capacity=capacity;
	}

	@Override
	public String toString() {
		return String.format("%s\t%d\n", getClassName(),getCapacity());
	}
	
	
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
