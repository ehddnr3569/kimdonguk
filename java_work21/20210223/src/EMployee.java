
public class EMployee {
	private String Name;
	private String Jumin;
	private int Sal;
	public void setName(String name){
		this.Name = name;
	}
	public void doPrint(){
		
		System.out.println("이름"+Name);
		System.out.println("주민"+Jumin);
		System.out.println("연봉"+Sal);
	}
	public void setJumin(String jumin) {
		Jumin = jumin;
	}
	public void setSal(int sal) {
		Sal = sal;
	}
	
//	private 접근제어지시자 설정
//	1.setName
//	2.생성자로
}
