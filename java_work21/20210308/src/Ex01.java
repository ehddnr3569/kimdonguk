class StaticValues{
	static int A = 10;
}
class A{
	public void doPrintStaticA(){System.out.println("SV.A = "+StaticValues.A++);}
}
class B{
	public void doPrintStaticA(){System.out.println("SV.A = "+StaticValues.A++);}
}
public class Ex01 {
	public static void main(String[] args) {
		A a = new A();
		a.doPrintStaticA();
		B b = new B();
		b.doPrintStaticA();
		System.out.println("SV.A = "+StaticValues.A);
		
		//		데이터영역(값을 저장, 프로그램 시작에서 종료까지)
		//		스택영역(함수에서 기본변수를 선언시에 사용하고, 함수종료할때 메모리에서 삭제)
		//		힙영역(molloc calloc realloc free 개발자가 사용해서 직접 메모리 할당및 삭제)
	}

}
