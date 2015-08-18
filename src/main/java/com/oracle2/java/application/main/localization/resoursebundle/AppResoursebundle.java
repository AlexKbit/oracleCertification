package com.oracle2.java.application.main.localization.resoursebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class AppResoursebundle {

	private static final String bundlePath = "com.oracle2.java.application.main.localization.resoursebundle.MyBundle";
	
	public static void main(String[] args) {
		String key = "hello";
		
		ResourceBundle englishBundle = ResourceBundle.getBundle(bundlePath, Locale.ENGLISH);
		ResourceBundle germanyBundle = ResourceBundle.getBundle(bundlePath, Locale.GERMAN);
		ResourceBundle defaultBundle = ResourceBundle.getBundle(bundlePath, Locale.getDefault());
		
		System.out.println(englishBundle.getString(key));
		System.out.println(germanyBundle.getString(key));
		System.out.println(defaultBundle.getString(key));
	}

}
