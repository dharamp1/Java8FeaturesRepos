package com.sterlite.java.main;

import java.util.StringJoiner;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 12 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class StringJoinerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringJoiner joiner1 = new StringJoiner(",");
		joiner1.add("Pune");
		joiner1.add("Ahmedabad");
		joiner1.add("Mumbai");
		joiner1.add("Nasik");
		joiner1.add("Delhi");
		
		String cities = joiner1.toString();
		System.out.println("StringJoiner1");
		System.out.println(cities);

		
		StringJoiner joiner2 = new StringJoiner("-", "(", ")");
		joiner2.add("Rose").add("Lotus").add("Jasmine");
		System.out.println(joiner2);
		
		// Merging two StringJoiners: Merging Joiner2 in Joiner1
		joiner1.merge(joiner2);  // uses prefix and suffix of invoking StringJoiner
		System.out.println(joiner1);
		
		// Merging two StringJoiners: Merging Joiner1 in Joiner2
		joiner2.merge(joiner1);  // uses prefix and suffix of invoking StringJoiner
		System.out.println(joiner2);
		
		StringJoiner joiner3 = new StringJoiner(",");
		joiner3.add("Elephant");
		joiner3.add("Deer");
		joiner3.add("Rabbit");
		
		StringJoiner joiner4 = new StringJoiner("-", "(", ")");
		joiner4.add("Tiger").add("Lion");
		
		joiner3.merge(joiner4);
		
		System.out.println(joiner3);

		
	}

}
