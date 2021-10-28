package AssigPgm;

public class AddTwoNum {
	int AddNum(int a, int b) {
		int add=a+b;
		System.out.println("Addition of A and B is: " +add);
		return add;
	}
	
public static void main(String[] args) {
	AddTwoNum obj=new AddTwoNum();
	obj.AddNum(10, 50);
}
}
