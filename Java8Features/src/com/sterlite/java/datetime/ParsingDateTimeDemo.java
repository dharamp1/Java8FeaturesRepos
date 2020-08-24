package com.sterlite.java.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParsingDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dateStr = "2020-08-10";
		LocalDate date = LocalDate.parse(dateStr);
		System.out.println("LocalDate: " + date);
		
		String dateStr1 = "25/03/2001";
		//LocalDate date1 = LocalDate.parse(dateStr1); // throws  java.time.format.DateTimeParseException: Text '25/03/2001' could not be parsed at index 0
		LocalDate date1 = LocalDate.parse(dateStr1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("LocalDate: " + date1);
		
		String dateStr2 = "Apr 05, 1901";
		LocalDate date2 = LocalDate.parse(dateStr2, DateTimeFormatter.ofPattern("MMM dd, yyyy"));
		System.out.println("LocalDate: " + date2);
		
		String timeStr = "11:05:45";
		LocalTime time = LocalTime.parse(timeStr);
		System.out.println("LocalTime: " + time);
		
		
		String timeStr1 = "21:05:45";
		//LocalTime time1 = LocalTime.parse(timeStr1,DateTimeFormatter.ofPattern("hh:mm:ss"));// throws  java.time.format.DateTimeParseException: Text '21:05:45' could not be parsed: Invalid value for ClockHourOfAmPm (valid values 1 - 12): 21
		LocalTime time1 = LocalTime.parse(timeStr1,DateTimeFormatter.ofPattern("HH:mm:ss"));
		System.out.println("LocalTime: " + time1);
		
		String timeStr2 = "09-45";
		LocalTime time2 = LocalTime.parse(timeStr2,DateTimeFormatter.ofPattern("hh-mm"));
		System.out.println("LocalTime: " + time2);
		
		
		
	}

}
