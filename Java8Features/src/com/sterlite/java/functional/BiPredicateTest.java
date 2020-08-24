package com.sterlite.java.functional;

import java.util.function.BiPredicate;

import com.sterlite.java.beans.Product;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 10 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class BiPredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BiPredicate<String, String> b1 = (str1,str2)->str1.startsWith(str2);
		BiPredicate<String, String> b1 = String::startsWith;  // method reference
		
		System.out.println(b1.test("Welcome to Java", "Welcome"));
		System.out.println(b1.test("Welcome to Java", "Java"));
		
		BiPredicate<Integer, Double> b2 = (no1,no2)->no1.intValue()==no2.doubleValue();
		System.out.println(b2.test(100, 100.0));
		System.out.println(b2.test(100, 100.1));

	}

}
