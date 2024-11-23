package com.heck.studentsorting;

public class Student {
	
	//Fields making up student object
	public int rollno; 
	public String name; 
	public String address;
	
	//Default Constructor
	public Student(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	//Getters and Setters
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	} 
	
	//Output as string
	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}
	

}
