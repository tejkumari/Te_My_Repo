package Abstraction;
abstract class Animal{
	public abstract void animalSound();
	public void sleep() {
		System.out.println("Zzzzzzz");
	}
}
class Pig extends Animal{
	public void animalSound() {
		System.out.println("The pig saya : weeeeeee weeeeeeee");
	}
}
class Dog extends Animal{
	public void animalSound() {
		System.out.println("The pig saya : bowwwww bowwwww");
	}
}
public class abstractClass1 {
public static void main(String[] args) {
	Pig p1=new Pig();
	p1.animalSound();
	p1.sleep();
	Dog d1=new Dog();
	d1.animalSound();
	d1.sleep();
		
}
}
 