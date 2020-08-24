package com.sterlite.java.functional;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Supplier;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 10 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> p1 = str->str.startsWith("Intern");
		//Predicate<String> p1 = (str)->str.startsWith("Internal");
		
		System.out.println(p1.test("Internationalization"));
		
		Predicate<String> p2 = String::isEmpty; // instance method reference
		System.out.println(p2.test("Welcome to Java"));
		System.out.println(p2.test(""));
		
		Supplier<ArrayList<Integer>> s1 = ArrayList::new;
		ArrayList<Integer> numList = s1.get();
		
		numList.add(400);
		numList.add(100);
		numList.add(700);
		numList.add(200);
		
		Predicate<Integer> p3 = numList::contains; // instance method reference
		System.out.println(p3.test(100));
		System.out.println(p3.test(800));
		
		
	}

}
