package week10;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui3 extends JFrame{

	public Gui3() {
		
		setLayout(new GridLayout(10,1));
		//JButton btn1=new JButton("btn1");
		setSize(500, 500);
		setVisible(true);
		setLocationRelativeTo(null);
		//add(btn1);
		
		for (int i=0; i<10; i++) {
	    JButton btn = new JButton("btn" + (i+1));
	    add(btn);
			
		}
		
		
	}
	
	
	
}
