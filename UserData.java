package chess;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class UserData extends Frame implements ActionListener
{
	Button b1,b2,b3;
	TextField t1,t2;int x2=0;
  public UserData(String str)
  {
	  super(str);
	  setLayout(new GridLayout(5,1,10,10));
	  add(new JLabel("ab"));add(new JLabel("ab"));
	  JPanel jp=new JPanel();
	  b1=new Button("ENTER PLAYER1 NAME");
	  b2=new Button("ENTER PLAYER2 NAME");
	  b3=new Button("START");
	  b3.setFont(new Font("Arial",Font.BOLD,20));
	  b2.setFont(new Font("Arial",Font.BOLD,20));
      b1.setFont(new Font("Arial",Font.BOLD,20));
      b1.setEnabled(false);
      b2.setEnabled(false);
      t1=new TextField(20);
      t2=new TextField(20);
	  t1.setFont(new Font("Arial",Font.BOLD,20));
	  t2.setFont(new Font("Arial",Font.BOLD,20));
      jp.add(b1);jp.add(t1);jp.add(b2);jp.add(t2);jp.add(b3);
      add(jp); add(new JLabel("ab")); add(new JLabel("ab"));
      setSize(Toolkit.getDefaultToolkit().getScreenSize());
      addWindowListener(new WindowAdapter()
      {
    	  @Override
    	  public void windowClosing(WindowEvent we)
    	  {
    		  System.exit(0);
    	  }
    	  
      });
      setVisible(true);
      b3.addActionListener(this);
	  
  }
  @Override
  public void paint(Graphics g)
  {
	  g.drawImage(ImageBoxChess.USER_WINDOW, 0, 0, getWidth(), getHeight(), this);
  }
  public static void main(String args[])
  {
	  new UserData("TO START THE CHESS GAME PLEASE ENTER PLAYERS INFORMATION");
  }
@Override
public void actionPerformed(ActionEvent e)
{
   if((t1.getText())==null || (t1.getText()).isEmpty() || (t2.getText())==null || (t2.getText()).isEmpty())
   {
	   JOptionPane.showMessageDialog(this, "PLEASE FILL THE PLAYERS NAME PROPERLY TO START");
	   t1.setText(null);
	   t2.setText(null);
   }
   else
   {
      new MainWindow("GAME STARTED",t1.getText(),t2.getText());
      this.dispose();
   }
	
}
}
