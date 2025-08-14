package chess;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JProgressBar;

public class ResultWindow extends Frame
{
	JProgressBar jb;Panel p;TextArea b;
 public ResultWindow(String str,int n)
 {
	 super("WINNER WINDOW");
	 setVisible(true);
	 setSize(Toolkit.getDefaultToolkit().getScreenSize());
	 addWindowListener(new WindowAdapter()
     {
   	  @Override
   	  public void windowClosing(WindowEvent we)
   	  {
   		  
   		  System.exit(0);
   	  }
   	  
     });
	 setLayout(null);
	 addMouseListener(new MouseAdapter() {
		 @Override
		 public void mouseClicked(MouseEvent me)
		 {
			System.out.println(me.getX()+","+me.getY()); 
		 }
	 });
	 p=new Panel();
	 p.setLayout(new BorderLayout());
	 jb=new JProgressBar();
	 jb.setMinimum(0);
	 jb.setMaximum(10);
	 jb.setOrientation(JProgressBar.HORIZONTAL);
	 jb.setValue(n);
	 jb.setStringPainted(true);
//	 jb.setBorderPainted(true);
	 jb.setForeground(Color.gray);
	 p.add(jb);
	 jb.setFont(new Font("Arial",Font.BOLD,20));
	 b=new TextArea(4,10);
	 b.setText(str+"\nThe Peformance Percentage Is:- "+(jb.getPercentComplete()*100));
	 b.setFont(new Font("Arial",Font.BOLD,20));
	 p.setBounds(464, 316, 431, 60);
	 b.setBounds(465, 399, 413, 80);
	 add(p);add(b);
	 
 }
 @Override
 public void paint(Graphics g)
 {
	 g.drawImage(ImageBoxChess.WINNER_WINDOW, 0, 0, getWidth(), getHeight(), this);
 }
}
