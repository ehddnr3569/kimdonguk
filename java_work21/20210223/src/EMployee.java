
public class EMployee {
	private String Name;
	private String Jumin;
	private int Sal;
	public void setName(String name){
		this.Name = name;
	}
	public void doPrint(){
		
		System.out.println("�̸�"+Name);
		System.out.println("�ֹ�"+Jumin);
		System.out.println("����"+Sal);
	}
	public void setJumin(String jumin) {
		Jumin = jumin;
	}
	public void setSal(int sal) {
		Sal = sal;
	}
	
//	private �������������� ����
//	1.setName
//	2.�����ڷ�
}
