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
public class StreamIteratingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> prodList = new ArrayList<>();
		prodList.add(new Product(12, "Refrigerator", "Whirlpool", 43000.00f));
		prodList.add(new Product(16, "Mobile", "Samsun", 18000.00f));
		prodList.add(new Product(11, "Laptop", "Lenovo", 28300.00f));
		
		prodList.stream().forEach(p->System.out.println(p));
	}

}
