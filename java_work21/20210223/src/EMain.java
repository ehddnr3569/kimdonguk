import java.util.Scanner;

public class EMain {
	public static void main(String[] args){
		EMployee emp = new EMployee();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�̸� �Է�");
		String name = scan.nextLine();
		emp.setName(name);
		
		System.out.println("�ֹ� �Է�");
		String Jumin = scan.nextLine();
		emp.setJumin(Jumin);
		
		System.out.println("�޿� �Է�");
		int sal = scan.nextInt();
		emp.setSal(sal);
		
		emp.doPrint();
	}
}
