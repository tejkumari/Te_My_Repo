package assigment1;

public class WhileLoop1 {
	void digitsInNum(int a) {
		System.out.println("Number is: " + a);
	
	int count = 0;
    while (a != 0) {
      a = a / 10;
      ++count;
    }

    System.out.println("Number of digits: " + count);
  }
public static void main(String[] args) {
	WhileLoop1 obj =new WhileLoop1();
	obj.digitsInNum(657587);
	obj.digitsInNum(215646454);
	
}
}
