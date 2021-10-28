package Constructor;

public class CoasOverLoading {
	CoasOverLoading(){
		int i=50;
			System.out.println("Running class A cons " +i);
			i= 100;
	}
	void display() { 
		System.out.println("Display method");
		}	
	
	CoasOverLoading(int a){
		 int j=a;
		 j= 10;
				System.out.println("Running class A1 cons " +j +"    " +a);
				
				
				
	 }
	
	
	
	public static void main(String[] args) {
		System.out.println("Running Main method ");
		CoasOverLoading obj = new CoasOverLoading();
		CoasOverLoading obj1 =new CoasOverLoading(500);
		obj1.display();
	}
}
