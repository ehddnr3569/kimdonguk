import java.util.Scanner;

public class EMain {
	public static void main(String[] args){
		EMployee emp = new EMployee();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름 입력");
		String name = scan.nextLine();
		emp.setName(name);
		
		System.out.println("주민 입력");
		String Jumin = scan.nextLine();
		emp.setJumin(Jumin);
		
		System.out.println("급여 입력");
		int sal = scan.nextInt();
		emp.setSal(sal);
		
		emp.doPrint();
	}
}
