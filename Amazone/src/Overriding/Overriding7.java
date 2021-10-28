package Overriding;
class Parent1{
	static void show() {
		System.out.println("i m show()" + " static member of parent class");
	}
	void showMe() {
		System.out.println("i m showMe()" + " non-static member of parent class");
	}
}
class Child1 extends Parent1{
	static void show() {
		System.out.println("i m show()" + " static member of child class");
	}
void showMe() {
	System.out.println("i m showMe()" + " non-static member of child class");
}
}
public class Overriding7 {
public static void main(String[] args) {
	Parent1 obj=new Parent1();
	obj.showMe();
	obj.show(); // call using class-name
	Child1 obj2=new Child1();
	obj2.show();
	obj2.showMe();
	Parent1 c=new Child1();
	c.showMe(); // overriding child1 class showMe()
	c.show();
	
}
}
