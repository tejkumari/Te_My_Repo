package Collection;

import java.util.ArrayList;

public class Arraylist1 {
public static void main(String[] args) {
	ArrayList a1= new ArrayList();
	a1.add("Mango");
	a1.add("Apple");
	a1.add("Banana");
	a1.add("Grapes");
	// print size of list
	System.out.println("size of list: " +a1.size());
	// print all elements of list
	System.out.println("Elements of list: " +a1);
	System.out.println("Traversing list through for loop:");
	for (int i = 0; i < a1.size(); i++) {
		System.out.println(a1.get(i));
	}
	System.out.println("Traversing list through for-each loop:");
	for(Object Fruits:a1) {
		System.out.println(Fruits);
	}
	a1.set(2, "Pineapple");
	System.out.println("size of list: " +a1.size());
	System.out.println("Elements of list: " +a1);
	
	System.out.println("Traversing list through for-each loop:");
for(Object FruitMela:a1) {
	System.out.println(FruitMela);}
	a1.set(3, "Guava");//add element at given position/index
	a1.add("Apple");
	System.out.println("size of list: " +a1.size());
	System.out.println("Elements of list: " +a1);
}
}
