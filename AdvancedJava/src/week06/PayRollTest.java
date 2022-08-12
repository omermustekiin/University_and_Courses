package week06;

public class PayRollTest {

	public static void main(String[] args) {
		
		
		SalariedEmployee s1 = new SalariedEmployee("Toprak", "Su", "A124", 14);
		HourlyEmployee h1 = new HourlyEmployee("Güneþ", "Yýldýz", "A12", 10, 7);
		CommissionEmployee c1 = new CommissionEmployee("Ay", "Merkur", "Lab306", 9, 5);
		BasePlusCommissionEmployee b1 = new BasePlusCommissionEmployee("Bob", "Lewis", "Lab206", 0.5, 5, 7);
		
		System.out.println("Employees processed individually.");
		
		System.out.println("-------------------------------------");
		System.out.println(s1 + " Earning : " + s1.earning());
		System.out.println("-------------------------------------");
		System.out.println(h1 + " Earning : " + h1.earning());
		System.out.println("-------------------------------------");
		System.out.println(c1 + " Earning : " + c1.earning());
		System.out.println("-------------------------------------");
		System.out.println(b1 + " Earning : " + b1.earning());
		System.out.println("-------------------------------------");
		
		Employee[] employees = new Employee[4];
		employees[0] = s1;
		employees[1] = h1;
		employees[2] = c1;
		employees[3] = b1;
		
		System.out.println("-------------------------------------");
		
		for( Employee e : employees) {
			if(e instanceof BasePlusCommissionEmployee) {
				System.out.println(e);
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) e;	// downcasting
				employee.setBaseSalary(employee.getBaseSalary()*2);
			}
			System.out.println(e);
		}
		
		System.out.println();
		
		for(int i = 0; i<employees.length; i++) {
			System.out.println(employees[i].getClass().getName());
		}
		
		
		
	}

}
