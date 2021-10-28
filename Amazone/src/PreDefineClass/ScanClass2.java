package PreDefineClass;

import java.util.Scanner;

public class ScanClass2 {
public static void main(String[] args) {
//	String name="Tej";
//	int age=10;
//	Double salary=(double) 50000;
	
	Scanner scan=new Scanner(System.in);
	String name;
	int age;
	Double salary;
	Boolean value;
	System.out.println("Get Name value from console");
	name=scan.next();
	System.out.println("Name: " +name);
	System.out.println("Get age value from console");
	age=scan.nextInt();
	System.out.println("Age: " +age);
	System.out.println("Get Salary value from console");
	salary=scan.nextDouble();
	System.out.println("Salary: " +salary);
	System.out.println("Enter true/false value from console");
	value=scan.nextBoolean();
	System.out.println("True Or False: " +value);
	scan.close();



}
}
