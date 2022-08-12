package week05;

import java.util.Random;
import java.util.Scanner;

public class ExampleTest {
	
	public static void main(String[] args) {
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		Examples e1 = new Examples();
		
		/*
		System.out.print("Enter row and column : ");
		int row = input.nextInt();
		int column = input.nextInt();
		
		int matris[][] = e1.createMatris(row, column);
		int matris2[][] = e1.createMatris(row, column);
		
		e1.assignMatris(matris, r);
		e1.assignMatris(matris2, r);
		
		e1.printMatris(matris);
		System.out.println();
		e1.printMatris(matris2);
		
		int sumColumn = e1.sumColumn(matris, 1);
		System.out.println(sumColumn);
		
		int[][] sumMatris = e1.sumMatris(matris, matris2);
		e1.printMatris(sumMatris);
		*/
		
		int[][] matris = e1.findSameValues();
		e1.printMatris(matris);
		input.close();
	}
	
}
