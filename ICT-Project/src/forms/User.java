package forms;

import java.io.File;

public class User {
	private File profile = new File("C:\\Users\\Abrasaldo\\eclipse-workspace\\ICT-Project\\src\\forms\\profile-def.png");
	private String firstName;
	private String lastName;
	private String password;
	private String birthday;
	private String userName;
	private String section;
	private String gradeLevel;
	private String sex;
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
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getGradeLevel() {
		return gradeLevel;
	}
	public void setGradeLevel(String gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public File getProfile() {
		return profile;
	}
	public void setProfile(File profile) {
		this.profile = profile;
	}
	
	
}
