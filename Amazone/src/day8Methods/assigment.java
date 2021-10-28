package day8Methods;

public class assigment {
	
	static double simpleIntrest(double p, double rate, int time ) {
		double SI= p*rate*time/100;
		System.out.println("Simple Interest: " +SI);
		return SI;
	}
	
	 double areaOfCircle(double r) {
		final double pi= 3.14;
		double area= pi*r*r;
		//System.out.println("Area of Circle: " +area);
		return area;
	}
	
	static double degreetoF(double degreeCelcius) {
		double res= degreeCelcius*1.8;
		//System.out.println("Degree in Fahrenheit:" +res);
		return res;
	}

	public static void main(String[] args) {
		assigment.simpleIntrest(5000, 5, 10);
		//System.out.println("Simple Interest: " +assigment.simpleIntrest(5000, 5, 10));
		
		assigment obj = new assigment();
		System.out.println("Area of Circle: " +obj.areaOfCircle(2.5));
		
		//assigment.degreetoF(90);
		System.out.println("Degree in Fahrenheit:" +assigment.degreetoF(90));
		
	}
}
