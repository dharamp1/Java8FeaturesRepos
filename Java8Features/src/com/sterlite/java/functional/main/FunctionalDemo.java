package com.sterlite.java.functional.main;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.sterlite.java.beans.Product;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 10 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class FunctionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p1 = a->a>10;
		
		System.out.println(p1.test(20));
		System.out.println(p1.test(5));
		
		Predicate<String> p2 = s->s.equals("Hello");
		System.out.println(p2.test("Hello"));
		System.out.println(p2.test("Hello World"));
		
		Product product = new Product(12445, "Mobile", "Honor", 18999.99f);
		
		Predicate<Product> p3 = prod->prod.getPrice()<20000.00f;
		System.out.println(p3.test(product));
		
		Product product2 = new Product(45334, "Mobile", "Samsung", 24500.00f);
		
		BiPredicate<Product, Product> bp1 = (prod1,prod2)->prod1.getPrice()>prod2.getPrice();
		System.out.println(bp1.test(product, product2));
		
		bp1 = (prod1,prod2)->prod1.getBrand().equals(prod2.getBrand());
		System.out.println(bp1.test(product, product2));
		
		bp1 = (prod1,prod2)->prod1.getName().equals(prod2.getName());
		System.out.println(bp1.test(product, product2));
		
		Consumer<Product> c = prod->System.out.println(prod);
		c.accept(product);
		c.accept(product2);
		
		Supplier<Product> s = ()-> {  return new Product(3223, "Laptop", "HP", 53500.00f);     };
		System.out.println(s.get());
		
		
		Function<Product, Float> f = prod->prod.getPrice();
		
		System.out.println(f.apply(product2));
		System.out.println(f.apply(product));
		
		
	}

}
