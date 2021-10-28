package Casting;

public class PrimitiveCasting1 {
public static void main(String[] args) {
	int salary=34500;
	//explicit widening
	double salarydouble=(double)salary;//explict widning
	float salaryfloat=(float)salary;
	System.out.println("int salary: " +salary);
	System.out.println("double salary: " +salarydouble);
	System.out.println("float salary: " +salaryfloat);
	
	//implicit widening
	double saldouble= salary;//34500.23567345
	float salfloat=salary;// 34500.235
	System.out.println("double salary: " +saldouble);
	System.out.println("float salary: " +salfloat);
	
	double salaryDb=30000.357984974d;
	/* only explicit narrowing*/ 
	int salaryInt=(int)salaryDb;
	float salartFt=(float)salaryDb;
	System.out.println("*********** explicit narrowing ***********");
	System.out.println("salaryDb: "+salaryDb+"\nsalaryInt: "+salaryInt+"\nsalartFt :"+salartFt);
	
}
}
