
public class Ex04 {
	public static void main(String[] args) {
		Point point = new Point (3,5);
//		Point cpy = point;
//		
//		System.out.println(point);
//		System.out.println(cpy);
		Point cpy = null;
		try {
			cpy = (Point)(point.clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		point.xpos = 20;
		System.out.println("org="+point);
		System.out.println("cpy="+cpy);
	}
}
