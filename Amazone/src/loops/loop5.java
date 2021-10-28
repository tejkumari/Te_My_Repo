package loops;

public class loop5 {
	static int marksOfStudent(int a) {
		if (a>=90)
			System.out.println("Student has score distintion with " +a +" Marks");
		else if (a>=80)
			System.out.println("Student has score First class with " +a +" Marks");
		else if (a>=70)
			System.out.println("Student has score Second class with " +a +" Marks");
		else if (a>=50)
			System.out.println("Student has score Third class with " +a +" Marks");
		else if (a>=40)
			System.out.println("Student has score Pass class with " +a +" Marks");
		else if (a<40)
			System.out.println("Student has score Fail with " +a +" Marks");
		else
			System.out.println("Invalid Marks");  

		return a;
	}
public static void main(String[] args) {
	loop5.marksOfStudent(4);
}
}
