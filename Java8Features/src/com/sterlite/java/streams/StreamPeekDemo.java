package com.sterlite.java.streams;

import java.util.stream.Stream;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 10 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class StreamPeekDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> intStm = Stream.of(23,12,45,90,36,27);
		
		//intStm.filter(e->e%2==0).peek(e->System.out.println(e)); // no output printed because not terminal operation instead final intermediate operation
		
		// unless some terminal operation is invoked on stream peek won't work
		//long count = intStm.filter(e->e%2==0).peek(e->System.out.println(e)).count();	
		//System.out.println("No of even elements: " + count);
		
		
		//System.out.println(intStm.filter(e->e%2==0).peek(e->System.out.println(e)).findFirst().get());
		//intStm.filter(e->e%2==0).peek(e->System.out.println(e)).findAny();
		
		
	}

}
