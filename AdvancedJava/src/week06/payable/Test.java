package week06.payable;

public class Test {

	public static void main(String[] args) {
				
		IPayable[] payables = new IPayable[4];
		
		payables[0] = new Invoice("A", "B", 0, 0);
		payables[1] = new Invoice("C", "D", 1, 1);
		payables[2] = new SalariedEmployee("E", "F", "LAB206", 2);
		payables[3] = new SalariedEmployee("G", "H", "Lab306", 3);
		
		for(IPayable p : payables) {
			System.out.println(p.toString());
		}
		
		
		
	}

}
