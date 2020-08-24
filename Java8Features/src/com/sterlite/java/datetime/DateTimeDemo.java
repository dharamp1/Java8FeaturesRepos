package com.sterlite.java.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.util.Set;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 11 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// System LocalDate
		LocalDate date = LocalDate.now();
		System.out.println("System LocalDate: " + date);
		
		// System LocalTime
		LocalTime time = LocalTime.now();
		System.out.println("System LocalTime: " + time);
		
		// System LocalDateTime
		LocalDateTime dtTm = LocalDateTime.now();
		System.out.println("System LocalDateTime: " + dtTm);
		
		// System ZonedDateTime
		ZonedDateTime znDtTm = ZonedDateTime.now();
		System.out.println("System ZonedDateTime: " + znDtTm);
		
		//Custom LocalDate
		LocalDate dt1 = LocalDate.of(2020, 5, 6); // of(year,month,date) Note: month begins with 1
		System.out.println("\nCustom LocalDate: " + dt1);
		LocalDate dt2 = LocalDate.of(2020, Month.MAY, 6);
		System.out.println("Custom LocalDate: " + dt2);
		
		//Custom LocalTime
		LocalTime t1 = LocalTime.of(8, 20); // of(hour,minute)
		System.out.println("\nCustom LocalTime: " + t1);
		LocalTime t2 = LocalTime.of(8, 20, 30); // of(hour,minute,seconds)
		System.out.println("Custom LocalTime: " +t2);
		LocalTime t3 = LocalTime.of(8, 20, 30, 500); // of(hour,minute,seconds,nanoseconds)
		System.out.println("Custom LocalTime: " +t3);
		
		//Custom LocalDateTime
		LocalDateTime dtTm1 = LocalDateTime.of(2019, Month.AUGUST, 20, 17, 15, 30); // of(year,month,date,hour,minute,seconds)
		System.out.println("\nCustom LocalDateTime: " +dtTm1);
		LocalDateTime dtTm2 = LocalDateTime.of(dt1, t1);// of(LocalDate,LocalTime)
		System.out.println("Custom LocalDateTime: " +dtTm2);
		
		//System Default Time Zone
		ZoneId id = ZoneId.systemDefault();
		System.out.println("\nDefault Zone Id:" + id);
		
		// All Available Zones
		System.out.println("\n\nAll Zones");
		Set<String> zones = ZoneId.getAvailableZoneIds();
		zones.forEach(System.out::println);
		
		System.out.println("\n\nFiltered Zones");
		zones.stream().filter(z->z.startsWith("America")||z.startsWith("US")).sorted().forEach(System.out::println);
		
		
		
		//Custom Time Zone
		ZoneId znId = ZoneId.of("America/Panama");
		ZonedDateTime znDtTm1 = ZonedDateTime.of(2001, 3, 25, 5, 12, 35, 300, znId);
		System.out.println(znDtTm1);
		ZonedDateTime znDtTm2 = ZonedDateTime.of(dt1, t1, znId);
		System.out.println(znDtTm2);
		ZonedDateTime znDtTm3 = ZonedDateTime.of(dtTm1, znId);
		System.out.println(znDtTm3);
		
		//Getting individual date parts
		LocalDate d = LocalDate.of(2020, 5, 1); // 1st May 2020
		System.out.println(d);
		System.out.println("Day of Month: " + d.getDayOfMonth());
		System.out.println("Day of Week: " + d.getDayOfWeek());
		System.out.println("Day of Year: " + d.getDayOfYear());
		System.out.println("Month Value: " + d.getMonthValue());
		System.out.println("Month: " + d.getMonth());
		System.out.println("Year: " + d.getYear());
		
		//Manipulating LocalDate
		LocalDate d1 = LocalDate.of(2020, 5, 1); // 1st May 2020
		System.out.println("Original Date: " + d1);
		LocalDate d2 = d1.plusDays(2);
		System.out.println(d2);
		LocalDate d3 = d1.minusDays(2);
		System.out.println(d3);
		LocalDate d4 = d1.plusMonths(3);
		System.out.println(d4);
		LocalDate d5 = d1.minusMonths(3);
		System.out.println(d5);
		LocalDate d6 = d1.plusWeeks(6);
		System.out.println(d6);
		LocalDate d7 = d1.minusWeeks(3);
		System.out.println(d7);
		LocalDate d8 = d1.plusYears(2);
		System.out.println(d8);
		LocalDate d9 = d1.minusYears(2);
		System.out.println(d9);
		
		d1 = LocalDate.of(2020, 5, 1); // 1st May 2020
		LocalDate d10 = d1.plusDays(4).minusMonths(3).plusYears(2); // Method call chaining
		System.out.println(d10);
		
		//Manipulating LocalDateTime
		LocalDateTime dtT1 = LocalDateTime.of(LocalDate.of(2020, 4, 10), LocalTime.of(3, 25, 45));
		System.out.println(dtT1);
		dtT1 = dtT1.plusDays(6).minusMinutes(4).minusHours(2);
		System.out.println(dtT1);
		
		dtT1 = LocalDateTime.of(LocalDate.of(2020, 4, 10), LocalTime.of(3, 25, 45));
		System.out.println(dtT1);
		dtT1 = dtT1.plus(6, ChronoUnit.DAYS).minus(4, ChronoUnit.MONTHS).minus(4, ChronoUnit.MINUTES).minus(2,ChronoUnit.HOURS);
		System.out.println("Date with chronounits: " + dtT1);
		
		// Period in terms of days,weeks,months,years
		d1 = LocalDate.of(2020, 5, 1); // 1st May 2020
		System.out.println("Original Date: " + d1);
		d1 = d1.plus(Period.ofDays(6)).minus(Period.ofMonths(1)).plus(Period.ofYears(5));
		System.out.println("Manipulated Date: " + d1);
		
		d1 = LocalDate.of(2020, 5, 1); // 1st May 2020
		System.out.println("Original Date: " + d1);
		d1 = d1.plus(Period.of(2, 0, 12)); // Period.of(year,month,date)
		System.out.println("Manipulated Date: " + d1);
		
		d1 = d1.plus(Period.of(-2, 6, -12)); // Period.of(year,month,date)
		System.out.println("Manipulated Date: " + d1);
		
		LocalDate start = LocalDate.of(2018, Month.JANUARY, 1);
		System.out.println("Start Date: " + start);
		LocalDate end = LocalDate.of(2018, Month.APRIL, 30);
		System.out.println("End Date: " + end);
		Period period = Period.ofMonths(1);
		while (start.isBefore(end)) {
			System.out.println("start " + start);
			start = start.plus(period); // adds the period
		}
		
		// Period: (P)
		System.out.println("\n\nPeriods");
		System.out.println(Period.of(6, 2, 47));
		System.out.println(Period.of(6, 0, 47));
		System.out.println(Period.of(6, -2, 47));
		System.out.println(Period.of(-6, -2, -34));
		System.out.println(Period.of(6, -2, 0));
		System.out.println(Period.of(0, -2, 47));
		System.out.println(Period.ofWeeks(2));
		
		LocalTime t = LocalTime.of(6, 15);
		Period p = Period.ofMonths(1);
		System.out.println(t.plus(p)); // throws UnsupportedTemporalTypeException
		
		// Duration: Period of Time(PT)
		System.out.println("\n\nDuration");
		Duration daily = Duration.ofDays(1); 
		System.out.println(daily);
		Duration hourly = Duration.ofHours(1);
		System.out.println(hourly);
		Duration everyMinute = Duration.ofMinutes(1);
		System.out.println(everyMinute);
		Duration everyTenSeconds = Duration.ofSeconds(10);
		System.out.println(everyTenSeconds);
		Duration everyMilli = Duration.ofMillis(1); 
		System.out.println(everyMilli);
		Duration everyNano = Duration.ofNanos(1); 
		System.out.println(everyNano);
		
		Duration hourly1 = Duration.of(3, ChronoUnit.HOURS);
		System.out.println(hourly1);
		
		LocalTime one = LocalTime.of(2, 30);
		LocalTime two = LocalTime.of(7, 20);
		LocalDate date5 = LocalDate.of(2020, 5, 2);
		System.out.println(ChronoUnit.HOURS.between(one, two)); // 1
		System.out.println(ChronoUnit.MINUTES.between(one, two)); // 75
		//System.out.println(ChronoUnit.MINUTES.between(one, date5)); // throws DateTimeException
		
		
		LocalDate ld = LocalDate.of(2020,1,12);
		Period pd = Period.ofDays(1);
		Duration days = Duration.ofDays(1);
		System.out.println(ld.plus(pd)); // 2015–05–26
		//System.out.println(ld.plus(days)); // throws UnsupportedTemporalTypeException: Unsupported unit: Seconds
		
		// Instant: Specific moment in time in the GMT Time Zone
		System.out.println("\nInstant");
		Instant now = Instant.now();
		System.out.println(now.get(ChronoField.MILLI_OF_SECOND));
		// do something time consuming
		int sum = 0;
		try {
			for(int n=1;n<=100;n++) {
				sum+=n;
				Thread.sleep(10);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		Instant later = Instant.now();
		System.out.println(later.get(ChronoField.MILLI_OF_SECOND));
		Duration duration = Duration.between(now, later);
		System.out.println("Duration between instants: " + duration.toMillis() + " milliseconds");
		
		
		LocalDate dt = LocalDate.of(2020,5,6);
		LocalTime tm = LocalTime.of(9,15,30);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
		Instant instant = zonedDateTime.toInstant(); // converting zoneDateTime into instant
		System.out.println(zonedDateTime);
		System.out.println(instant); 
		
		
		Instant inst = Instant.now();
		System.out.println("Instant: " + inst);
		
		Instant nextDay = inst.plus(1, ChronoUnit.DAYS);
		System.out.println(nextDay); 
		Instant nextHour = inst.plus(1, ChronoUnit.HOURS);
		System.out.println(nextHour); 
		//Instant nextWeek = inst.plus(1, ChronoUnit.WEEKS); // throws UnsupportedTemporalTypeException: Unsupported unit: Weeks
	}

}
