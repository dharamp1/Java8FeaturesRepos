package com.sterlite.java.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 11 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class FormattingDateTimeDemo {
	
	public static void main(String[] args) {
		
		
		LocalDate dt = LocalDate.of(2020, 8, 11);
		System.out.println("Original Date: " + dt);
		
		// Creating DateFormatter
		//DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		//DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		//DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		//DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		
		// Formatting LocalDate
		String formattedDate = dt.format(formatter);
		System.out.println("Formatted Date: " + formattedDate);
		
		
		// LocalTime
		LocalTime time = LocalTime.now();
		System.out.println("Original Time: " + time);
		
		// Creating TimeFormatter
		//DateTimeFormatter timeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		//DateTimeFormatter timeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		//DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh-mm-ss");
		//DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm");
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
		
		// Formatting LocalTime
		String formattedTime = time.format(timeFormatter);
		System.out.println("Formatted Time: " + formattedTime);

	}

}
