package week05;

public class CommissionEmployee extends Object{
	
	private String firstName;
	private String lastName;
	private String SSN;
	private double grossSale;
	private double commissionRate;
	
	public CommissionEmployee(String firstName, String lastName, String SSN, double grossSale, double commissionRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
		setGrossySale(grossSale);
		setCommissionRate(commissionRate);
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return String.format("FirstName : %s\nLastName : %s\nSSN : %s\nGrossSale : %f\nCommissioanRate : %f\n", firstName, lastName, SSN, grossSale, commissionRate);
	}
	

	public double earning() {
		return commissionRate*grossSale;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public double getGrossSale() {
		return grossSale;
	}

	public void setGrossySale(double grossSale) {
		
		this.grossSale = (grossSale < 0.0 ? 0 : grossSale);
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = (commissionRate>0 && commissionRate<1 ? commissionRate : 0);
	}
	
	
	

}

