package com.oracle2.java.application.main.datatimeapi.instant;

import java.time.Instant;

public class AppInstant {

	public static void main(String[] args) {
		Instant now = Instant.now();
		System.out.println(now);
		System.out.println(now.getEpochSecond());
		now = now.plusSeconds(2).plusMillis(500);
		System.out.println(now.getEpochSecond());
	}

}
