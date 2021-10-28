package Encapsulation;

public class Encapsulation5{
	
public static void main(String[] args) {
	Encapsulatiopn5Account Acc=new Encapsulatiopn5Account();
	Acc.setAcc_no(1042l);
	Acc.setName("Sweety sharma");
	Acc.setEmail("sweety1254@gmail.com");
	Acc.setAmount(124579.14f);
	System.out.println(Acc.getAcc_no());
	System.out.println(Acc.getName());
	System.out.println(Acc.getEmail());
	System.out.println(Acc.getAmount());
	Acc.setAcc_no(1212145l);
}
}
