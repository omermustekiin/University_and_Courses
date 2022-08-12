package week15_LastWeek;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class hesap_machine extends JFrame implements ActionListener
{    
   JButton btn10,btn11,btn12,btn13,btn14,btn15; 
   JButton btn[]=new JButton[10];
   int i,sonuc,n1,n2;
   JTextField txt;
   char dortislem;
    
   public hesap_machine()
  {
     super("Calulator");
      setLayout(new BorderLayout());
      JPanel pnl=new JPanel();
      pnl.setLayout(new GridLayout(4,4));
      
      
      //Number Buttons
      
      for(int i=0;i<=9;i++)
      {
        btn[i]=new JButton(i+"");
        pnl.add(btn[i]);
        btn[i].addActionListener(this);
      }
   
      btn10=new JButton("+");
      btn11=new JButton("-");
      btn12=new JButton("*");
      btn13=new JButton("/");
      btn14=new JButton("=");
      btn15=new JButton("del");
      
      
      //add
      pnl.add(btn10);
      pnl.add(btn11);
      pnl.add(btn12);
      pnl.add(btn13);
      pnl.add(btn14);
      pnl.add(btn15);
      
      //btn add action
      btn10.addActionListener(this);
      btn11.addActionListener(this);
      btn12.addActionListener(this);
      btn13.addActionListener(this);
      btn14.addActionListener(this);
      btn15.addActionListener(this);
 
    
      txt=new JTextField(10);
      
      add(pnl,BorderLayout.CENTER);
      add(txt,BorderLayout.NORTH);
      setVisible(true);
      setSize(200,200);
     }
   
   
public void actionPerformed(ActionEvent event)
{
  JButton a=(JButton)event.getSource();
  

	if(a==btn15)
	{
	 txt.setText("");
	}
	else if(a==btn14)
		{
		 n2=Integer.parseInt(txt.getText());
		}
	else if(a==btn13)
	{
	
	}
	else if(a==btn12)
	{
		
	}
	else if(a==btn11)
	{
		
	}
	else if(a==btn10)
	{
		
	}
	else {
		
	}
}
 

	
	//4 tane durumum var
int functions()
{
	switch(dortislem)
	{
 	case '+':   sonuc=n1+n2; break;
 	case '-':   sonuc=n1-n2; break;
 	case '*':   sonuc=n1*n2; break;
 	case '/':   sonuc=n1/n2; break;
 
	}
	return 0;
}
 
  public static void main(String arg[])
  {
      new hesap_machine();
   }
}