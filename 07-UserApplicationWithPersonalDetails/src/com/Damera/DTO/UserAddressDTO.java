package com.Damera.DTO;

public class UserAddressDTO {
	
	private String email;
	private String city;
	private String state;
	private String country;
	
	public UserAddressDTO(){
		
	}
	
	public UserAddressDTO(String email, String city, String state, String country){
		super();
		this.email = email;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
