package com.oracle.java.application.main.time;

import  java.time.LocalDate;
import java.time.Period;

public class ApplicationDateWithPeriod {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2015, 5, 12);
		Period p = Period.of(1, 2, 3);
		date.minus(p);
		System.out.println(date);
		// 2015-05-12 because need date = date.minus(p);
		
		LocalDate oldDate = LocalDate.of(2014, 4, 11);

		Period p1 = Period.between(oldDate, date);
		Period p2 = Period.between(date, oldDate);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p2.equals(p1));
	}
}
