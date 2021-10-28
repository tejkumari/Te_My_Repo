package Abstraction;
abstract class Demo3{
	abstract void print();
	void display2() {
		System.out.println("I m a non-abstract display2() in Demo3 class");
	}
}
class Demo1 extends Demo3{
	void display() {
		System.out.println("I m a non-abstract display() in Demo1 class");
	}
	void display2() {
		System.out.println("I m non-abstract display2() in Demo1 class");
	}
	void print1() {
		System.out.println("Print 1 method");
	}
	void print2() {
		System.out.println("Print 2 method");
	}
	void print() {
		System.out.println("Print  method");
		super.display2();
	}
}
abstract class Demo2{
	abstract void print();
	abstract void print1();
	abstract void print2();
}
public class abstractClass2 {
public static void main(String[] args) {
	Demo1 d1=new Demo1();
	d1.display();
	d1.print();
	d1.display2();
	d1.print2();
	d1.print1();
	Demo3 d2=new Demo1();
	d2.display2();
}
}
