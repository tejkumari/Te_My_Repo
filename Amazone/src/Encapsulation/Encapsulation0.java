package Encapsulation;
class Demo{
	private int empId=101;
	private double salary=450000;
	public int getempId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public double getsalary() {
		return salary;
	}
	public void setsalary(double salary) {
		this.salary=salary;
		
	}
}
public class Encapsulation0 {
public static void main(String[] args) {
	Demo d1=new Demo();
	System.out.println("initial empid: " +d1.getempId());
	System.out.println("initial salary: " +d1.getsalary());
	double updatedsal=d1.getsalary()+1500;
	System.out.println("updated salary + bonus: " +updatedsal);
	//d1.setEmpId(10001);s
	d1.setsalary(500000);
	//System.out.println("updated empid: " +d1.getempId());
	System.out.println("updated salary: " +d1.getsalary());
}
}
