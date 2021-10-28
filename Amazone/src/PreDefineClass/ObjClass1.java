package PreDefineClass;
class Demo{
	void display() {
		System.out.println("I am display()..");
	}
}
public class ObjClass1 extends Demo{
static int last_roll=100;
int roll_no;
ObjClass1(){
	roll_no=last_roll;
	last_roll++;
}
	
	
	public static void main(String[] args) {
		ObjClass1 O=new ObjClass1();
		System.out.println(O); //Or  call by compiler/implicit call
		System.out.println(O.toString()); // call by pgmmer/explicit call
//when ref_variable of class, toString() is called by default which gives string representation of object		
		Demo D=new Demo();
		D.display();
		System.out.println(D.toString());// gives String representation of an object	
		System.out.println(D.hashCode());// gives hashCode value of an object
		System.out.println(D.equals(O));// it compares two object based on there location in heap(static constant area OR non Constant area)
		//System.out.println(D.notify()); // used with theads to wake-up it
		
		Demo d=new ObjClass1();
		d.display();
	}
}
