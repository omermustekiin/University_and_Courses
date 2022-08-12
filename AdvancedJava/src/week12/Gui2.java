package week12;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Gui2 extends JFrame implements ItemListener{
	
	private JComboBox combo;
	private JLabel lbl;
	private Icon[] icon = {
			new ImageIcon(getClass().getResource("1.png")),
			new ImageIcon(getClass().getResource("2.png")),
			new ImageIcon(getClass().getResource("3.png"))
			};
	
	public Gui2() {
		super("JCombobox Example");
		setLayout(new FlowLayout());
		
		String[] animal = {"Seçiniz", "At", "Keçi", "Kangal"};
		combo = new JComboBox(animal);
		combo.addItemListener(this);
		
		lbl = new JLabel();
		lbl.setIcon(icon[1]);		

		add(combo);
		add(lbl);
		
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(500, 500);
	}
	public static void main(String[] args) {
		new Gui2();
	}
	
	@Override
	public void itemStateChanged(ItemEvent event) {

//		JOptionPane.showMessageDialog(null, "Click");
		
		switch(combo.getSelectedIndex()) {
		case 1:
			lbl.setIcon(icon[0]);
			break;
		case 2:
			lbl.setIcon(icon[1]);
			break;
		case 3:
			lbl.setIcon(icon[2]);
			break;
		}
		
	}

}