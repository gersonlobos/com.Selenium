package com.Selenium;


public class User {
	
	private String firstName;
	private String lasttName;
	private String email;
	private String phoneNumber;
	private String department;
	
	
	
	
	
	//constructor
	public User(String firstName, String lasttName, String email, String phoneNumber,String department) {
		
		this.firstName = firstName;
		this.lasttName = lasttName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.department = department;
		
	}

	// all getters
	public String getFirstName() {
		return firstName;
	}

	public String getLasttName() {
		return lasttName;
	}

	public String getEmail() {
		return email;
	}

	public String getDepartment() {
		return department;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void displayUserInfo(){
		
		System.out.println("User"+" [name= " + firstName + " , last="  
			      + lasttName + " , email=" + email + " , PhoneNumber="  
			      + phoneNumber + " , Department=" + department + "]"); 
	}
	public boolean compareUserTo(User temp){
		
		if( (temp.getFirstName()).equals(this.firstName) && (temp.getLasttName()).equals(this.lasttName)
				&& (temp.getEmail()).equals(this.email) && (temp.getPhoneNumber()).equals(this.phoneNumber)
				&& (temp.getDepartment()).equals(this.department)){
		return true;
		}
		else{
		return false;
		}
	}

	
	
	
}
