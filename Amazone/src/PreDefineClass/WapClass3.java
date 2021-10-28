package PreDefineClass;

public class WapClass3 {
public static void main(String[] args) {
//Character Boxing operation	
		char c1='A';
		System.out.println("c1: "+c1);
		Character charObj=new Character(c1);
		System.out.println(c1==charObj);//True-->compare based on value of obj
		//System.out.println("charObj: "+charObj);
		Character charObj1=new Character('X');
		//System.out.println("charObj1: "+charObj1);
		Character charObj2='Z';
		System.out.println(" charObj: "+charObj+ "\n charObj1: "+charObj1+ "\n charObj2: "+charObj2);
		
//Character UnBoxing Operation
		Character CHARACTERcharObj=charObj.charValue();
		System.out.println("CHARACTER of charObj: " +CHARACTERcharObj);
		Character CHARACTERcharObj1=charObj1.charValue();
		System.out.println("CHARACTER of charObj1: " +CHARACTERcharObj1);
		Character CHARACTERcharObj2=charObj2.charValue();
		System.out.println("CHARACTER of charObj2: " +CHARACTERcharObj2);		
}
}
