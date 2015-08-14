package com.oracle2.java.application.main.datatimeapi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class AppDateOperations {

	public static void main(String[] args) {
		datePlusPeriod();
		datePlusDuration();
		betwenWithPeriodAndDuration();
	}
	
	private static void datePlusPeriod() {
		LocalDateTime today = LocalDateTime.now();
		Period period = Period.ofDays(7);
		LocalDateTime nextWeek = today.plus(period);
		System.out.println(today);
		System.out.println(nextWeek);
	}
	
	private static void datePlusDuration() {
		LocalTime now = LocalTime.now();
		Duration tenMinutes = Duration.ofMinutes(10);
		LocalTime tenMinutesLater = now.plus(tenMinutes);
		System.out.println(now);
		System.out.println(tenMinutesLater);
	}
	
	private static void betwenWithPeriodAndDuration() {
		Period timeBetween = Period.between(LocalDate.of(2015, 5, 23),LocalDate.of(2014, 3, 21)); 
		Duration timeSpan = Duration.between(LocalTime.of(23, 55, 10), LocalTime.of(22, 53, 20));
		System.out.println(timeBetween);
		System.out.println(timeSpan);
	}
	 

}
