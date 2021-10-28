package Array;

public class MultiDimArray3 {
public static void main(String[] args) {
	char[] copyFrom= { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
	char[] copyTo=new char[7];
	System.arraycopy(copyFrom, 2, copyTo, 0, copyTo.length);
	for(int i=0;i<copyTo.length;i++) {
		System.out.print(copyTo[i] + "  ");
	}
	System.out.println(String.valueOf(copyTo));
}


}
