import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JFrame;

// constructor »ý¼ºÀÚ

public class AtableMain{
	public static Scanner scan = new Scanner (System.in);
	public AtableMain() {
		
		ManagerAtable ma = new ManagerAtable();
		while(true){
		System.out.println("1.insert 2.update 3.delete 4.select");
		int select = scan.nextInt();
		if(select == 1)
			ma.insertAtable();
		else if(select == 2)
			ma.updateAtable();
		else if(select == 3)
			ma.deleteAtable();
		else if(select == 4)
			ma.selectAtable();
		else
			System.exit(1);
		}
	}
	
	public static void main(String[] args) {
		new AtableMain();

	}

}
