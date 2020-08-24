package com.sterlite.java.functional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 10 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Integer> s1 = () -> 10;
		int a = s1.get();
		System.out.println(a);
		
		Supplier<String> s2 = ()->"Welcome to Java";
		String message = s2.get();
		System.out.println(message);
		
		
		Supplier<LocalDate> s3 = ()->LocalDate.now();
		LocalDate d1 = s3.get();
		System.out.println(d1);
		
		
		Supplier<LocalDate> s4 = LocalDate::now; // static method reference
		LocalDate d2 = s4.get();
		System.out.println(d2);
		
		
		//Supplier<ArrayList<String>> s5 = ()-> new ArrayList<String>();
		Supplier<ArrayList<String>> s5 = ArrayList<String>::new; // constructor reference
		ArrayList<String> arrList = s5.get();
		System.out.println(arrList);
		System.out.println("Size: " + arrList.size());
		
	}

}
