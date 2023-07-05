package com.Damera.DTO;

public class UserAppDTO {

	private String fName;
	private String lName;
	private String email;
	private String pwd;
	private String gender;
	
	public UserAppDTO() {
		
	}
	
	public UserAppDTO(String fName, String lName, String email, String pwd, String gender) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.pwd = pwd;
		this.gender = gender;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
