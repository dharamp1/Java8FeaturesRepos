package com.sterlite.java.beans;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 10 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class Product implements Comparable<Product>{
	
	private int productId;
	private String name;
	private String brand;
	private float price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int productId, String name, String brand, float price) {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
	public int compareTo(Product p) {
		
		return this.productId>p.productId?1:-1;
		
	}
	
	public int hashCode() {
		return productId + name.hashCode() + brand.hashCode();
	}
	
	public boolean equals(Object ob) {
		if(!(ob instanceof Product)) return false;
		Product p = (Product) ob;
		if(this.productId==p.productId 
				&& this.name.equals(p.name)
					&& this.brand.equals(p.brand) 
						&& this.price == p.price)
			return true;
		else
			return false;	
	}

}
