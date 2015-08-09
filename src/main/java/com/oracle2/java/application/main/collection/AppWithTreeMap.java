package com.oracle2.java.application.main.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class AppWithTreeMap {

	public static void main(String[] args) {
		  Map<String, Integer> tm = new TreeMap<>();
	      // Put elements to the map
	      tm.put("A", 10);
	      tm.put("C", 40);
	      tm.put("B", 20);

	        // Get a set of the entries
	      Set<Entry<String, Integer>> set = tm.entrySet();
	      // Get an iterator
	      Iterator<Entry<String, Integer>> i = set.iterator();
	      // Display elements
	      while(i.hasNext()) {
	         Entry<String, Integer> me = i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }

	      // Get an element
	      Integer x = tm.get("C");
	      System.out.println(x);
	      
	      // OR
	      
	      tm.entrySet().forEach(System.out::println);
	}

}
