package Collection;

import java.util.ArrayList;

public class Arraylist3 {
public static void main(String[] args) {
//generic type collection which store String class objects only
	ArrayList<String> s1=new ArrayList<String>();
	s1.add("Ravi");
	s1.add("Vijay");
	s1.add("Ajay");
	s1.add("Anuj");
	s1.add("Gaurav");
	System.out.println("String ArrayList elements: " +s1 );
//remove specific element from collection and return boolean(T/F) value
	//System.out.println(s1.remove("Anuj"));
//remove element of given index and return element(Vijay) vlaue
	//System.out.println(s1.remove(1));
//remove all elements from list and return boolean(T/F) value
	//System.out.println(s1.removeAll(s1));
	System.out.println("String ArrayList elements: " +s1);
	ArrayList<String> s2 = new ArrayList<String>();
	s2.add("Ravi");
	s2.add("Hanumat");
	System.out.println(s2);
//add all elements of s2 in s1 including duplicates
	s1.addAll(s2);
	System.out.println(s1);//Ravi,vijay,ajay,anuj,gaurav,ravi,hanumat
//remove all elements of s2 from s1	
	s1.removeAll(s2);//ravi, vijay, ajay, anuj, gaurav
	System.out.println(s1);//Ravi,vijay,ajay,anuj,gaurav
	s1.removeIf(str->str.contains("Ajay"));
	s1.clear();
	System.out.println(s1);
}
}
