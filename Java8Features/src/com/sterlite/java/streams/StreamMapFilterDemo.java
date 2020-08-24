package com.sterlite.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sterlite.java.beans.Product;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 10 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class StreamMapFilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> prodList = new ArrayList<>();
		prodList.add(new Product(12, "Refrigerator", "Whirlpool", 43000.00f));
		prodList.add(new Product(16, "Mobile", "Samsun", 18000.00f));
		prodList.add(new Product(11, "Laptop", "Lenovo", 28300.00f));
		
		Stream<Product> strmProducts  = prodList.stream();
		Stream<Float> strmPrices = strmProducts.map(p->p.getPrice());
		Stream<Float> filteredStrmPrices = strmPrices.filter(price->price>25000.00f);
		List<Float> prices = filteredStrmPrices.collect(Collectors.toList());
		prices.forEach(price->System.out.println(price));
		
		System.out.println("Pipeline Operations-Method call chain");
		List<Float> productPrices = prodList.stream()
				.map(p->p.getPrice())
				.filter(price->price>25000.00f)
				.collect(Collectors.toList());
		
		productPrices.forEach(System.out::println);
	}

}
