package Array;

public class MultiDimArray {
	
public static void main(String[] args) {
	int a1[][]=new int[5][4]; //5 rows and 4 columns
	for (int i = 0; i < a1.length; i++) {// row count
		for (int j = 0; j < a1[i].length; j++) {// cell count on current row
			System.out.print(a1[i][j] + "  ");
		}
		System.out.println();
	}
	System.out.println("***************************************************");
	a1[0][2]=1;//initialization  
	a1[1][3]=2;  
	a1[2][1]=7;  
	a1[3][2]=4;  
	a1[4][0]=5;
	a1[3][0]=5;
	a1[2][0]=5;
	System.out.println("Array elements count " +a1.length);
	for(int i=0; i<a1.length; i++)
	{for (int j = 0; j < a1[i].length; j++) {
		
		System.out.print(a1[i][j] +"  ");
	}
	System.out.println();
}
	System.out.println("***************************************************");
}
}
