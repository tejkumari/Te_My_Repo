package PreDefineClass;

public class WapClass2 {
public static void main(String[] args) {
//Integer Boxing Operation	
		int age=20;
		System.out.println("Age: "+age);
		Integer intObj1=new Integer(age);//Explicit Boxing
		//System.out.println("intObj1: "+intObj1);
		//System.out.println(age==intObj1);//True-->compare based on value of obj
		Integer intObj2=new Integer(50);//Explicit Boxing
		//System.out.println("intObj2: "+intObj2);
		Integer intObj3=30;//Implicit Boxing(auto-boxing)
		//System.out.println("intObj3: "+intObj3);
System.out.println(" intObj1: "+intObj1+ "\n intObj2: " +intObj2+ "\n intObj3: " +intObj3);
		
//Integer UnBoxing Operation
	Integer intObj1Age=intObj1.intValue();
	System.out.println("Age of intObj1: " +intObj1Age);
	Integer intObj2Age=intObj2.intValue();
	System.out.println("Age of intObj2: " +intObj2Age);
	Integer intObj3Age=intObj3.intValue();
	System.out.println("Age of intObj3: " +intObj3Age);		
		
}
}
