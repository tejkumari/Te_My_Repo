package Collection;

import java.util.ArrayList;

class book{
	int id, quantity;
	String name, author, publisher;
public book(int id, String name, String author, String publisher, int quantity) {
	this.id=id;
	this.name=name;
	this.author=author;
	this.publisher=publisher;
	this.quantity=quantity;
}
}
public class Arraylist5 {
public static void main(String[] args) {
	ArrayList<book> l1= new ArrayList<book>();
	
	book b1=new book(101, "Let us c", "yashwant kanetkar", "BPB", 10);
	book b2=new book(102, "Let us c++", "Vishal thapa", "BPB", 10);
	book b3=new book(103, "Let us java", "Mukta rai", "BPB", 10);
	System.out.println(b1.id);
	System.out.println(b1.name);
	System.out.println(b1.author);
	System.out.println(b1.publisher);
	System.out.println(b1.quantity);
	l1.add(b3);
	l1.add(b2);
	l1.add(b1);
	for(book b:l1) {
		System.out.println(b.id +" " +b.name +" " +b.author +" " +b.publisher +" " +b.quantity);
	}
	
}
}
