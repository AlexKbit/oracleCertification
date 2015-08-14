package com.oracle2.java.application.main.datatimeapi.timezones;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class AppTimezones {

	public static void main(String[] args) {
		ZoneId id = ZoneId.of("Europe/Paris");
		System.out.println(id);
		
		ZoneOffset offset = ZoneOffset.of("-06:00");
		System.out.println(offset);

		ZonedDateTime zdt1 = ZonedDateTime.parse("2015-08-14T13:21:46.819+02:00[Europe/Paris]");
		ZonedDateTime zdt2 = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		
		System.out.println(zdt1);
		System.out.println(zdt2);
		
		OffsetDateTime odt = OffsetDateTime.of(LocalDateTime.now(),ZoneOffset.of("-4")); //2015-05-22T23:42:20.101-06:00
		OffsetTime ot = OffsetTime.ofInstant(Instant.now(),ZoneId.of("America/Los_Angeles")); //22:42:20.101-07:00
		
		System.out.println(odt);
		System.out.println(ot);
		
		Clock clock = Clock.systemDefaultZone();
		System.out.println(clock);
	}

}
