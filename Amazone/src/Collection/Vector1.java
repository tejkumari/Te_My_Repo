package Collection;

import java.util.Vector;

public class Vector1 {
public static void main(String[] args) {
	Vector v1=new Vector();
	v1.add("Tiger");
	v1.add("Lion");
	v1.add("Dog");
	v1.add("Elephant");
	System.out.println(v1);
	v1.addElement("Rat");// vector ll inc its size by 1
	v1.addElement("Cat");
	System.out.println(v1);
	System.out.println(v1.capacity());//
}
}
