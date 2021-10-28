package PreDefineClass;

public class WapClass1 {
public static void main(String[] args) {
//Integer Boxing Operation	
	int age=20;
	System.out.println("Age: "+age);
	Integer intObj1=new Integer(age);//Explicit Boxing
	System.out.println("intObj1: "+intObj1);
	System.out.println(age==intObj1);//True-->compare based on value of obj
	Integer intObj2=new Integer(50);//Explicit Boxing
	System.out.println("intObj2: "+intObj2);
	Integer intObj3=30;//Implicit Boxing(auto-boxing)
	System.out.println("intObj3: "+intObj3);
//Character Boxing operation	
	char c1='A';
	System.out.println("c1: "+c1);
	Character charObj=new Character(c1);
	System.out.println(c1==charObj);//True-->compare based on value of obj
	System.out.println("charObj: "+charObj);
	Character charObj1=new Character('X');
	System.out.println("charObj1: "+charObj1);
	Character charObj2='Z';
	System.out.println("charObj2: "+charObj2);

//Unboxing Operation--> Only boxed obj can be unboxed
	Double doubleObj1=545.258;//Boxing
	System.out.println("doubleObj1: " +doubleObj1);
	double salary=doubleObj1.doubleValue();//Unboxing
	System.out.println("Salary: " +salary);
//Integer UnBoxing Operation
	Integer intObj1Age=intObj1.intValue();
	System.out.println("Age of intObj1: " +intObj1Age);
	Integer intObj2Age=intObj2.intValue();
	System.out.println("Age of intObj2: " +intObj2Age);
	Integer intObj3Age=intObj3.intValue();
	System.out.println("Age of intObj3: " +intObj3Age);
//Character UnBoxing Operation
	Character CHARACTERcharObj=charObj.charValue();
	System.out.println("CHARACTER of charObj: " +CHARACTERcharObj);
	Character CHARACTERcharObj1=charObj1.charValue();
	System.out.println("CHARACTER of charObj1: " +CHARACTERcharObj1);
	Character CHARACTERcharObj2=charObj2.charValue();
	System.out.println("CHARACTER of charObj2: " +CHARACTERcharObj2);
}
}
