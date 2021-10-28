package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList6 {
public static void main(String[] args) {
//Generic: with the help of generic we can force collection to store similar type of data 
	List<Integer> l1= new ArrayList<Integer>();
	l1.add(12345);
	l1.add(549879);
	l1.add(179865);
	l1.add(125478);
	System.out.println(" Size: " +l1.size() +"\n Elements of l1: " +l1);
	Collections.sort(l1);
	System.out.println("l1 elements after sorting: " +l1);
	Collections.reverse(l1);
	System.out.println("l1 elements after reverse: " +l1);

	List l3=new ArrayList();
	l3.add(12);
	l3.add(10);
	l3.add("Pune");
	l3.add(true);
	System.out.println("Size: "+l3.size());
	System.out.println("Elements of collection: "+l3);
	//Collections.sort(l3);//error for sorting
	//System.out.println("After sorting Elements of collection: "+l3);
	//Collections.reverse(l2);//error for reverse
	//System.out.println("Reversing sorted Elements of collection: "+l3);

}
}