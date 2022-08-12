package week06.payable;

public abstract class Employee implements IPayable{
	
	//Abstract class'lar interface metodlarýný override etmek zorunda deðil.
	
	private String firstName;
	private String lastName;
	private String SSN;
	
	public Employee(String firstName, String lastName, String sSN) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = sSN;
	}
	
	@Override
	public String toString() {
		return String.format("First Name : %s, Last Name : %s, SSN : %s", firstName, lastName, SSN);
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
		SSN = sSN;
	}
	
	
	
	

}
