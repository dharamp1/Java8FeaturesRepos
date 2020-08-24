package com.sterlite.java.functional;

import java.util.function.BinaryOperator;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 10 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class BinaryOperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BinaryOperator<Integer> b1 = (no1,no2)->no1>no2?no1:no2;
		BinaryOperator<Integer> b1 = (no1,no2)->Integer.max(no1, no2);
		
		System.out.println("Max value is " + b1.apply(10, 20));
		System.out.println("Max value is " + b1.apply(120, 20));
		
		BinaryOperator<Integer> b2 = Integer::min; // static method reference
		System.out.println("Min value is " + b2.apply(10, 20));
		System.out.println("Min value is " + b2.apply(120, 20));
		
		BinaryOperator<String> b3 = (s1,s2)->s1 + s2;
		System.out.println("Resultant string is " + b3.apply("Welcome to ", " Java"));
	}

}
