package com.oracle2.java.application.main.datatimeapi.duration;

import java.time.Duration;
import java.time.LocalTime;

public class AppDuration {

	public static void main(String[] args) {
		Duration d1 = Duration.ofSeconds(10, 50); // 10 seconds and 50 nanoseconds
		Duration d2 = Duration.between(LocalTime.NOON, LocalTime.MIDNIGHT);
		
		System.out.println(d1);
		System.out.println(d2);
		
		toThisString();
	}
	
	private static void toThisString() {
		Duration d = Duration.ofDays(2);
		System.out.println(d.toString());
		d = Duration.ofHours(4);
		System.out.println(d.toString());
		d = Duration.ofMinutes(6);
		System.out.println(d.toString());

		d = Duration.ZERO;
		System.out.println(d.toString());
	}
}
