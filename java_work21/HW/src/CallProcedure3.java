import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallProcedure3 {

	public void add() {
		

		// 프로시저 호출
		Connection conn = null; // DB연결된 상태(세션)을 담은 객체
		PreparedStatement pstm = null;  // SQL 문을 나타내는 객체
        ResultSet rs = null;  // 쿼리문을 날린것에 대한 반환값을 담을 객체

        Scanner scann = new Scanner(System.in);
		conn = DBConnection.getConnection();
		
		System.out.println("번호입력");
		int idx = scann.nextInt();
		scann.nextLine();
		System.out.println("이름입력");
		String name = scann.nextLine();
		System.out.println("성별입력");
		String gender = scann.nextLine();
		System.out.println("비고입력");
		String remark = scann.nextLine();
	
		try {
			CallableStatement cs = conn.prepareCall("begin add_atable(?,?,?,?); end;");
			// 입력 파라메터
			cs.setInt(1, idx);
			cs.setString(2, name);
			cs.setString(3, gender);
			cs.setString(4, remark);

			int seq = cs.executeUpdate();

			if (seq == 0) {
				System.out.println(seq + "값");
			} else {
				System.out.println(seq + "값 입력 완료");
			}

			cs.close();
			conn.close();
		} catch (SQLException sqle) {
            System.out.println("SELECT문에서 예외 발생");
            sqle.printStackTrace();
		} finally {
			// DB 연결을 종료한다.
			try {
                if ( rs != null ){rs.close();}   
                if ( pstm != null ){pstm.close();}   
                if ( conn != null ){conn.close(); }
			} catch (Exception e) {
				throw new RuntimeException(e.getMessage());
			}

		}
	}

}
