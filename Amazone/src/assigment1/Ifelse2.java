package assigment1;

public class Ifelse2 {
	static boolean alphabet(char a) {
		if (a == 'a' || a== 'A' || a== 'e' || a== 'E' || a== 'i' || a== 'I' || a== 'o' || a== 'O' || a=='u' || a== 'U') 
			System.out.println(a +" VOWEL");
		else
			System.out.println(a +" CONSONANT");
		return true;
	}

	
public static void main(String[] args) {
	Ifelse2.alphabet('A');
	Ifelse2.alphabet('a');
	Ifelse2.alphabet('Z');
	Ifelse2.alphabet('o');

}

}
