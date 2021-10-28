package AssigPgm;

public class UpperCaseAplhabet {
static void UpperCase() {
	for(char a='A'; a<='Z'; a++) {
		System.out.print(a);
	}
	System.out.println();
}
static void LowerCase() {
	for(char a='a'; a<='z'; a++) {
		System.out.print(a);
	}
	System.out.println();
}	
	public static void main(String[] args) {
		UpperCaseAplhabet.UpperCase();
		System.out.println("************************************");
		UpperCaseAplhabet.LowerCase();
	}
}
