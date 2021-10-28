package Interfaces;
interface Animal1{
	int age=20;
	void animalSound();
	void sleep();
}
class Pig11 implements Animal1{
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
	public void sleep() {
		System.out.println("Zzz");
	}
}
public class Interface5 {
public static void main(String[] args) {
	Pig11 p1=new Pig11();
	p1.animalSound();
	p1.sleep();
	int age=50;
	System.out.println(Animal1.age);
	System.out.println("Local animal age: " +age);
}
}
