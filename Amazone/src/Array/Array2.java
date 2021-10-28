package Array;

public class Array2 {
public static void main(String[] args) {
	int a[]=new int[5];
	System.out.println(a[0]=10);  
	System.out.println(a[1]=45);  
	System.out.println(a[2]=50);  
	System.out.println(a[3]=62);  
	System.out.println(a[4]);  
	System.out.println("***************************************************");
	//a[0]=10;//initialization  
	a[1]=20;  
	//a[2]=70;  
	a[3]=40;  
	a[4]=100;
	System.out.println("Array elements count " +a.length);
	for(int i=0; i<a.length; i++) {
		System.out.println(a[i]);
	}
	System.out.println("***************************************************");
}
}