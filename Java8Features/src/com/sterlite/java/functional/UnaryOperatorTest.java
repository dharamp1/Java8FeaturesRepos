package com.sterlite.java.functional;

import java.util.function.UnaryOperator;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 10 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class UnaryOperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator<Integer> u1 = i1->i1 + i1;
		System.out.println(u1.apply(new Integer(400)));
		
		UnaryOperator<String> u2 = s->s.toLowerCase();
		System.out.println(u2.apply("WELCOME"));
		
		UnaryOperator<String> u3 = String::toUpperCase;
		System.out.println(u3.apply("Hello"));
	}

}
