package week04;

public class GradeBook {
	
	private String courseName;
	private int[] grades;
	
	public GradeBook(String courseName, int[] grades) {
		this.courseName = courseName;
		this.grades = grades;
	}
	
	
	public void displayInfo() {
		System.out.println("Welcome to the gradebook " + getCourseName());
	}
	
	public int getMinimum() {
		int min = grades[0];
		for(int i= 1; i<grades.length; i++) {
			if(min>grades[i]) {
				min = grades[i];
			}
		}
		return min;
	}
	
	public int getMaximum() {
		int max = grades[0];
		for(int value : grades) {
			if(value > max) {
				max = value;
			}
		}
		return max;
	}
	
	public double findAverage() {
		double sum = 0;
		for(int value : grades) {
			sum += value;
		}
		return sum/grades.length;
	}
	
	public void printGrades(int[] arr) {
		for(int i = 0; i<arr.length; i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public int[] getGrades() {
		return grades;
	}


	public void setGrades(int[] grades) {
		this.grades = grades;
	}
	
	
	
	
	
	
	

}
