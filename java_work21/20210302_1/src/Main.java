import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Student[] student = new Student[50];
		
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("1.���  2.��ȸ  3.����  4.����  5.����");
			int select = scan.nextInt();
			System.out.println("select = " +select);
			if(select==1){
				scan.nextLine();
				System.out.print("�̸� : ");
				String name = scan.nextLine();
				System.out.print("���� : ");
				String gender = scan.nextLine();
				System.out.print("���� : ");
				int age = scan.nextInt();
				
				student[0] = new Student (name, gender, age);
				System.out.println("��ϿϷ�");
			}
			else if(select==2){
				System.out.println("===�л���ȸ===");
				for(int i=0; i<student.length;i++){
					System.out.println(i+ "=" +student[i]);
					if(student[i] != null)
						student[i].print();
				}
				System.out.println("==========");
			}
			else if(select==3){
				
			}
			else if(select==4){
				
			}
			else if(select==5){
				System.out.println("����˴ϴ�.");
				break;
			}
		}
	}
}