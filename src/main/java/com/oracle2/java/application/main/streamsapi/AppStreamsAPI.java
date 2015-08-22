package com.oracle2.java.application.main.streamsapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AppStreamsAPI {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("Petter",20));
		list.add(new Person("Jon",19));
		list.add(new Person("Abba",21));
		list.add(new Person("Tom",22));
		
		List<Integer> ages = list.stream().map(p -> p.getAge()).collect(Collectors.toList());
		System.out.println("Ages: "+ages); //Ages: [20, 19, 21, 22]
		Person yungPerson = list.stream().filter(p -> p.getAge() < 20).findFirst().get();
		System.out.println("Yung: "+yungPerson.getName()); //Yung: Jon
		
		Predicate<Person> nameNotNull = p -> p.getName() != null;
		Predicate<Person> ageAbove20 = p -> p.getAge() > 20;
		
		Predicate<Person> multipleConditions = nameNotNull.and(ageAbove20);
		List filterd = list.stream().filter(multipleConditions).collect(Collectors.toList());
		System.out.println(filterd); //[Abba(21), Tom(22)]
	}
}

class Person {
    private int age;
    private String name;
    
    public Person(String name, int age) {
    	this.name = name;
    	this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString() {
    	return name+"("+String.valueOf(age)+")";
    }
}
