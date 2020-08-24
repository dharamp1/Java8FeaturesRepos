package com.sterlite.java.collections.utilities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.sterlite.java.beans.Product;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 11 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> prodList = new ArrayList<>();
		prodList.add(new Product(12, "Refrigerator", "Whirlpool", 43000.00f));
		prodList.add(new Product(16, "Mobile", "Samsung", 18000.00f));
		prodList.add(new Product(11, "Laptop", "Lenovo", 30500.00f));
		prodList.add(new Product(13, "Laptop", "Asus", 28300.00f));
		
		
		System.out.println("Sorting product list in asc order");
		prodList.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		
		System.out.println("\nSorting product list in desc order");
		prodList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("\nSorting product list in asc order of name");
		prodList.stream().sorted(Comparator.comparing(Product::getName)).forEach(System.out::println);
		
		System.out.println("\nSorting product list in desc order of name");
		prodList.stream().sorted(Comparator.comparing(Product::getName).reversed()).forEach(System.out::println);
		
		System.out.println("\nSorting product list in asc order of brand");
		prodList.stream().sorted(Comparator.comparing(Product::getBrand)).forEach(System.out::println);
		
		System.out.println("\nSorting product list in asc order of name and then brand");
		prodList.stream().sorted(Comparator.comparing(Product::getName).thenComparing(Comparator.comparing(Product::getBrand))).forEach(System.out::println);
		
		System.out.println("\nSorting product list in asc order of name and then desc order of brand");
		prodList.stream().sorted(Comparator.comparing(Product::getName).thenComparing(Comparator.comparing(Product::getBrand,Comparator.reverseOrder()))).forEach(System.out::println);
		
		System.out.println("\nSorting product list in asc order of name and then price");
		prodList.stream().sorted(Comparator.comparing(Product::getName).thenComparingDouble(Product::getPrice)).forEach(System.out::println);
	}

}
