


public class Point implements Cloneable{
	public int xpos;
	public int ypos;
	public Point(int xpos, int ypos) {
		super();
		this.xpos = xpos;
		this.ypos = ypos;
	}
	@Override
	public String toString() {
		return "Point [xpos=" + xpos + ", ypos=" + ypos + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
