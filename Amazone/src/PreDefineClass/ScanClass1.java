package PreDefineClass;

import java.util.Scanner;

public class ScanClass1 {
public static void main(String[] args) {
	String s1="Hello!!! This is BasicJava";
	Scanner Scan=new Scanner(s1);
	System.out.println("Boolean Result: " +Scan.hasNext());
	System.out.println("String: " +Scan.nextLine());
	Scan.close();
	
	System.out.println("Enter your details");
	Scanner in=new Scanner(System.in);
	System.out.println("Enter your Name:");
	String name=in.next();
	System.out.println("Name: " +name);

	System.out.println("Enter your Age");
	int age=in.nextInt();
	System.out.println("Age: " +age);
	
	System.out.println("Enter your Salary");
	long sal=in.nextLong();
	System.out.println("Salary: " +sal);
	
	System.out.println("Enter your Gender");
	String gen=in.next();
	System.out.println("Gender: " +gen);
	in.close();
}
}
