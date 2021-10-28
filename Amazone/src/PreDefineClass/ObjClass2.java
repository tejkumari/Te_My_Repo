package PreDefineClass;
class Demo123{
	void display() {
		System.out.println("I am display() of class Demo123");
	}
}
public class ObjClass2 extends Demo123{
	static int last_roll = 100;
	int roll_no;
	ObjClass2()
    {
        roll_no = last_roll;//100
        last_roll++;//101
    }
	@Override
	void display() {
		System.out.println("I am display() of class ObjClass2");
	}
	public int hashCode() {
		return roll_no;
	}
	
	
public static void main(String[] args) {
	ObjClass2 O=new ObjClass2();
	System.out.println(O.toString()); //provide String reptn of an Obj
	System.out.println(O.hashCode());// returns hashcode(unique no) of an obj
	O.display();
	Demo123 D=new Demo123();
	System.out.println(O.equals(D));// compare two objs based on location in heap(in constant_pool OR non-Constant_Pool)
	System.out.println(D.equals(O));// alwys recomended to override equal() for differentiation
}
}