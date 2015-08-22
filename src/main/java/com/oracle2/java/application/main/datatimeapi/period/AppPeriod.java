package com.oracle2.java.application.main.datatimeapi.period;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class AppPeriod {

	public static void main(String[] args) {
		Period period = Period.of(1, 2, 3); // 1 year, 2 months, 3 days
		Period periodTwoMonths = Period.ofMonths(2);
		System.out.println(period);
		System.out.println(periodTwoMonths);
		Period period20142015 = Period.between(
				LocalDate.of(2014, Month.JANUARY, 1),
				LocalDate.of(2015, Month.JANUARY, 1));
		Period period20152014 = Period.between(
				LocalDate.of(2015, Month.JANUARY, 1),
				LocalDate.of(2014, Month.JANUARY, 1));	
		
		System.out.println("2014-2015:"+period20142015);
		System.out.println("2015-2014:"+period20152014);
	}

}
