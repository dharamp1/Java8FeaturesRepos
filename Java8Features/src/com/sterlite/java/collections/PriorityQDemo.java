package com.sterlite.java.collections;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 11 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class PriorityQDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Queue<Integer> numQ = new PriorityQueue<>();
		//Queue<Integer> numQ = new PriorityQueue<>(Collections.reverseOrder());
		Deque<Integer> numQ = new LinkedList<>();
		numQ.add(20);
		numQ.offer(10);
		numQ.offer(70);
		numQ.offer(20);
		numQ.add(40);
		
		System.out.println("Head of Q: " + numQ.peek());
		
		System.out.println("Elements of Q");
		numQ.forEach(System.out::println);
		
		System.out.println("Removing head of Q: " + numQ.poll());
		
		System.out.println("Head of Q: " + numQ.peek());
		
		while (!numQ.isEmpty()) {
			System.out.println("Polling: " + numQ.poll());
		}
		
		
		//System.out.println("Head of Q: " + numQ.element());
		
	}

}
