package com.sterlite.exceptions;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 10 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class ProductNotFoundException extends Exception {
	
	private String message;
	
	public ProductNotFoundException() {
		// TODO Auto-generated constructor stub
	}

	public ProductNotFoundException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "ProductNotFoundException [message=" + message + "]";
	}
	
	

}
