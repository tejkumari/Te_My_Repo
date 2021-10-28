package Inheritance;
class Company {
	int yahoo=2000;
	Company(){	
		System.out.println("i m const1 of class Company");	
	}
	Company(int i){
		this();
		System.out.println("i m const2 of class Company");
	}
	static void display() {
		System.out.println("i m method display1 of class Company: ");
	}
	void display(int yahoo) {
		System.out.println("i m method dsplay2 LV of class Company : " +yahoo);
		System.out.println("i m GV of class Company: " +this.yahoo);
	}
	static void eat() {
		System.out.println("static eat() of company class");
	}
}
class Employee extends Company {
	int google=10000;
	Employee(){
		super(45);
	System.out.println("i m const1 of class Employee");	
	}
	Employee(int i){
		this();
		System.out.println("i m const2 of class Employee");
	}
	static void display() {
		System.out.println("i m method display1 of class Employee: ");
		//super.display();
	}
	void display(int google) {
		System.out.println("i m method dsplay2 LV of class Employee: " +google);
		System.out.println("i m GV of class Employee: " +this.google);
		System.out.println("i m GV of class Company: " +this.yahoo);
		this.display();
	}
	static void eat() {
		System.out.println("ststic eat() of Employee class");
	}
}
public class Inheritance9 {
	public static void main(String[] args) {
		System.out.println("**************Pgm Starts****************");
		Employee e1=new Employee(23);
		e1.display(5000);
		Company c1=new Company();
		c1.display(4000);
		c1.eat();
	}
}
