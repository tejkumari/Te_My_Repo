package Array;

public class Array1 {
	
public static void main(String[] args) {
	String[] cars= {"Volvo", "Nano", "Ford", "BMW"};
	System.out.println(cars.length);
	System.out.println("*********For loop*********");
	for(int i=0; i<cars.length; i++) {
		System.out.println(cars[i]);
	}
	System.out.println("*********For each loop*********");
	for(String i:cars) {
		System.out.println(i);
	}
}
}
