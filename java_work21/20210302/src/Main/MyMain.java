package Main;
import Dog.Dog;

public class MyMain {
	MyMain(){
		Dog dog = new Dog();
		Cat.Cat cat = new Cat.Cat();
		
		dog.welcom(cat);
		System.out.println("프로그램종료");
	}
	public static void main(String[] args){
		new MyMain();
	}
}
