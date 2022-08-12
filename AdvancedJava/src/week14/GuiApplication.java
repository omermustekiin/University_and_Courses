package week14;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuiApplication extends JFrame implements ActionListener{
	private JButton btn1, btn2, btn3, btn4;
	private JTextArea txt1;
	private JLabel lbl;
	private JPanel pnl1,pnl2,pnl3;
	
	public GuiApplication() {
		
		super("Gui App"); //setTitle
		
		setLayout(new BorderLayout());
		
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(500,300);
		
		pnl1 = new JPanel();
		pnl2= new JPanel();
		pnl3 = new JPanel();
		
		btn1= new JButton("Teacher");
		btn2= new JButton("Student");
		btn3= new JButton("Class");
		btn4= new JButton("Clear");
		txt1= new JTextArea("");
		lbl=new JLabel("label");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		
		pnl1.setLayout(new GridLayout(1,4));
		pnl2.setLayout(new GridLayout(1,1));
		pnl3.setLayout(new GridLayout(1,1));
		
		add(pnl1, BorderLayout.NORTH);
		add(pnl2, BorderLayout.CENTER);
		add(pnl3, BorderLayout.SOUTH);
		
		pnl1.add(btn1);
		pnl1.add(btn2);
		pnl1.add(btn3);
		pnl1.add(btn4);
		
		pnl2.add(txt1);
		pnl3.add(lbl);
		
	}
	
	public static void main(String[] args) {
		new GuiApplication();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		
		if(e.getSource()==btn1) {
			for(Teacher t: Gui_Console.arrayTeacher)
				txt1.append(t.toString()+"\n hhh");
		}
		else if(e.getSource()==btn2) {
			for(Student s: Gui_Console.arrayStudent)
				txt1.append(s.toString()+"\n");
		}
		else if(e.getSource()==btn3) {
			for(Class c: Gui_Console.arrayClass)
				txt1.append(c.toString()+"\n");
		}
		else if(e.getSource()==btn4) {
				txt1.setText(" ");
		}
		
	}
    
	
	
}
