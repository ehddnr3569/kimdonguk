class MyException extends Exception{
	MyException(){
		super("내가 만든 예외 상황");
	}
}
public class Ex04 {
	Ex04(){
		try {
			new MyException();
		}catch (Exception me) {
			System.out.println(me.getMessage());
		}
	}
	public static void main(String[] args) {
		new Ex04();
	}
}
