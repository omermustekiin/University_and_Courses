package week10;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui1 {
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		window.setVisible(true);       
		window.setSize(300, 500);
		//window.setLocationRelativeTo(null);                  //pencere merkezde konumlanýr
		window.setLocation(40, 40);                           //pencere belirttiðim koordinatlarda konumlanýr
		window.setTitle("My First Frame");
		
		
		JButton button1 = new JButton("Click");
		JButton button2 = new JButton("Click2");
		window.add(button1);
		window.add(button2);

		
		FlowLayout f = new FlowLayout(FlowLayout.LEFT);
		window.setLayout(f);                                  //window.setLayout(new FlowLayout());
		
		//GridLayout g = new GridLayout(3,1);
		//window.setLayout(g); 
		
		window.setDefaultCloseOperation(1);                  //pencereyi kapatýr. 0 olsa kapanmazdý
		
		
		
		
		
	}

}
