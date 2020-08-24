package com.sterlite.java.functional;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

import com.sterlite.java.beans.Product;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 10 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class BiConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<String, Integer> b1 = (message,age)-> System.out.println("Dear User, " + message + " your age is " + age);
		b1.accept("Welcome", 23);
		
		Supplier<Product> s1 = ()->new Product(1001, "LED TV", "Sony", 65000.00f);
		Product product = s1.get();
		
		BiConsumer<String, Float> b2 = (name,price)-> System.out.println("Product Name: " + name + " and Price: " + price);
		b2.accept(product.getName(), product.getPrice());
		
		Map<String, Long> actorPhMap = new HashMap<>();
		
		BiConsumer<String, Long> b3 = (key,value)->actorPhMap.put(key, value);
		//BiConsumer<String , Long> b3 = actorPhMap::put; // instance method reference
		b3.accept("Varun Dhawan", 4555509333L);
		b3.accept("Alia Bhat", 8900223344L);
		b3.accept("Shraddha Kapoor", 7200323221L);
		b3.accept("Prabhas", 9022776688L);
		
		System.out.println(actorPhMap);

	}
}


