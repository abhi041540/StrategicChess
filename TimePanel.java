package chess;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class TimePanel extends JPanel
{
	Panel p1,p2;Button b1,b2;JLabel l1,l2; int m1,m2,sc1,sc2;Frame f;
	Timer t1,t2;String s1,s2;
  public  TimePanel(String s1,String s2,Frame f)
  {
	  this.f=f;
	  this.s1=s1;
	  this.s2=s2;
	  setLayout(new BorderLayout());
	  p1=new Panel();
	  p2=new Panel();
	  b1=new Button(s1);
	  b2=new Button(s2);
	  b1.setBackground(Color.gray);
	  b2.setBackground(Color.gray);
	  b1.setEnabled(false);
	  b2.setEnabled(false);
	  b1.setFont(new Font("Arial",Font.BOLD,20));
	  b2.setFont(new Font("Arial",Font.BOLD,20));
	  l1=new JLabel("Remaining Time :-  10:00");
	  l2=new JLabel("Remaining Time :- 10:00");
	  l1.setFont(new Font("Arial",Font.BOLD,20));
	  l2.setFont(new Font("Arial",Font.BOLD,20));
	  m1=9;
	  m2=9;
	  sc1=60;
	  sc2=60;
	  p1.setBackground(Color.LIGHT_GRAY);
	  p2.setBackground(Color.lightGray);
	  p1.add(b1);p1.add(l2);p2.add(b2);p2.add(l1);
	  add(BorderLayout.NORTH,p1);
	  add(BorderLayout.SOUTH,p2);
 	  add(BorderLayout.CENTER,new MainPanel(this,f));  
	   t1=new Timer(1000,new ActionListener() 
	   {
        @Override
		public void actionPerformed(ActionEvent e) 
		{
	      sc1-=1;
	      if(sc1==0)
	      {
	    	  sc1=60;
	    	  m1-=1;
	      }
	      if(sc1==60)
	      l1.setText("Remaining Time :- "+m1+":"+"00");
	      else
	      l1.setText("Remaining Time :- "+m1+":"+sc1);  
	      if(m1==0)
	      {
	    	  t1.stop();
	    	  new ResultWindow("THE WINNER OF THIS ROUND IS:- "+s1,m2);
	    	  f.dispose();
	    	 
	      }
		}
		});
	  t1.start();
	  t2=new Timer(1000,new ActionListener() 
	   {
       @Override
		public void actionPerformed(ActionEvent e) 
		{
	      sc2-=1;
	      if(sc2==0)
	      {
	    	  sc2=60;
	    	  m2-=1;
	      }
	      if(sc1==60)
		  l2.setText("Remaining Time :- "+m2+":"+"00");
		  else
	      l2.setText("Remaining Time :- "+m2+":"+sc2);
	      if(m2==0)
	      {
	    	 t2.stop();
	    	 new ResultWindow("THE WINNER OF THIS ROUND IS:- "+s2,m1);
	    	 f.dispose();
	    	 
	      }
		}
		});
  }
 
  public void updateTime(int n)
  {
	  if(n==1)
	  {
		 t2.stop();
		 t1.start(); 
	  }
	  else if(n==2)
	  {
		  t1.stop();
		  t2.start();
	  }
   }
  public void resultWindow(String str,int n)
  {
	  if(n==1)
	  {
	  new ResultWindow(str+" "+s2+" Winn This Round",m1);
	  f.dispose();
	  }
	  else if(n==2)
	  {
	  new ResultWindow(str+" "+s1+" Winn This Round",m2);
	  f.dispose();
	  }
  }
}
