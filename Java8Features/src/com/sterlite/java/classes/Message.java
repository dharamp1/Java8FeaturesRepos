package com.sterlite.java.classes;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 10 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class Message {
	
	private int a;
	
	public Message() {
		a = -1;
		System.out.println("default constructor");
	}
	
	public Message(int a) {
		// TODO Auto-generated constructor stub
		this.a = a;
		System.out.println("param constructor");
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
	

}
