package Array;

public class MulriDimArray2 {
public static void main(String[] args) {
	int Array1[][]= {{1,4,1},{4,5,7},{2,6,8},{1,4,6}};
	for(int i=0; i<Array1.length; i++) {
		for(int j=0; j<Array1[1].length; j++) {
			System.out.print(Array1[i][j] + "  ");
		}
		System.out.println();
	}
	System.out.println("***********************");
	
	
	char[] charArray[]= {{'a', 't', 'w'},{'d', 'g', 'q'},{'o', 'n'}};
	for(int i=0; i<charArray.length; i++) {
		for(int j=0; j<charArray[i].length; j++) {
			System.out.print(charArray[i][j] + "  ");
		}
		System.out.println();
	}
	
	
}
}
