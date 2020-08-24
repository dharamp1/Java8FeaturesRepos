package com.sterlite.java.functional;

import java.util.function.BiFunction;

import com.sterlite.java.beans.Product;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 10 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class BiFunctionTest {
	
	public static void main(String[] args) {
		//BiFunction<String, Integer, Character> b1 = (str,index)->str.charAt(index);
		BiFunction<String, Integer, Character> b1 = String::charAt;// method reference
		
		System.out.println("Character at index 0 is " + b1.apply("Hello", 0));
		
		BiFunction<String, String, String> b2 = (str1,str2)-> str1.concat(str2);
		System.out.println(b2.apply("Sterlite", " Tech"));
		
	}

}
