package day8Methods;
class call{
	public static void main(String[] args) {
		System.out.println(" Hello... Programs starts");
		
		// TODO Auto-generated method stub

	}
}

public class Method4 {
int Emoid;
static double salary;
double pno;

public double EmpId() {
	Emoid=10;
	salary= 70000;
	double Eid= Emoid + salary;
	return(Eid);
}

public static double EmpDep() {
	Method4 obj2 = new Method4();
	obj2.pno= 5.50;
	obj2.Emoid= 70;
	double EDep= obj2.Emoid * obj2.pno;
	return(EDep);
}
	public static void main(String[] args) {
		System.out.println("Programs starts");
		Method4 obj = new Method4();
		double EmpId = obj.EmpId();
		System.out.println("Employee ID is: " +EmpId);
		
		Method4.EmpDep();
		//pno=5.50;
		double EmpDep= Method4.EmpDep();
		System.out.println("Employee Dept is: " +EmpDep);
	}
}
