package assigment1;

public class Pgm3 {
static char ascii() {
	int c='A';
	System.out.println("ASCII value of A: " +c);
	return 0 ;
	
}
static char asccii2() {
	char ch1 = 'a';  
	char ch2 = 'm';  
	// variable that stores the integer value of the character  
	int asciivalue1 = ch1;  
	int asciivalue2 = ch2;  
	System.out.println("The ASCII value of " + ch1 + " is: " + asciivalue1);  
	System.out.println("The ASCII value of " + ch2 + " is: " + asciivalue2);  
	return 0;
}


	public static void main(String[] args)   { 
		Pgm3.ascii();
		Pgm3.asccii2();
	}
}