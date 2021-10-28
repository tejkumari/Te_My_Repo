package Overriding;
class Animal{
	final void move() {
		System.out.println("Animals can run");
	}
}
class Dog1 extends Animal{
	/*
	 * void move() { // compile time error: final method move() cannot b overrided
	 * by child class System.out.println("Dogs can run"); this.eat(); }
	 */
	void eat() {
		super.move();
		System.out.println("Dogs can eat");
	}
}
public class Overriding2 {
public static void main(String[] args) {
	Animal a=new Dog1();
	a.move();
}
}
