
public class Atable {
	private String idx;
	private String name;
	private String gender;
	private String remark;

	public Atable(String idx,String name,String gender, String remark){
		this.idx = idx;
		this.name = name;
		this.gender = gender;
		this.remark = remark;

	}
	public void print(){
		System.out.println("번호는"+idx+"입니다");
		System.out.println("이름은 "+name+"입니다");
		System.out.println("성별은 "+gender+"입니다");
		System.out.println("비고는 "+remark+"입니다");
		System.out.println();
		System.out.println();
	}
}
