package week02;

import java.util.Scanner;

public class Math {
	
	private int total;
	private int gradeCounter;
	private int average;
	private int nextGrade;
	
	private Scanner input = new Scanner(System.in);
		
	public Math(int total, int gradeCounter) {
		this.total = total;
		this.gradeCounter = gradeCounter;
	}
	
	public Math() {
		this.total = 0;
		this.gradeCounter = 1;
	}

	public void calculate() {
		while(gradeCounter <= 10) {
			System.out.print("Enter the next grade : ");
			this.nextGrade = input.nextInt();
			this.total += nextGrade;
			gradeCounter++;
		}
		
		this.average = this.getTotal()/this.getGradeCounter();
		System.out.println("Average : " + average);
		
	}
	
	public static void piCalculate(int n) {
		
		double pi=0;
		
		for(int i=0; i<n; i++) {
			if(i%2==0) {
				pi+= 4.0/(2*i+1);
			}
			if(i%2==1){
				pi-=4.0/(2*i+1);
			}
		}
		System.out.println(pi);
	}
	
	public static void starWar(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n; i>=0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getGradeCounter() {
		return gradeCounter;
	}

	public void setGradeCounter(int gradeCounter) {
		this.gradeCounter = gradeCounter;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}
	
	

}
