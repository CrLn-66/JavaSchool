package forms;

public class User {
	private String firstName;
	private String lastName;
	private String password;
	private String birthday;
	private String userName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		String output = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
		this.firstName = output;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		String output = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
		this.lastName = output;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
