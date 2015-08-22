package com.oracle2.java.application.main.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class AppWithArrayDeque {

	public static void main(String[] args) {
	  Deque<Integer> d = new ArrayDeque();
	
	  //Add elements
	  d.add(1); //add element at tail
	  d.addFirst(2); //add element at head
	  d.addLast (3); //add element at tail
	  System.out.println(d);
	  
	  //Get elements
	  Integer firstElement1 = d.element(); //peek at the element at the head without taking the element out of the queue (throws exception is the queue is empty)
	  Integer firstElement2 = d.peek(); //peek at the element at the head without taking the element out of the queue (returns null is the queue is empty)
	  Integer firstElement3 = d.getFirst();//get first element (throws exception is the queue is empty)
	  Integer firstElement4 = d.peekFirst();//get first element (returns null is the queue is empty)
	  Integer lastElement1  = d.getLast();//get last element (throws exception is the queue is empty)
	  Integer lastElement2  = d.peekLast();//get last element (returns null is the queue is empty)
	
	  //Remove elements
	  Integer element1 = d.remove(); //retrieves and removes the head of the queue
	  Integer element2 = d.removeFirst(); //retrieves and removes the first element of the queue
	  Integer element3  = d.removeLast(); //retrieves and removes the last element of the queue

	  System.out.println(d);
	}
}
