package week03;

import java.util.Random;
import java.util.Scanner;

public class MathTest {

	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);
//		
//		System.out.print("Enter three number : ");
//		int num1 = input.nextInt();
//		int num2 = input.nextInt();
//		int num3 = input.nextInt();
//		
//		System.out.println(Math.findMax(num1, num2, num3));
//		
//		System.out.println(Math.carpimBul());
//		
//		
		
//		System.out.println();
//		
		Random r = new Random();
//		
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<5; j++) {
//				int number = r.nextInt(7);
//				if(number == 5) {
//					System.out.print("x ");
//					//continue;
//				}else {
//					System.out.print(number + " ");
//				}
//			}
//			System.out.println();
//		}
		
		Math.isMukemmel(17); //6, 28, 496
		
		System.out.println(Math.power(5, 3));
		
		
		System.out.print("Dizi boyutunu giriniz : ");
		int size = input.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = r.nextInt(11);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		input.close();
	}

}
