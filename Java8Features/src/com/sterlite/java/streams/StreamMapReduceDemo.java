package com.sterlite.java.streams;

import java.util.ArrayList;
import java.util.List;

import com.sterlite.java.beans.Product;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 10 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class StreamMapReduceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1,"Laptop","HP",35000.00f));
		products.add(new Product(2,"Mobile","Samsung",32700.00f));
		products.add(new Product(3,"Laptop","Lenovo",28500.00f));
		
		// This is more compact approach for filtering data  
		Float totalPrice1 = products.stream()
				.map(product->product.getPrice())
				.reduce(0.0f,(sum,price)->sum+price);	// accumulating price  
		
		System.out.println(totalPrice1);
		
		// More precise code
		float totalPrice2=products.stream()
				.map(product->product.getPrice())
				.reduce(0.0f,Float::sum);	// accumulating price, by referring method of Float class  
			
		System.out.println(totalPrice2);
	}

}
