package week12;

public class Account {

	private String userName, password;
	
	public Account() {
		this.userName="admin";
		this.password="beykent";
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
