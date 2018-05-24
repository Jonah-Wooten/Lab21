package com.gc.model;

public class Person {

	private String firstName;
	private String lastName;
	private String eName;
	private int pNumber;
	private String pWord;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getpNumber() {
		return pNumber;
	}
	public void setpNumber(int pNumber) {
		this.pNumber = pNumber;
	}
	public String getpWord() {
		return pWord;
	}
	public void setpWord(String pWord) {
		this.pWord = pWord;
	}
	public Person(String firstName, String lastName, String eName, int pNumber, String pWord) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.eName = eName;
		this.pNumber = pNumber;
		this.pWord = pWord;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", eName=" + eName + ", pNumber=" + pNumber
				+ ", pWord=" + pWord + "]";
	}
	
	
	
	
	
	
}
