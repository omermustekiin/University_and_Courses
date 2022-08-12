package week04;

import java.util.Random;

public class ArrayExample {
	
	
	
	public void displayArray(int[] r) {
		System.out.println("Index \tValue");
		for(int i = 0; i<r.length; i++) {
			System.out.println(i + "\t" + r[i]);
		}
	}
		
	public int[] assignArray(int[] r, Random random) {
		for(int i = 0; i<r.length; i++) {
			r[i] = random.nextInt(6) + 1;
		}
		return r;
	}
	
	public int[] modifyArray(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (arr[i]*2) + 2;
		}
		return arr;
	}
	
	public int sumArray(int[] arr) {
		int total = 0;
		for(int value : arr) {
			total += value;
		}
		return total;
	}
	
	public void getProbability(int[] arr) {
		System.out.println("Yazi gelme olasiligi : " + arr[0]*1.0 / (arr[0]+arr[1]));
		System.out.println("Tura gelme olasiligi : " + arr[1]*1.0 / (arr[0]+arr[1]));
	}
	

}
