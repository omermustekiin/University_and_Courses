package week10;

import java.awt.BorderLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui4 extends JFrame{
	
	private JButton btn1, btn2, btn3, btn4;
	private JLabel label1;
	
	
	public Gui4(){
		
		
		
		label1=new JLabel(" ");
		btn1=new JButton("btn1");
		btn2=new JButton("btn2");
		btn3=new JButton("btn3");
		btn4=new JButton("btn4");
		
		Icon icon1=new ImageIcon(getClass().getResource("indir.png"));

		label1.setIcon(icon1);
		label1.setToolTipText("Java...");
		
		setLayout(new BorderLayout());
		
		add(btn1, BorderLayout.NORTH);
		add(btn2, BorderLayout.SOUTH);
		add(btn3, BorderLayout.WEST);
		add(btn4, BorderLayout.EAST);
		add(label1, BorderLayout.CENTER);
		
		setVisible(true);
		setSize(650, 650);
		setLocation(700, 0);
		
		
		
		
	}

	
	
	
}
