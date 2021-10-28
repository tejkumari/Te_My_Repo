package assigment1;

public class Ifelse4 {
	void leapyear() {
	int year=2895;    
	if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)) {
		System.out.println("Year" +year +" is leap year");
	}
	else {
		System.out.println("Year" +year +" is not leap year");
	}
	
	}
	
	public static void main(String[] args) {
		Ifelse4 obj =new Ifelse4();
		obj.leapyear();
	}
}
