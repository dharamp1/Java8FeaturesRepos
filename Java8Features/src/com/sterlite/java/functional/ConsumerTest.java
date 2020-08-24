package com.sterlite.java.functional;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 10 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> c1 = a->System.out.println(a);
		c1.accept(10);
		
		Consumer<String> c2 = System.out::println;
		c2.accept("Welcome to Java");
		
		
		Supplier<ArrayList<String>> s5 = ArrayList<String>::new; // constructor reference
		ArrayList<String> arrList = s5.get();
		System.out.println(arrList);
		System.out.println("Size: " + arrList.size());
		
		Consumer<String> c3 = arrList::add;
		c3.accept("Delhi");
		c3.accept("Mumbai");
		c3.accept("Pune");
		
		System.out.println(arrList);
		System.out.println("Size: " + arrList.size());
		
	}

}
