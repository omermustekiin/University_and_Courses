package week05;

public class CommissionEmployeeTest {

	public static void main(String[] args) {
		
		CommissionEmployee e1 = new CommissionEmployee("Zehra", "Cicek", "A14", 14, 100);
		System.out.println(e1.toString());
		
		System.out.println("**************");
		
		e1.setGrossySale(124);
		System.out.println(e1); //toString methodu çalýþtý
		
	}

}
