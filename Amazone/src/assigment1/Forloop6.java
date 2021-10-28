package assigment1;

public class Forloop6 {
 static void CountDigit(int num) {
	 System.out.println("Number: " + num);
	 int i=0;
		for(; i<5; i++){
			System.out.print(i +"\t");
		}
	 
	 int count = 0;
	    for (;num != 0; num = num/10, ++count) {
	    }
	    System.out.println("Number of digits: " + count);
	 return;
 }
	
	public static void main(String[] args) {
		Forloop6.CountDigit(87439);
		
	}
}

