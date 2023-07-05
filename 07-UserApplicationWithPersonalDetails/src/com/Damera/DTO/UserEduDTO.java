package com.Damera.DTO;

public class UserEduDTO {

	private String email;
	private String highestQualification;
	private int passoutYear;
	private int percentage;
	
	public UserEduDTO() {

	}
	
	public UserEduDTO(String email, String highestQualification, int passoutYear, int percentage) {
		super();
		this.email = email;
		this.highestQualification = highestQualification;
		this.passoutYear = passoutYear;
		this.percentage = percentage;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getHighestQualification() {
		return highestQualification;
	}
	
	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}
	
	public int getPassoutYear() {
		return passoutYear;
	}
	
	public void setPassoutYear(int passoutYear) {
		this.passoutYear = passoutYear;
	}
	
	public int getPercentage() {
		return percentage;
	}
	
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
}
