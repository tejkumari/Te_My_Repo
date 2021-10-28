package day8Methods;

public class Variable {
	static double salary=10000.67;
	   int empId=1001;
	   
	   public static void main(String args[]) {
		
		int age=30;//local variable
		//System.out.println("Salary: "+Variable1.salary);//10000.67
		Variable v1=new Variable();
		System.out.println("EmpID: "+v1.empId);//1001
		System.out.println("Salary: " +Variable.salary);
		System.out.println("age: "+age);
	      
	   }
}
