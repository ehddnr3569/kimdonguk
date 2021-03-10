import java.lang.*; //생략가능

//접근제어지시자
//public protected default private
//
//static 프로그램 종료시에 계속 상주
//변수 
//메서드
//
//생성자 오버로딩
//super
//this 1.생성자에서 호출 2.클래스 변스를 참조할때 사용

class AAAA {
	AAAA() {
		System.out.println("상위클래스 생성자");
	}
}

public class Person extends AAAA {
	private String name;
	private int age;

	// 생성자 오버로딩
	public Person() {
		// super(); 생략가능 생성자 호출시에 바로 그다믕줄에 위치
	}

	public Person(String name, int age) {
		// super(); 생략가능
		this.name = name;
		this.age = age;
	}

	public void doPrint() {
		System.out.println("name = " + name);
		System.out.println("age = " + age);
	}
	// 생성자 자동만들기 alt + shift + s + o
}
