import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Student[] student = new Student[50];
		
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("1.등록  2.조회  3.수정  4.삭제  5.종료");
			int select = scan.nextInt();
			System.out.println("select = " +select);
			if(select==1){
				scan.nextLine();
				System.out.print("이름 : ");
				String name = scan.nextLine();
				System.out.print("성별 : ");
				String gender = scan.nextLine();
				System.out.print("나이 : ");
				int age = scan.nextInt();
				
				
				student[0] = new Student (name, gender, age);
				System.out.println("등록완료");
			}
			else if(select==2){
				System.out.println("===학생조회===");
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
				System.out.println("종료됩니다.");
				break;
			}
		}
	}
}
