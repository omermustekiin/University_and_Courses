package week05;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	
	private double salary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String SSN, double grossSale,
			double commissionRate, double salary) {
		super(firstName, lastName, SSN, grossSale, commissionRate);
		setSalary(salary);
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Salary : " + getSalary();
	}

	public double earning() {
		return salary + getCommissionRate()*getGrossSale();
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = (salary < 0 ? 0 : salary);
	}
	
	

	
	
}
