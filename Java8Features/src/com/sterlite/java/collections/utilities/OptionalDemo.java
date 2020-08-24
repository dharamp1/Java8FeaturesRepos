package com.sterlite.java.collections.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.sterlite.exceptions.ProductNotFoundException;
import com.sterlite.java.beans.Product;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 11 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class OptionalDemo {
	
	public static void main(String[] args) {
		
		String s = "Hello World";
		
		Optional<String> empt = Optional.empty();
		Optional<String> val = Optional.of(s);
		
		if(empt.isPresent())
			System.out.println(empt.get());
		
		empt.ifPresent(System.out::println);
		System.out.println(val.get());
		
		System.out.println("Filtered Empty: " + empt.filter(s1->s1.equals("welcome")));
		System.out.println("Filtered Value: " + val.filter(s1->s1.equals("Hello World")));
		
		
		System.out.println("orElse value: " + val.orElse("welcome"));
		System.out.println("orElse value in empt: " + empt.orElse("welcome"));
		
		List<Product> prodList = new ArrayList<>();
		prodList.add(new Product(12, "Refrigerator", "Whirlpool", 43000.00f));
		prodList.add(new Product(16, "Mobile", "Samsun", 18000.00f));
		prodList.add(new Product(11, "Laptop", "Lenovo", 28300.00f));
		
		Optional<Product> pOptional = Optional.of(new Product(12, "Refrigerator", "Whirlpool", 43000.00f));
		if(pOptional.isPresent())
			System.out.println(pOptional.get());
		
		System.out.println("orElse value: " + pOptional.orElse(prodList.get(1)));
		
		Optional<Product> pOptional1 = Optional.empty();
		System.out.println("orElse value: " + pOptional1.orElse(prodList.get(1)));
		
		try {
			System.out.println("orElse value: " + pOptional1.orElseThrow(()->new ProductNotFoundException("Product does not exist")));
		} catch (ProductNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
