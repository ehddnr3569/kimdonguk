


public class Ex02 {
	public static void main(String[] args) {
//		doA();
		doB();
		Ex02 ex02 = new Ex02();
		ex02.doA();
	}
	public void doA(){
		System.out.println("A의 함수입니다.");
	}
	public static void doB(){
		System.out.println("B의 함수입니다.");
	}
}
