
public class UniFriend extends Friend{
	String major;
	public UniFriend(String name, String number,String major) {
		super(name, number);
		this.major = major;
	}
	@Override
	public String toString() {
		return "UniFriend [mager=" + major + ", name=" + name + ", number=" + number + "]";
	}
}
