package assigment1;

public class Forloop9 {
void prime(int a) {
	boolean flag = false;
	for(int i=2; i <= a/2; ) {
		if(a % i == 0)
			flag = true;
			break;
}
 if (!flag)
	 System.out.println(a + " is a prime number.");
 else
   System.out.println(a + " is not a prime number.");

}
	public static void main(String[] args) {
		Forloop9 obj =new Forloop9();
		obj.prime(21545);
		obj.prime(5461);
		obj.prime(258);
	

}
}


