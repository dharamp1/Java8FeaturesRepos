package com.sterlite.java;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 10 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class Student {
	
	private int rollNo;
	private String name;
	private float percentages;
	
	public Student(int rollNo, String name, float percentages) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.percentages = percentages;
	}
	
	
	public boolean equals(Object ob) {
		
		if(!(ob instanceof Student))
			return false;
		
		Student s = (Student) ob;
		if(this.rollNo==s.rollNo && this.name.equals(s.name) && this.percentages==s.percentages)
			return true;
		else
			return false;
	}
	
	public String toString() {
		return "RollNo: " + rollNo + 
				" Name: " + name + 
				" Percentages: " + percentages;
	}
	
	

}
