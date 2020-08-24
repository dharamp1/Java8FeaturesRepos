package com.sterlite.java.functional;

import java.util.function.Function;

import com.sterlite.java.beans.Product;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 10 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Function<String,Integer> f1 = str->str.length();
		Function<String,Integer> f1 = String::length;   // method reference
		System.out.println("Length of string : " + f1.apply("Welcome"));
		System.out.println("Length of string : " + f1.apply("Internationalization"));
		
		String s = "Hello";
		Function<Integer, Character> f2 = s::charAt; // instance method reference
		System.out.println("Character : " + f2.apply(2));
		
		Function<Product, Float> f3 = p->p.getPrice();
		Product product = new Product(1001, "Laptop", "HP", 65000.00f);
		
		float price = f3.apply(product);
		System.out.println("Price of product: " + price);
		
		Function<Product, String> f4 = p->"Product name is " + p.getName() + " and Brand is " + p.getBrand();
		System.out.println(f4.apply(product));
	}

}
