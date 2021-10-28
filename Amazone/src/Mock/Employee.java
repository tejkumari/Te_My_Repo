package Mock;
abstract class manager{
	 public abstract void DevEmp();
	 public void acctEmp()
	 {
	 System.out.println("i m accouts dept employee");
	 }
	 }
public class Employee extends manager{
	  public abstract void DevEmp(){
	   System.out.println("i m Development dept employee");
	  }
	  public static void main(String[] args) {
	  Employee e=new Employee();
	  e.DevEmp();
	  e.acctEmp();
	 }
	 }