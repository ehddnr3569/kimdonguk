
public class Student {
	private String name;
	private String gender;
	private int age;
	
	public Student (String n,String g,int a){
		name = n;
		gender = g;
		age = a;
	}
	
	public void print(){
		System.out.println("�̸���" +name +"�Դϴ�");
		System.out.println("������" +gender+"�Դϴ�");
		System.out.println("���̴�" +age+"�Դϴ�");
	}
}
