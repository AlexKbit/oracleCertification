package com.oracle2.java.application.main.datatimeapi.duration;

import java.time.Duration;
import java.time.LocalTime;

public class AppDuration {

	public static void main(String[] args) {
		Duration d1 = Duration.ofSeconds(10, 50); // 10 seconds and 50 nanoseconds
		Duration d2 = Duration.between(LocalTime.NOON, LocalTime.MIDNIGHT);
		
		System.out.println(d1);
		System.out.println(d2);
	}
}
