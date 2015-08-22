package com.oracle2.java.application.main.datatimeapi.timezones;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class AppFormatting {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of( 2010, Month.JULY, 3, 9, 10, 30 );
		String isoDateTime = dt.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(isoDateTime);
		
		LocalDate date = LocalDate.parse( "2014/09/19 14:05:12", DateTimeFormatter.ofPattern( "yyyy/MM/dd kk:mm:ss" ) );
		System.out.println(date);
	}

}
