package com.sterlite.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import com.sterlite.java.beans.Product;
import com.sterlite.java.collections.utilities.ProductNameComparator;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 11 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class ProductListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> prodList = new ArrayList<>();
		prodList.add(new Product(12, "Refrigerator", "Whirlpool", 43000.00f));
		prodList.add(new Product(16, "Mobile", "Samsung", 18000.00f));
		prodList.add(new Product(11, "Laptop", "Lenovo", 28300.00f));
		
		
		
		System.out.println("Before Sorting");
		for(Product p:prodList) {
			System.out.println(p);
		}
		
		Collections.sort(prodList);
		
		System.out.println("After Sorting");
		for(Product p:prodList) {
			System.out.println(p);
		}
		
		ProductNameComparator pnc = new ProductNameComparator();
		Collections.sort(prodList, pnc);
		
		System.out.println("After Sorting as per name");
		for(Product p:prodList) {
			System.out.println(p);
		}
		
		Collections.sort(prodList,Collections.reverseOrder());
		
		System.out.println("After Sorting as per desc id");
		for(Product p:prodList) {
			System.out.println(p);
		}
		
		Collections.sort(prodList,Collections.reverseOrder(pnc));
		
		System.out.println("After Sorting as per desc name");
		for(Product p:prodList) {
			System.out.println(p);
		}
		
		
		Collections.sort(prodList, (p1,p2)-> p1.getPrice()>p2.getPrice()?1:-1 );
		System.out.println("After Sorting as per price");
		prodList.forEach(p->System.out.println(p));
		
		Collections.sort(prodList, (p1,p2)-> p1.getPrice()<p2.getPrice()?1:-1 );
		System.out.println("After Sorting as per desc price");
		prodList.forEach(System.out::println);
		
	}

}
