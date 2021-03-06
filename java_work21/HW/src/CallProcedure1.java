import java.sql.*;

public class CallProcedure1 {

	public void see(){
		// TODO Auto-generated method stub
		Connection conn = null; // DB연결된 상태(세션)을 담은 객체
        ResultSet rs = null;  // 쿼리문을 날린것에 대한 반환값을 담을 객체
        PreparedStatement pstm = null;  // SQL 문을 나타내는 객체
		try {	
			int count =0;
			Atable[] atable = new Atable[50];
			conn = DBConnection.getConnection();
			 // 프로시저 호출
			 CallableStatement cs = conn.prepareCall("begin SELECTALLCOLUMN_ATABLE(?); end;");
			
			 // 출력 파라메터
			 cs.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
			 // 실행
			 cs.execute();
//			 ResultSet rs = (ResultSet)cs.getObject(1);
			 rs = (ResultSet)cs.getObject(1);
			 
			 while(rs.next()) {
				 atable[count]=new Atable(rs.getInt("idx"),rs.getString("name"),rs.getString("gender"),rs.getString("remark"));
			 count++;
			 }
			 
			 for (int i=0;atable.length>i;i++)
			 {
				if(atable[i] != null)
				{
					atable[i].print();
				}
			 }
			 
			 rs.close();
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
