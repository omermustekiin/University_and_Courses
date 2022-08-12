package week06;

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private String SSN;
	
	public Employee(String firstName, String lastName, String sSN) {
		this.firstName = firstName;
		this.lastName = lastName;
		SSN = sSN;
	}
	
	
	public abstract double earning();

	@Override
	public String toString() {
		return String.format("Firstname : %s Lastname : %s Social Security Number : %s", firstName, lastName, SSN);
	}

	public String getFirstName() {
		return firstName;
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
		this.SSN = sSN;
	}
	
	
	
	
	
}
