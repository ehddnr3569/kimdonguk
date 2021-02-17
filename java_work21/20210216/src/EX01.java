class MyCal{
	public void doAdd(int num1 ,int num2){System.out.println(num1+num2);}
	public void doMin(int num1 ,int num2){System.out.println(num1-num2);}
	public void doMul(int num1 ,int num2){System.out.println(num1*num2);}
	public void doDivRe(int num1, int num2){System.out.println(num1/num2);
											System.out.println(num1%num2);}
}
public class EX01 {
	
	public static void main(String[] args) {
		MyCal mc = new MyCal();
		mc.doAdd(10, 20);
		mc.doMin(30, 20);
		mc.doMul(5, 3);
		mc.doDivRe(9, 2);
	}

}
