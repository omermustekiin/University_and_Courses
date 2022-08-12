package week05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Examples {
	Scanner input = new Scanner(System.in);
	Random random = new Random();

	public int[][] createMatris(int row, int column) {
		int[][] matris = new int[row][column];
		System.out.println(row + " by " + column + " is created.");
		
		return matris;
	}
	
	public void assignMatris(int[][] matris, Random random) {
		for(int i = 0; i<matris.length; i++) {
			for(int j = 0; j<matris[i].length; j++) {
				matris[i][j] = random.nextInt(15);
			}
		}
		
		System.out.println("Matris assigned.");		
	}
	
	public void printMatris(int[][] matris) {
		for(int i = 0; i < matris.length; i++) {
			System.out.print("|\t");
			for(int j = 0; j < matris[i].length; j++) {
				System.out.print(matris[i][j] + "\t");
			}
			System.out.println("|");
			System.out.println();
		}
	}
	/*
	public int sumColumn(int[][] matris, int columnIndex) {
		int sum = 0;
		for(int i = 0; i<matris.length; i++) {
			for(int j = 0; j<matris[i].length; j++) {
				if(j == columnIndex) {
					sum += matris[i][j];
				}
			}
		}
		
		return sum;
	}
	*/
	
	public int sumColumn(int[][] matris, int columIndex) {
		int sum = 0;
		for(int i = 0; i<matris[0].length; i++) {
			sum += matris[i][columIndex]; 
		}
		return sum;
	}
	
	public int[][] sumMatris(int[][] m1, int[][] m2){
		int[][] matris = new int[m1.length][m1[0].length];
		
		for(int i = 0; i<matris.length; i++) {
			for(int j = 0; j<matris[i].length; j++) {
				matris[i][j] = m1[i][j] + m2[i][j];
			}
		}
		
		return matris;
	}
	
	public int[][] assignMatris2(int[][] matris){
		for(int i =0; i<matris.length; i++) {
			for(int j=0; j<matris[i].length; j++) {
				matris[i][j] = random.nextInt(2);
			}
		}
		return matris;
	}
	
	
	public int[][] findSameValues() {
		System.out.print("Enter the size of matris : ");
		int size = input.nextInt();
		int[][] m = new int[size][size];
		
		int[][] matris = assignMatris2(m);
		
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i=0; i<matris.length; i++) {
			for(int j = 0; j<matris[0].length; j++) {
				numbers.add(matris[i][j]);
			}
			numbers.sort(Comparator.naturalOrder());
			if(numbers.get(0)==numbers.get(size-1)) {
				System.out.println("All " + numbers.get(0) + "s on row " + i);
			}else {
				
			}
			numbers.clear();
		}

		
		
		
		return matris;
		
		
		
		
	}
	
}
