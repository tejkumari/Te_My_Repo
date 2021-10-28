package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class HashSet2 {
public static void main(String[] args) {
	ArrayList<String> a1= new ArrayList<String>();
	a1.add("Ravi");
	a1.add("Vijay");
	a1.add("Ravi");
	a1.add("Ajay");
	System.out.println(a1.size() + " " +a1);
	Iterator itr=a1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	a1.forEach(s1 ->{System.out.println(s1);});
	a1.removeIf(s1 ->s1.contains("Ajay"));
	System.out.println(a1.size() + " " +a1);
}
}
