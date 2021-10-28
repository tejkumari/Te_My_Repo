package PreDefineClass;
class Singleton{
private static Singleton single_instance=new Singleton();
public String s;
//private constructor is used to restricted to this class itself
private Singleton() {
	s = "Hello I am a string part of Singleton class";
}
//method ll return obj/ref-variable/instance of class(singleton)
public static Singleton getInstanceOfSingleton() {
	// To ensure only one instance is created		
	return single_instance;
}
}
public class SingletonClass1 {
public static void main(String[] args) {
//Instantiating Singleton class with variable	
	Singleton x=Singleton.getInstanceOfSingleton();
	System.out.println("String of x: " +x);
	Singleton y=Singleton.getInstanceOfSingleton();
	System.out.println("String of y: " +y);
	Singleton z=Singleton.getInstanceOfSingleton();
	System.out.println("String of z: " +z);
	x.s=(x.s).toUpperCase();
	System.out.println("String of x: " +x.s);
	System.out.println("String of y: " +y.s);
	System.out.println("String of z: " +z.s);
	x.s=(y.s).concat(" and i love it.").toUpperCase();
	System.out.println("String of x: " +x.s);
	System.out.println("String of y: " +y.s);
	System.out.println("String of z: " +z.s);
	x.s=(z.s)+" Its my fav";
	System.out.println("String of x: " +x.s);
	System.out.println("String of y: " +y.s);
	System.out.println("String of z: " +z.s);
	
	
	
	
	
	
	
	
}
}
