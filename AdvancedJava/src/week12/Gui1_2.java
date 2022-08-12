package week12;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Gui1_2 extends JFrame implements ActionListener, ItemListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txt1, txt2;
	private JLabel lbl1, lbl2, lblEmpty; 
	private JButton btn1;
	private JRadioButton rbtn1, rbtn2, rbtn3, rbtn4;
	private JPanel pnl1, pnl2;
	private ButtonGroup grb;
	
	public Gui1_2() {
		
		setLayout(new GridLayout(2,1));
		
		txt1 = new JTextField(6);
		txt2 = new JTextField(6);
		
		lbl1=new JLabel("Sayi1");
		lbl2=new JLabel("Sayi2");
		lblEmpty=new JLabel();
	
		grb=new ButtonGroup();
		btn1= new JButton("Hesapla");
		
		btn1.addActionListener(this);
		
		rbtn1=new JRadioButton("Toplama");
		rbtn2=new JRadioButton("Çýkarma");
		rbtn3=new JRadioButton("Çarpma");
		rbtn4=new JRadioButton("Bölme");
		
		
		
		rbtn1.addItemListener(this);
		
		
		
		pnl1 = new JPanel();
		pnl2 = new JPanel();
		
		pnl1.setLayout(new GridLayout(3,2));
		pnl2.setLayout(new GridLayout(1,4));
		
		Component[] r = {lbl1, txt1, lbl2, txt2, lblEmpty, btn1, rbtn1, rbtn2, rbtn3, rbtn4};
		
		for (int i=0; i<r.length; i++) {
			if(i<6) {
				pnl1.add(r[i]);
			}else {
				pnl2.add(r[i]);
			}
		}
		
//		pnl1.add(lbl1);
//		pnl1.add(txt1);
//		pnl1.add(lbl2);
//		pnl1.add(txt2);
//		pnl1.add(lblEmpty);
//		pnl1.add(btn1);
//	
    	grb.add(rbtn1);
		grb.add(rbtn2);
		grb.add(rbtn3);
		grb.add(rbtn4);
		
//		pnl2.add(rbtn1);
//		pnl2.add(rbtn2);
//		pnl2.add(rbtn3);
//		pnl2.add(rbtn4);
		
		add(pnl1);
		add(pnl2);
	
//		add(lbl1);
//		add(txt1);
//		add(lbl2);
//		add(txt2);
//		
//		add(rbtn1);
//		add(rbtn2);
//		add(rbtn3);
//		add(rbtn4);
	
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(500, 700);
		setTitle("Combobox Exaöple..");
	}
	
	public static void main(String[] args) {
		new Gui1_2();
	}

	@Override
	public void itemStateChanged(ItemEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		String number1=txt1.getText();
		String number2=txt2.getText();
		
		int fNum=Integer.parseInt(number1);
		int sNum=Integer.parseInt(number2);
		int result;
		
		if(event.getSource()==btn1 && rbtn1.isSelected()) {
			result = fNum + sNum;
			lblEmpty.setText("Result: "+result);
		}
		else if(event.getSource()==btn1 && rbtn2.isSelected()) {
			result = fNum - sNum;
			lblEmpty.setText("Result: "+result);
		}
		else if(event.getSource()==btn1 && rbtn3.isSelected()) {
			result = fNum * sNum;
			lblEmpty.setText("Result: "+result);
		}
		else if(event.getSource()==btn1 && rbtn4.isSelected()) {
			result = fNum/sNum;
			lblEmpty.setText("Result: "+result);
		}
		
	}

}
