
public class Bank {
	public static void main(String[] args) {
		
		Account yoon;
		Account park;
		
		yoon =new Account();
		park =new Account();
		
		yoon.setName("��");
		park.setName("��");
		
		yoon.printAl();
		park.printAl();
		
		yoon.setAl(1000);
		park.setAl(3000);
		
		yoon.printAl();
		park.printAl();
	}
}