package com.sterlite.java.functional.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.sterlite.java.classes.Message;
import com.sterlite.java.classes.MyClass;
import com.sterlite.java.classes.YourClass;
import com.sterlite.java.functional.Addable;
import com.sterlite.java.functional.Greeting;
import com.sterlite.java.functional.GreetingMsg;
import com.sterlite.java.functional.StringMerger;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 10 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class MethodReferenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// static method reference
		YourClass o1 = new YourClass();
		Greeting g1 = YourClass::aMethod;
		System.out.println(g1.sayGreet(20));
		
		// instance method reference
		MyClass ob = new MyClass();
		Greeting g  = ob::hello;
		
		System.out.println(g.sayGreet(10));
		
		// instance method reference of an arbitrary object of class type
		
		
		StringMerger sm = String::concat;
		System.out.println(sm.merge("Hello", " World!"));
		
		
		
		
		Comparator<Integer> c1 = Integer::max;
		System.out.println(c1.compare(400,500));
		
		Comparator<Integer> c2 = Integer::min;
		System.out.println(c2.compare(400,500));
		
		List<String> cities = Arrays.asList("Pune","Ahmedabad","Mumbai","Gurgaon");
		cities.sort(String::compareTo);
		cities.forEach(city->System.out.println(city));
		
		
		// constructor reference
		GreetingMsg gm = Message::new;
		Message msg = gm.getMessage(10);
		//System.out.println(msg.getA());
		
		
		
		
		
		
		
		
		
		
		
	}

}
