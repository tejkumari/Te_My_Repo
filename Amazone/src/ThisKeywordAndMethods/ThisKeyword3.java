package ThisKeywordAndMethods;

public class ThisKeyword3 {
	int x;
	// Constructor with a parameter
	 ThisKeyword3(int x) {
		this.x = x;
	}

	// Call the constructor
	public static void main(String[] args) {
		ThisKeyword3 myObj = new ThisKeyword3(5);
		System.out.println("Value of x = " + myObj.x);//5
	}

}
