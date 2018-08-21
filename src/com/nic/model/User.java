package com.nic.model;

public class User{
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", city=" + city + ", mobile="
				+ mobile + ", designation=" + designation + ", email=" + email
				+ ", addrs=" + addrs + ", other=" + other + ", getFirstname()="
				+ getFirstname() + ", getLastname()=" + getLastname()
				+ ", getDesignation()=" + getDesignation() + ", getCity()="
				+ getCity() + ", getMobile()=" + getMobile() + ", getEmail()="
				+ getEmail() + ", getAddrs()=" + getAddrs() + ", getOther()="
				+ getOther() + ", getUserId()=" + getUserId() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	private int userId;
	private String firstname;
	private String lastname;
	private String city;
	private String mobile;
	private String designation;
	private String email;
	
	Address   addrs;
	Other     other;
	
	
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	
	
	
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	public Address getAddrs() {
		return addrs;
	}
	public void setAddrs(Address addrs) {
		this.addrs = addrs;
	}
	
	
	
	public Other getOther() {
		return other;
	}
	public void setOther(Other other) {
		this.other = other;
	}
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	

	
}
