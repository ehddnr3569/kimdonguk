class Account{
	String accNumber;
	String ssNumber;
	int balance;
	public void initAccount(String acc, String ss,int bal){
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
	public void checkAccount(){
		System.out.println("���¹�ȣ = "+accNumber);
		System.out.println("�ֹε�� = "+ssNumber);
		System.out.println("�ݾ� = "+balance);
	}
	
}

public class accountMana {
	public static void main(String[] args) {
		Account acc1 = new Account();
		Account acc2 = new Account();
		
		acc1.checkAccount();
		acc2.checkAccount();
		
		acc1.initAccount("12-34-89","850511-1111111",1000);
		acc2.initAccount("33-33-33","961222-1111111",1000000000);
		
		acc1.checkAccount();
		acc2.checkAccount();
	}
}
