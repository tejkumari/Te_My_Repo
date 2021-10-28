package Encapsulation;
class encapsulationDemo{
	private int ssn;
	private String empName;
	private int empAge;
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
	
}
public class Encapsulation2 {
public static void main(String[] args) {
	encapsulationDemo ED=new encapsulationDemo();
	System.out.println("emp ssn: " +ED.getSsn());
	System.out.println("emp name: " +ED.getEmpName());
	System.out.println("emp age: " +ED.getEmpAge());
	ED.setSsn(101);
	ED.setEmpName("Manas");
	ED.setEmpAge(35);
	System.out.println("updated emp ssn: " +ED.getSsn());
	System.out.println("updated emp name: " +ED.getEmpName());
	System.out.println("updated emp age: " +ED.getEmpAge());
}
}
