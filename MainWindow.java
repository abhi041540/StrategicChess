package chess;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends Frame
{
    JPanel jp1,jp2;	Frame f1;
 public MainWindow(String str,String p1,String p2)
 {
	 super(str);
	 f1=this;
	 setVisible(true);
	 setSize(Toolkit.getDefaultToolkit().getScreenSize());
	 jp2=new TimePanel(p2,p1,this);
	 //setDefaultCloseOperation(EXIT_ON_CLOSE);
	 addWindowListener(new WindowAdapter()
     {
   	  @Override
   	  public void windowClosing(WindowEvent we)
   	  {
   		  
   		  System.exit(0);
   	  }
   	  
     });
	 jp1=new JPanel();
	 //jp1.setLayout(new BorderLayout());
	 jp1.add(jp2);
	 jp2.setPreferredSize(new Dimension(700,700));
	 add(jp1);
	 
	 
 }
 @Override
 public void paint(Graphics g)
 {
	 g.drawImage(ImageBoxChess.Game_WINDOW, 0, 0, getWidth(), getHeight(), this);
 }
}
