
public class Ex02 {
	public static void main(String[] args) {
		INum i1 = new INum(10);
		INum i2 = new INum(12);
		INum i3 = new INum(10);
		
		if(i1.equals(i2))
			System.out.println("내용이 다르다");
		if(i1.equals(i3))
			System.out.println("내용이 똑같다");
		if(i1 == i2)
			System.out.println("i1 == i2 똑같다");
		if(i1 == i3)
			System.out.println("i1 == i3 똑같다");
	}
}
