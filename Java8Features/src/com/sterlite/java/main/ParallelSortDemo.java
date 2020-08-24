package com.sterlite.java.main;

import java.util.Arrays;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 12 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class ParallelSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {7,4,9,2,12,56,23};
		
		System.out.println("Before parallel sort");
		for(int ele:arr)
			System.out.println(ele);
		
		Arrays.parallelSort(arr);
		
		System.out.println("After parallel sort");
		for(int ele:arr)
			System.out.println(ele);
	}

}
