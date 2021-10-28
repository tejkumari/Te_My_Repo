package Collection;

import java.util.ArrayList;

public class Arraylist {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("Pune");
	a1.add("Mumbai");
	a1.add("Chainnai");
	a1.add("Bangalore");
	System.out.println("ArrayList size: " +a1.size());
	System.out.println("ArrayList elements: " +a1);
	a1.add(null);// add Null value
	a1.add("Nagpur");// add element at end of list
	System.out.println("ArrayList elements: " +a1);
//add element at given index,nd rest ll shift down in same sequance
	a1.add(2, "Pune");
	System.out.println("ArrayList size: " +a1.size());
	System.out.println("ArrayList elements: " +a1);
/**
* int will be converted into Integer class object, dn it will upcasted in to Object class object
* 					//or
* first boxing operation --->Integer Class Object ---> Auto-upcasting to convert it to object class object
*/	
	a1.add(214342);//
	a1.add(true);
	System.out.println("ArrayList size: " +a1.size());
	System.out.println("ArrayList elements: " +a1);
	for(int i=0; i<a1.size(); i++) {
		System.out.println(a1.get(i));
	}
	
}
}
