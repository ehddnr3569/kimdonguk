import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

class CallProcedure4{
	public void delete(){
		Connection conn = null; // DB연결된 상태(세션)을 담은 객체
		PreparedStatement pstm = null;  // SQL 문을 나타내는 객체
        ResultSet rs = null;  // 쿼리문을 날린것에 대한 반환값을 담을 객체
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("번호입력");
			int idx = scan.nextInt();
			scan.nextLine();
			conn = DBConnection.getConnection();
			// 프로시저 호출
			CallableStatement cs = conn.prepareCall("begin del_atable(?); end;");
			// 입력 파라메터
			cs.setInt(1, idx);
			
			int seq= cs.executeUpdate();
			
			if (seq == 0) {
				System.out.println(seq + "값");
			} else {
				System.out.println(seq + "값 삭제 완료");
			}
			cs.close();
			conn.close();
		} catch (SQLException sqle) {
            System.out.println("SELECT문에서 예외 발생");
            sqle.printStackTrace();
            
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
