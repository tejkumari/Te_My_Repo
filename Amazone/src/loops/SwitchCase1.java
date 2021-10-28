package loops;

public class SwitchCase1 {

	static void month(int a) {
	switch(a) {
	case 1:
		System.out.println("January is " +a +" Month");
		break;
	case 2:
		System.out.println("Febuary is " +a  +" Month");
		break;
	case 3:
		System.out.println("March is " +a +" Month");
		break;
	case 4:
		System.out.println("April is " +a +" Month");
		break;
	case 5:
		System.out.println("May is " +a +" Month");
		break;
	case 6:
		System.out.println("June is " +a +" Month");
		break;
	case 7:
		System.out.println("July is " +a +" Month");
		break;
	case 8:
		System.out.println("August is " +a +" Month");
		break;
	case 9:
		System.out.println("September is " +a +" Month");
		break;
	case 10:
		System.out.println("October is " +a +" Month");
		break;
	case 11:
		System.out.println("November is " +a +" Month");
		break;
	case 12:
		System.out.println("December is " +a +" Month");
		break;
	}
	}
public static void main(String[] args) {
	SwitchCase1.month(5);
	SwitchCase1.month(12);
	SwitchCase1.month(7);
}
}
