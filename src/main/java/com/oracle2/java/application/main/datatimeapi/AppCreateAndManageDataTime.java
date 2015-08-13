package com.oracle2.java.application.main.datatimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class AppCreateAndManageDataTime {

	public static void main(String[] args) {
		createTimeAndDate();
		localeTimeAndDate();
		operation();
	}
	
	private static void createTimeAndDate() {
		LocalTime time = LocalTime.now();
		LocalDate date = LocalDate.now();
		LocalDateTime dt = LocalDateTime.of( date, time ); // You can also call LocalDateTime.now();
		System.out.println(dt);
	}
	
	private static void localeTimeAndDate() {
		LocalDate ld1 = LocalDate.of(2014, Month.SEPTEMBER, 19);
		LocalDate ld2 = LocalDate.ofEpochDay(1000);
		LocalTime lt1 = LocalTime.of(14, 05);
		LocalTime lt2 = LocalTime.parse("14:05:00");
		System.out.println(ld1);
		System.out.println(ld2);
		System.out.println(lt1);
		System.out.println(lt2);
	}
	
	private static void operation() {
		LocalDateTime dateTime = LocalDateTime.now();
		dateTime = dateTime.plusMinutes(10).plus(2, ChronoUnit.DAYS);
		dateTime = dateTime.minusYears(10);
		System.out.println(dateTime);
	}

}
