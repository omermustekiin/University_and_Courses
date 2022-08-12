package week03;

public class Math {

	public static int findMax(int num1, int num2, int num3) {
		
		int max = num1;
		
		if(num2 > max && num2 > num3) {
			max = num2;
		}else if(num3 > max && num3 > num2) {
			max = num3;
		}
		
		return max;
		
	}
	
	
	public static double carpimBul() {
		
		double result = 1;
		
		for(int i = 1; i<15 ; i+=2) {
			result*= i;
		}
		
		return result;
		
	}
	
	public static void isMukemmel(int num) {
		
		int sum = 0;
		
		for(int i=1; i<num; i++) {
			if(num % i == 0) {
				sum+=i;
			}
		}
		
		if(sum == num) {
			System.out.println("Sayý mukemmel.");
		}else {
			System.out.println("Sayý mukemmel degil.");
		}
		
	}
	
	public static int power(int x, int y) throws Exception {
		int total =1;
		
		if(x==0 && y==0) {
			throw new Exception("x and y can not be zero at the same time");
		}
		
		for(int i=0; i<y; i++) {
			total*=x;
		}
		return total;
	}
	
	
	
}
