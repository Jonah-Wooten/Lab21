package com.CoffeeShop.model;

import java.io.Serializable;

public class Person implements Serializable {

	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	private static final long serialVersionUID = 1L;
	private String fName;
	private String lName;
	private String eName;
	private String pNumber;
	private String passN;
	
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
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getpNumber() {
		return pNumber;
	}
	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}
	public String getpassN() {
		return passN;
	}
	public void setpassN(String passN) {
		this.passN = passN;
	}
	public Person(String fName, String lName, String eName, String pNumber, String passN) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.eName = eName;
		this.pNumber = pNumber;
		this.passN = passN;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + fName + ", lastName=" + lName + ", eName=" + eName + ", pNumber=" + pNumber
				+ ", pWord=" + passN + "]";
	}
	
	
	
	
	
	
}
