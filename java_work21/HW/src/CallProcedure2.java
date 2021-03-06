import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallProcedure2 {

	public void update(){
		Connection conn = null; // DB연결된 상태(세션)을 담은 객체
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Scanner scan = new Scanner(System.in);
		
		try {
			
			conn = DBConnection.getConnection();
			 // 프로시저 호출
			
			System.out.println("번호입력");
			int idx = scan.nextInt();
			scan.nextLine();
			System.out.println("이름입력");
			String name = scan.next();
			System.out.println("성별입력");
			String gender = scan.next();
			System.out.println("비고입력");
			String remark = scan.next();
//			scan.close();
			
			 CallableStatement cs = conn.prepareCall("begin update_atable2(?,?,?,?); end;");
			 // 입력 파라메터
			 cs.setInt(1, idx);
			 cs.setString(2, name);
			 cs.setString(3, gender);
			 cs.setString(4, remark);
			 cs.execute();
			 int seq= cs.executeUpdate();
			 
			 if ( seq ==0 )
			 {
				 System.out.println(seq+"값");
			 }
			 else
			 {
				 System.out.println(seq+"값 업데이트 완료");
			 }
			 
			 cs.close();
			 conn.close();
			 } catch(Exception e){
			 e.printStackTrace();
			 }finally{
            // DB 연결을 종료한다.
            try{
                if ( rs != null ){rs.close();}   
                if ( pstm != null ){pstm.close();}   
                if ( conn != null ){conn.close(); }
            }catch(Exception e){
                throw new RuntimeException(e.getMessage());
            }
            
        }
	}

}
