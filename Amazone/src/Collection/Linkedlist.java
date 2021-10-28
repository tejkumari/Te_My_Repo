package Collection;

import java.util.LinkedList;

public class Linkedlist {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add("Ravi");
	l1.add("Vijay");
	l1.add("Ajay");
	l1.add("Ravi"); //allow to add duplicate elements
	System.out.println("l1: " +l1);
	l1.addFirst("poonam");//add element at first position
	l1.addLast("Ritu");
	System.out.println("Updated l1: " +l1);
	LinkedList l2=new LinkedList();
	l2.add("Jhon");
	l2.add("Rahul");
	System.out.println("l2: " +l2);
	l1.addAll(l2);// add l1 to l1
	l1.addAll(3, l2);// all l2 at 3 position in l1
	System.out.println("l1 after invoking addAll(): " +l1);
	l1.addFirst("Rohit");// add element at 1 position of list
	l1.addLast("Suraj");// add element at last position of list
}
}
