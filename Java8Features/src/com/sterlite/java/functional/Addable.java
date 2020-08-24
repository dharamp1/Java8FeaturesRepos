package com.sterlite.java.functional;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 10 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
//@FunctionalInterface
public interface Addable {
	
	int add(int a,int b);
	
	default float addFloats(float a,float b) {
		return a + b;
	}
	
	static String show() {
		return "Addable show";
	}

}
