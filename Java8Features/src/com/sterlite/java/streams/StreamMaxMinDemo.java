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
public class StreamMaxMinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1,"Laptop","HP",35000.00f));
		products.add(new Product(2,"Mobile","Samsung",32700.00f));
		products.add(new Product(3,"Laptop","Lenovo",28500.00f));
		
		Product product1 = products.stream()
						.max((p1,p2)->p1.getPrice()>p2.getPrice()?1:-1)
				        .get();
				
		System.out.println(product1.getPrice());   // 35000.00
				
		Product product2 = products.stream()
						.min((p1,p2)->p1.getPrice()>p2.getPrice()?1:-1)
				        .get();
				
		System.out.println(product2.getPrice());  // 28500.00

	}

}
