package com.Damera.DTO;

public class EmployeeDTO {
	private int eid;
	private String ename;
	private String email;
	private String gender;
	private String dept;
	private Integer exp;
	public EmployeeDTO() {
		
	}
	
	public EmployeeDTO(String ename, String email, String gender, String dept, Integer exp) {
		super();
		this.ename = ename;
		this.email = email;
		this.gender = gender;
		this.dept = dept;
		this.exp = exp;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Integer getExp() {
		return exp;
	}

	public void setExp(Integer exp) {
		this.exp = exp;
	}
	
}
