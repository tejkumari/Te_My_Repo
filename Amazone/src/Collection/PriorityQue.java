package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQue {
public static void main(String[] args) {
	Queue q1=new PriorityQueue();
	q1.add("Ravi");
	q1.add(154);//only add similar type of Elements
	q1.add("Ravi");
	q1.add("vijay");
	System.out.println(q1.size() + " " +q1);
//element() will return top most element of queue
// if queue is emplty, it ll throw an error(NoSuchElementFound)
	System.out.println(q1.element());
	for(Object obj:q1) {
		System.out.println(obj);
	}
	System.out.println("********************");
	Iterator itr=q1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println(q1.size() + " " +q1);
}
}
