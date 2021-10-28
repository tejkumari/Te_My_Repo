package day8Methods;
// cam we overload main() in java?


public class overloading3 {

	public static void main(int args) {
		System.out.println("Second Main method");
		
		}
	public static void main(String[] args) {
		System.out.println("Main method");
		overloading3.main(0);
	}
}
