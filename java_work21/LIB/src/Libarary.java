import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Libarary extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	public Libarary() {
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(172, 168, 116, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(172, 199, 116, 21);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(103, 171, 57, 15);
		getContentPane().add(lblNewLabel);
		 
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(103, 202, 57, 15);
		getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.setBounds(103, 237, 87, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("회원가입");
		btnNewButton_1.setBounds(202, 237, 86, 23);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("로그인");
		lblNewLabel_2.setBounds(177, 143, 36, 15);
		getContentPane().add(lblNewLabel_2);
	}
	public static void main(String[] args) {
		new LLL();
	}
}
