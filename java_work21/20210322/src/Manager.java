
public class Manager {
	public static void main(String[] args) {
		Friend[] friends = new Friend[10];
		
		friends[0] = new UniFriend("대학교친구1","010111111", "컴퓨터");
		friends[0] = new UniFriend("대학교친구2","010222222", "컴퓨터");
		
		friends[0] = new UniFriend("직장친구1","010333333", "개발1팀");
		friends[0] = new UniFriend("직장친구2","010444444", "개발2팀");
		
		for(int i = 0; i<friends.length; i++){
			System.out.println("friends["+i+"]"+friends[i]);
		}
	}
}