package Interfaces;
interface Printable {
	void print();
}

interface Showable {
	void show();
}
public class Interface3 {
	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		System.out.println("Welcome");
	}
public static void main(String[] args) {
	Interface3 obj = new Interface3();
	obj.print();
	obj.show();
}
}
