package Casting;

public class PrimitiveCasting {
	public static void main(String[] args) {
	int myint=10;
	double mydouble=myint;//auto-widening/ implicit widening
	double d=(double)myint;//explicit widening
	System.out.println(myint);
	System.out.println(mydouble);
	System.out.println(d);
	
	double salary=182342.768467;
	int sal=(int)salary; //explicit narrowing--->182342
	long f=(long)salary; //explicit narrowing--->182342
	System.out.println("double salary: " +salary);
	System.out.println("int salary: " +sal);
	System.out.println("long salary: " +f);
	
}
}