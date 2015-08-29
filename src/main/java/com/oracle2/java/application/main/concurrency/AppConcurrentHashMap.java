package com.oracle2.java.application.main.concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class AppConcurrentHashMap {

	public static void main(String[] args) {
		ConcurrentMap<String, String> map = new ConcurrentHashMap<>();
		map.put("key", "value");
		Object value = map.get("key");
		System.out.println(value);

		// Puts a new value into the map only 
		// if no value exists for the given key
		value = map.putIfAbsent("key2", "value2");
		System.out.println(value);

		// Returns the value for the given key. 
		// If doesn't exist, the passed default value is returned
		value = map.getOrDefault("hi", "or not");
		System.out.println(value);
		
		map.forEach((k, v) -> System.out.println(k + "=" + v));
		
		map.replaceAll((k, v) -> v.toUpperCase());
		System.out.println(map);
		
		String res = map.compute("key", (k, v) -> v.toLowerCase());
		System.out.println(map);
		System.out.println("Res " + res);
		
		
		map.merge("key", "newVal", (oldVal, newVal) -> oldVal + " merged with " + newVal);
		System.out.println(map.get("key")); 
		// It prints "value merged with newVal"
		
	}

}
