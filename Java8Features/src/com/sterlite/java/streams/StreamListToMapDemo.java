package com.sterlite.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.sterlite.java.beans.Product;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 10 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class StreamListToMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1,"Laptop","HP",35000.00f));
		products.add(new Product(2,"Mobile","Samsung",32700.00f));
		products.add(new Product(3,"Laptop","Lenovo",28500.00f));
		products.add(new Product(4,"Mobile","Lenono",35000.00f));
		
		Map<Integer, String> productMap =
				products.stream()
				.collect(Collectors.toMap(p->p.getProductId(), p->p.getName()));
		
		System.out.println(productMap);
	}

}
