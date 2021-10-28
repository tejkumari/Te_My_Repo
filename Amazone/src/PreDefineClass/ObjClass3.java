package PreDefineClass;

 class Print extends Object{
	int a=10;
	public int hashCode() {
		return 100;
	}
	public String toString() {
		return "I am toString()";
	}
	public boolean equals(Object obj) {
		Print p=(Print)obj;// explicit down-casting
		return(this.a==p.a);
	}
 }
 public class ObjClass3{
	 static int last_roll = 100;
		int roll_no;
		ObjClass3()
	    {
	        roll_no = last_roll;
	        last_roll++;
	    }	
public static void main(String[] args) {
	ObjClass3 O=new ObjClass3();
//below both statements are same
	System.out.println("toString() of object class: " +O.toString());
	//System.out.println("toString() of object class: " +O);
	System.out.println("hashCode of Ocject class of O ref_variable: " +O.hashCode());

	ObjClass3 O1=new ObjClass3();
	//System.out.println("toString() of object class: " +O1);
//hashCode is a unique value given to object by JVM for unique identification
	System.out.println("hashCode of Ocject class of O1 ref_variable: " +O1.hashCode());

System.out.println("equal() to compare 2 objects" +O.equals(O1));

Print p=new Print();
System.out.println("equal() to compare p and p object: " +p.equals(p));


}		
 }