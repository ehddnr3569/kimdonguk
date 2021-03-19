package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleTest {

	public static void main(String[] args) {

		Connection conn = null; 
        PreparedStatement pstm = null; 
        ResultSet rs = null; 
        
        try {
            String quary = "SELECT * FROM EMP";
            
//            String sqli = "insert into user_contacts"
//                    +"(user_no, user_name, user_phone, user_create_date)"
//                    +"values"
//                    +"(?, ?, ?, sysdate)"; // 값이 무엇이 들어갈지 몰라 ?를 쓰고 값에만 ?를 쓸수있다.
//            pstmt.setString(1, name);
//            pstmt.setString(2, phone);
//            pstmt.setInt(3, no);
//            
//            String sqld ="delete from user_contacts where user_name = ?";
//            pstmt.setString(1, name);
//            
//            String sqlu = "update user_contacts "
//                    + "set "
//                    + "user_name = ?, "
//                    + "user_phone = ? "
//                    + "where user_no = ? ";
//            pstmt.setString(1, name);
//            pstmt.setString(2, phone);
//            pstmt.setInt(3, no);
            
            conn = DBConnection.getConnection();
            pstm = conn.prepareStatement(quary);
            rs = pstm.executeQuery();
//            rs = pstm.executeUpdate();
            
            /*  EMP 테이블의 데이터 타입
             * 
                EMPNO NOT NULL NUMBER(4) -- int
                ENAME VARCHAR2(10) -- String
                JOB VARCHAR2(9) -- String
                MGR NUMBER(4) -- int
                HIREDATE DATE -- Date
                SAL NUMBER(7,2) -- float/double
                COMM NUMBER(7,2) -- float/double
                DEPTNO NUMBER(2) -- int
            */
//            System.out.println(rs.getRow());
            System.out.println("EMPNO ENAME JOB MGR HIREDATE SAL COMM DEPTNO");
            System.out.println("============================================");
            
            while(rs.next()){
                int empno = rs.getInt(1);
                //int empno = rs.getInt("empno"); 숫자 대신 컬럼 이름을 적어도 된다.
                String ename = rs.getString(2);
                String job = rs.getString(3);
                int mgr = rs.getInt(4);
                java.sql.Date hiredate = rs.getDate(5); // Date 타입 처리
                int sal = rs.getInt(6);
                int comm = rs.getInt(7);
                int deptno = rs.getInt(8);
                
                String result = empno+" "+ename+" "+job+" "+mgr+" "+hiredate+" "+sal+" "+comm+" "+deptno;
                System.out.println(result);
            }
            
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
