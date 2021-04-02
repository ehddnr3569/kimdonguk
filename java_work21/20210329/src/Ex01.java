import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


//화면 구현 하는 GUI -> 그래픽 사용자 도구
//
//java -> JFrame(javaFx 망함)
//c# -> windowFOrm -> 사용자OS ->윈도우..
//Python - > pyQt5, matplotlib.pyplot


public class Ex01 extends JFrame{

	JButton btn1 = new JButton("입력");
	DataBaseManager dbm = new DataBaseManager();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	// Ex01 은 JFrame 이다
	Ex01(){
		getContentPane().setLayout(null);// 버튼 꽉 차는거 지워라..
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(12, 35, 57, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(22, 75, 57, 15);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(12, 109, 57, 15);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(12, 134, 57, 15);
		getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(91, 32, 116, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(91, 66, 116, 21);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(91, 97, 116, 21);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(91, 131, 116, 21);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		btn1.setBounds(222,126,100,30);
		btn1.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("이거는 인터페이스");
						
					}
				});
		btn1.addActionListener((e)->{System.out.println("ㅇㅇ...");});
		btn1.addActionListener(dbm);
		
		super.add(btn1);
		
		setSize(500,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		for(int i=0; i<10; i++)
//		{                                                                                                                        
//			JFrame jf = new JFrame(i+"");
//				jf.setSize(500,600);
//				jf.setVisible(true);
//				jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
