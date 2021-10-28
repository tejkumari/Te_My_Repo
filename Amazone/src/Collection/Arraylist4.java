package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist4 {
public static void main(String[] args) {
	ArrayList<String> a1=new ArrayList<String>();
	a1.add("Ravi");
	a1.add("Vijay");
	a1.add("Ajay");
	System.out.println("a1 collection elements: "+a1);
	Iterator i1=a1.iterator();
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}
	ArrayList<String> a2 = new ArrayList<String>();
	a2.add("Ravi");
	a2.add("Ajay");
	a2.add("Hanumat");
	System.out.println("a2 collection elements: "+a2);
	Iterator i2=a2.iterator();
	while(i2.hasNext()){
		System.out.println(i2.next());
	}
	a1.retainAll(a2);// gives common elements of a1 & a2
	System.out.println("a1 collection after retain elements: "+a1);
	Iterator i3=a1.iterator();
	while(i3.hasNext()) {
		System.out.println(i3.next());
	}
}
}
