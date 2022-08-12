package week10;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Gui2_2 extends JFrame implements ActionListener{
	
	private JButton button1;    //kontrol etmemiz gerek actionlý buton
	
	public Gui2_2(String title) {
		
		//JFrame window2 = new JFrame("");
		
		//----------Window Settings--------//
		
//		super(title);
		//FlowLayout f = new FlowLayout(FlowLayout.LEFT);
		GridLayout g = new GridLayout(3,3);
		setLayout(g);
		setSize(200, 250);
		setVisible(true);
		setLocationRelativeTo(null);
		setLocation(1100, 0);
		
		
		//--------------Labels--------------//
		JLabel label1= new JLabel("Username: ");
		JTextField text1 = new JTextField(7);
		
		JLabel label2 = new JLabel("Password: ");
		JTextField text2 = new JTextField(7);
		
		JLabel emptyLabel = new JLabel(" ");
		button1 = new JButton("Login");          //global deðiþken mavi 


		
		//--------Add to Window-------//
		add(label1);
		add(text1);
		add(label2);
		add(text2);
		add(emptyLabel);
		add(button1);
		
		
		//-------Button Action-----//
		button1.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==button1) {
			String number = JOptionPane.showInputDialog(null, "Enter a number: ");
			
			int newNumber=Integer.parseInt(number);
			
			JOptionPane.showMessageDialog(null,"New Number: " + newNumber*5);
		}
		
		
	}

	
}
