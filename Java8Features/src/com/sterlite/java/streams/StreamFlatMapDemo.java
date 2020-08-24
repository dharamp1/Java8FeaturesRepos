package com.sterlite.java.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 10 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class StreamFlatMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> lists = 
				Arrays.asList(
						Arrays.asList("Pune","Mumbai"),
						Arrays.asList("Bengaluru","Ooty"),
						Arrays.asList("Kanpur","Varanasi"));
		// printing list of lists of strings
		System.out.println(lists);
		
		List<String> cityList =
				lists.stream()  // Stream<List<String>>
				.flatMap(list->list.stream()) // Stream<String>
				.collect(Collectors.toList());
		
		// printing list of strings
		System.out.println(cityList);
		
		List<String> cityList1 =
				lists.stream()
				.flatMap(Collection::stream) // method reference
				.collect(Collectors.toList());
		
		// printing list of strings
		System.out.println(cityList1);
		
		int[] intArray = {1, 2, 3, 4, 5, 6}; 
		
		Stream<int []> streamIntArr = Stream.of(intArray);
		
		IntStream intStream =
				streamIntArr.flatMapToInt(arr->Arrays.stream(arr));
		
		intStream.forEach(e->System.out.println(e));
	}

}
