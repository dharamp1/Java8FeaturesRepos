package com.sterlite.java.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

import com.sterlite.java.beans.Product;


/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 11 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class ProductSetSortedDemo {
	
	public static void main(String[] args) {
		
		HashSet<Product> prodSet = new HashSet<>();
		//HashSet<Product> prodSet = new HashSet<>(Collections.reverseOrder());
		
		//LinkedHashSet<Product> prodSet = new LinkedHashSet<>();
		prodSet.add(new Product(12, "Laptop", "HP", 43000.00f));
		prodSet.add(new Product(16, "Mobile", "Samsung", 18000.00f));
		prodSet.add(new Product(11, "Laptop", "Lenovo", 28300.00f));
		prodSet.add(new Product(16, "Mobile", "Samsung", 18000.00f));
		
		
		prodSet.forEach(p->System.out.println(p));
	}

}
