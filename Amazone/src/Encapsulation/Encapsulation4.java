package Encapsulation;
class Person{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class Encapsulation4 {
public static void main(String[] args) {
	Person p=new Person();
	p.setName("Neha nikhil");
	//System.out.println("person name: " +p.getName());
	p.setName("Roshani dubey");
	System.out.println("person name: " +p.getName());
}
}
