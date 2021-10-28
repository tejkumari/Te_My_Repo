package day8Methods;

public class overloading4 {
void spuare() {
	System.out.println("i am 1st Method");
	return;
}
 static int square(int a) {
	System.out.println("i am 2nd Method");
	return a;
}
double square(long a, double b) {
	System.out.println("i am 3rd Method");
	return(a+b);
}
public static void main(String[] args) {
	overloading4 obj= new overloading4();
	obj.spuare();
	obj.square(58l, 70);
	overloading4.square(15);
}

}
