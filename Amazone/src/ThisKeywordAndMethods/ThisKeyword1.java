package ThisKeywordAndMethods;

public class ThisKeyword1 {
	static int age;
	int sal=70000000;
	int empId;
	void didplay(int sal, int empId) {
		System.out.println("Age 4: " +age);
		System.out.println("Salary 4: " +sal);
		System.out.println("Salary 4: " +this.sal);
		//System.out.println("Salary 4: " +obj2.sal);
		System.out.println("EmpId 2: " +this.empId);
		System.out.println("EmpId 2: " +empId);
	}
public static void main(String[] args) {
	int age=25;
	int sal=4000;
	int empId=101;
	//void Method(){
		//{System.out.println("EmpId 2: " +empId);
	//}
	System.out.println("Age 1: " +age);
	System.out.println("EmpId 1: " +empId);
	System.out.println("Salary 1: " +sal);
	
	ThisKeyword1 obj=new ThisKeyword1();
	System.out.println("Age 2: " +age);
	System.out.println("Salary 2: " +sal);
	System.out.println("Salary 2.1 : " +obj.sal);
	
	ThisKeyword1 obj2=new ThisKeyword1();
	System.out.println("Age 3: " +age);
	System.out.println("Salary 2.1.1 : " +sal);
	System.out.println("EmpId 2: " +obj2.empId);
	System.out.println("Salary 2.1.1.1 : " +obj2.sal);
	obj2.didplay(50000,500);
}
}
