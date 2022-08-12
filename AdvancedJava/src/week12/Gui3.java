package week12;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Gui3 extends JFrame implements ListSelectionListener{

	private JList listex;
	
	public Gui3() {
		
		setLayout(new FlowLayout());
		String[] color = {"green", "blue", "white", "orange", "yellow"};
		listex = new JList(color);
		listex.addListSelectionListener(this                                                                                                                                                  );
		add(listex);

		setVisible(true);
		setLocation(300, 500);
		setTitle("JList Example...");
		setSize(300,300);
		
	}
	
	public static void main(String[] args) {
		 new Gui3();
	}

	@Override
	public void valueChanged(ListSelectionEvent event) {
	
		switch(listex.getSelectedIndex()) {
		
		case 0:
			getContentPane().setBackground(Color.green);
			break;
		case 1:
			getContentPane().setBackground(Color.blue);
			break;
		case 2:
			getContentPane().setBackground(Color.white);
			break;
		case 3:
			getContentPane().setBackground(Color.orange);
			break;
		case 4:
			getContentPane().setBackground(Color.yellow);
			break;
				
		
		}
	}
	
	
	
}
