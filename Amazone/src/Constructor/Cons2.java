package Constructor;

public class Cons2 {
int age;
double sal;
Cons2(){
}
public static void main(String[] args) {
	Cons2 c1 =new Cons2();
	Cons2 c2 =new Cons2();
	System.out.println(c1.age);//0
	System.out.println(c2.sal);//0.0
}
}
