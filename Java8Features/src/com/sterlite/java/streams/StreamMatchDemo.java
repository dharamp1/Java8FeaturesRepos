package com.sterlite.java.streams;

import java.util.stream.Stream;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 10 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class StreamMatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> intStm = Stream.of(23,12,45,90,36,27);
		
		//System.out.println("All elements match above 50: "  + intStm.allMatch(e->e>1));
		
		//System.out.println("Any element match above 100: "  + intStm.anyMatch(e->e>100));
		
		//System.out.println("None element match above 50: "  + intStm.noneMatch(e->e>50));
		
		System.out.println("None element match above 100: "  + intStm.noneMatch(e->e>100));
	}

}
