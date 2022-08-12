package week06;

public class CommissionEmployee extends Employee{

	private double commissionRate;
	private double grossSale;
	
	public CommissionEmployee(String firstName, String lastName, String sSN, double commissionRate, double grossSale) {
		super(firstName, lastName, sSN);
		setCommissionRate(commissionRate);
		this.grossSale = grossSale;
	}

	@Override
	public String toString() {
		return super.toString() + " Gross Sale " + getGrossSale() + " Commission Rate : " + getCommissionRate();
	}
	
	@Override
	public double earning() {
		return getCommissionRate()*getGrossSale();
	}
	
	
	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = (commissionRate > 0 && commissionRate < 1)?commissionRate:0;
	}

	public double getGrossSale() {
		return grossSale;
	}

	public void setGrossSale(double grossSale) {
		this.grossSale = grossSale;
	}

	
	
	
	
	

}
