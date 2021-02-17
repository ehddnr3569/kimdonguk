
public class Account {
	String name;
	int al;
	
	public void setName(String a){
		name =a;
	}
	// Al 설정
	public void setAl(int value){
		al = value;
	}	
	// Al 출력
	public void printAl(){
		System.out.println("name ="+name);
		System.out.println("al = "+al);
	}
}
