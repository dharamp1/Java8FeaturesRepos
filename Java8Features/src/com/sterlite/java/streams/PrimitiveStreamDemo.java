package com.sterlite.java.streams;

import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 10 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class PrimitiveStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntStream ints = IntStream.of(10,60,50,30,20);
		
		//int total = ints.sum();
		//System.out.println("Sum: " + total);
		
		OptionalDouble avg = ints.average();
		avg.ifPresent(System.out::println);
		
		LongStream longs = LongStream.range(11, 15); // inclusive 11 and exclusive 15
		longs.forEach(System.out::println); 
		
		System.out.println("Inclusive of last value");
		LongStream longs1 = LongStream.rangeClosed(11, 15); // inclusive 11 and 15
		longs1.forEach(System.out::println); 
		
		DoubleStream ds = DoubleStream.generate(Math::random);
		ds.limit(5).forEach(System.out::println);
		
		System.out.println("limit and filter");
		IntStream is = IntStream.iterate(1, i->i+1);
		is.limit(10).filter(n->n%2==1).forEach(System.out::println);
		
		System.out.println("filter and limit");
		IntStream is1 = IntStream.iterate(1, i->i+1);
		is1.filter(n->n%2==1).limit(5).forEach(System.out::println);
		
	}

}
