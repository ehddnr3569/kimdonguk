
public class Ex02 {
	
	
	public static void doprint(int a, int b){
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	public static void doA(){
		int a =10;
		int b =20;
		doprint(a,b);
	}
	public static void doB(){
		int a = 30;
		int b = 40;
		doprint(a,b);
	}
	public static void main(String[] args) {
		int a = 50;
		int b = 60;
		doprint(a,b);
		doA();
		doB();
		
	}
}
