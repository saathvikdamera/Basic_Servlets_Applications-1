package com.Damera.DTO;

public class UserDetailsDTO {
	private String email;
	private String fatherName;
	private String motherName;
	private int noOfSiblings;
	
	public UserDetailsDTO() {
		
	}

	public UserDetailsDTO(String email, String fatherName, String motherName, int noOfSiblings) {
		super();
		this.email = email;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.noOfSiblings = noOfSiblings;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public int getNoOfSiblings() {
		return noOfSiblings;
	}

	public void setNoOfSiblings(int noOfSiblings) {
		this.noOfSiblings = noOfSiblings;
	}
	

}
