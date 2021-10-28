package Collection;

import java.util.ArrayList;

public class Arraylist2 {
public static void main(String[] args) {
	ArrayList a1= new ArrayList();
	a1.add("Ravi");
	a1.add("Vijay");
	a1.add("Ajay");
	System.out.println("Size: " +a1.size() +"\nElements in a1: " +a1 );
	ArrayList a2=new ArrayList();
	a2.add("Sonu");
	a2.add("Hanumant");
	a2.add(1, 12345);// add element(Primitive/non-primitive) in specific index
	System.out.println("Size: " +a2.size() +"\nElements in a2: " +a2 );
	a2.addAll(a1);// add two or more list
	System.out.println("Size: " +a2.size() +"\nElements a1 in a2: " +a2 );
	a2.addAll(1, a1);//add list a1 at index 1 of list a2
	System.out.println("Size: " +a2.size() +"\nElements in a2: " +a2 );
}
}
