
class BB {
	public void doPro() {
		for(int i=0; i<10; i++){
			Accummulator.add(i);
		}
		Accummulator.showResult();
	}
}

public class Ex01 {
	Ex01(){
		BB b =new BB();
		b.doPro();
	}
	public static void main(String[] args){
		new Ex01();
	}
} 