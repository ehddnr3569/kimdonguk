package aa.bb.cc;

// public ��� ���� ���
// private ���� java Ŭ���� �ȿ��� ���

public class Student {
	public int x = 10;
	private int y = 20;
	int z = 30; // default
	protected int k = 30; 
	
	// public - private - default - protected
	
	//alt + shift + s -> r
	public int getY(){
		return this.y;
	}
}