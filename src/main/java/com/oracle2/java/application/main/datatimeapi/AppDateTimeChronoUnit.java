package com.oracle2.java.application.main.datatimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class AppDateTimeChronoUnit {

	public static void main(String[] args) {
		LocalDateTime date1 = LocalDateTime.of(LocalDate.of(1999, 5, 15), LocalTime.of(10, 22));
		LocalDateTime date2 = LocalDateTime.of(LocalDate.of(2008, 2, 11), LocalTime.of(5, 33));
		System.out.println("date1: "+date1);
		System.out.println("date2: "+date2);
		
		System.out.println(ChronoUnit.YEARS.between(date1, date2));
		System.out.println(ChronoUnit.MONTHS.between(date1, date2));
		System.out.println(ChronoUnit.WEEKS.between(date1, date2));
		System.out.println(ChronoUnit.DAYS.between(date1, date2));
		System.out.println(ChronoUnit.HOURS.between(date1, date2));
		System.out.println(ChronoUnit.MINUTES.between(date1, date2));
		System.out.println(ChronoUnit.SECONDS.between(date1, date2));
	}

}
