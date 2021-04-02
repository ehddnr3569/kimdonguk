import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

//데이터베이스매니저 클래스는 리액션리스너이다.. is a 관계 성립..
public class DataBaseManager implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// 시도해라
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ai","1234");
			PreparedStatement pstmt = conn.prepareStatement("insert into atable values('1','a','b','b')");
			pstmt.executeUpdate();
		}
		catch(ArithmeticException ae) {
			JOptionPane.showMessageDialog(null, "0으로 나눌 수 없다.");
		}
		catch(ClassNotFoundException cne) {
			JOptionPane.showMessageDialog(null, "클래스 없다.");
		}
		// 하다가 예외상황이 발생하면 catch로 빠져라..
		catch (Exception exc) {
			exc.printStackTrace();
		}
		System.out.println("데이터베이스매니저..");
		
	}

}
