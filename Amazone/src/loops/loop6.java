package loops;

public class loop6 {
void BloodDonationCriteria(int age, int weight) {
	if (age>=18)
		System.out.println("Age aligibility fulfilled " +age);
	if (weight>=50)
		System.out.println("Weight aligibility fulfilled " +weight);
	else
		System.out.println("Age " +age + " and"  +" Weight " +weight +" Blood donation aligibility not fulfilled " );
}
public static void main(String[] args) {
	loop6 obj = new loop6();
	obj.BloodDonationCriteria(45, 27);
}
}