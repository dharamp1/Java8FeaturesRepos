package com.sterlite.java.base64;

import java.util.Base64;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 11 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class Base64Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte [] arr = {1,4,3,2};
		for(byte b : arr)
			System.out.println(b);
		
		Base64.Encoder encoder = Base64.getEncoder();
		
		byte [] encodedArr = encoder.encode(arr);
		System.out.println("Encoded Byte Array: " + encodedArr);
		for(byte b : encodedArr)
			System.out.println(b);
		
		Base64.Decoder decoder = Base64.getDecoder();
		
		byte [] decodedArr = decoder.decode(encodedArr);
		System.out.println("Decoded Byte Array: " + decodedArr);
		for(byte b : decodedArr)
			System.out.println(b);

		String message = "Hi this is secret";
		
		String encodedMessage = encoder.encodeToString(message.getBytes());
		
		System.out.println("Encoded Message: " + encodedMessage);
		
		String decodedMessage = new String(decoder.decode(encodedMessage));
		System.out.println("Decoded Message: " + decodedMessage);
		
		// Url Encoding
		String url = "http://www.google.com";
		
		Base64.Encoder  urlEncoder = Base64.getUrlEncoder();
		String encodedUrl = urlEncoder.encodeToString(url.getBytes());
		System.out.println("Encoded Url: " + encodedUrl);
		
		Base64.Decoder urlDecoder = Base64.getUrlDecoder();
		String decodedUrl = new String(urlDecoder.decode(encodedUrl));
		System.out.println("Decoded Url: " + decodedUrl);
		
		
		
	}

}
