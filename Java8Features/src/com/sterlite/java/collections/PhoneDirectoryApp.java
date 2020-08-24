package com.sterlite.java.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 11 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class PhoneDirectoryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<String, Long> phoneDir = new HashMap<>();
		//Map<String, Long> phoneDir = new LinkedHashMap<>();
		//Map<String, Long> phoneDir = new TreeMap<>();
		Map<String, Long> phoneDir = new TreeMap<>(Collections.reverseOrder());
		phoneDir.put("Kareena Kapoor", 9056634333L);
		phoneDir.put("Amitabh Bachchan", 56343433323L);
		phoneDir.put("Alia Bhat", 3400003232L);
		phoneDir.put("Varun Dhawan", 300544344L);
		phoneDir.put("Madhuri Dixit", 124343433L);
		phoneDir.putIfAbsent("Alia Bhat", 7777777777L);
		phoneDir.putIfAbsent("Aishwarya Ray Bachchan", 5656565656L);
	
		
		System.out.println(phoneDir);
		
		System.out.println("Contact no of Alia: " + phoneDir.get("Alia Bhat"));
		
		
		System.out.println("\nUsing Java 8 forEach method");
		phoneDir.forEach((k,v)->System.out.println(k + ":" + v));
		
		System.out.println("\nWith keys starting with A");
		phoneDir.forEach((k,v)->{if(k.startsWith("A"))System.out.println(k + ":" + v);});
		
		System.out.println("\nWith matching value");
		phoneDir.forEach((k,v)->{if(v.equals(3400003232L))System.out.println(k + ":" + v);});
	}

}
