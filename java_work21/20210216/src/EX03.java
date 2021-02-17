import aa.bb.cc.Triangle;

public class EX03 {

//	선언 부분으로 이동
//	ctrl + 마우스왼쪽클링 ,f3
//	소스 뒤로 이동
//	ctrl + <-,_->
	
	public static void main(String[] args) {
		Triangle tri = new Triangle();
		double area = tri.getArea();
		System.out.println("area = "+area);
		tri.setXY(3, 2);
		System.out.println("area ="+area);
	}

}
