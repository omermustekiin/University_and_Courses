package week06;

public class HourlyEmployee extends Employee{

	private double wage;
	private double hours;

	public HourlyEmployee(String firstName, String lastName, String sSN, double wage, double hours) {
		super(firstName, lastName, sSN);
		setWage(wage);
		this.hours = hours;
	}

	@Override
	public double earning() {
		if(hours <= 40) {
			return wage*hours;
		}else {
			return 40*wage + (hours - 40)*wage*1.5;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + " Wage : " + getWage() + " Hours : " + getHours();
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage<0 ? 0:wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	};
	
	
	
	
	
	
	
}
