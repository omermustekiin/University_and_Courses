package week06;

public class BasePlusCommissionEmployee extends CommissionEmployee {

	private double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String sSN, double commissionRate,
			double grossSale, double baseSalary) {
		super(firstName, lastName, sSN, commissionRate, grossSale);
		this.baseSalary = baseSalary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Base Salary : " + getBaseSalary();
	}
	
	@Override
	public double earning() {
		return getCommissionRate()*getGrossSale() + getBaseSalary();
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	
	
	
}
