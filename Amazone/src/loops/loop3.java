package loops;

public class loop3 {
	public static void main(String[] args) {
		int year=2095;    
		if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)) {
			System.out.println("Year" +year +" is leap year");
		}
		else {
			System.out.println("Year" +year +" is not leap year");
		}
	}

}
