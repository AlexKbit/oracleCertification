package com.oracle2.java.application.main.locale;

import java.util.Locale;

public class AppLocale {

	public static void main(String[] args) {
		localeBuilder();
		localeConstructor();
		forLanguageTag();
		fromConstant();
		localeProperties();
	}
	
	private static void localeBuilder() {
		Locale loc1 = new Locale.Builder().setLanguage("fr").setRegion("FR").build();
		Locale loc2 = new Locale.Builder().setLanguage("ru").setRegion("RU").build();
		System.out.println(loc1 + " and " + loc2);
	}
	
	private static void localeConstructor() {
		Locale l1 = new Locale("es", "ES");
		Locale l2 = new Locale("en");
		System.out.println(l1 + " and " + l2);
	}
	
	private static void forLanguageTag() {
		Locale l1 =Locale.forLanguageTag("ja-JP");
		System.out.println(l1);
	}
	
	private static void fromConstant() {
		System.out.println(Locale.GERMAN + " " + Locale.GERMANY);
	}
	
	private static void localeProperties() {
		Locale locale = Locale.getDefault();
		System.out.println("My default locale: "+locale);
		System.out.println("getCountry: "+locale.getCountry());
		System.out.println("getDisplayCountry: "+locale.getDisplayCountry());
		System.out.println("getLanguage: "+locale.getLanguage());
		System.out.println("getDisplayLanguage: "+locale.getDisplayLanguage());
		System.out.println("getVariant: "+locale.getVariant());
		System.out.println("getDisplayVariant: "+locale.getDisplayVariant());
	}


}
