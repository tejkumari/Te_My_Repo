package Constructor;

public class Cons1 {
	abstract Cons1(int a){
		System.out.println("this is Zero Parameter Constructor");
	}
	
	 Cons1(boolean b){
		System.out.println("this is Zero Parameter Constructor");
	}
	private Cons1(){
		System.out.println("this is Zero Parameter Constructor");
	}
	 public Cons1(int a, int b){
		System.out.println("this is Parameter Constructor " + a +"**** "+b);
	}
	 protected Cons1(char a){
		System.out.println("this is Parameter Constructor    " +a);
	}
public static void main(String[] args) {
	Cons1 c1 = new Cons1(19, 29);
	Cons1 c2 = new Cons1();
	Cons1 c3 = new Cons1('A');
}
}
//Only Access-modifier (public, protected, default and private) is allowed
//Non-access-modifier (final, static, abstract) are not allowed
