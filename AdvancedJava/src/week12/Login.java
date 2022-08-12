package week12;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{

	
	private JLabel lblUsername, lblPassword;
	private JTextField txtUsername;
	private JPasswordField passField;
	private JButton btnLogin, btnRegister;
	
	public Login() {
		
		setLayout(new GridLayout(3,2));
		lblUsername = new JLabel("UserName");
		lblPassword = new JLabel("Password");
		
		txtUsername = new JTextField();
		passField = new JPasswordField();
		
		btnLogin = new JButton("Login");
		btnRegister = new JButton("Register");
		
		btnLogin.addActionListener(this);
		btnRegister.addActionListener(this);
		
		Component[] r = {lblUsername, txtUsername, lblPassword, passField, btnRegister, btnLogin};
		
		for (int i=0; i<r.length; i++) {
			add(r[i]);
		}
		
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(400,400);
	}
	
	public static void main(String[] args) {
		
		new Login();
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		if (event.getSource()==btnRegister) {
			new  Gui2();
		}//else if (event.getSource()){
			
		//}
		
	}
	
	
	
}
