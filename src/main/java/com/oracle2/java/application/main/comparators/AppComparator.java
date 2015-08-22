package com.oracle2.java.application.main.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppComparator {

	public static void main(String[] args) {
		Person p1 = new Person(60, "James");
        Person p2 = new Person(55, "Bryan");

        // p1.compareTo(p2) == p1 > p2 
        if (p1.compareTo(p2) > 0) {
            System.out.println(p1.getName() + " is older.");
        } else {
            System.out.println(p2.getName() + " is older.");
        }

        //Sorted by age
        List<Person> l = new ArrayList<>();
        l.add(p1);
        l.add(p2);

        Collections.sort(l, new AgeComparator());
        for (Person p : l)
          System.out.println(p.getName());
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int age1 = p1.getAge();
        int age2 = p2.getAge();

        if (age1 > age2) {
            return 1;
        } else if (age1 < age2) {
            return -1;
        } else {
            return 0;
        }
    }
}

class Person implements Comparable<Person> {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
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

    @Override
    public int compareTo(Person p) {
        if (this.getAge() > p.getAge())
            return 1;
        else if (this.getAge() < p.getAge())
            return -1;
        else
            return 0;
    }
}
