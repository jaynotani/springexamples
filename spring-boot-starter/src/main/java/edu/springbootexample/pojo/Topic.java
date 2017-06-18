package edu.springbootexample.pojo;

public class Topic {
	
	private String name;
	private String mobileNumber;
	private String address;
	
	public Topic(){
		
	}
	
	public Topic(String name, String mobileNumber, String address) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
