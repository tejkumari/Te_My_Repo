package Overriding;
 static class Human{// static class cant inherited by child=class

  void eat() { 
	 System.out.println("Humans can eat"); 
	 }
}
final class Boy extends Human{
	final void eat() {
		System.out.println("Boys can eat");
		//super.eat();
	}
	final void eat(int a) {
		System.out.println("Humans can eat" +a);
	}
}
public class Overloading3 {
public static void main(String[] args) {
	Boy b=new Boy();
	b.eat();
	Human h=new Boy();
	h.eat();
}
}
