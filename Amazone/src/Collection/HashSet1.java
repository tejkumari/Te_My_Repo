package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 {
public static void main(String[] args) {
	Set<String> s1=new HashSet();
	s1.add("Ravi");
	s1.add("Vijay");
	s1.add("Ravi");
	s1.add("Ajay");
	System.out.println(s1.size() +" " +s1);
//Traversing Elements
	Iterator<String> itr=s1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("******************");
	for(Object obj:s1) {
		System.out.println(obj);
	}
	System.out.println(s1.remove("Vijay"));//return T/F & remove element from set
	System.out.println(s1.size() + " " +s1);
	/*use with list i.e arraylist,vector
	 * // for(int i; i<s1.size(); i++) { 
	 * 			System.out.println(s1.get());}
	 */	
	HashSet<String> s2=new HashSet<String>();
	s2.add("Pune");
	s2.add("Benglore");
	s2.add("Pune");
	s2.add("Mumbai");
	s2.add("Patna");
	System.out.println(s2.size() + " " +s2);
	Iterator<String> itr1=s2.iterator();
	while(itr1.hasNext()) {
		System.out.println(itr1.next());
		}
	System.out.println("******************");
	for(Object obj:s2) {
		System.out.println(obj);
	}
	s2.addAll(s1);// add set s1 to s2
	System.out.println(s2.size() +" " +s2);
	s2.remove("Pune");
	System.out.println(s2.size() +" " +s2);
	s2.removeAll(s1);
	System.out.println(s2.size() +" " +s2);
	s2.removeIf(str -> str.contains("Patna"));
	System.out.println(s2.size() +" " +s2);
	
	}
}
