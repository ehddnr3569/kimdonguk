import aa.bb.cc.Triangle;

public class EX03 {

//	���� �κ����� �̵�
//	ctrl + ���콺����Ŭ�� ,f3
//	�ҽ� �ڷ� �̵�
//	ctrl + <-,_->
	
	public static void main(String[] args) {
		Triangle tri = new Triangle();
		double area = tri.getArea();
		System.out.println("area = "+area);
		tri.setXY(3, 2);
		System.out.println("area ="+area);
	}

}
