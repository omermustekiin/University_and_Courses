package week06.payable;

public class SalariedEmployee extends Employee{

	private double weeklySalary;
	
	public SalariedEmployee(String firstName, String lastName, String sSN, double weeklySalary) {
		super(firstName, lastName, sSN);
		setWeeklySalary(weeklySalary);
	}

	@Override
	public double getPaymentAmount() {
		return 0;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format(" Weekly Salary : %f", weeklySalary);
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary<0 ? 0:weeklySalary;
	}
	
	
	
	
	

}
