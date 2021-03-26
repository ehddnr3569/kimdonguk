//생략가능
//extends Object 최상위 클래스
//toString() 생략
//자식클래스 생성시 부모클래스 참조변수 가능  = 다형성
//super() <- 상위클래스 생성자호출
//		super(파라메터)...
//this() <- 현재클래스 생성자호출
//		this(파라메터)...
//오버로딩...

class A extends Object{
	public void doA() {System.out.println("A");}
}
class B{
	public void doB() {System.out.println("B");}
}
class C extends B{
	
}
public class Ex02 {

	public static void main(String[] args) {
		B bb = new C();
		
		A a =new A();
		System.out.println(a);
		
		B b =new B();
		System.out.println(b);
		
		Object obj1 = new A();
		Object obj2 = new B();
		
		Object c[] = {new A(),new A(),new B()};
		
		for (int i = 0; i<c.length; i++){
			System.out.println(c[i]);
			if( c[i] instanceof A){
				A ina = (A) c[i];
				ina.doA();	
			}
			if( c[i] instanceof B){
				B ina = (B) c[i];
				ina.doB();
			}
		}
	}
}
