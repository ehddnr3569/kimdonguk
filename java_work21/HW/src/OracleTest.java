import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class OracleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null; // DB연결된 상태(세션)을 담은 객체
        PreparedStatement pstm = null;  // SQL 문을 나타내는 객체
        ResultSet rs = null;  // 쿼리문을 날린것에 대한 반환값을 담을 객체
        
        

        	while(true){
        		Scanner scan = new Scanner(System.in);
        		System.out.println("1.insert 2.update 3.delete 4.select 5.x");
        		int select = scan.nextInt();
//        		scan.close();
        		
        		if(select == 1){
        			CallProcedure3 sum = new CallProcedure3();
        			sum.add();
        		}
        		else if(select == 2){
        			CallProcedure2 up = new CallProcedure2();
        			up.update();
        		}
        		if(select == 3){
        			CallProcedure4 del = new CallProcedure4();
        			del.delete();
        		}
        		else if(select == 4){
        			CallProcedure1 see = new CallProcedure1();
        			see.see();
        		}
        		else if(select == 5)
        			System.exit(1);
        		}

            
        }

	}


