import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManagerAtable {
	
	public void insertAtable() {
		String idx = null;
		String name = null;
		String gender = null;
		String remark = null;

		AtableMain.scan.nextLine();
		System.out.println("번호입력");
		idx = AtableMain.scan.nextLine();
		System.out.println("이름입력");
		name = AtableMain.scan.nextLine();
		System.out.println("성별입력");
		gender = AtableMain.scan.nextLine();
		System.out.println("비고입력");
		remark = AtableMain.scan.nextLine();

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
//			String user = "ai";
//			String pw = "1234";
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DBConnection.getConnection();
//			conn = AtableMain.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ai", "1234");
			System.out.println("DB연결성공");
			CallableStatement cs = conn.prepareCall("begin add_atable(?,?,?,?); end;");
			cs.setString(1, idx);
			cs.setString(2, name);
			cs.setString(3, gender);
			cs.setString(4, remark);
			cs.execute();

			int seq = cs.executeUpdate();
			if (seq == 0) {
				System.out.println("실패했습니다.");
			} else {
				System.out.println("성공");
			}

		} catch (Exception e) {
			System.out.println("에러 그 클래스 파일 없음");
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void updateAtable() {
		String idx = null;
		String name = null;
		String gender = null;
		String remark = null;

		AtableMain.scan.nextLine();
		System.out.println("번호입력");
		idx = AtableMain.scan.nextLine();
		System.out.println("이름입력");
		name = AtableMain.scan.nextLine();
		System.out.println("성별입력");
		gender = AtableMain.scan.nextLine();
		System.out.println("비고입력");
		remark = AtableMain.scan.nextLine();

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ai", "1234");
			pstmt = conn.prepareCall("begin update_atable(?,?,?,?); end;");
			pstmt.setString(1, name);
			pstmt.setString(2, gender);
			pstmt.setString(3, remark);
			pstmt.setString(4, idx);

			pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println("에러 그 클래스 파일 없음");
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void deleteAtable() {
		String idx = null;
		AtableMain.scan.nextLine();
		System.out.println("번호입력");
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:xe", "ai", "1234");
			pstmt = conn.prepareCall("begin del_atable(?); end;");
			pstmt.setString(1, idx);
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("에러 그 클래스 파일 없음");
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void selectAtable() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ai", "1234");
			pstmt = conn.prepareCall("begin selectallcolumn_atable(?,?,?,?); end;");

			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getString(1) + " ");
				System.out.print(rs.getString(2) + " ");
				System.out.print(rs.getString(3) + " ");
				System.out.println(rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
	}
}
