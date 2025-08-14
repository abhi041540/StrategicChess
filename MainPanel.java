package chess;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MainPanel extends Panel implements ActionListener
{
	TimePanel jp; JButton b[][]=new JButton[8][8];int i,j;ImageIcon im[]=new ImageIcon[12],sic;
	PopupMenu po;MenuItem m1,m2,m3,m4;int n=1,cl=1,r1,c1; String c;int r2,c2;
	Frame f;
  public MainPanel(TimePanel jp,Frame f)
  {
	  po=new PopupMenu();
	  this.f=f;
	  setLayout(new GridLayout(8,8,10,10));
	  for(i=0;i<=7;i++)
	  {
		  for(j=0;j<=7;j++)
		  {
			  b[i][j]=new JButton();
			  
		  }
	  }
	  for(i=0;i<=11;i++)
	  {
		  if(i==0)
		  {
			  im[i]=new ImageIcon(ImageBoxChess.BE);
		  }
		  else if(i==1)
		  {
			  im[i]=new ImageIcon(ImageBoxChess.BG);
		  }
		  else if(i==2)
		  {
			  im[i]=new ImageIcon(ImageBoxChess.BH);
		  }
		  else if(i==3)
		  {
			  im[i]=new ImageIcon(ImageBoxChess.BQ);
		  }
		  else if(i==4)
		  {
			  im[i]=new ImageIcon(ImageBoxChess.BK);
		  }
		  else if(i==5)
		  {
			  im[i]=new ImageIcon(ImageBoxChess.BN);
		  }
		  if(i==6)
		  {
			  im[i]=new ImageIcon(ImageBoxChess.WE);
		  }
		  else if(i==7)
		  {
			  im[i]=new ImageIcon(ImageBoxChess.WG);
		  }
		  else if(i==8)
		  {
			  im[i]=new ImageIcon(ImageBoxChess.WH);
		  }
		  else if(i==9)
		  {
			  im[i]=new ImageIcon(ImageBoxChess.WQ);
		  }
		  else if(i==10)
		  {
			  im[i]=new ImageIcon(ImageBoxChess.WK);
		  }
		  else if(i==11)
		  {
			  im[i]=new ImageIcon(ImageBoxChess.WN);
		  }
	  }
	  m1=new MenuItem("QUEEN(Q)");
	  m1.setFont(new Font("Arial",Font.BOLD,20));
	  m2=new MenuItem("ROOK(E)");
	  m2.setFont(new Font("Arial",Font.BOLD,20));
	  m3=new MenuItem("BISHOP(C)");
	  m3.setFont(new Font("Arial",Font.BOLD,20));
	  m4=new MenuItem("KNIGHT(H)");
	  m4.setFont(new Font("Arial",Font.BOLD,20));
	  po.add(m1);po.add(m2);po.add(m3);po.add(m4);
	  add(po);
	  for(i=0;i<=7;i++)
	  {
		 b[1][i].setIcon(im[5]);
		 b[6][i].setIcon(im[11]);
		 if(i==0 || i==7)
		 {
			 b[0][i].setIcon(im[0]);
			 b[7][i].setIcon(im[6]);
		 }
		 else if(i==1 || i==6)
		 {
			 b[0][i].setIcon(im[2]);
			 b[7][i].setIcon(im[8]);
		 }
		 else if(i==2 || i==5)
		 {
			 b[0][i].setIcon(im[1]);
			 b[7][i].setIcon(im[7]);
		 }
		 else if(i==3)
		 {
			 b[0][i].setIcon(im[4]);
			 b[7][i].setIcon(im[10]);
		 }
		 else if(i==4)
		 {
			 b[0][i].setIcon(im[3]);
			 b[7][i].setIcon(im[9]);
		 }
	  }
	  
	  for(i=0;i<=7;i++)
	  {
		    if((i%2)!=0)
			  {
				  b[i][0].setBackground(Color.white);
				  b[i][1].setBackground(Color.black);
				  b[i][2].setBackground(Color.white);
				  b[i][3].setBackground(Color.black);
				  b[i][4].setBackground(Color.white);
				  b[i][5].setBackground(Color.black);
				  b[i][6].setBackground(Color.white);
				  b[i][7].setBackground(Color.black);
			  }
			  else if((i%2)==0)
			  {
				  b[i][0].setBackground(Color.black);
				  b[i][1].setBackground(Color.white);
				  b[i][2].setBackground(Color.black);
				  b[i][3].setBackground(Color.white);
				  b[i][4].setBackground(Color.black);
				  b[i][5].setBackground(Color.white);
				  b[i][6].setBackground(Color.black);
				  b[i][7].setBackground(Color.white);
		     }
	  }
		 
	  for(i=0;i<=7;i++)
		  {
			  for(j=0;j<=7;j++)
			  {
				  add(b[i][j]);
			  }
		  }
		  setBackground(Color.white);
	 this.jp=jp;
	 
	 for(i=0;i<=7;i++)
	  {
		  for(j=0;j<=7;j++)
		  {
			  b[i][j].addActionListener(this);
		  }
	  }
	 po.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String m=e.getActionCommand();
			if(n==1)
			{
				if(m.equalsIgnoreCase("QUEEN(Q)"))
				{
					b[r2][c2].setIcon(im[3]);
				}
				else if(m.equalsIgnoreCase("ROOK(E)"))
				{
					b[r2][c2].setIcon(im[0]);
				}
				else if(m.equalsIgnoreCase("BISHOP(C)"))
				{
					b[r2][c2].setIcon(im[1]);
				}
				else if(m.equalsIgnoreCase("KNIGHT(H)"))
				{
					b[r2][c2].setIcon(im[2]);
				}
			}
			else if(n==2)
			{
				if(m.equalsIgnoreCase("QUEEN(Q)"))
				{
					b[r2][c2].setIcon(im[9]);
				}
				else if(m.equalsIgnoreCase("ROOK(E)"))
				{
					b[r2][c2].setIcon(im[6]);
				}
				else if(m.equalsIgnoreCase("BISHOP(C)"))
				{
					b[r2][c2].setIcon(im[7]);
				}
				else if(m.equalsIgnoreCase("KNIGHT(H)"))
				{
					b[r2][c2].setIcon(im[8]);
				}
			}
			
		}
	});
	 
  }
@Override
public void actionPerformed(ActionEvent e)
{
    Component b2=(Component)e.getSource();
    if(b2 instanceof JButton)
    {
    	JButton b1=(JButton)e.getSource();
    ImageIcon im1=(ImageIcon)b1.getIcon();
    if(im1!=null)
    {
    	 if(n==1)
    	 {
    		 firstPlayer(b1, im1);
    	 }
    	 else if(n==2)
    	{
    		secondPlayer(b1,im1);
    	}
    	
    }
    else
    {
    	if(cl==2)
    	{
    		if(n==1)
    		{
    			if(c.equalsIgnoreCase("WE"))
        		{
        			bo:
        	    		 for(i=0;i<=7;i++)
        	    		  {
        	    			  for(j=0;j<=7;j++)
        	    			  {
        	    				  if(b[i][j]==b1)
        	    				  {
        	    					  r2=i;
        	    					  c2=j;
        	    					  break bo;
        	    				  }
        	    			  }
        	    		  }
        			
        				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
        				{
        					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
        					{
        						if(c1>c2)
        						{
        							for(i=c2+1;i<=c1-1;i++)
        							{
        								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
        								if(ci!=null)
        								{
        									break;
        								}
        							}
        							if(i==c1)
        							{
        								b[r2][c2].setIcon(sic);
        		    					b[r1][c1].setIcon(null);
        		    					cl=1;
        		    					n=2;
        		    					jp.updateTime(n);
        							}
        						}
        						else
        						{
        							for(i=c1+1;i<=c2-1;i++)
        							{
        								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
        								if(ci!=null)
        								{
        									break;
        								}
        							}
        							if(i==c2)
        							{
        								b[r2][c2].setIcon(sic);
        		    					b[r1][c1].setIcon(null);
        		    					cl=1;
        		    					n=2;
        		    					jp.updateTime(n);
        							}
        							
        						}
        					}
        					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
        					{
        						if(r1>r2)
        						{

        							for(i=r2+1;i<=r1-1;i++)
        							{
        								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
    								if(ci!=null)
    								{
    		     						break;
    								}
        							}
        							if(i==r1)
        							{
        								b[r2][c2].setIcon(sic);
        		    					b[r1][c1].setIcon(null);
        		    					cl=1;
        		    					n=2;
        		    					jp.updateTime(n);
        							}
        						}
        						else
        						{
        							for(i=r1+1;i<=r2-1;i++)
        							{
        								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
        								if(ci!=null)
        								{
        									break;
        								}
        							}
        							if(i==r2)
        							{
        								b[r2][c2].setIcon(sic);
        		    					b[r1][c1].setIcon(null);
        		    					cl=1;
        		    					n=2;
        		    					jp.updateTime(n);
        							}
        						}
        					}
        					
        				}
        				else
        				{
        					cl=1;
        				}
        			}
        		
        		else if(c.equalsIgnoreCase("WH"))
        		{
        			bo:
       	    		 for(i=0;i<=7;i++)
       	    		  {
       	    			  for(j=0;j<=7;j++)
       	    			  {
       	    				  if(b[i][j]==b1)
       	    				  {
       	    					  r2=i;
       	    					  c2=j;
       	    					  break bo;
       	    				  }
       	    			  }
       	    		  }
       			
       			
       				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
       				{
       					b[r2][c2].setIcon(sic);
       					b[r1][c1].setIcon(null);
       					cl=1;
       					n=2;
       					jp.updateTime(n);
       				}
       				else
    				{
    					cl=1;
    				}
       			}
        		
        		else if(c.equalsIgnoreCase("WC"))
        		{
        			bo:
       	    		 for(i=0;i<=7;i++)
       	    		  {
       	    			  for(j=0;j<=7;j++)
       	    			  {
       	    				  if(b[i][j]==b1)
       	    				  {
       	    					  r2=i;
       	    					  c2=j;
       	    					  break bo;
       	    				  }
       	    			  }
       	    		  }
       			
       			
       				if((Math.abs(r1-r2)==Math.abs(c1-c2)))
       				{
       					if(r1<r2 && c1>c2)
       					{
       						
       						int cc=c1,m=0;
       						for(i=r1;i<=r2;i++)
       						{
       							if(b[i][cc].getIcon()!=null)
       							{
       								m+=1;
       								if(m>1)
       								break;
       							}
       							cc-=1;
       						}
       						if(m==1)
       						{
       							b[r2][c2].setIcon(sic);
       		   					b[r1][c1].setIcon(null);
       		   					cl=1;
       		   					n=2;
       		   					jp.updateTime(n);
       						}
       					}
       					else if(r2>r1 && c2>c1)
       					{
       			            	int cc=c1,m=0;
       	   						for(i=r1;i<=r2;i++)
       	   						{
       	   							if(b[i][cc].getIcon()!=null)
       	   							{
       	   							m+=1;
       								if(m>1)
       								break;
       	   							}
       	   							cc+=1;
       	   						}
       	   						if(m==1)
       	   						{
       	   							b[r2][c2].setIcon(sic);
       	   		   					b[r1][c1].setIcon(null);
       	   		   					cl=1;
       	   		   					n=2;
       	   		   					jp.updateTime(n);
       	   						}
       					}
       					else if(r2<r1 && c2<c1)
       					{
       						int cc=c2,m=0;
    	   						for(i=r2;i<=r1;i++)
    	   						{
    	   							if(b[i][cc].getIcon()!=null)
    	   							{
    	   								m+=1;
           								if(m>1)
           								break;
    	   							}
    	   							cc+=1;
    	   						}
    	   						if(m==1)
    	   						{
    	   							b[r2][c2].setIcon(sic);
    	   		   					b[r1][c1].setIcon(null);
    	   		   					cl=1;
    	   		   					n=2;
    	   		   					jp.updateTime(n);
    	   						}
       					}
       					else if(r2<r1 && c2>c1)
       					{
       						int cc=c2,m=0;
    	   						for(i=r2;i<=r1;i++)
    	   						{
    	   							if(b[i][cc].getIcon()!=null)
    	   							{
    	   								m+=1;
           								if(m>1)
           								break;
    	   							}
    	   							cc-=1;
    	   						}
    	   						if(m==1)
    	   						{
    	   							b[r2][c2].setIcon(sic);
    	   		   					b[r1][c1].setIcon(null);
    	   		   					cl=1;
    	   		   					n=2;
    	   		   					jp.updateTime(n);
    	   						}
       					}
       					
       				}
       				else
    				{
    					cl=1;
    				}
       			}
       			
        		else if(c.equalsIgnoreCase("WQ"))
        		{
        			bo:
          	    		 for(i=0;i<=7;i++)
          	    		  {
          	    			  for(j=0;j<=7;j++)
          	    			  {
          	    				  if(b[i][j]==b1)
          	    				  {
          	    					  r2=i;
          	    					  c2=j;
          	    					  break bo;
          	    				  }
          	    			  }
          	    		  }
          			
        			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    				{
    					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
    					{
    						if(c1>c2)
    						{
    							for(i=c2+1;i<=c1-1;i++)
    							{
    								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
    								if(ci!=null)
    								{
    									break;
    								}
    							}
    							if(i==c1)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    						else
    						{
    							for(i=c1+1;i<=c2-1;i++)
    							{
    								ImageIcon ci=(ImageIcon)b[r2][i].getIcon();
    								if(ci!=null)
    								{
    									break;
    								}
    							}
    							if(i==c2)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    							
    						}
    					}
    					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    					{
    						if(r1>r2)
    						{

    							for(i=r2+1;i<=r1-1;i++)
    							{
    								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
								if(ci!=null)
								{
		     						break;
								}
    							}
    							if(i==r1)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    						else
    						{
    							for(i=r1+1;i<=r2-1;i++)
    							{
    								ImageIcon ci=(ImageIcon)b[i][c2].getIcon();
    								if(ci!=null)
    								{
    									break;
    								}
    							}
    							if(i==r2)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    					}
    					
    				}
          				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
           				{
           					if(r1<r2 && c1>c2)
           					{
           						
           						int cc=c1,m=0;
           						for(i=r1;i<=r2;i++)
           						{
           							if(b[i][cc].getIcon()!=null)
           							{
           								m+=1;
           								if(m>1)
           								break;
           							}
           							cc-=1;
           						}
           						if(m==1)
           						{
           							b[r2][c2].setIcon(sic);
           		   					b[r1][c1].setIcon(null);
           		   					cl=1;
           		   					n=2;
           		   					jp.updateTime(n);
           						}
           					}
           					else if(r2>r1 && c2>c1)
           					{
           			            	int cc=c1,m=0;
           	   						for(i=r1;i<=r2;i++)
           	   						{
           	   							if(b[i][cc].getIcon()!=null)
           	   							{
           	   							m+=1;
           								if(m>1)
           								break;
           	   							}
           	   							cc+=1;
           	   						}
           	   						if(m==1)
           	   						{
           	   							b[r2][c2].setIcon(sic);
           	   		   					b[r1][c1].setIcon(null);
           	   		   					cl=1;
           	   		   					n=2;
           	   		   					jp.updateTime(n);
           	   						}
           					}
           					else if(r2<r1 && c2<c1)
           					{
           						int cc=c2,m=0;
        	   						for(i=r2;i<=r1;i++)
        	   						{
        	   							if(b[i][cc].getIcon()!=null)
        	   							{
        	   								m+=1;
               								if(m>1)
               								break;
        	   							}
        	   							cc+=1;
        	   						}
        	   						if(m==1)
        	   						{
        	   							b[r2][c2].setIcon(sic);
        	   		   					b[r1][c1].setIcon(null);
        	   		   					cl=1;
        	   		   					n=2;
        	   		   					jp.updateTime(n);
        	   						}
           					}
           					else if(r2<r1 && c2>c1)
           					{
           						int cc=c2,m=0;
        	   						for(i=r2;i<=r1;i++)
        	   						{
        	   							if(b[i][cc].getIcon()!=null)
        	   							{
        	   								m+=1;
               								if(m>1)
               								break;
        	   							}
        	   							cc-=1;
        	   						}
        	   						if(m==1)
        	   						{
        	   							b[r2][c2].setIcon(sic);
        	   		   					b[r1][c1].setIcon(null);
        	   		   					cl=1;
        	   		   					n=2;
        	   		   					jp.updateTime(n);
        	   						}
           					}
           					
           				}
          				else
        				{
        					cl=1;
        				}
          				
          			}
        		
        		else if(c.equalsIgnoreCase("WK"))
        		{
        			bo:
          	    		 for(i=0;i<=7;i++)
          	    		  {
          	    			  for(j=0;j<=7;j++)
          	    			  {
          	    				  if(b[i][j]==b1)
          	    				  {
          	    					  r2=i;
          	    					  c2=j;
          	    					  break bo;
          	    				  }
          	    			  }
          	    		  }
          			
          			
          				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
          				{
          					b[r2][c2].setIcon(sic);
          					b[r1][c1].setIcon(null);
          					cl=1;
          					n=2;
          					jp.updateTime(n);
          				}
          				else
        				{
        					cl=1;
        				}
          			}
        		
        		else if(c.equalsIgnoreCase("WN"))
        		{
        			bo:
         	    		 for(i=0;i<=7;i++)
         	    		  {
         	    			  for(j=0;j<=7;j++)
         	    			  {
         	    				  if(b[i][j]==b1)
         	    				  {
         	    					  r2=i;
         	    					  c2=j;
         	    					  break bo;
         	    				  }
         	    			  }
         	    		  }
         				if((Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) && (r2<r1))
                         {
          					
         					b[r2][c2].setIcon(sic);
         					b[r1][c1].setIcon(null);
         					cl=1;
         					n=2;
         					if(r2==0)
         					{
         						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
         					}
         					jp.updateTime(n);
         				}
         				else
        				{
        					cl=1;
        				}
         			}
        		}
    			
    		else if(n==2)
    			{
    				if(c.equalsIgnoreCase("BE"))
    	    		{
    	    			bo:
    	    	    		 for(i=0;i<=7;i++)
    	    	    		  {
    	    	    			  for(j=0;j<=7;j++)
    	    	    			  {
    	    	    				  if(b[i][j]==b1)
    	    	    				  {
    	    	    					  r2=i;
    	    	    					  c2=j;
    	    	    					  break bo;
    	    	    				  }
    	    	    			  }
    	    	    		  }
    	    				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    	    				{
    	    					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
    	    					{
    	    						if(c1>c2)
    	    						{
    	    							for(i=c2+1;i<=c1-1;i++)
    	    							{
    	    								if(b[r1][i].getIcon()!=null)
    	    								{
    	    									break;
    	    								}
    	    							}
    	    							if(i==c1)
    	    							{
    	    								b[r2][c2].setIcon(sic);
    	    		    					b[r1][c1].setIcon(null);
    	    		    					cl=1;
    	    		    					n=1;
    	    		    					jp.updateTime(n);
    	    							}
    	    						}
    	    						else
    	    						{
    	    							for(i=c1+1;i<=c2-1;i++)
    	    							{
    	    								if(b[r1][i].getIcon()!=null)
    	    								{
    	    									break;
    	    								}
    	    							}
    	    							if(i==c2)
    	    							{
    	    								b[r2][c2].setIcon(sic);
    	    		    					b[r1][c1].setIcon(null);
    	    		    					cl=1;
    	    		    					n=1;
    	    		    					jp.updateTime(n);
    	    							}
    	    							
    	    						}
    	    					}
    	    					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    	    					{
    	    						if(r1>r2)
    	    						{
    	    							for(i=r2+1;i<=r1-1;i++)
    	    							{
    	    								if(b[i][c1].getIcon()!=null)
    	    								{
    	    									break;
    	    								}
    	    							}
    	    							if(i==r1)
    	    							{
    	    								b[r2][c2].setIcon(sic);
    	    		    					b[r1][c1].setIcon(null);
    	    		    					cl=1;
    	    		    					n=1;
    	    		    					jp.updateTime(n);
    	    							}
    	    						}
    	    						else
    	    						{
    	    							for(i=r1+1;i<=r2-1;i++)
    	    							{
    	    								if(b[i][c2].getIcon()!=null)
    	    								{
    	    									break;
    	    								}
    	    							}
    	    							if(i==r2)
    	    							{
    	    								b[r2][c2].setIcon(sic);
    	    		    					b[r1][c1].setIcon(null);
    	    		    					cl=1;
    	    		    					n=1;
    	    		    					jp.updateTime(n);
    	    							}
    	    						}
    	    					}
    	    					
    	    				}
    	    				else
    	    				{
    	    					cl=1;
    	    				}
    	    			}
    	    		
    	    		else if(c.equalsIgnoreCase("BH"))
    	    		{
    	    			bo:
    	   	    		 for(i=0;i<=7;i++)
    	   	    		  {
    	   	    			  for(j=0;j<=7;j++)
    	   	    			  {
    	   	    				  if(b[i][j]==b1)
    	   	    				  {
    	   	    					  r2=i;
    	   	    					  c2=j;
    	   	    					  break bo;
    	   	    				  }
    	   	    			  }
    	   	    		  }
    	   			
    	   			
    	   				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
    	   				{
    	   					b[r2][c2].setIcon(sic);
    	   					b[r1][c1].setIcon(null);
    	   					cl=1;
    	   					n=1;
    	   					jp.updateTime(n);
    	   				}
    	   				else
        				{
        					cl=1;
        				}
    	   			}
    	    		
    	    		else if(c.equalsIgnoreCase("BC"))
    	    		{
    	    			bo:
    	   	    		 for(i=0;i<=7;i++)
    	   	    		  {
    	   	    			  for(j=0;j<=7;j++)
    	   	    			  {
    	   	    				  if(b[i][j]==b1)
    	   	    				  {
    	   	    					  r2=i;
    	   	    					  c2=j;
    	   	    					  break bo;
    	   	    				  }
    	   	    			  }
    	   	    		  }
    	   			
    	   			
    	   				if((Math.abs(r1-r2)==Math.abs(c1-c2)))
    	   				{
    	   					if(r1<r2 && c1>c2)
    	   					{
    	   						int cc=c1,m=0;
    	   						for(i=r1;i<=r2;i++)
    	   						{
    	   							if(b[i][cc].getIcon()!=null)
    	   							{
    	   								m+=1;
    	   								if(m>1)
    	   								break;
    	   							}
    	   							cc-=1;
    	   						}
    	   						if(m==1)
    	   						{
    	   							b[r2][c2].setIcon(sic);
    	   		   					b[r1][c1].setIcon(null);
    	   		   					cl=1;
    	   		   					n=1;
    	   		   					jp.updateTime(n);
    	   						}
    	   					}
    	   					else if(r2>r1 && c2>c1)
    	   					{
    	   			            	int cc=c1,m=0;
    	   	   						for(i=r1;i<=r2;i++)
    	   	   						{
    	   	   							if(b[i][cc].getIcon()!=null)
    	   	   							{
    	   	   							m+=1;
    	   								if(m>1)
    	   								break;
    	   	   							}
    	   	   							cc+=1;
    	   	   						}
    	   	   						if(m==1)
    	   	   						{
    	   	   							b[r2][c2].setIcon(sic);
    	   	   		   					b[r1][c1].setIcon(null);
    	   	   		   					cl=1;
    	   	   		   					n=1;
    	   	   		   					jp.updateTime(n);
    	   	   						}
    	   					}
    	   					else if(r2<r1 && c2<c1)
    	   					{
    	   						int cc=c2,m=0;
    		   						for(i=r2;i<=r1;i++)
    		   						{
    		   							if(b[i][cc].getIcon()!=null)
    		   							{
    		   								m+=1;
        	   								if(m>1)
        	   								break;
    		   							}
    		   							cc+=1;
    		   						}
    		   						if(m==1)
    		   						{
    		   							b[r2][c2].setIcon(sic);
    		   		   					b[r1][c1].setIcon(null);
    		   		   					cl=1;
    		   		   					n=1;
    		   		   					jp.updateTime(n);
    		   						}
    	   					}
    	   					else if(r2<r1 && c2>c1)
    	   					{
    	   						int cc=c2,m=0;
    		   						for(i=r2;i<=r1;i++)
    		   						{
    		   							if(b[i][cc].getIcon()!=null)
    		   							{
    		   								m+=1;
        	   								if(m>1)
        	   								break;
    		   							}
    		   							cc-=1;
    		   						}
    		   						if(m==1)
    		   						{
    		   							b[r2][c2].setIcon(sic);
    		   		   					b[r1][c1].setIcon(null);
    		   		   					cl=1;
    		   		   					n=1;
    		   		   					jp.updateTime(n);
    		   						}
    	   					}
    	   					
    	   				}
    	   				else
        				{
        					cl=1;
        				}
    	   			}
    	   			
    	    		else if(c.equalsIgnoreCase("BQ"))
    	    		{
    	    			bo:
    	      	    		 for(i=0;i<=7;i++)
    	      	    		  {
    	      	    			  for(j=0;j<=7;j++)
    	      	    			  {
    	      	    				  if(b[i][j]==b1)
    	      	    				  {
    	      	    					  r2=i;
    	      	    					  c2=j;
    	      	    					  break bo;
    	      	    				  }
    	      	    			  }
    	      	    		  }
    	      			
    	    			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
	    				{
	    					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
	    					{
	    						if(c1>c2)
	    						{
	    							for(i=c2+1;i<=c1-1;i++)
	    							{
	    								if(b[r1][i].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==c1)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=1;
	    		    					jp.updateTime(n);
	    							}
	    						}
	    						else
	    						{
	    							for(i=c1+1;i<=c2-1;i++)
	    							{
	    								if(b[r1][i].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==c2)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=1;
	    		    					jp.updateTime(n);
	    							}
	    							
	    						}
	    					}
	    					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
	    					{
	    						if(r1>r2)
	    						{
	    							for(i=r2+1;i<=r1-1;i++)
	    							{
	    								if(b[i][c1].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==r1)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=1;
	    		    					jp.updateTime(n);
	    							}
	    						}
	    						else
	    						{
	    							for(i=r1+1;i<=r2-1;i++)
	    							{
	    								if(b[i][c2].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==r2)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=1;
	    		    					jp.updateTime(n);
	    							}
	    						}
	    					}
	    					
	    				}
    	      				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
        	   				{
        	   					if(r1<r2 && c1>c2)
        	   					{
        	   						int cc=c1,m=0;
        	   						for(i=r1;i<=r2;i++)
        	   						{
        	   							if(b[i][cc].getIcon()!=null)
        	   							{
        	   								m+=1;
        	   								if(m>1)
        	   								break;
        	   							}
        	   							cc-=1;
        	   						}
        	   						if(m==1)
        	   						{
        	   							b[r2][c2].setIcon(sic);
        	   		   					b[r1][c1].setIcon(null);
        	   		   					cl=1;
        	   		   					n=1;
        	   		   					jp.updateTime(n);
        	   						}
        	   					}
        	   					else if(r2>r1 && c2>c1)
        	   					{
        	   			            	int cc=c1,m=0;
        	   	   						for(i=r1;i<=r2;i++)
        	   	   						{
        	   	   							if(b[i][cc].getIcon()!=null)
        	   	   							{
        	   	   							m+=1;
        	   								if(m>1)
        	   								break;
        	   	   							}
        	   	   							cc+=1;
        	   	   						}
        	   	   						if(m==1)
        	   	   						{
        	   	   							b[r2][c2].setIcon(sic);
        	   	   		   					b[r1][c1].setIcon(null);
        	   	   		   					cl=1;
        	   	   		   					n=1;
        	   	   		   					jp.updateTime(n);
        	   	   						}
        	   					}
        	   					else if(r2<r1 && c2<c1)
        	   					{
        	   						int cc=c2,m=0;
        		   						for(i=r2;i<=r1;i++)
        		   						{
        		   							if(b[i][cc].getIcon()!=null)
        		   							{
        		   								m+=1;
            	   								if(m>1)
            	   								break;
        		   							}
        		   							cc+=1;
        		   						}
        		   						if(m==1)
        		   						{
        		   							b[r2][c2].setIcon(sic);
        		   		   					b[r1][c1].setIcon(null);
        		   		   					cl=1;
        		   		   					n=1;
        		   		   					jp.updateTime(n);
        		   						}
        	   					}
        	   					else if(r2<r1 && c2>c1)
        	   					{
        	   						int cc=c2,m=0;
        		   						for(i=r2;i<=r1;i++)
        		   						{
        		   							if(b[i][cc].getIcon()!=null)
        		   							{
        		   								m+=1;
            	   								if(m>1)
            	   								break;
        		   							}
        		   							cc-=1;
        		   						}
        		   						if(m==1)
        		   						{
        		   							b[r2][c2].setIcon(sic);
        		   		   					b[r1][c1].setIcon(null);
        		   		   					cl=1;
        		   		   					n=1;
        		   		   					jp.updateTime(n);
        		   						}
        	   					}
        	   					
        	   				}
    	      				else
    	    				{
    	    					cl=1;
    	    				}
    	      				
    	      			}
    	    		
    	    		else if(c.equalsIgnoreCase("BK"))
    	    		{
    	    			bo:
    	      	    		 for(i=0;i<=7;i++)
    	      	    		  {
    	      	    			  for(j=0;j<=7;j++)
    	      	    			  {
    	      	    				  if(b[i][j]==b1)
    	      	    				  {
    	      	    					  r2=i;
    	      	    					  c2=j;
    	      	    					  break bo;
    	      	    				  }
    	      	    			  }
    	      	    		  }
    	      			
    	      				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
    	      				{
       	      					b[r2][c2].setIcon(sic);
    	      					b[r1][c1].setIcon(null);
    	      					cl=1;
    	      					n=1;
    	      					jp.updateTime(n);
    	      				}
    	      				else
    	    				{
    	    					cl=1;
    	    				}
    	      			}
    	    		
    	    		else if(c.equalsIgnoreCase("BN"))
    	    		{
    	    			bo:
    	     	    		 for(i=0;i<=7;i++)
    	     	    		  {
    	     	    			  for(j=0;j<=7;j++)
    	     	    			  {
    	     	    				  if(b[i][j]==b1)
    	     	    				  {
    	     	    					  r2=i;
    	     	    					  c2=j;
    	     	    					  break bo;
    	     	    				  }
    	     	    			  }
    	     	    		  }
    	     				if((Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) && r2>r1)
    	     				{
    	     					b[r2][c2].setIcon(sic);
    	     					b[r1][c1].setIcon(null);
    	     					cl=1;
    	     					n=1;
    	     					if(r2==0)
    	     					{
    	     						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
    	     					}
    	     					jp.updateTime(n);
    	     				}
    	     				else
    	    				{
    	    					cl=1;
    	    				}
    	     			}
    	    		}
    			}
    		}
}
}
public void secondPlayer(JButton b1,ImageIcon im1)
{
if(im1==im[0])
{
	if(cl==1)
	{
		bo:
		 for(i=0;i<=7;i++)
		  {
			  for(j=0;j<=7;j++)
			  {
				  if(b[i][j]==b1)
				  {
					  r1=i;
					  c1=j;
					  c="BE";
					  sic=im1;
					  cl=2;
					  break bo;
				  }
			  }
		  }
	}
	else
	{
		if(c.equalsIgnoreCase("WE"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
				{
					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
					{
						if(c1>c2)
						{
							for(i=c2+1;i<=c1-1;i++)
							{
								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
								if(ci!=null)
								{
									break;
								}
							}
							if(i==c1)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
						else
						{
							for(i=c1+1;i<=c2-1;i++)
							{
								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
								if(ci!=null)
								{
									break;
								}
							}
							if(i==c2)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
							
						}
					}
					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
					{
						if(r1>r2)
						{

							for(i=r2+1;i<=r1-1;i++)
							{
								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
							if(ci!=null)
							{
	     						break;
							}
							}
							if(i==r1)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
						else
						{
							for(i=r1+1;i<=r2-1;i++)
							{
								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
								if(ci!=null)
								{
									break;
								}
							}
							if(i==r2)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
					}
					
				}
				else
				{
					cl=1;
				}
			}
		
		else if(c.equalsIgnoreCase("WH"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
			
				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
				{
					b[r2][c2].setIcon(sic);
					b[r1][c1].setIcon(null);
					cl=1;
					n=1;
					jp.updateTime(n);
				}
				else
			{
				cl=1;
			}
			}
		
		else if(c.equalsIgnoreCase("WC"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
			
				if((Math.abs(r1-r2)==Math.abs(c1-c2)))
				{
					if(r1<r2 && c1>c2)
					{
						
						int cc=c1,m=0;
						for(i=r1;i<=r2;i++)
						{
							if(b[i][cc].getIcon()!=null)
							{
								m+=1;
								if(m>2)
								break;
							}
							cc-=1;
						}
						if(m==2)
						{
							b[r2][c2].setIcon(sic);
		   					b[r1][c1].setIcon(null);
		   					cl=1;
		   					n=1;
		   					jp.updateTime(n);
						}
					}
					else if(r2>r1 && c2>c1)
					{
			            	int cc=c1,m=0;
	   						for(i=r1;i<=r2;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   							m+=1;
								if(m>2)
								break;
	   							}
	   							cc+=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
					}
					else if(r2<r1 && c2<c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc+=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
					}
					else if(r2<r1 && c2>c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc-=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
					}
					
				}
				else
			{
				cl=1;
			}
			}
			
		else if(c.equalsIgnoreCase("WQ"))
		{
			bo:
  	    		 for(i=0;i<=7;i++)
  	    		  {
  	    			  for(j=0;j<=7;j++)
  	    			  {
  	    				  if(b[i][j]==b1)
  	    				  {
  	    					  r2=i;
  	    					  c2=j;
  	    					  break bo;
  	    				  }
  	    			  }
  	    		  }
  			
			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
			{
				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
				{
					if(c1>c2)
					{
						for(i=c2+1;i<=c1-1;i++)
						{
							ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
							if(ci!=null)
							{
								break;
							}
						}
						if(i==c1)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
					else
					{
						for(i=c1+1;i<=c2-1;i++)
						{
							ImageIcon ci=(ImageIcon)b[r2][i].getIcon();
							if(ci!=null)
							{
								break;
							}
						}
						if(i==c2)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
						
					}
				}
				else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
				{
					if(r1>r2)
					{

						for(i=r2+1;i<=r1-1;i++)
						{
							ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
						if(ci!=null)
						{
     						break;
						}
						}
						if(i==r1)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
					else
					{
						for(i=r1+1;i<=r2-1;i++)
						{
							ImageIcon ci=(ImageIcon)b[i][c2].getIcon();
							if(ci!=null)
							{
								break;
							}
						}
						if(i==r2)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
				}
				
			}
  				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
   				{
   					if(r1<r2 && c1>c2)
   					{
   						
   						int cc=c1,m=0;
   						for(i=r1;i<=r2;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc-=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
   					}
   					else if(r2>r1 && c2>c1)
   					{
   			            	int cc=c1,m=0;
   	   						for(i=r1;i<=r2;i++)
   	   						{
   	   							if(b[i][cc].getIcon()!=null)
   	   							{
   	   							m+=1;
   								if(m>2)
   								break;
   	   							}
   	   							cc+=1;
   	   						}
   	   						if(m==2)
   	   						{
   	   							b[r2][c2].setIcon(sic);
   	   		   					b[r1][c1].setIcon(null);
   	   		   					cl=1;
   	   		   					n=1;
   	   		   					jp.updateTime(n);
   	   						}
   					}
   					else if(r2<r1 && c2<c1)
   					{
   						int cc=c2,m=0;
	   						for(i=r2;i<=r1;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
       								if(m>2)
       								break;
	   							}
	   							cc+=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
   					}
   					else if(r2<r1 && c2>c1)
   					{
   						int cc=c2,m=0;
	   						for(i=r2;i<=r1;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
       								if(m>2)
       								break;
	   							}
	   							cc-=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
   					}
   					
   				}
  				else
				{
					cl=1;
				}
  				
  			}
		
		else if(c.equalsIgnoreCase("WK"))
		{
			bo:
  	    		 for(i=0;i<=7;i++)
  	    		  {
  	    			  for(j=0;j<=7;j++)
  	    			  {
  	    				  if(b[i][j]==b1)
  	    				  {
  	    					  r2=i;
  	    					  c2=j;
  	    					  break bo;
  	    				  }
  	    			  }
  	    		  }
  			
  			
  				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
  				{
  					b[r2][c2].setIcon(sic);
  					b[r1][c1].setIcon(null);
  					cl=1;
  					n=1;
  					jp.updateTime(n);
  				}
  				else
				{
					cl=1;
				}
  			}
		
		else if(c.equalsIgnoreCase("WN"))
		{
			bo:
 	    		 for(i=0;i<=7;i++)
 	    		  {
 	    			  for(j=0;j<=7;j++)
 	    			  {
 	    				  if(b[i][j]==b1)
 	    				  {
 	    					  r2=i;
 	    					  c2=j;
 	    					  break bo;
 	    				  }
 	    			  }
 	    		  }
 				if((Math.abs(r1-r2)==1 && c2!=c1) && (r2<r1))
                 {
  					
 					b[r2][c2].setIcon(sic);
 					b[r1][c1].setIcon(null);
 					cl=1;
 					n=1;
 					if(r2==0)
 					{
 						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
 					}
 					jp.updateTime(n);
 				}
 				else
				{
					cl=1;
				}
 			}
	}
	
}
else if(im1==im[1])
{
	if(cl==1)
	{
		bo:
		 for(i=0;i<=7;i++)
		  {
			  for(j=0;j<=7;j++)
			  {
				  if(b[i][j]==b1)
				  {
					  r1=i;
					  c1=j;
					  c="BC";
					  cl=2;
					  sic=im1;
					  break bo;
				  }
			  }
		  }
	}
	else
	{
		if(c.equalsIgnoreCase("WE"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
				{
					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
					{
						if(c1>c2)
						{
							for(i=c2+1;i<=c1-1;i++)
							{
								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
								if(ci!=null)
								{
									break;
								}
							}
							if(i==c1)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
						else
						{
							for(i=c1+1;i<=c2-1;i++)
							{
								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
								if(ci!=null)
								{
									break;
								}
							}
							if(i==c2)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
							
						}
					}
					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
					{
						if(r1>r2)
						{

							for(i=r2+1;i<=r1-1;i++)
							{
								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
							if(ci!=null)
							{
	     						break;
							}
							}
							if(i==r1)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
						else
						{
							for(i=r1+1;i<=r2-1;i++)
							{
								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
								if(ci!=null)
								{
									break;
								}
							}
							if(i==r2)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
					}
					
				}
				else
				{
					cl=1;
				}
			}
		
		else if(c.equalsIgnoreCase("WH"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
			
				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
				{
					b[r2][c2].setIcon(sic);
					b[r1][c1].setIcon(null);
					cl=1;
					n=1;
					jp.updateTime(n);
				}
				else
			{
				cl=1;
			}
			}
		
		else if(c.equalsIgnoreCase("WC"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
			
				if((Math.abs(r1-r2)==Math.abs(c1-c2)))
				{
					if(r1<r2 && c1>c2)
					{
						
						int cc=c1,m=0;
						for(i=r1;i<=r2;i++)
						{
							if(b[i][cc].getIcon()!=null)
							{
								m+=1;
								if(m>2)
								break;
							}
							cc-=1;
						}
						if(m==2)
						{
							b[r2][c2].setIcon(sic);
		   					b[r1][c1].setIcon(null);
		   					cl=1;
		   					n=1;
		   					jp.updateTime(n);
						}
					}
					else if(r2>r1 && c2>c1)
					{
			            	int cc=c1,m=0;
	   						for(i=r1;i<=r2;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   							m+=1;
								if(m>2)
								break;
	   							}
	   							cc+=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
					}
					else if(r2<r1 && c2<c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc+=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
					}
					else if(r2<r1 && c2>c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc-=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
					}
					
				}
				else
			{
				cl=1;
			}
			}
			
		else if(c.equalsIgnoreCase("WQ"))
		{
			bo:
  	    		 for(i=0;i<=7;i++)
  	    		  {
  	    			  for(j=0;j<=7;j++)
  	    			  {
  	    				  if(b[i][j]==b1)
  	    				  {
  	    					  r2=i;
  	    					  c2=j;
  	    					  break bo;
  	    				  }
  	    			  }
  	    		  }
  			
			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
			{
				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
				{
					if(c1>c2)
					{
						for(i=c2+1;i<=c1-1;i++)
						{
							ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
							if(ci!=null)
							{
								break;
							}
						}
						if(i==c1)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
					else
					{
						for(i=c1+1;i<=c2-1;i++)
						{
							ImageIcon ci=(ImageIcon)b[r2][i].getIcon();
							if(ci!=null)
							{
								break;
							}
						}
						if(i==c2)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
						
					}
				}
				else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
				{
					if(r1>r2)
					{

						for(i=r2+1;i<=r1-1;i++)
						{
							ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
						if(ci!=null)
						{
     						break;
						}
						}
						if(i==r1)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
					else
					{
						for(i=r1+1;i<=r2-1;i++)
						{
							ImageIcon ci=(ImageIcon)b[i][c2].getIcon();
							if(ci!=null)
							{
								break;
							}
						}
						if(i==r2)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
				}
				
			}
  				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
   				{
   					if(r1<r2 && c1>c2)
   					{
   						
   						int cc=c1,m=0;
   						for(i=r1;i<=r2;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc-=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
   					}
   					else if(r2>r1 && c2>c1)
   					{
   			            	int cc=c1,m=0;
   	   						for(i=r1;i<=r2;i++)
   	   						{
   	   							if(b[i][cc].getIcon()!=null)
   	   							{
   	   							m+=1;
   								if(m>2)
   								break;
   	   							}
   	   							cc+=1;
   	   						}
   	   						if(m==2)
   	   						{
   	   							b[r2][c2].setIcon(sic);
   	   		   					b[r1][c1].setIcon(null);
   	   		   					cl=1;
   	   		   					n=1;
   	   		   					jp.updateTime(n);
   	   						}
   					}
   					else if(r2<r1 && c2<c1)
   					{
   						int cc=c2,m=0;
	   						for(i=r2;i<=r1;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
       								if(m>2)
       								break;
	   							}
	   							cc+=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
   					}
   					else if(r2<r1 && c2>c1)
   					{
   						int cc=c2,m=0;
	   						for(i=r2;i<=r1;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
       								if(m>2)
       								break;
	   							}
	   							cc-=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
   					}
   					
   				}
  				else
				{
					cl=1;
				}
  				
  			}
		
		else if(c.equalsIgnoreCase("WK"))
		{
			bo:
  	    		 for(i=0;i<=7;i++)
  	    		  {
  	    			  for(j=0;j<=7;j++)
  	    			  {
  	    				  if(b[i][j]==b1)
  	    				  {
  	    					  r2=i;
  	    					  c2=j;
  	    					  break bo;
  	    				  }
  	    			  }
  	    		  }
  			
  			
  				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
  				{
  					b[r2][c2].setIcon(sic);
  					b[r1][c1].setIcon(null);
  					cl=1;
  					n=1;
  					jp.updateTime(n);
  				}
  				else
				{
					cl=1;
				}
  			}
		
		else if(c.equalsIgnoreCase("WN"))
		{
			bo:
 	    		 for(i=0;i<=7;i++)
 	    		  {
 	    			  for(j=0;j<=7;j++)
 	    			  {
 	    				  if(b[i][j]==b1)
 	    				  {
 	    					  r2=i;
 	    					  c2=j;
 	    					  break bo;
 	    				  }
 	    			  }
 	    		  }
 				if((Math.abs(r1-r2)==1 && c2!=c1) && (r2<r1))
                 {
  					
 					b[r2][c2].setIcon(sic);
 					b[r1][c1].setIcon(null);
 					cl=1;
 					n=1;
 					if(r2==0)
 					{
 						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
 					}
 					jp.updateTime(n);
 				}
 				else
				{
					cl=1;
				}
 			}
		}
	}
	

else if(im1==im[2])
{
	if(cl==1)
	{
		bo:
		 for(i=0;i<=7;i++)
		  {
			  for(j=0;j<=7;j++)
			  {
				  if(b[i][j]==b1)
				  {
					  r1=i;
					  c1=j;
					  c="BH";
					  cl=2;
					  sic=im1;
					  break bo;
				  }
			  }
		  }
	}
	else
	{
		if(c.equalsIgnoreCase("WE"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
				{
					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
					{
						if(c1>c2)
						{
							for(i=c2+1;i<=c1-1;i++)
							{
								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
								if(ci!=null)
								{
									break;
								}
							}
							if(i==c1)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
						else
						{
							for(i=c1+1;i<=c2-1;i++)
							{
								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
								if(ci!=null)
								{
									break;
								}
							}
							if(i==c2)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
							
						}
					}
					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
					{
						if(r1>r2)
						{

							for(i=r2+1;i<=r1-1;i++)
							{
								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
							if(ci!=null)
							{
	     						break;
							}
							}
							if(i==r1)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
						else
						{
							for(i=r1+1;i<=r2-1;i++)
							{
								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
								if(ci!=null)
								{
									break;
								}
							}
							if(i==r2)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
					}
					
				}
				else
				{
					cl=1;
				}
			}
		
		else if(c.equalsIgnoreCase("WH"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
			
				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
				{
					b[r2][c2].setIcon(sic);
					b[r1][c1].setIcon(null);
					cl=1;
					n=1;
					jp.updateTime(n);
				}
				else
			{
				cl=1;
			}
			}
		
		else if(c.equalsIgnoreCase("WC"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
			
				if((Math.abs(r1-r2)==Math.abs(c1-c2)))
				{
					if(r1<r2 && c1>c2)
					{
						
						int cc=c1,m=0;
						for(i=r1;i<=r2;i++)
						{
							if(b[i][cc].getIcon()!=null)
							{
								m+=1;
								if(m>2)
								break;
							}
							cc-=1;
						}
						if(m==2)
						{
							b[r2][c2].setIcon(sic);
		   					b[r1][c1].setIcon(null);
		   					cl=1;
		   					n=1;
		   					jp.updateTime(n);
						}
					}
					else if(r2>r1 && c2>c1)
					{
			            	int cc=c1,m=0;
	   						for(i=r1;i<=r2;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   							m+=1;
								if(m>2)
								break;
	   							}
	   							cc+=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
					}
					else if(r2<r1 && c2<c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc+=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
					}
					else if(r2<r1 && c2>c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc-=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
					}
					
				}
				else
			{
				cl=1;
			}
			}
			
		else if(c.equalsIgnoreCase("WQ"))
		{
			bo:
  	    		 for(i=0;i<=7;i++)
  	    		  {
  	    			  for(j=0;j<=7;j++)
  	    			  {
  	    				  if(b[i][j]==b1)
  	    				  {
  	    					  r2=i;
  	    					  c2=j;
  	    					  break bo;
  	    				  }
  	    			  }
  	    		  }
  			
			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
			{
				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
				{
					if(c1>c2)
					{
						for(i=c2+1;i<=c1-1;i++)
						{
							ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
							if(ci!=null)
							{
								break;
							}
						}
						if(i==c1)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
					else
					{
						for(i=c1+1;i<=c2-1;i++)
						{
							ImageIcon ci=(ImageIcon)b[r2][i].getIcon();
							if(ci!=null)
							{
								break;
							}
						}
						if(i==c2)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
						
					}
				}
				else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
				{
					if(r1>r2)
					{

						for(i=r2+1;i<=r1-1;i++)
						{
							ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
						if(ci!=null)
						{
     						break;
						}
						}
						if(i==r1)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
					else
					{
						for(i=r1+1;i<=r2-1;i++)
						{
							ImageIcon ci=(ImageIcon)b[i][c2].getIcon();
							if(ci!=null)
							{
								break;
							}
						}
						if(i==r2)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
				}
				
			}
  				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
   				{
   					if(r1<r2 && c1>c2)
   					{
   						
   						int cc=c1,m=0;
   						for(i=r1;i<=r2;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc-=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
   					}
   					else if(r2>r1 && c2>c1)
   					{
   			            	int cc=c1,m=0;
   	   						for(i=r1;i<=r2;i++)
   	   						{
   	   							if(b[i][cc].getIcon()!=null)
   	   							{
   	   							m+=1;
   								if(m>2)
   								break;
   	   							}
   	   							cc+=1;
   	   						}
   	   						if(m==2)
   	   						{
   	   							b[r2][c2].setIcon(sic);
   	   		   					b[r1][c1].setIcon(null);
   	   		   					cl=1;
   	   		   					n=1;
   	   		   					jp.updateTime(n);
   	   						}
   					}
   					else if(r2<r1 && c2<c1)
   					{
   						int cc=c2,m=0;
	   						for(i=r2;i<=r1;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
       								if(m>2)
       								break;
	   							}
	   							cc+=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
   					}
   					else if(r2<r1 && c2>c1)
   					{
   						int cc=c2,m=0;
	   						for(i=r2;i<=r1;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
       								if(m>2)
       								break;
	   							}
	   							cc-=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
   					}
   					
   				}
  				else
				{
					cl=1;
				}
  				
  			}
		
		else if(c.equalsIgnoreCase("WK"))
		{
			bo:
  	    		 for(i=0;i<=7;i++)
  	    		  {
  	    			  for(j=0;j<=7;j++)
  	    			  {
  	    				  if(b[i][j]==b1)
  	    				  {
  	    					  r2=i;
  	    					  c2=j;
  	    					  break bo;
  	    				  }
  	    			  }
  	    		  }
  			
  			
  				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
  				{
  					b[r2][c2].setIcon(sic);
  					b[r1][c1].setIcon(null);
  					cl=1;
  					n=1;
  					jp.updateTime(n);
  				}
  				else
				{
					cl=1;
				}
  			}
		
		else if(c.equalsIgnoreCase("WN"))
		{
			bo:
 	    		 for(i=0;i<=7;i++)
 	    		  {
 	    			  for(j=0;j<=7;j++)
 	    			  {
 	    				  if(b[i][j]==b1)
 	    				  {
 	    					  r2=i;
 	    					  c2=j;
 	    					  break bo;
 	    				  }
 	    			  }
 	    		  }
 				if((Math.abs(r1-r2)==1 && c2!=c1) && (r2<r1))
                 {
  					
 					b[r2][c2].setIcon(sic);
 					b[r1][c1].setIcon(null);
 					cl=1;
 					n=1;
 					if(r2==0)
 					{
 						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
 					}
 					jp.updateTime(n);
 				}
 				else
				{
					cl=1;
				}
 			}
		}
	}

else if(im1==im[3])
{
	if(cl==1)
	{
		bo:
		 for(i=0;i<=7;i++)
		  {
			  for(j=0;j<=7;j++)
			  {
				  if(b[i][j]==b1)
				  {
					  r1=i;
					  c1=j;
					  c="BQ";
					  cl=2;
					  sic=im1;
					  break bo;
				  }
			  }
		  }
	}
	else
	{
		if(c.equalsIgnoreCase("WE"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
				{
					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
					{
						if(c1>c2)
						{
							for(i=c2+1;i<=c1-1;i++)
							{
								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
								if(ci!=null)
								{
									break;
								}
							}
							if(i==c1)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
						else
						{
							for(i=c1+1;i<=c2-1;i++)
							{
								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
								if(ci!=null)
								{
									break;
								}
							}
							if(i==c2)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
							
						}
					}
					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
					{
						if(r1>r2)
						{

							for(i=r2+1;i<=r1-1;i++)
							{
								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
							if(ci!=null)
							{
	     						break;
							}
							}
							if(i==r1)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
						else
						{
							for(i=r1+1;i<=r2-1;i++)
							{
								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
								if(ci!=null)
								{
									break;
								}
							}
							if(i==r2)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
					}
					
				}
				else
				{
					cl=1;
				}
			}
		
		else if(c.equalsIgnoreCase("WH"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
			
				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
				{
					b[r2][c2].setIcon(sic);
					b[r1][c1].setIcon(null);
					cl=1;
					n=1;
					jp.updateTime(n);
				}
				else
			{
				cl=1;
			}
			}
		
		else if(c.equalsIgnoreCase("WC"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
			
				if((Math.abs(r1-r2)==Math.abs(c1-c2)))
				{
					if(r1<r2 && c1>c2)
					{
						
						int cc=c1,m=0;
						for(i=r1;i<=r2;i++)
						{
							if(b[i][cc].getIcon()!=null)
							{
								m+=1;
								if(m>2)
								break;
							}
							cc-=1;
						}
						if(m==2)
						{
							b[r2][c2].setIcon(sic);
		   					b[r1][c1].setIcon(null);
		   					cl=1;
		   					n=1;
		   					jp.updateTime(n);
						}
					}
					else if(r2>r1 && c2>c1)
					{
			            	int cc=c1,m=0;
	   						for(i=r1;i<=r2;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   							m+=1;
								if(m>2)
								break;
	   							}
	   							cc+=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
					}
					else if(r2<r1 && c2<c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc+=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
					}
					else if(r2<r1 && c2>c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc-=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
					}
					
				}
				else
			{
				cl=1;
			}
			}
			
		else if(c.equalsIgnoreCase("WQ"))
		{
			bo:
  	    		 for(i=0;i<=7;i++)
  	    		  {
  	    			  for(j=0;j<=7;j++)
  	    			  {
  	    				  if(b[i][j]==b1)
  	    				  {
  	    					  r2=i;
  	    					  c2=j;
  	    					  break bo;
  	    				  }
  	    			  }
  	    		  }
  			
			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
			{
				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
				{
					if(c1>c2)
					{
						for(i=c2+1;i<=c1-1;i++)
						{
							ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
							if(ci!=null)
							{
								break;
							}
						}
						if(i==c1)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
					else
					{
						for(i=c1+1;i<=c2-1;i++)
						{
							ImageIcon ci=(ImageIcon)b[r2][i].getIcon();
							if(ci!=null)
							{
								break;
							}
						}
						if(i==c2)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
						
					}
				}
				else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
				{
					if(r1>r2)
					{

						for(i=r2+1;i<=r1-1;i++)
						{
							ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
						if(ci!=null)
						{
     						break;
						}
						}
						if(i==r1)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
					else
					{
						for(i=r1+1;i<=r2-1;i++)
						{
							ImageIcon ci=(ImageIcon)b[i][c2].getIcon();
							if(ci!=null)
							{
								break;
							}
						}
						if(i==r2)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
				}
				
			}
  				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
   				{
   					if(r1<r2 && c1>c2)
   					{
   						
   						int cc=c1,m=0;
   						for(i=r1;i<=r2;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc-=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
   					}
   					else if(r2>r1 && c2>c1)
   					{
   			            	int cc=c1,m=0;
   	   						for(i=r1;i<=r2;i++)
   	   						{
   	   							if(b[i][cc].getIcon()!=null)
   	   							{
   	   							m+=1;
   								if(m>2)
   								break;
   	   							}
   	   							cc+=1;
   	   						}
   	   						if(m==2)
   	   						{
   	   							b[r2][c2].setIcon(sic);
   	   		   					b[r1][c1].setIcon(null);
   	   		   					cl=1;
   	   		   					n=1;
   	   		   					jp.updateTime(n);
   	   						}
   					}
   					else if(r2<r1 && c2<c1)
   					{
   						int cc=c2,m=0;
	   						for(i=r2;i<=r1;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
       								if(m>2)
       								break;
	   							}
	   							cc+=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
   					}
   					else if(r2<r1 && c2>c1)
   					{
   						int cc=c2,m=0;
	   						for(i=r2;i<=r1;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
       								if(m>2)
       								break;
	   							}
	   							cc-=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
   					}
   					
   				}
  				else
				{
					cl=1;
				}
  				
  			}
		
		else if(c.equalsIgnoreCase("WK"))
		{
			bo:
  	    		 for(i=0;i<=7;i++)
  	    		  {
  	    			  for(j=0;j<=7;j++)
  	    			  {
  	    				  if(b[i][j]==b1)
  	    				  {
  	    					  r2=i;
  	    					  c2=j;
  	    					  break bo;
  	    				  }
  	    			  }
  	    		  }
  			
  			
  				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
  				{
  					b[r2][c2].setIcon(sic);
  					b[r1][c1].setIcon(null);
  					cl=1;
  					n=1;
  					jp.updateTime(n);
  				}
  				else
				{
					cl=1;
				}
  			}
		
		else if(c.equalsIgnoreCase("WN"))
		{
			bo:
 	    		 for(i=0;i<=7;i++)
 	    		  {
 	    			  for(j=0;j<=7;j++)
 	    			  {
 	    				  if(b[i][j]==b1)
 	    				  {
 	    					  r2=i;
 	    					  c2=j;
 	    					  break bo;
 	    				  }
 	    			  }
 	    		  }
 				if((Math.abs(r1-r2)==1 && c2!=c1) && (r2<r1))
                 {
  					
 					b[r2][c2].setIcon(sic);
 					b[r1][c1].setIcon(null);
 					cl=1;
 					n=1;
 					if(r2==0)
 					{
 						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
 					}
 					jp.updateTime(n);
 				}
 				else
				{
					cl=1;
				}
		}
		}
	}
	
else if(im1==im[4])
{
	if(cl==1)
	{
		bo:
		 for(i=0;i<=7;i++)
		  {
			  for(j=0;j<=7;j++)
			  {
				  if(b[i][j]==b1)
				  {
					  r1=i;
					  c1=j;
					  c="BK";
					  cl=2;
					  sic=im1;
					  break bo;
				  }
			  }
		  }
	}
	else
	{
		if(c.equalsIgnoreCase("WE"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
		
				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
				{
					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
					{
						if(c1>c2)
						{
							for(i=c2+1;i<=c1-1;i++)
							{
								if(b[r1][i].getIcon()!=null)
								{
									break;
								}
							}
							if(i==c1)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
		    					 jp.resultWindow("CheckMate",1);
							}
						}
						else
						{
							for(i=c1+1;i<=c2-1;i++)
							{
								if(b[r1][i].getIcon()!=null)
								{
									break;
								}
							}
							if(i==c2)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
		    					 jp.resultWindow("CheckMate",1);
							}
							
						}
					}
					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
					{
						if(r1>r2)
						{
							for(i=r2+1;i<=r1-1;i++)
							{
								if(b[i][c1].getIcon()!=null)
								{
									break;
								}
							}
							if(i==r1)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
		    					 jp.resultWindow("CheckMate",1);
							}
						}
						else
						{
							for(i=r1+1;i<=r2-1;i++)
							{
								if(b[i][c1].getIcon()!=null)
								{
									break;
								}
							}
							if(i==r2)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
		    					 jp.resultWindow("CheckMate",1);
							}
						}
					}
					
				}
				else
				{
					cl=1;
				}
			}
		else if(c.equalsIgnoreCase("WH"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
				{
					b[r2][c2].setIcon(sic);
					b[r1][c1].setIcon(null);
					cl=1;
					n=1;
					jp.updateTime(n);
					 jp.resultWindow("CheckMate",1);
				}
				else
			{
				cl=1;
			}
			}
		
		else if(c.equalsIgnoreCase("WC"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
			
				if((Math.abs(r1-r2)==Math.abs(c1-c2)))
				{
					if(r1<r2 && c1>c2)
					{
						int cc=c1,m=0;
						for(i=r1;i<=r2;i++)
						{
							if(b[i][cc].getIcon()!=null)
							{
								m+=1;
								if(m>2)
								break;
							}
							cc-=1;
						}
						if(m==2)
						{
							b[r2][c2].setIcon(sic);
		   					b[r1][c1].setIcon(null);
		   					cl=1;
		   					n=1;
		   					jp.updateTime(n);
	    					 jp.resultWindow("CheckMate",1);
						}
					}
					else if(r2>r1 && c2>c1)
					{
			            	int cc=c1,m=0;
	   						for(i=r1;i<=r2;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   							m+=1;
								if(m>2)
								break;
	   							}
	   							cc+=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
		    					 jp.resultWindow("CheckMate",1);
	   						}
					}
					else if(r2<r1 && c2<c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc+=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
	    					 jp.resultWindow("CheckMate",1);
   						}
					}
					else if(r2<r1 && c2>c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc-=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
	    					 jp.resultWindow("CheckMate",1);
   						}
					}
					
				}
				else
			{
				cl=1;
			}
			}
			
		else if(c.equalsIgnoreCase("WQ"))
		{
			bo:
  	    		 for(i=0;i<=7;i++)
  	    		  {
  	    			  for(j=0;j<=7;j++)
  	    			  {
  	    				  if(b[i][j]==b1)
  	    				  {
  	    					  r2=i;
  	    					  c2=j;
  	    					  break bo;
  	    				  }
  	    			  }
  	    		  }
  			
  			
			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
			{
				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
				{
					if(c1>c2)
					{
						for(i=c2+1;i<=c1-1;i++)
						{
							if(b[r1][i].getIcon()!=null)
							{
								break;
							}
						}
						if(i==c1)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
	    					 jp.resultWindow("CheckMate",1);
						}
					}
					else
					{
						for(i=c1+1;i<=c2-1;i++)
						{
							if(b[r1][i].getIcon()!=null)
							{
								break;
							}
						}
						if(i==c2)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
	    					 jp.resultWindow("CheckMate",1);
						}
						
					}
				}
				else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
				{
					if(r1>r2)
					{
						for(i=r2+1;i<=r1-1;i++)
						{
							if(b[i][c1].getIcon()!=null)
							{
								break;
							}
						}
						if(i==r1)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
	    					 jp.resultWindow("CheckMate",1);
						}
					}
					else
					{
						for(i=r1+1;i<=r2-1;i++)
						{
							if(b[i][c1].getIcon()!=null)
							{
								break;
							}
						}
						if(i==r2)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
	    					 jp.resultWindow("CheckMate",1);
						}
					}
				}
				
			}
  				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
   				{
   					if(r1<r2 && c1>c2)
   					{
   						int cc=c1,m=0;
   						for(i=r1;i<=r2;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc-=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
	    					 jp.resultWindow("CheckMate",1);
   						}
   					}
   					else if(r2>r1 && c2>c1)
   					{
   			            	int cc=c1,m=0;
   	   						for(i=r1;i<=r2;i++)
   	   						{
   	   							if(b[i][cc].getIcon()!=null)
   	   							{
   	   							m+=1;
   								if(m>2)
   								break;
   	   							}
   	   							cc+=1;
   	   						}
   	   						if(m==2)
   	   						{
   	   							b[r2][c2].setIcon(sic);
   	   		   					b[r1][c1].setIcon(null);
   	   		   					cl=1;
   	   		   					n=1;
   	   		   					jp.updateTime(n);
		    					 jp.resultWindow("CheckMate",1);
   	   						}
   					}
   					else if(r2<r1 && c2<c1)
   					{
   						int cc=c2,m=0;
	   						for(i=r2;i<=r1;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
	   								if(m>2)
	   								break;
	   							}
	   							cc+=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
		    					 jp.resultWindow("CheckMate",1);
	   						}
   					}
   					else if(r2<r1 && c2>c1)
   					{
   						int cc=c2,m=0;
	   						for(i=r2;i<=r1;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
	   								if(m>2)
	   								break;
	   							}
	   							cc-=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
		    					 jp.resultWindow("CheckMate",1);
	   						}
   					}
   					
   				}
  				else
				{
					cl=1;
				}
  				
  			}
		
		else if(c.equalsIgnoreCase("WK"))
		{
			bo:
  	    		 for(i=0;i<=7;i++)
  	    		  {
  	    			  for(j=0;j<=7;j++)
  	    			  {
  	    				  if(b[i][j]==b1)
  	    				  {
  	    					  r2=i;
  	    					  c2=j;
  	    					  break bo;
  	    				  }
  	    			  }
  	    		  }
  		
  				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
  				{
  					b[r2][c2].setIcon(sic);
  					b[r1][c1].setIcon(null);
  					cl=1;
  					n=1;
  					jp.updateTime(n);
					 jp.resultWindow("CheckMate",1);
  				}
  				else
				{
					cl=1;
				}
  			}
		
		else if(c.equalsIgnoreCase("WN"))
		{
			bo:
 	    		 for(i=0;i<=7;i++)
 	    		  {
 	    			  for(j=0;j<=7;j++)
 	    			  {
 	    				  if(b[i][j]==b1)
 	    				  {
 	    					  r2=i;
 	    					  c2=j;
 	    					  break bo;
 	    				  }
 	    			  }
 	    		  }
 			
 				if((Math.abs(r1-r2)==1 && c1!=c2) && r1<r2)
 				{
 					b[r2][c2].setIcon(sic);
 					b[r1][c1].setIcon(null);
 					cl=1;
 					n=1;
 					if(r2==0)
 					{
 						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
 					}
 					jp.updateTime(n);
					 jp.resultWindow("CheckMate",1);
 				}
 				else
				{
					cl=1;
				}
 			}
		}
	}
	

else if(im1==im[5])
{
	if(cl==1)
	{
		bo:
		 for(i=0;i<=7;i++)
		  {
			  for(j=0;j<=7;j++)
			  {
				  if(b[i][j]==b1)
				  {
					  r1=i;
					  c1=j;
					  c="BN";
					  cl=2;
					  sic=im1;
//					  System.out.println("ab");
					  break bo;
				  }
			  }
		  }
		
	}
	else
	{
		if(c.equalsIgnoreCase("WE"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
				{
					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
					{
						if(c1>c2)
						{
							for(i=c2+1;i<=c1-1;i++)
							{
								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
								if(ci!=null)
								{
									break;
								}
							}
							if(i==c1)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
						else
						{
							for(i=c1+1;i<=c2-1;i++)
							{
								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
								if(ci!=null)
								{
									break;
								}
							}
							if(i==c2)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
							
						}
					}
					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
					{
						if(r1>r2)
						{

							for(i=r2+1;i<=r1-1;i++)
							{
								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
							if(ci!=null)
							{
	     						break;
							}
							}
							if(i==r1)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
						else
						{
							for(i=r1+1;i<=r2-1;i++)
							{
								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
								if(ci!=null)
								{
									break;
								}
							}
							if(i==r2)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
					}
					
				}
				else
				{
					cl=1;
				}
			}
		
		else if(c.equalsIgnoreCase("WH"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
			
				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
				{
					b[r2][c2].setIcon(sic);
					b[r1][c1].setIcon(null);
					cl=1;
					n=1;
					jp.updateTime(n);
				}
				else
			{
				cl=1;
			}
			}
		
		else if(c.equalsIgnoreCase("WC"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
			
				if((Math.abs(r1-r2)==Math.abs(c1-c2)))
				{
					if(r1<r2 && c1>c2)
					{
						
						int cc=c1,m=0;
						for(i=r1;i<=r2;i++)
						{
							if(b[i][cc].getIcon()!=null)
							{
								m+=1;
								if(m>2)
								break;
							}
							cc-=1;
						}
						if(m==2)
						{
							b[r2][c2].setIcon(sic);
		   					b[r1][c1].setIcon(null);
		   					cl=1;
		   					n=1;
		   					jp.updateTime(n);
						}
					}
					else if(r2>r1 && c2>c1)
					{
			            	int cc=c1,m=0;
	   						for(i=r1;i<=r2;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   							m+=1;
								if(m>2)
								break;
	   							}
	   							cc+=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
					}
					else if(r2<r1 && c2<c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc+=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
					}
					else if(r2<r1 && c2>c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc-=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
					}
					
				}
				else
			{
				cl=1;
			}
			}
			
		else if(c.equalsIgnoreCase("WQ"))
		{
			bo:
  	    		 for(i=0;i<=7;i++)
  	    		  {
  	    			  for(j=0;j<=7;j++)
  	    			  {
  	    				  if(b[i][j]==b1)
  	    				  {
  	    					  r2=i;
  	    					  c2=j;
  	    					  break bo;
  	    				  }
  	    			  }
  	    		  }
  			
			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
			{
				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
				{
					if(c1>c2)
					{
						for(i=c2+1;i<=c1-1;i++)
						{
							ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
							if(ci!=null)
							{
								break;
							}
						}
						if(i==c1)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
					else
					{
						for(i=c1+1;i<=c2-1;i++)
						{
							ImageIcon ci=(ImageIcon)b[r2][i].getIcon();
							if(ci!=null)
							{
								break;
							}
						}
						if(i==c2)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
						
					}
				}
				else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
				{
					if(r1>r2)
					{

						for(i=r2+1;i<=r1-1;i++)
						{
							ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
						if(ci!=null)
						{
     						break;
						}
						}
						if(i==r1)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
					else
					{
						for(i=r1+1;i<=r2-1;i++)
						{
							ImageIcon ci=(ImageIcon)b[i][c2].getIcon();
							if(ci!=null)
							{
								break;
							}
						}
						if(i==r2)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
				}
				
			}
  				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
   				{
   					if(r1<r2 && c1>c2)
   					{
   						
   						int cc=c1,m=0;
   						for(i=r1;i<=r2;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc-=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
   					}
   					else if(r2>r1 && c2>c1)
   					{
   			            	int cc=c1,m=0;
   	   						for(i=r1;i<=r2;i++)
   	   						{
   	   							if(b[i][cc].getIcon()!=null)
   	   							{
   	   							m+=1;
   								if(m>2)
   								break;
   	   							}
   	   							cc+=1;
   	   						}
   	   						if(m==2)
   	   						{
   	   							b[r2][c2].setIcon(sic);
   	   		   					b[r1][c1].setIcon(null);
   	   		   					cl=1;
   	   		   					n=1;
   	   		   					jp.updateTime(n);
   	   						}
   					}
   					else if(r2<r1 && c2<c1)
   					{
   						int cc=c2,m=0;
	   						for(i=r2;i<=r1;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
       								if(m>2)
       								break;
	   							}
	   							cc+=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
   					}
   					else if(r2<r1 && c2>c1)
   					{
   						int cc=c2,m=0;
	   						for(i=r2;i<=r1;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
       								if(m>2)
       								break;
	   							}
	   							cc-=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
   					}
   					
   				}
  				else
				{
					cl=1;
				}
  				
  			}
		
		else if(c.equalsIgnoreCase("WK"))
		{
			bo:
  	    		 for(i=0;i<=7;i++)
  	    		  {
  	    			  for(j=0;j<=7;j++)
  	    			  {
  	    				  if(b[i][j]==b1)
  	    				  {
  	    					  r2=i;
  	    					  c2=j;
  	    					  break bo;
  	    				  }
  	    			  }
  	    		  }
  			
  			
  				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
  				{
  					b[r2][c2].setIcon(sic);
  					b[r1][c1].setIcon(null);
  					cl=1;
  					n=1;
  					jp.updateTime(n);
  				}
  				else
				{
					cl=1;
				}
  			}
		
		else if(c.equalsIgnoreCase("WN"))
		{
			bo:
 	    		 for(i=0;i<=7;i++)
 	    		  {
 	    			  for(j=0;j<=7;j++)
 	    			  {
 	    				  if(b[i][j]==b1)
 	    				  {
 	    					  r2=i;
 	    					  c2=j;
 	    					  break bo;
 	    				  }
 	    			  }
 	    		  }
 				if((Math.abs(r1-r2)==1 && c2!=c1) && (r2<r1))
                 {
  					
 					b[r2][c2].setIcon(sic);
 					b[r1][c1].setIcon(null);
 					cl=1;
 					n=1;
 					if(r2==0)
 					{
 						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
 					}
 					jp.updateTime(n);
 				}
 				else
				{
					cl=1;
				}
 			}
		}
	}
if(im1==im[6])
{
	 if(cl==1)
	{
//		bo:
//		 for(i=0;i<=7;i++)
//		  {
//			  for(j=0;j<=7;j++)
//			  {
//				  if(b[i][j]==b1)
//				  {
//					  r1=i;
//					  c1=j;
//					  c="WE";
//					  sic=im1;
//					  cl=2;
//					  break bo;
//				  }
//			  }
//		  }
	}
	else
	{
		if(c.equalsIgnoreCase("BE"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
				{
					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
					{
						if(c1>c2)
						{
							for(i=c2+1;i<=c1-1;i++)
							{
								if(b[r1][i].getIcon()!=null)
								{
									break;
								}
							}
							if(i==c1)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
						else
						{
							for(i=c1+1;i<=c2-1;i++)
							{
								if(b[r1][i].getIcon()!=null)
								{
									break;
								}
							}
							if(i==c2)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
							
						}
					}
					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
					{
						if(r1>r2)
						{
							for(i=r2+1;i<=r1-1;i++)
							{
								if(b[i][c1].getIcon()!=null)
								{
									break;
								}
							}
							if(i==r1)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
						else
						{
							for(i=r1+1;i<=r2-1;i++)
							{
								if(b[i][c2].getIcon()!=null)
								{
									break;
								}
							}
							if(i==r2)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
					}
					
				}
				else
				{
					cl=1;
				}
			}
		
		else if(c.equalsIgnoreCase("BH"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
			
				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
				{
					b[r2][c2].setIcon(sic);
					b[r1][c1].setIcon(null);
					cl=1;
					n=1;
					jp.updateTime(n);
				}
				else
			{
				cl=1;
			}
			}
		
		else if(c.equalsIgnoreCase("BC"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
			
				if((Math.abs(r1-r2)==Math.abs(c1-c2)))
				{
					if(r1<r2 && c1>c2)
					{
						int cc=c1,m=0;
						for(i=r1;i<=r2;i++)
						{
							if(b[i][cc].getIcon()!=null)
							{
								m+=1;
								if(m>2)
								break;
							}
							cc-=1;
						}
						if(m==2)
						{
							b[r2][c2].setIcon(sic);
		   					b[r1][c1].setIcon(null);
		   					cl=1;
		   					n=1;
		   					jp.updateTime(n);
						}
					}
					else if(r2>r1 && c2>c1)
					{
			            	int cc=c1,m=0;
	   						for(i=r1;i<=r2;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   							m+=1;
								if(m>2)
								break;
	   							}
	   							cc+=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
					}
					else if(r2<r1 && c2<c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc+=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
					}
					else if(r2<r1 && c2>c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc-=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
					}
					
				}
				else
			{
				cl=1;
			}
			}
			
		else if(c.equalsIgnoreCase("BQ"))
		{
			bo:
  	    		 for(i=0;i<=7;i++)
  	    		  {
  	    			  for(j=0;j<=7;j++)
  	    			  {
  	    				  if(b[i][j]==b1)
  	    				  {
  	    					  r2=i;
  	    					  c2=j;
  	    					  break bo;
  	    				  }
  	    			  }
  	    		  }
  			
			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
			{
				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
				{
					if(c1>c2)
					{
						for(i=c2+1;i<=c1-1;i++)
						{
							if(b[r1][i].getIcon()!=null)
							{
								break;
							}
						}
						if(i==c1)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
					else
					{
						for(i=c1+1;i<=c2-1;i++)
						{
							if(b[r1][i].getIcon()!=null)
							{
								break;
							}
						}
						if(i==c2)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
						
					}
				}
				else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
				{
					if(r1>r2)
					{
						for(i=r2+1;i<=r1-1;i++)
						{
							if(b[i][c1].getIcon()!=null)
							{
								break;
							}
						}
						if(i==r1)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
					else
					{
						for(i=r1+1;i<=r2-1;i++)
						{
							if(b[i][c2].getIcon()!=null)
							{
								break;
							}
						}
						if(i==r2)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
				}
				
			}
  				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
   				{
   					if(r1<r2 && c1>c2)
   					{
   						int cc=c1,m=0;
   						for(i=r1;i<=r2;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc-=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
   					}
   					else if(r2>r1 && c2>c1)
   					{
   			            	int cc=c1,m=0;
   	   						for(i=r1;i<=r2;i++)
   	   						{
   	   							if(b[i][cc].getIcon()!=null)
   	   							{
   	   							m+=1;
   								if(m>2)
   								break;
   	   							}
   	   							cc+=1;
   	   						}
   	   						if(m==2)
   	   						{
   	   							b[r2][c2].setIcon(sic);
   	   		   					b[r1][c1].setIcon(null);
   	   		   					cl=1;
   	   		   					n=1;
   	   		   					jp.updateTime(n);
   	   						}
   					}
   					else if(r2<r1 && c2<c1)
   					{
   						int cc=c2,m=0;
	   						for(i=r2;i<=r1;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
	   								if(m>2)
	   								break;
	   							}
	   							cc+=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
   					}
   					else if(r2<r1 && c2>c1)
   					{
   						int cc=c2,m=0;
	   						for(i=r2;i<=r1;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
	   								if(m>2)
	   								break;
	   							}
	   							cc-=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
   					}
   				}
  				else
				{
					cl=1;
				}
  				
  			}
		
		else if(c.equalsIgnoreCase("BK"))
		{
			bo:
  	    		 for(i=0;i<=7;i++)
  	    		  {
  	    			  for(j=0;j<=7;j++)
  	    			  {
  	    				  if(b[i][j]==b1)
  	    				  {
  	    					  r2=i;
  	    					  c2=j;
  	    					  break bo;
  	    				  }
  	    			  }
  	    		  }
  			
  			
  				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
  				{
  					b[r2][c2].setIcon(sic);
  					b[r1][c1].setIcon(null);
  					cl=1;
  					n=1;
  					jp.updateTime(n);
  				}
  				else
				{
					cl=1;
				}
  			}
		
		else if(c.equalsIgnoreCase("BN"))
		{
			bo:
 	    		 for(i=0;i<=7;i++)
 	    		  {
 	    			  for(j=0;j<=7;j++)
 	    			  {
 	    				  if(b[i][j]==b1)
 	    				  {
 	    					  r2=i;
 	    					  c2=j;
 	    					  break bo;
 	    				  }
 	    			  }
 	    		  }
 				if((Math.abs(r1-r2)==1 && c1!=c2) && r2>r1)
 				{
 					b[r2][c2].setIcon(sic);
 					b[r1][c1].setIcon(null);
 					cl=1;
 					n=1;
 					if(r2==0)
 					{
 						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
 					}
 					jp.updateTime(n);
 				}
 				else
				{
					cl=1;
				}
 			}
		}
	}
	
else if(im1==im[7])
{

	if(cl==1)
	{
//		bo:
//		 for(i=0;i<=7;i++)
//		  {
//			  for(j=0;j<=7;j++)
//			  {
//				  if(b[i][j]==b1)
//				  {
//					  r1=i;
//					  c1=j;
//					  c="WC";
//					  cl=2;
//					  sic=im1;
//					  break bo;
//				  }
//			  }
//		  }
	}
	else
	{
		if(c.equalsIgnoreCase("BE"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
				{
					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
					{
						if(c1>c2)
						{
							for(i=c2+1;i<=c1-1;i++)
							{
								if(b[r1][i].getIcon()!=null)
								{
									break;
								}
							}
							if(i==c1)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
						else
						{
							for(i=c1+1;i<=c2-1;i++)
							{
								if(b[r1][i].getIcon()!=null)
								{
									break;
								}
							}
							if(i==c2)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
							
						}
					}
					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
					{
						if(r1>r2)
						{
							for(i=r2+1;i<=r1-1;i++)
							{
								if(b[i][c1].getIcon()!=null)
								{
									break;
								}
							}
							if(i==r1)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
						else
						{
							for(i=r1+1;i<=r2-1;i++)
							{
								if(b[i][c2].getIcon()!=null)
								{
									break;
								}
							}
							if(i==r2)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
					}
					
				}
				else
				{
					cl=1;
				}
			}
		
		else if(c.equalsIgnoreCase("BH"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
			
				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
				{
					b[r2][c2].setIcon(sic);
					b[r1][c1].setIcon(null);
					cl=1;
					n=1;
					jp.updateTime(n);
				}
				else
			{
				cl=1;
			}
			}
		
		else if(c.equalsIgnoreCase("BC"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
			
				if((Math.abs(r1-r2)==Math.abs(c1-c2)))
				{
					if(r1<r2 && c1>c2)
					{
						int cc=c1,m=0;
						for(i=r1;i<=r2;i++)
						{
							if(b[i][cc].getIcon()!=null)
							{
								m+=1;
								if(m>2)
								break;
							}
							cc-=1;
						}
						if(m==2)
						{
							b[r2][c2].setIcon(sic);
		   					b[r1][c1].setIcon(null);
		   					cl=1;
		   					n=1;
		   					jp.updateTime(n);
						}
					}
					else if(r2>r1 && c2>c1)
					{
			            	int cc=c1,m=0;
	   						for(i=r1;i<=r2;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   							m+=1;
								if(m>2)
								break;
	   							}
	   							cc+=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
					}
					else if(r2<r1 && c2<c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc+=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
					}
					else if(r2<r1 && c2>c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc-=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
					}
					
				}
				else
			{
				cl=1;
			}
			}
			
		else if(c.equalsIgnoreCase("BQ"))
		{
			bo:
  	    		 for(i=0;i<=7;i++)
  	    		  {
  	    			  for(j=0;j<=7;j++)
  	    			  {
  	    				  if(b[i][j]==b1)
  	    				  {
  	    					  r2=i;
  	    					  c2=j;
  	    					  break bo;
  	    				  }
  	    			  }
  	    		  }
  			
			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
			{
				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
				{
					if(c1>c2)
					{
						for(i=c2+1;i<=c1-1;i++)
						{
							if(b[r1][i].getIcon()!=null)
							{
								break;
							}
						}
						if(i==c1)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
					else
					{
						for(i=c1+1;i<=c2-1;i++)
						{
							if(b[r1][i].getIcon()!=null)
							{
								break;
							}
						}
						if(i==c2)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
						
					}
				}
				else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
				{
					if(r1>r2)
					{
						for(i=r2+1;i<=r1-1;i++)
						{
							if(b[i][c1].getIcon()!=null)
							{
								break;
							}
						}
						if(i==r1)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
					else
					{
						for(i=r1+1;i<=r2-1;i++)
						{
							if(b[i][c2].getIcon()!=null)
							{
								break;
							}
						}
						if(i==r2)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
				}
				
			}
  				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
   				{
   					if(r1<r2 && c1>c2)
   					{
   						int cc=c1,m=0;
   						for(i=r1;i<=r2;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc-=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
   					}
   					else if(r2>r1 && c2>c1)
   					{
   			            	int cc=c1,m=0;
   	   						for(i=r1;i<=r2;i++)
   	   						{
   	   							if(b[i][cc].getIcon()!=null)
   	   							{
   	   							m+=1;
   								if(m>2)
   								break;
   	   							}
   	   							cc+=1;
   	   						}
   	   						if(m==2)
   	   						{
   	   							b[r2][c2].setIcon(sic);
   	   		   					b[r1][c1].setIcon(null);
   	   		   					cl=1;
   	   		   					n=1;
   	   		   					jp.updateTime(n);
   	   						}
   					}
   					else if(r2<r1 && c2<c1)
   					{
   						int cc=c2,m=0;
	   						for(i=r2;i<=r1;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
	   								if(m>2)
	   								break;
	   							}
	   							cc+=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
   					}
   					else if(r2<r1 && c2>c1)
   					{
   						int cc=c2,m=0;
	   						for(i=r2;i<=r1;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
	   								if(m>2)
	   								break;
	   							}
	   							cc-=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
   					}
   				}
  				else
				{
					cl=1;
				}
  				
  			}
		
		else if(c.equalsIgnoreCase("BK"))
		{
			bo:
  	    		 for(i=0;i<=7;i++)
  	    		  {
  	    			  for(j=0;j<=7;j++)
  	    			  {
  	    				  if(b[i][j]==b1)
  	    				  {
  	    					  r2=i;
  	    					  c2=j;
  	    					  break bo;
  	    				  }
  	    			  }
  	    		  }
  			
  			
  				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
  				{
  					b[r2][c2].setIcon(sic);
  					b[r1][c1].setIcon(null);
  					cl=1;
  					n=1;
  					jp.updateTime(n);
  				}
  				else
				{
					cl=1;
				}
  			}
		
		else if(c.equalsIgnoreCase("BN"))
		{
			bo:
 	    		 for(i=0;i<=7;i++)
 	    		  {
 	    			  for(j=0;j<=7;j++)
 	    			  {
 	    				  if(b[i][j]==b1)
 	    				  {
 	    					  r2=i;
 	    					  c2=j;
 	    					  break bo;
 	    				  }
 	    			  }
 	    		  }
 				if((Math.abs(r1-r2)==1 && c1!=c2) && r2>r1)
 				{
 					b[r2][c2].setIcon(sic);
 					b[r1][c1].setIcon(null);
 					cl=1;
 					n=1;
 					if(r2==0)
 					{
 						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
 					}
 					jp.updateTime(n);
 				}
 				else
				{
					cl=1;
				}
 			}
		}
}
else if(im1==im[8])
{

	if(cl==1)
	{
//		bo:
//		 for(i=0;i<=7;i++)
//		  {
//			  for(j=0;j<=7;j++)
//			  {
//				  if(b[i][j]==b1)
//				  {
//					  r1=i;
//					  c1=j;
//					  c="WH";
//					  cl=2;
//					  sic=im1;
//					  break bo;
//				  }
//			  }
//		  }
	}
	else
	{
		if(c.equalsIgnoreCase("BE"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
				{
					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
					{
						if(c1>c2)
						{
							for(i=c2+1;i<=c1-1;i++)
							{
								if(b[r1][i].getIcon()!=null)
								{
									break;
								}
							}
							if(i==c1)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
						else
						{
							for(i=c1+1;i<=c2-1;i++)
							{
								if(b[r1][i].getIcon()!=null)
								{
									break;
								}
							}
							if(i==c2)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
							
						}
					}
					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
					{
						if(r1>r2)
						{
							for(i=r2+1;i<=r1-1;i++)
							{
								if(b[i][c1].getIcon()!=null)
								{
									break;
								}
							}
							if(i==r1)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
						else
						{
							for(i=r1+1;i<=r2-1;i++)
							{
								if(b[i][c2].getIcon()!=null)
								{
									break;
								}
							}
							if(i==r2)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
					}
					
				}
				else
				{
					cl=1;
				}
			}
		
		else if(c.equalsIgnoreCase("BH"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
			
				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
				{
					b[r2][c2].setIcon(sic);
					b[r1][c1].setIcon(null);
					cl=1;
					n=1;
					jp.updateTime(n);
				}
				else
			{
				cl=1;
			}
			}
		
		else if(c.equalsIgnoreCase("BC"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
			
				if((Math.abs(r1-r2)==Math.abs(c1-c2)))
				{
					if(r1<r2 && c1>c2)
					{
						int cc=c1,m=0;
						for(i=r1;i<=r2;i++)
						{
							if(b[i][cc].getIcon()!=null)
							{
								m+=1;
								if(m>2)
								break;
							}
							cc-=1;
						}
						if(m==2)
						{
							b[r2][c2].setIcon(sic);
		   					b[r1][c1].setIcon(null);
		   					cl=1;
		   					n=1;
		   					jp.updateTime(n);
						}
					}
					else if(r2>r1 && c2>c1)
					{
			            	int cc=c1,m=0;
	   						for(i=r1;i<=r2;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   							m+=1;
								if(m>2)
								break;
	   							}
	   							cc+=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
					}
					else if(r2<r1 && c2<c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc+=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
					}
					else if(r2<r1 && c2>c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc-=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
					}
					
				}
				else
			{
				cl=1;
			}
			}
			
		else if(c.equalsIgnoreCase("BQ"))
		{
			bo:
  	    		 for(i=0;i<=7;i++)
  	    		  {
  	    			  for(j=0;j<=7;j++)
  	    			  {
  	    				  if(b[i][j]==b1)
  	    				  {
  	    					  r2=i;
  	    					  c2=j;
  	    					  break bo;
  	    				  }
  	    			  }
  	    		  }
  			
			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
			{
				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
				{
					if(c1>c2)
					{
						for(i=c2+1;i<=c1-1;i++)
						{
							if(b[r1][i].getIcon()!=null)
							{
								break;
							}
						}
						if(i==c1)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
					else
					{
						for(i=c1+1;i<=c2-1;i++)
						{
							if(b[r1][i].getIcon()!=null)
							{
								break;
							}
						}
						if(i==c2)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
						
					}
				}
				else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
				{
					if(r1>r2)
					{
						for(i=r2+1;i<=r1-1;i++)
						{
							if(b[i][c1].getIcon()!=null)
							{
								break;
							}
						}
						if(i==r1)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
					else
					{
						for(i=r1+1;i<=r2-1;i++)
						{
							if(b[i][c2].getIcon()!=null)
							{
								break;
							}
						}
						if(i==r2)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
				}
				
			}
  				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
   				{
   					if(r1<r2 && c1>c2)
   					{
   						int cc=c1,m=0;
   						for(i=r1;i<=r2;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc-=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
   					}
   					else if(r2>r1 && c2>c1)
   					{
   			            	int cc=c1,m=0;
   	   						for(i=r1;i<=r2;i++)
   	   						{
   	   							if(b[i][cc].getIcon()!=null)
   	   							{
   	   							m+=1;
   								if(m>2)
   								break;
   	   							}
   	   							cc+=1;
   	   						}
   	   						if(m==2)
   	   						{
   	   							b[r2][c2].setIcon(sic);
   	   		   					b[r1][c1].setIcon(null);
   	   		   					cl=1;
   	   		   					n=1;
   	   		   					jp.updateTime(n);
   	   						}
   					}
   					else if(r2<r1 && c2<c1)
   					{
   						int cc=c2,m=0;
	   						for(i=r2;i<=r1;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
	   								if(m>2)
	   								break;
	   							}
	   							cc+=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
   					}
   					else if(r2<r1 && c2>c1)
   					{
   						int cc=c2,m=0;
	   						for(i=r2;i<=r1;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
	   								if(m>2)
	   								break;
	   							}
	   							cc-=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
   					}
   				}
  				else
				{
					cl=1;
				}
  				
  			}
		
		else if(c.equalsIgnoreCase("BK"))
		{
			bo:
  	    		 for(i=0;i<=7;i++)
  	    		  {
  	    			  for(j=0;j<=7;j++)
  	    			  {
  	    				  if(b[i][j]==b1)
  	    				  {
  	    					  r2=i;
  	    					  c2=j;
  	    					  break bo;
  	    				  }
  	    			  }
  	    		  }
  			
  			
  				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
  				{
  					b[r2][c2].setIcon(sic);
  					b[r1][c1].setIcon(null);
  					cl=1;
  					n=1;
  					jp.updateTime(n);
  				}
  				else
				{
					cl=1;
				}
  			}
		
		else if(c.equalsIgnoreCase("BN"))
		{
			bo:
 	    		 for(i=0;i<=7;i++)
 	    		  {
 	    			  for(j=0;j<=7;j++)
 	    			  {
 	    				  if(b[i][j]==b1)
 	    				  {
 	    					  r2=i;
 	    					  c2=j;
 	    					  break bo;
 	    				  }
 	    			  }
 	    		  }
 				if((Math.abs(r1-r2)==1 && c1!=c2) && r2>r1)
 				{
 					b[r2][c2].setIcon(sic);
 					b[r1][c1].setIcon(null);
 					cl=1;
 					n=1;
 					if(r2==0)
 					{
 						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
 					}
 					jp.updateTime(n);
 				}
 				else
				{
					cl=1;
				}
 			}
		}
}
else if(im1==im[9])
{
 	if(cl==1)
	{
//		bo:
//		 for(i=0;i<=7;i++)
//		  {
//			  for(j=0;j<=7;j++)
//			  {
//				  if(b[i][j]==b1)
//				  {
//					  r1=i;
//					  c1=j;
//					  c="WQ";
//					  cl=2;
//					  sic=im1;
//					  break bo;
//				  }
//			  }
//		  }
	}
	else
	{
		if(c.equalsIgnoreCase("BE"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
				{
					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
					{
						if(c1>c2)
						{
							for(i=c2+1;i<=c1-1;i++)
							{
								if(b[r1][i].getIcon()!=null)
								{
									break;
								}
							}
							if(i==c1)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
						else
						{
							for(i=c1+1;i<=c2-1;i++)
							{
								if(b[r1][i].getIcon()!=null)
								{
									break;
								}
							}
							if(i==c2)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
							
						}
					}
					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
					{
						if(r1>r2)
						{
							for(i=r2+1;i<=r1-1;i++)
							{
								if(b[i][c1].getIcon()!=null)
								{
									break;
								}
							}
							if(i==r1)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
						else
						{
							for(i=r1+1;i<=r2-1;i++)
							{
								if(b[i][c2].getIcon()!=null)
								{
									break;
								}
							}
							if(i==r2)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
					}
					
				}
				else
				{
					cl=1;
				}
			}
		
		else if(c.equalsIgnoreCase("BH"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
			
				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
				{
					b[r2][c2].setIcon(sic);
					b[r1][c1].setIcon(null);
					cl=1;
					n=1;
					jp.updateTime(n);
				}
				else
			{
				cl=1;
			}
			}
		
		else if(c.equalsIgnoreCase("BC"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
			
				if((Math.abs(r1-r2)==Math.abs(c1-c2)))
				{
					if(r1<r2 && c1>c2)
					{
						int cc=c1,m=0;
						for(i=r1;i<=r2;i++)
						{
							if(b[i][cc].getIcon()!=null)
							{
								m+=1;
								if(m>2)
								break;
							}
							cc-=1;
						}
						if(m==2)
						{
							b[r2][c2].setIcon(sic);
		   					b[r1][c1].setIcon(null);
		   					cl=1;
		   					n=1;
		   					jp.updateTime(n);
						}
					}
					else if(r2>r1 && c2>c1)
					{
			            	int cc=c1,m=0;
	   						for(i=r1;i<=r2;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   							m+=1;
								if(m>2)
								break;
	   							}
	   							cc+=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
					}
					else if(r2<r1 && c2<c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc+=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
					}
					else if(r2<r1 && c2>c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc-=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
					}
					
				}
				else
			{
				cl=1;
			}
			}
			
		else if(c.equalsIgnoreCase("BQ"))
		{
			bo:
  	    		 for(i=0;i<=7;i++)
  	    		  {
  	    			  for(j=0;j<=7;j++)
  	    			  {
  	    				  if(b[i][j]==b1)
  	    				  {
  	    					  r2=i;
  	    					  c2=j;
  	    					  break bo;
  	    				  }
  	    			  }
  	    		  }
  			
			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
			{
				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
				{
					if(c1>c2)
					{
						for(i=c2+1;i<=c1-1;i++)
						{
							if(b[r1][i].getIcon()!=null)
							{
								break;
							}
						}
						if(i==c1)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
					else
					{
						for(i=c1+1;i<=c2-1;i++)
						{
							if(b[r1][i].getIcon()!=null)
							{
								break;
							}
						}
						if(i==c2)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
						
					}
				}
				else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
				{
					if(r1>r2)
					{
						for(i=r2+1;i<=r1-1;i++)
						{
							if(b[i][c1].getIcon()!=null)
							{
								break;
							}
						}
						if(i==r1)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
					else
					{
						for(i=r1+1;i<=r2-1;i++)
						{
							if(b[i][c2].getIcon()!=null)
							{
								break;
							}
						}
						if(i==r2)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
				}
				
			}
  				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
   				{
   					if(r1<r2 && c1>c2)
   					{
   						int cc=c1,m=0;
   						for(i=r1;i<=r2;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc-=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
   					}
   					else if(r2>r1 && c2>c1)
   					{
   			            	int cc=c1,m=0;
   	   						for(i=r1;i<=r2;i++)
   	   						{
   	   							if(b[i][cc].getIcon()!=null)
   	   							{
   	   							m+=1;
   								if(m>2)
   								break;
   	   							}
   	   							cc+=1;
   	   						}
   	   						if(m==2)
   	   						{
   	   							b[r2][c2].setIcon(sic);
   	   		   					b[r1][c1].setIcon(null);
   	   		   					cl=1;
   	   		   					n=1;
   	   		   					jp.updateTime(n);
   	   						}
   					}
   					else if(r2<r1 && c2<c1)
   					{
   						int cc=c2,m=0;
	   						for(i=r2;i<=r1;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
	   								if(m>2)
	   								break;
	   							}
	   							cc+=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
   					}
   					else if(r2<r1 && c2>c1)
   					{
   						int cc=c2,m=0;
	   						for(i=r2;i<=r1;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
	   								if(m>2)
	   								break;
	   							}
	   							cc-=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
   					}
   				}
  				else
				{
					cl=1;
				}
  				
  			}
		
		else if(c.equalsIgnoreCase("BK"))
		{
			bo:
  	    		 for(i=0;i<=7;i++)
  	    		  {
  	    			  for(j=0;j<=7;j++)
  	    			  {
  	    				  if(b[i][j]==b1)
  	    				  {
  	    					  r2=i;
  	    					  c2=j;
  	    					  break bo;
  	    				  }
  	    			  }
  	    		  }
  			
  			
  				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
  				{
  					b[r2][c2].setIcon(sic);
  					b[r1][c1].setIcon(null);
  					cl=1;
  					n=1;
  					jp.updateTime(n);
  				}
  				else
				{
					cl=1;
				}
  			}
		
		else if(c.equalsIgnoreCase("BN"))
		{
			bo:
 	    		 for(i=0;i<=7;i++)
 	    		  {
 	    			  for(j=0;j<=7;j++)
 	    			  {
 	    				  if(b[i][j]==b1)
 	    				  {
 	    					  r2=i;
 	    					  c2=j;
 	    					  break bo;
 	    				  }
 	    			  }
 	    		  }
 				if((Math.abs(r1-r2)==1 && c1!=c2) && r2>r1)
 				{
 					b[r2][c2].setIcon(sic);
 					b[r1][c1].setIcon(null);
 					cl=1;
 					n=1;
 					if(r2==0)
 					{
 						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
 					}
 					jp.updateTime(n);
 				}
 				else
				{
					cl=1;
				}
 			}
		}
}
else if(im1==im[10])
{
	if(cl==1)
	{
//		bo:
//		 for(i=0;i<=7;i++)
//		  {
//			  for(j=0;j<=7;j++)
//			  {
//				  if(b[i][j]==b1)
//				  {
//					  r1=i;
//					  c1=j;
//					  c="WK";
//					  cl=2;
//					  sic=im1;
//					  break bo;
//				  }
//			  }
//		  }
	}
	else
	{
		if(c.equalsIgnoreCase("BE"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
		
				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
				{
					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
					{
						if(c1>c2)
						{
							for(i=c2+1;i<=c1-1;i++)
							{
								if(b[r1][i].getIcon()!=null)
								{
									break;
								}
							}
							if(i==c1)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
		    					 jp.resultWindow("CheckMate",2);
							}
						}
						else
						{
							for(i=c1+1;i<=c2-1;i++)
							{
								if(b[r2][i].getIcon()!=null)
								{
									break;
								}
							}
							if(i==c2)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
		    					 jp.resultWindow("CheckMate",2);
							}
							
						}
					}
					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
					{
						if(r1>r2)
						{
							for(i=r2+1;i<=r1-1;i++)
							{
								if(b[i][c1].getIcon()!=null)
								{
									break;
								}
							}
							if(i==r1)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
		    					 jp.resultWindow("CheckMate",2);
							}
						}
						else
						{
							for(i=r1+1;i<=r2-1;i++)
							{
								if(b[i][c1].getIcon()!=null)
								{
									break;
								}
							}
							if(i==r2)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
		    					 jp.resultWindow("CheckMate",2);
							}
						}
					}
					
				}
				else
				{
					cl=1;
				}
			}
		else if(c.equalsIgnoreCase("BH"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
				{
					b[r2][c2].setIcon(sic);
					b[r1][c1].setIcon(null);
					cl=1;
					n=1;
					jp.updateTime(n);
				    jp.resultWindow("CheckMate",2);
				}
				else
			{
				cl=1;
			}
			}
		
		else if(c.equalsIgnoreCase("BC"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
			
				if((Math.abs(r1-r2)==Math.abs(c1-c2)))
				{
					if(r1<r2 && c1>c2)
					{
						int cc=c1,m=0;
						for(i=r1;i<=r2;i++)
						{
							if(b[i][cc].getIcon()!=null)
							{ 
								m+=1;
								if(m>2)
								break;
							}
							cc-=1;
						}
						if(m==2)
						{
							b[r2][c2].setIcon(sic);
		   					b[r1][c1].setIcon(null);
		   					cl=1;
		   					n=1;
		   					jp.updateTime(n);
		   				 jp.resultWindow("CheckMate",2);
						}
					}
					else if(r2>r1 && c2>c1)
					{
			            	int cc=c1,m=0;
	   						for(i=r1;i<=r2;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
    								if(m>2)
    								break;
	   							}
	   							cc+=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   		   				 jp.resultWindow("CheckMate",2);
	   						}
					}
					else if(r2<r1 && c2<c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
								if(m>2)
								break;
   							}
   							cc+=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   		   				 jp.resultWindow("CheckMate",2);
   						}
					}
					else if(r2<r1 && c2>c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
								if(m>2)
								break;
   							}
   							cc-=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   		   				 jp.resultWindow("CheckMate",2);
   						}
					}
					
				}
				else
			{
				cl=1;
			}
			}
			
		else if(c.equalsIgnoreCase("BQ"))
		{
			bo:
  	    		 for(i=0;i<=7;i++)
  	    		  {
  	    			  for(j=0;j<=7;j++)
  	    			  {
  	    				  if(b[i][j]==b1)
  	    				  {
  	    					  r2=i;
  	    					  c2=j;
  	    					  break bo;
  	    				  }
  	    			  }
  	    		  }
  			
  			
			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
			{
				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
				{
					if(c1>c2)
					{
						for(i=c2+1;i<=c1-1;i++)
						{
							if(b[r1][i].getIcon()!=null)
							{
								break;
							}
						}
						if(i==c1)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
	    					 jp.resultWindow("CheckMate",2);
						}
					}
					else
					{
						for(i=c1+1;i<=c2-1;i++)
						{
							if(b[r2][i].getIcon()!=null)
							{
								break;
							}
						}
						if(i==c2)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
	    					 jp.resultWindow("CheckMate",2);
						}
						
					}
				}
				else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
				{
					if(r1>r2)
					{
						for(i=r2+1;i<=r1-1;i++)
						{
							if(b[i][c1].getIcon()!=null)
							{
								break;
							}
						}
						if(i==r1)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
	    					 jp.resultWindow("CheckMate",2);
						}
					}
					else
					{
						for(i=r1+1;i<=r2-1;i++)
						{
							if(b[i][c1].getIcon()!=null)
							{
								break;
							}
						}
						if(i==r2)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
	    					 jp.resultWindow("CheckMate",2);
						}
					}
				}
				
			}
  				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
				{
					if(r1<r2 && c1>c2)
					{
						int cc=c1,m=0;
						for(i=r1;i<=r2;i++)
						{
							if(b[i][cc].getIcon()!=null)
							{ 
								m+=1;
								if(m>2)
								break;
							}
							cc-=1;
						}
						if(m==2)
						{
							b[r2][c2].setIcon(sic);
		   					b[r1][c1].setIcon(null);
		   					cl=1;
		   					n=1;
		   					jp.updateTime(n);
		   				 jp.resultWindow("CheckMate",2);
						}
					}
					else if(r2>r1 && c2>c1)
					{
			            	int cc=c1,m=0;
	   						for(i=r1;i<=r2;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
    								if(m>2)
    								break;
	   							}
	   							cc+=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   		   				 jp.resultWindow("CheckMate",2);
	   						}
					}
					else if(r2<r1 && c2<c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
								if(m>2)
								break;
   							}
   							cc+=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   		   				 jp.resultWindow("CheckMate",2);
   						}
					}
					else if(r2<r1 && c2>c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
								if(m>2)
								break;
   							}
   							cc-=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   		   				 jp.resultWindow("CheckMate",2);
   						}
					}
					
				}
  				else
				{
					cl=1;
				}
  				
  			}
		
		else if(c.equalsIgnoreCase("BK"))
		{
			bo:
  	    		 for(i=0;i<=7;i++)
  	    		  {
  	    			  for(j=0;j<=7;j++)
  	    			  {
  	    				  if(b[i][j]==b1)
  	    				  {
  	    					  r2=i;
  	    					  c2=j;
  	    					  break bo;
  	    				  }
  	    			  }
  	    		  }
  		
  				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
  				{
  					b[r2][c2].setIcon(sic);
  					b[r1][c1].setIcon(null);
  					cl=1;
  					n=1;
  					jp.updateTime(n);
  					 jp.resultWindow("CheckMate",2);
  				}
  				else
				{
					cl=1;
				}
  			}
		
		else if(c.equalsIgnoreCase("BN"))
		{
			bo:
 	    		 for(i=0;i<=7;i++)
 	    		  {
 	    			  for(j=0;j<=7;j++)
 	    			  {
 	    				  if(b[i][j]==b1)
 	    				  {
 	    					  r2=i;
 	    					  c2=j;
 	    					  break bo;
 	    				  }
 	    			  }
 	    		  }
 			
 				if((Math.abs(r1-r2)==1 && c1!=c2) && r2>r1)
 				{
 					b[r2][c2].setIcon(sic);
 					b[r1][c1].setIcon(null);
 					cl=1;
 					n=1;
 					if(r2==0)
 					{
 						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
 					}
 					jp.updateTime(n);
 					 jp.resultWindow("CheckMate",2);
 				}
 				else
				{
					cl=1;
				}
 			}
		}
}
else if(im1==im[11])
{
	if(cl==1)
	{
//		bo:
//		 for(i=0;i<=7;i++)
//		  {
//			  for(j=0;j<=7;j++)
//			  {
//				  if(b[i][j]==b1)
//				  {
//					  r1=i;
//					  c1=j;
//					  c="WN";
//					  cl=2;
//					  sic=im1;
//					  break bo;
//				  }
//			  }
//		  }
	}
	else
	{
		if(c.equalsIgnoreCase("BE"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
				{
					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
					{
						if(c1>c2)
						{
							for(i=c2+1;i<=c1-1;i++)
							{
								if(b[r1][i].getIcon()!=null)
								{
									break;
								}
							}
							if(i==c1)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
						else
						{
							for(i=c1+1;i<=c2-1;i++)
							{
								if(b[r1][i].getIcon()!=null)
								{
									break;
								}
							}
							if(i==c2)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
							
						}
					}
					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
					{
						if(r1>r2)
						{
							for(i=r2+1;i<=r1-1;i++)
							{
								if(b[i][c1].getIcon()!=null)
								{
									break;
								}
							}
							if(i==r1)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
						else
						{
							for(i=r1+1;i<=r2-1;i++)
							{
								if(b[i][c2].getIcon()!=null)
								{
									break;
								}
							}
							if(i==r2)
							{
								b[r2][c2].setIcon(sic);
		    					b[r1][c1].setIcon(null);
		    					cl=1;
		    					n=1;
		    					jp.updateTime(n);
							}
						}
					}
					
				}
				else
				{
					cl=1;
				}
			}
		
		else if(c.equalsIgnoreCase("BH"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
			
				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
				{
					b[r2][c2].setIcon(sic);
					b[r1][c1].setIcon(null);
					cl=1;
					n=1;
					jp.updateTime(n);
				}
				else
			{
				cl=1;
			}
			}
		
		else if(c.equalsIgnoreCase("BC"))
		{
			bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r2=i;
	    					  c2=j;
	    					  break bo;
	    				  }
	    			  }
	    		  }
			
			
				if((Math.abs(r1-r2)==Math.abs(c1-c2)))
				{
					if(r1<r2 && c1>c2)
					{
						int cc=c1,m=0;
						for(i=r1;i<=r2;i++)
						{
							if(b[i][cc].getIcon()!=null)
							{
								m+=1;
								if(m>2)
								break;
							}
							cc-=1;
						}
						if(m==2)
						{
							b[r2][c2].setIcon(sic);
		   					b[r1][c1].setIcon(null);
		   					cl=1;
		   					n=1;
		   					jp.updateTime(n);
						}
					}
					else if(r2>r1 && c2>c1)
					{
			            	int cc=c1,m=0;
	   						for(i=r1;i<=r2;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   							m+=1;
								if(m>2)
								break;
	   							}
	   							cc+=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
					}
					else if(r2<r1 && c2<c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc+=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
					}
					else if(r2<r1 && c2>c1)
					{
						int cc=c2,m=0;
   						for(i=r2;i<=r1;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc-=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
					}
					
				}
				else
			{
				cl=1;
			}
			}
			
		else if(c.equalsIgnoreCase("BQ"))
		{
			bo:
  	    		 for(i=0;i<=7;i++)
  	    		  {
  	    			  for(j=0;j<=7;j++)
  	    			  {
  	    				  if(b[i][j]==b1)
  	    				  {
  	    					  r2=i;
  	    					  c2=j;
  	    					  break bo;
  	    				  }
  	    			  }
  	    		  }
  			
			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
			{
				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
				{
					if(c1>c2)
					{
						for(i=c2+1;i<=c1-1;i++)
						{
							if(b[r1][i].getIcon()!=null)
							{
								break;
							}
						}
						if(i==c1)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
					else
					{
						for(i=c1+1;i<=c2-1;i++)
						{
							if(b[r1][i].getIcon()!=null)
							{
								break;
							}
						}
						if(i==c2)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
						
					}
				}
				else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
				{
					if(r1>r2)
					{
						for(i=r2+1;i<=r1-1;i++)
						{
							if(b[i][c1].getIcon()!=null)
							{
								break;
							}
						}
						if(i==r1)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
					else
					{
						for(i=r1+1;i<=r2-1;i++)
						{
							if(b[i][c2].getIcon()!=null)
							{
								break;
							}
						}
						if(i==r2)
						{
							b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=1;
	    					jp.updateTime(n);
						}
					}
				}
				
			}
  				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
   				{
   					if(r1<r2 && c1>c2)
   					{
   						int cc=c1,m=0;
   						for(i=r1;i<=r2;i++)
   						{
   							if(b[i][cc].getIcon()!=null)
   							{
   								m+=1;
   								if(m>2)
   								break;
   							}
   							cc-=1;
   						}
   						if(m==2)
   						{
   							b[r2][c2].setIcon(sic);
   		   					b[r1][c1].setIcon(null);
   		   					cl=1;
   		   					n=1;
   		   					jp.updateTime(n);
   						}
   					}
   					else if(r2>r1 && c2>c1)
   					{
   			            	int cc=c1,m=0;
   	   						for(i=r1;i<=r2;i++)
   	   						{
   	   							if(b[i][cc].getIcon()!=null)
   	   							{
   	   							m+=1;
   								if(m>2)
   								break;
   	   							}
   	   							cc+=1;
   	   						}
   	   						if(m==2)
   	   						{
   	   							b[r2][c2].setIcon(sic);
   	   		   					b[r1][c1].setIcon(null);
   	   		   					cl=1;
   	   		   					n=1;
   	   		   					jp.updateTime(n);
   	   						}
   					}
   					else if(r2<r1 && c2<c1)
   					{
   						int cc=c2,m=0;
	   						for(i=r2;i<=r1;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
	   								if(m>2)
	   								break;
	   							}
	   							cc+=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
   					}
   					else if(r2<r1 && c2>c1)
   					{
   						int cc=c2,m=0;
	   						for(i=r2;i<=r1;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
	   								if(m>2)
	   								break;
	   							}
	   							cc-=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=1;
	   		   					jp.updateTime(n);
	   						}
   					}
   				}
  				else
				{
					cl=1;
				}
  				
  			}
		
		else if(c.equalsIgnoreCase("BK"))
		{
			bo:
  	    		 for(i=0;i<=7;i++)
  	    		  {
  	    			  for(j=0;j<=7;j++)
  	    			  {
  	    				  if(b[i][j]==b1)
  	    				  {
  	    					  r2=i;
  	    					  c2=j;
  	    					  break bo;
  	    				  }
  	    			  }
  	    		  }
  			
  			
  				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
  				{
  					b[r2][c2].setIcon(sic);
  					b[r1][c1].setIcon(null);
  					cl=1;
  					n=1;
  					jp.updateTime(n);
  				}
  				else
				{
					cl=1;
				}
  			}
		
		else if(c.equalsIgnoreCase("BN"))
		{
			bo:
 	    		 for(i=0;i<=7;i++)
 	    		  {
 	    			  for(j=0;j<=7;j++)
 	    			  {
 	    				  if(b[i][j]==b1)
 	    				  {
 	    					  r2=i;
 	    					  c2=j;
 	    					  break bo;
 	    				  }
 	    			  }
 	    		  }
 				if((Math.abs(r1-r2)==1 && c1!=c2) && r2>r1)
 				{
 					b[r2][c2].setIcon(sic);
 					b[r1][c1].setIcon(null);
 					cl=1;
 					n=1;
 					if(r2==0)
 					{
 						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
 					}
 					jp.updateTime(n);
 				}
 				else
				{
					cl=1;
				}
 			}
		}
}
}

public void firstPlayer(JButton b1,ImageIcon im1)
{
	{
}
	    if(im1==im[0])
	    {
	    	if(cl==1)
	    	{
//	    		bo:
//	    		 for(i=0;i<=7;i++)
//	    		  {
//	    			  for(j=0;j<=7;j++)
//	    			  {
//	    				  if(b[i][j]==b1)
//	    				  {
//	    					  r1=i;
//	    					  c1=j;
//	    					  c="BE";
//	    					  sic=im1;
//	    					  cl=2;
//	    					  break bo;
//	    				  }
//	    			  }
//	    		  }
	    	}
	    	else
	    	{
	    		if(c.equalsIgnoreCase("WE"))
        		{
        			bo:
        	    		 for(i=0;i<=7;i++)
        	    		  {
        	    			  for(j=0;j<=7;j++)
        	    			  {
        	    				  if(b[i][j]==b1)
        	    				  {
        	    					  r2=i;
        	    					  c2=j;
        	    					  break bo;
        	    				  }
        	    			  }
        	    		  }
        			
        				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
        				{
        					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
        					{
        						if(c1>c2)
        						{
        							for(i=c2+1;i<=c1-1;i++)
        							{
        								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
        								if(ci!=null)
        								{
        									break;
        								}
        							}
        							if(i==c1)
        							{
        								b[r2][c2].setIcon(sic);
        		    					b[r1][c1].setIcon(null);
        		    					cl=1;
        		    					n=2;
        		    					jp.updateTime(n);
        							}
        						}
        						else
        						{
        							for(i=c1+1;i<=c2-1;i++)
        							{
        								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
        								if(ci!=null)
        								{
        									break;
        								}
        							}
        							if(i==c2)
        							{
        								b[r2][c2].setIcon(sic);
        		    					b[r1][c1].setIcon(null);
        		    					cl=1;
        		    					n=2;
        		    					jp.updateTime(n);
        							}
        							
        						}
        					}
        					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
        					{
        						if(r1>r2)
        						{

        							for(i=r2+1;i<=r1-1;i++)
        							{
        								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
    								if(ci!=null)
    								{
    		     						break;
    								}
        							}
        							if(i==r1)
        							{
        								b[r2][c2].setIcon(sic);
        		    					b[r1][c1].setIcon(null);
        		    					cl=1;
        		    					n=2;
        		    					jp.updateTime(n);
        							}
        						}
        						else
        						{
        							for(i=r1+1;i<=r2-1;i++)
        							{
        								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
        								if(ci!=null)
        								{
        									break;
        								}
        							}
        							if(i==r2)
        							{
        								b[r2][c2].setIcon(sic);
        		    					b[r1][c1].setIcon(null);
        		    					cl=1;
        		    					n=2;
        		    					jp.updateTime(n);
        							}
        						}
        					}
        					
        				}
        				else
        				{
        					cl=1;
        				}
        			}
        		
        		else if(c.equalsIgnoreCase("WH"))
        		{
        			bo:
       	    		 for(i=0;i<=7;i++)
       	    		  {
       	    			  for(j=0;j<=7;j++)
       	    			  {
       	    				  if(b[i][j]==b1)
       	    				  {
       	    					  r2=i;
       	    					  c2=j;
       	    					  break bo;
       	    				  }
       	    			  }
       	    		  }
       			
       			
       				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
       				{
       					b[r2][c2].setIcon(sic);
       					b[r1][c1].setIcon(null);
       					cl=1;
       					n=2;
       					jp.updateTime(n);
       				}
       				else
    				{
    					cl=1;
    				}
       			}
        		
        		else if(c.equalsIgnoreCase("WC"))
        		{
        			bo:
       	    		 for(i=0;i<=7;i++)
       	    		  {
       	    			  for(j=0;j<=7;j++)
       	    			  {
       	    				  if(b[i][j]==b1)
       	    				  {
       	    					  r2=i;
       	    					  c2=j;
       	    					  break bo;
       	    				  }
       	    			  }
       	    		  }
       			
       			
       				if((Math.abs(r1-r2)==Math.abs(c1-c2)))
       				{
       					if(r1<r2 && c1>c2)
       					{
       						
       						int cc=c1,m=0;
       						for(i=r1;i<=r2;i++)
       						{
       							if(b[i][cc].getIcon()!=null)
       							{
       								m+=1;
       								if(m>2)
       								break;
       							}
       							cc-=1;
       						}
       						if(m==2)
       						{
       							b[r2][c2].setIcon(sic);
       		   					b[r1][c1].setIcon(null);
       		   					cl=1;
       		   					n=2;
       		   					jp.updateTime(n);
       						}
       					}
       					else if(r2>r1 && c2>c1)
       					{
       			            	int cc=c1,m=0;
       	   						for(i=r1;i<=r2;i++)
       	   						{
       	   							if(b[i][cc].getIcon()!=null)
       	   							{
       	   							m+=1;
       								if(m>2)
       								break;
       	   							}
       	   							cc+=1;
       	   						}
       	   						if(m==2)
       	   						{
       	   							b[r2][c2].setIcon(sic);
       	   		   					b[r1][c1].setIcon(null);
       	   		   					cl=1;
       	   		   					n=2;
       	   		   					jp.updateTime(n);
       	   						}
       					}
       					else if(r2<r1 && c2<c1)
       					{
       						int cc=c2,m=0;
    	   						for(i=r2;i<=r1;i++)
    	   						{
    	   							if(b[i][cc].getIcon()!=null)
    	   							{
    	   								m+=1;
           								if(m>2)
           								break;
    	   							}
    	   							cc+=1;
    	   						}
    	   						if(m==2)
    	   						{
    	   							b[r2][c2].setIcon(sic);
    	   		   					b[r1][c1].setIcon(null);
    	   		   					cl=1;
    	   		   					n=2;
    	   		   					jp.updateTime(n);
    	   						}
       					}
       					else if(r2<r1 && c2>c1)
       					{
       						int cc=c2,m=0;
    	   						for(i=r2;i<=r1;i++)
    	   						{
    	   							if(b[i][cc].getIcon()!=null)
    	   							{
    	   								m+=1;
           								if(m>2)
           								break;
    	   							}
    	   							cc-=1;
    	   						}
    	   						if(m==2)
    	   						{
    	   							b[r2][c2].setIcon(sic);
    	   		   					b[r1][c1].setIcon(null);
    	   		   					cl=1;
    	   		   					n=2;
    	   		   					jp.updateTime(n);
    	   						}
       					}
       					
       				}
       				else
    				{
    					cl=1;
    				}
       			}
       			
        		else if(c.equalsIgnoreCase("WQ"))
        		{
        			bo:
          	    		 for(i=0;i<=7;i++)
          	    		  {
          	    			  for(j=0;j<=7;j++)
          	    			  {
          	    				  if(b[i][j]==b1)
          	    				  {
          	    					  r2=i;
          	    					  c2=j;
          	    					  break bo;
          	    				  }
          	    			  }
          	    		  }
          			
        			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    				{
    					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
    					{
    						if(c1>c2)
    						{
    							for(i=c2+1;i<=c1-1;i++)
    							{
    								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
    								if(ci!=null)
    								{
    									break;
    								}
    							}
    							if(i==c1)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    						else
    						{
    							for(i=c1+1;i<=c2-1;i++)
    							{
    								ImageIcon ci=(ImageIcon)b[r2][i].getIcon();
    								if(ci!=null)
    								{
    									break;
    								}
    							}
    							if(i==c2)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    							
    						}
    					}
    					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    					{
    						if(r1>r2)
    						{

    							for(i=r2+1;i<=r1-1;i++)
    							{
    								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
								if(ci!=null)
								{
		     						break;
								}
    							}
    							if(i==r1)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    						else
    						{
    							for(i=r1+1;i<=r2-1;i++)
    							{
    								ImageIcon ci=(ImageIcon)b[i][c2].getIcon();
    								if(ci!=null)
    								{
    									break;
    								}
    							}
    							if(i==r2)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    					}
    					
    				}
          				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
           				{
           					if(r1<r2 && c1>c2)
           					{
           						
           						int cc=c1,m=0;
           						for(i=r1;i<=r2;i++)
           						{
           							if(b[i][cc].getIcon()!=null)
           							{
           								m+=1;
           								if(m>2)
           								break;
           							}
           							cc-=1;
           						}
           						if(m==2)
           						{
           							b[r2][c2].setIcon(sic);
           		   					b[r1][c1].setIcon(null);
           		   					cl=1;
           		   					n=2;
           		   					jp.updateTime(n);
           						}
           					}
           					else if(r2>r1 && c2>c1)
           					{
           			            	int cc=c1,m=0;
           	   						for(i=r1;i<=r2;i++)
           	   						{
           	   							if(b[i][cc].getIcon()!=null)
           	   							{
           	   							m+=1;
           								if(m>2)
           								break;
           	   							}
           	   							cc+=1;
           	   						}
           	   						if(m==2)
           	   						{
           	   							b[r2][c2].setIcon(sic);
           	   		   					b[r1][c1].setIcon(null);
           	   		   					cl=1;
           	   		   					n=2;
           	   		   					jp.updateTime(n);
           	   						}
           					}
           					else if(r2<r1 && c2<c1)
           					{
           						int cc=c2,m=0;
        	   						for(i=r2;i<=r1;i++)
        	   						{
        	   							if(b[i][cc].getIcon()!=null)
        	   							{
        	   								m+=1;
               								if(m>2)
               								break;
        	   							}
        	   							cc+=1;
        	   						}
        	   						if(m==2)
        	   						{
        	   							b[r2][c2].setIcon(sic);
        	   		   					b[r1][c1].setIcon(null);
        	   		   					cl=1;
        	   		   					n=2;
        	   		   					jp.updateTime(n);
        	   						}
           					}
           					else if(r2<r1 && c2>c1)
           					{
           						int cc=c2,m=0;
        	   						for(i=r2;i<=r1;i++)
        	   						{
        	   							if(b[i][cc].getIcon()!=null)
        	   							{
        	   								m+=1;
               								if(m>2)
               								break;
        	   							}
        	   							cc-=1;
        	   						}
        	   						if(m==2)
        	   						{
        	   							b[r2][c2].setIcon(sic);
        	   		   					b[r1][c1].setIcon(null);
        	   		   					cl=1;
        	   		   					n=2;
        	   		   					jp.updateTime(n);
        	   						}
           					}
           					
           				}
          				else
        				{
        					cl=1;
        				}
          				
          			}
        		
        		else if(c.equalsIgnoreCase("WK"))
        		{
        			bo:
          	    		 for(i=0;i<=7;i++)
          	    		  {
          	    			  for(j=0;j<=7;j++)
          	    			  {
          	    				  if(b[i][j]==b1)
          	    				  {
          	    					  r2=i;
          	    					  c2=j;
          	    					  break bo;
          	    				  }
          	    			  }
          	    		  }
          			
          			
          				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
          				{
          					b[r2][c2].setIcon(sic);
          					b[r1][c1].setIcon(null);
          					cl=1;
          					n=2;
          					jp.updateTime(n);
          				}
          				else
        				{
        					cl=1;
        				}
          			}
        		
        		else if(c.equalsIgnoreCase("WN"))
        		{
        			bo:
         	    		 for(i=0;i<=7;i++)
         	    		  {
         	    			  for(j=0;j<=7;j++)
         	    			  {
         	    				  if(b[i][j]==b1)
         	    				  {
         	    					  r2=i;
         	    					  c2=j;
         	    					  break bo;
         	    				  }
         	    			  }
         	    		  }
         				if((Math.abs(r1-r2)==1 && c2!=c1) && (r2<r1))
                         {
          					
         					b[r2][c2].setIcon(sic);
         					b[r1][c1].setIcon(null);
         					cl=1;
         					n=2;
         					if(r2==0)
         					{
         						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
         					}
         					jp.updateTime(n);
         				}
         				else
        				{
        					cl=1;
        				}
         			}
        		}
	    	
	    }
	    else if(im1==im[1])
	    {
	    	if(cl==1)
	    	{
//	    		bo:
//	    		 for(i=0;i<=7;i++)
//	    		  {
//	    			  for(j=0;j<=7;j++)
//	    			  {
//	    				  if(b[i][j]==b1)
//	    				  {
//	    					  r1=i;
//	    					  c1=j;
//	    					  c="BC";
//	    					  cl=2;
//	    					  sic=im1;
//	    					  break bo;
//	    				  }
//	    			  }
//	    		  }
	    	}
	    	else
	    	{
	    		if(c.equalsIgnoreCase("WE"))
        		{
        			bo:
        	    		 for(i=0;i<=7;i++)
        	    		  {
        	    			  for(j=0;j<=7;j++)
        	    			  {
        	    				  if(b[i][j]==b1)
        	    				  {
        	    					  r2=i;
        	    					  c2=j;
        	    					  break bo;
        	    				  }
        	    			  }
        	    		  }
        			
        				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
        				{
        					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
        					{
        						if(c1>c2)
        						{
        							for(i=c2+1;i<=c1-1;i++)
        							{
        								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
        								if(ci!=null)
        								{
        									break;
        								}
        							}
        							if(i==c1)
        							{
        								b[r2][c2].setIcon(sic);
        		    					b[r1][c1].setIcon(null);
        		    					cl=1;
        		    					n=2;
        		    					jp.updateTime(n);
        							}
        						}
        						else
        						{
        							for(i=c1+1;i<=c2-1;i++)
        							{
        								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
        								if(ci!=null)
        								{
        									break;
        								}
        							}
        							if(i==c2)
        							{
        								b[r2][c2].setIcon(sic);
        		    					b[r1][c1].setIcon(null);
        		    					cl=1;
        		    					n=2;
        		    					jp.updateTime(n);
        							}
        							
        						}
        					}
        					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
        					{
        						if(r1>r2)
        						{

        							for(i=r2+1;i<=r1-1;i++)
        							{
        								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
    								if(ci!=null)
    								{
    		     						break;
    								}
        							}
        							if(i==r1)
        							{
        								b[r2][c2].setIcon(sic);
        		    					b[r1][c1].setIcon(null);
        		    					cl=1;
        		    					n=2;
        		    					jp.updateTime(n);
        							}
        						}
        						else
        						{
        							for(i=r1+1;i<=r2-1;i++)
        							{
        								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
        								if(ci!=null)
        								{
        									break;
        								}
        							}
        							if(i==r2)
        							{
        								b[r2][c2].setIcon(sic);
        		    					b[r1][c1].setIcon(null);
        		    					cl=1;
        		    					n=2;
        		    					jp.updateTime(n);
        							}
        						}
        					}
        					
        				}
        				else
        				{
        					cl=1;
        				}
        			}
        		
        		else if(c.equalsIgnoreCase("WH"))
        		{
        			bo:
       	    		 for(i=0;i<=7;i++)
       	    		  {
       	    			  for(j=0;j<=7;j++)
       	    			  {
       	    				  if(b[i][j]==b1)
       	    				  {
       	    					  r2=i;
       	    					  c2=j;
       	    					  break bo;
       	    				  }
       	    			  }
       	    		  }
       			
       			
       				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
       				{
       					b[r2][c2].setIcon(sic);
       					b[r1][c1].setIcon(null);
       					cl=1;
       					n=2;
       					jp.updateTime(n);
       				}
       				else
    				{
    					cl=1;
    				}
       			}
        		
        		else if(c.equalsIgnoreCase("WC"))
        		{
        			bo:
       	    		 for(i=0;i<=7;i++)
       	    		  {
       	    			  for(j=0;j<=7;j++)
       	    			  {
       	    				  if(b[i][j]==b1)
       	    				  {
       	    					  r2=i;
       	    					  c2=j;
       	    					  break bo;
       	    				  }
       	    			  }
       	    		  }
       			
       			
        			if((Math.abs(r1-r2)==Math.abs(c1-c2)))
       				{
       					if(r1<r2 && c1>c2)
       					{
       						
       						int cc=c1,m=0;
       						for(i=r1;i<=r2;i++)
       						{
       							if(b[i][cc].getIcon()!=null)
       							{
       								m+=1;
       								if(m>2)
       								break;
       							}
       							cc-=1;
       						}
       						if(m==2)
       						{
       							b[r2][c2].setIcon(sic);
       		   					b[r1][c1].setIcon(null);
       		   					cl=1;
       		   					n=2;
       		   					jp.updateTime(n);
       						}
       					}
       					else if(r2>r1 && c2>c1)
       					{
       			            	int cc=c1,m=0;
       	   						for(i=r1;i<=r2;i++)
       	   						{
       	   							if(b[i][cc].getIcon()!=null)
       	   							{
       	   							m+=1;
       								if(m>2)
       								break;
       	   							}
       	   							cc+=1;
       	   						}
       	   						if(m==2)
       	   						{
       	   							b[r2][c2].setIcon(sic);
       	   		   					b[r1][c1].setIcon(null);
       	   		   					cl=1;
       	   		   					n=2;
       	   		   					jp.updateTime(n);
       	   						}
       					}
       					else if(r2<r1 && c2<c1)
       					{
       						int cc=c2,m=0;
    	   						for(i=r2;i<=r1;i++)
    	   						{
    	   							if(b[i][cc].getIcon()!=null)
    	   							{
    	   								m+=1;
           								if(m>2)
           								break;
    	   							}
    	   							cc+=1;
    	   						}
    	   						if(m==2)
    	   						{
    	   							b[r2][c2].setIcon(sic);
    	   		   					b[r1][c1].setIcon(null);
    	   		   					cl=1;
    	   		   					n=2;
    	   		   					jp.updateTime(n);
    	   						}
       					}
       					else if(r2<r1 && c2>c1)
       					{
       						int cc=c2,m=0;
    	   						for(i=r2;i<=r1;i++)
    	   						{
    	   							if(b[i][cc].getIcon()!=null)
    	   							{
    	   								m+=1;
           								if(m>2)
           								break;
    	   							}
    	   							cc-=1;
    	   						}
    	   						if(m==2)
    	   						{
    	   							b[r2][c2].setIcon(sic);
    	   		   					b[r1][c1].setIcon(null);
    	   		   					cl=1;
    	   		   					n=2;
    	   		   					jp.updateTime(n);
    	   						}
       					}
       					
       				}
       				else
    				{
    					cl=1;
    				}
       			}
       			
        		else if(c.equalsIgnoreCase("WQ"))
        		{
        			bo:
          	    		 for(i=0;i<=7;i++)
          	    		  {
          	    			  for(j=0;j<=7;j++)
          	    			  {
          	    				  if(b[i][j]==b1)
          	    				  {
          	    					  r2=i;
          	    					  c2=j;
          	    					  break bo;
          	    				  }
          	    			  }
          	    		  }
          			
        			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    				{
    					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
    					{
    						if(c1>c2)
    						{
    							for(i=c2+1;i<=c1-1;i++)
    							{
    								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
    								if(ci!=null)
    								{
    									break;
    								}
    							}
    							if(i==c1)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    						else
    						{
    							for(i=c1+1;i<=c2-1;i++)
    							{
    								ImageIcon ci=(ImageIcon)b[r2][i].getIcon();
    								if(ci!=null)
    								{
    									break;
    								}
    							}
    							if(i==c2)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    							
    						}
    					}
    					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    					{
    						if(r1>r2)
    						{

    							for(i=r2+1;i<=r1-1;i++)
    							{
    								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
								if(ci!=null)
								{
		     						break;
								}
    							}
    							if(i==r1)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    						else
    						{
    							for(i=r1+1;i<=r2-1;i++)
    							{
    								ImageIcon ci=(ImageIcon)b[i][c2].getIcon();
    								if(ci!=null)
    								{
    									break;
    								}
    							}
    							if(i==r2)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    					}
    					
    				}
          				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
           				{
           					if(r1<r2 && c1>c2)
           					{
           						
           						int cc=c1,m=0;
           						for(i=r1;i<=r2;i++)
           						{
           							if(b[i][cc].getIcon()!=null)
           							{
           								m+=1;
           								if(m>2)
           								break;
           							}
           							cc-=1;
           						}
           						if(m==2)
           						{
           							b[r2][c2].setIcon(sic);
           		   					b[r1][c1].setIcon(null);
           		   					cl=1;
           		   					n=2;
           		   					jp.updateTime(n);
           						}
           					}
           					else if(r2>r1 && c2>c1)
           					{
           			            	int cc=c1,m=0;
           	   						for(i=r1;i<=r2;i++)
           	   						{
           	   							if(b[i][cc].getIcon()!=null)
           	   							{
           	   							m+=1;
           								if(m>2)
           								break;
           	   							}
           	   							cc+=1;
           	   						}
           	   						if(m==2)
           	   						{
           	   							b[r2][c2].setIcon(sic);
           	   		   					b[r1][c1].setIcon(null);
           	   		   					cl=1;
           	   		   					n=2;
           	   		   					jp.updateTime(n);
           	   						}
           					}
           					else if(r2<r1 && c2<c1)
           					{
           						int cc=c2,m=0;
        	   						for(i=r2;i<=r1;i++)
        	   						{
        	   							if(b[i][cc].getIcon()!=null)
        	   							{
        	   								m+=1;
               								if(m>2)
               								break;
        	   							}
        	   							cc+=1;
        	   						}
        	   						if(m==2)
        	   						{
        	   							b[r2][c2].setIcon(sic);
        	   		   					b[r1][c1].setIcon(null);
        	   		   					cl=1;
        	   		   					n=2;
        	   		   					jp.updateTime(n);
        	   						}
           					}
           					else if(r2<r1 && c2>c1)
           					{
           						int cc=c2,m=0;
        	   						for(i=r2;i<=r1;i++)
        	   						{
        	   							if(b[i][cc].getIcon()!=null)
        	   							{
        	   								m+=1;
               								if(m>2)
               								break;
        	   							}
        	   							cc-=1;
        	   						}
        	   						if(m==2)
        	   						{
        	   							b[r2][c2].setIcon(sic);
        	   		   					b[r1][c1].setIcon(null);
        	   		   					cl=1;
        	   		   					n=2;
        	   		   					jp.updateTime(n);
        	   						}
           					}
           					
           				}
          				else
        				{
        					cl=1;
        				}
          				
          			}
        		
        		else if(c.equalsIgnoreCase("WK"))
        		{
        			bo:
          	    		 for(i=0;i<=7;i++)
          	    		  {
          	    			  for(j=0;j<=7;j++)
          	    			  {
          	    				  if(b[i][j]==b1)
          	    				  {
          	    					  r2=i;
          	    					  c2=j;
          	    					  break bo;
          	    				  }
          	    			  }
          	    		  }
          			
          			
          				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0 || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1)))
          				{
          					b[r2][c2].setIcon(sic);
          					b[r1][c1].setIcon(null);
          					cl=1;
          					n=2;
          					jp.updateTime(n);
          				}
          				else
        				{
        					cl=1;
        				}
          			}
        		
        		else if(c.equalsIgnoreCase("WN"))
        		{
        			bo:
         	    		 for(i=0;i<=7;i++)
         	    		  {
         	    			  for(j=0;j<=7;j++)
         	    			  {
         	    				  if(b[i][j]==b1)
         	    				  {
         	    					  r2=i;
         	    					  c2=j;
         	    					  break bo;
         	    				  }
         	    			  }
         	    		  }
         				if((Math.abs(r1-r2)==1 && c1!=c2) && (r2<r1))
                         {
          					
         					b[r2][c2].setIcon(sic);
         					b[r1][c1].setIcon(null);
         					cl=1;
         					n=2;
         					if(r2==0)
         					{
         						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
         					}
         					jp.updateTime(n);
         				}
         				else
        				{
        					cl=1;
        				}
         			}
        		}
	    	}
	    	
	    
	    else if(im1==im[2])
	    {
	    	if(cl==1)
	    	{
//	    		bo:
//	    		 for(i=0;i<=7;i++)
//	    		  {
//	    			  for(j=0;j<=7;j++)
//	    			  {
//	    				  if(b[i][j]==b1)
//	    				  {
//	    					  r1=i;
//	    					  c1=j;
//	    					  c="BH";
//	    					  cl=2;
//	    					  sic=im1;
//	    					  break bo;
//	    				  }
//	    			  }
//	    		  }
	    	}
	    	else
	    	{
	    		if(c.equalsIgnoreCase("WE"))
        		{
        			bo:
        	    		 for(i=0;i<=7;i++)
        	    		  {
        	    			  for(j=0;j<=7;j++)
        	    			  {
        	    				  if(b[i][j]==b1)
        	    				  {
        	    					  r2=i;
        	    					  c2=j;
        	    					  break bo;
        	    				  }
        	    			  }
        	    		  }
        			
        				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
        				{
        					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
        					{
        						if(c1>c2)
        						{
        							for(i=c2+1;i<=c1-1;i++)
        							{
        								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
        								if(ci!=null)
        								{
        									break;
        								}
        							}
        							if(i==c1)
        							{
        								b[r2][c2].setIcon(sic);
        		    					b[r1][c1].setIcon(null);
        		    					cl=1;
        		    					n=2;
        		    					jp.updateTime(n);
        							}
        						}
        						else
        						{
        							for(i=c1+1;i<=c2-1;i++)
        							{
        								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
        								if(ci!=null)
        								{
        									break;
        								}
        							}
        							if(i==c2)
        							{
        								b[r2][c2].setIcon(sic);
        		    					b[r1][c1].setIcon(null);
        		    					cl=1;
        		    					n=2;
        		    					jp.updateTime(n);
        							}
        							
        						}
        					}
        					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
        					{
        						if(r1>r2)
        						{

        							for(i=r2+1;i<=r1-1;i++)
        							{
        								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
    								if(ci!=null)
    								{
    		     						break;
    								}
        							}
        							if(i==r1)
        							{
        								b[r2][c2].setIcon(sic);
        		    					b[r1][c1].setIcon(null);
        		    					cl=1;
        		    					n=2;
        		    					jp.updateTime(n);
        							}
        						}
        						else
        						{
        							for(i=r1+1;i<=r2-1;i++)
        							{
        								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
        								if(ci!=null)
        								{
        									break;
        								}
        							}
        							if(i==r2)
        							{
        								b[r2][c2].setIcon(sic);
        		    					b[r1][c1].setIcon(null);
        		    					cl=1;
        		    					n=2;
        		    					jp.updateTime(n);
        							}
        						}
        					}
        					
        				}
        				else
        				{
        					cl=1;
        				}
        			}
        		
        		else if(c.equalsIgnoreCase("WH"))
        		{
        			bo:
       	    		 for(i=0;i<=7;i++)
       	    		  {
       	    			  for(j=0;j<=7;j++)
       	    			  {
       	    				  if(b[i][j]==b1)
       	    				  {
       	    					  r2=i;
       	    					  c2=j;
       	    					  break bo;
       	    				  }
       	    			  }
       	    		  }
       			
       			
       				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
       				{
       					b[r2][c2].setIcon(sic);
       					b[r1][c1].setIcon(null);
       					cl=1;
       					n=2;
       					jp.updateTime(n);
       				}
       				else
    				{
    					cl=1;
    				}
       			}
        		
        		else if(c.equalsIgnoreCase("WC"))
        		{
        			bo:
       	    		 for(i=0;i<=7;i++)
       	    		  {
       	    			  for(j=0;j<=7;j++)
       	    			  {
       	    				  if(b[i][j]==b1)
       	    				  {
       	    					  r2=i;
       	    					  c2=j;
       	    					  break bo;
       	    				  }
       	    			  }
       	    		  }
       			
       			
        			if((Math.abs(r1-r2)==Math.abs(c1-c2)))
       				{
       					if(r1<r2 && c1>c2)
       					{
       						
       						int cc=c1,m=0;
       						for(i=r1;i<=r2;i++)
       						{
       							if(b[i][cc].getIcon()!=null)
       							{
       								m+=1;
       								if(m>2)
       								break;
       							}
       							cc-=1;
       						}
       						if(m==2)
       						{
       							b[r2][c2].setIcon(sic);
       		   					b[r1][c1].setIcon(null);
       		   					cl=1;
       		   					n=2;
       		   					jp.updateTime(n);
       						}
       					}
       					else if(r2>r1 && c2>c1)
       					{
       			            	int cc=c1,m=0;
       	   						for(i=r1;i<=r2;i++)
       	   						{
       	   							if(b[i][cc].getIcon()!=null)
       	   							{
       	   							m+=1;
       								if(m>2)
       								break;
       	   							}
       	   							cc+=1;
       	   						}
       	   						if(m==2)
       	   						{
       	   							b[r2][c2].setIcon(sic);
       	   		   					b[r1][c1].setIcon(null);
       	   		   					cl=1;
       	   		   					n=2;
       	   		   					jp.updateTime(n);
       	   						}
       					}
       					else if(r2<r1 && c2<c1)
       					{
       						int cc=c2,m=0;
    	   						for(i=r2;i<=r1;i++)
    	   						{
    	   							if(b[i][cc].getIcon()!=null)
    	   							{
    	   								m+=1;
           								if(m>2)
           								break;
    	   							}
    	   							cc+=1;
    	   						}
    	   						if(m==2)
    	   						{
    	   							b[r2][c2].setIcon(sic);
    	   		   					b[r1][c1].setIcon(null);
    	   		   					cl=1;
    	   		   					n=2;
    	   		   					jp.updateTime(n);
    	   						}
       					}
       					else if(r2<r1 && c2>c1)
       					{
       						int cc=c2,m=0;
    	   						for(i=r2;i<=r1;i++)
    	   						{
    	   							if(b[i][cc].getIcon()!=null)
    	   							{
    	   								m+=1;
           								if(m>2)
           								break;
    	   							}
    	   							cc-=1;
    	   						}
    	   						if(m==2)
    	   						{
    	   							b[r2][c2].setIcon(sic);
    	   		   					b[r1][c1].setIcon(null);
    	   		   					cl=1;
    	   		   					n=2;
    	   		   					jp.updateTime(n);
    	   						}
       					}
       					
       				}
       				else
    				{
    					cl=1;
    				}
       			}
       			
        		else if(c.equalsIgnoreCase("WQ"))
        		{
        			bo:
          	    		 for(i=0;i<=7;i++)
          	    		  {
          	    			  for(j=0;j<=7;j++)
          	    			  {
          	    				  if(b[i][j]==b1)
          	    				  {
          	    					  r2=i;
          	    					  c2=j;
          	    					  break bo;
          	    				  }
          	    			  }
          	    		  }
          			
        			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    				{
    					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
    					{
    						if(c1>c2)
    						{
    							for(i=c2+1;i<=c1-1;i++)
    							{
    								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
    								if(ci!=null)
    								{
    									break;
    								}
    							}
    							if(i==c1)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    						else
    						{
    							for(i=c1+1;i<=c2-1;i++)
    							{
    								ImageIcon ci=(ImageIcon)b[r2][i].getIcon();
    								if(ci!=null)
    								{
    									break;
    								}
    							}
    							if(i==c2)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    							
    						}
    					}
    					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    					{
    						if(r1>r2)
    						{

    							for(i=r2+1;i<=r1-1;i++)
    							{
    								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
								if(ci!=null)
								{
		     						break;
								}
    							}
    							if(i==r1)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    						else
    						{
    							for(i=r1+1;i<=r2-1;i++)
    							{
    								ImageIcon ci=(ImageIcon)b[i][c2].getIcon();
    								if(ci!=null)
    								{
    									break;
    								}
    							}
    							if(i==r2)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    					}
    					
    				}
          				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
           				{
           					if(r1<r2 && c1>c2)
           					{
           						
           						int cc=c1,m=0;
           						for(i=r1;i<=r2;i++)
           						{
           							if(b[i][cc].getIcon()!=null)
           							{
           								m+=1;
           								if(m>2)
           								break;
           							}
           							cc-=1;
           						}
           						if(m==2)
           						{
           							b[r2][c2].setIcon(sic);
           		   					b[r1][c1].setIcon(null);
           		   					cl=1;
           		   					n=2;
           		   					jp.updateTime(n);
           						}
           					}
           					else if(r2>r1 && c2>c1)
           					{
           			            	int cc=c1,m=0;
           	   						for(i=r1;i<=r2;i++)
           	   						{
           	   							if(b[i][cc].getIcon()!=null)
           	   							{
           	   							m+=1;
           								if(m>2)
           								break;
           	   							}
           	   							cc+=1;
           	   						}
           	   						if(m==2)
           	   						{
           	   							b[r2][c2].setIcon(sic);
           	   		   					b[r1][c1].setIcon(null);
           	   		   					cl=1;
           	   		   					n=2;
           	   		   					jp.updateTime(n);
           	   						}
           					}
           					else if(r2<r1 && c2<c1)
           					{
           						int cc=c2,m=0;
        	   						for(i=r2;i<=r1;i++)
        	   						{
        	   							if(b[i][cc].getIcon()!=null)
        	   							{
        	   								m+=1;
               								if(m>2)
               								break;
        	   							}
        	   							cc+=1;
        	   						}
        	   						if(m==2)
        	   						{
        	   							b[r2][c2].setIcon(sic);
        	   		   					b[r1][c1].setIcon(null);
        	   		   					cl=1;
        	   		   					n=2;
        	   		   					jp.updateTime(n);
        	   						}
           					}
           					else if(r2<r1 && c2>c1)
           					{
           						int cc=c2,m=0;
        	   						for(i=r2;i<=r1;i++)
        	   						{
        	   							if(b[i][cc].getIcon()!=null)
        	   							{
        	   								m+=1;
               								if(m>2)
               								break;
        	   							}
        	   							cc-=1;
        	   						}
        	   						if(m==2)
        	   						{
        	   							b[r2][c2].setIcon(sic);
        	   		   					b[r1][c1].setIcon(null);
        	   		   					cl=1;
        	   		   					n=2;
        	   		   					jp.updateTime(n);
        	   						}
           					}
           					
           				}
          				else
        				{
        					cl=1;
        				}
          				
          			}
        		
        		else if(c.equalsIgnoreCase("WK"))
        		{
        			bo:
          	    		 for(i=0;i<=7;i++)
          	    		  {
          	    			  for(j=0;j<=7;j++)
          	    			  {
          	    				  if(b[i][j]==b1)
          	    				  {
          	    					  r2=i;
          	    					  c2=j;
          	    					  break bo;
          	    				  }
          	    			  }
          	    		  }
          			
          			
          				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
          				{
          					b[r2][c2].setIcon(sic);
          					b[r1][c1].setIcon(null);
          					cl=1;
          					n=2;
          					jp.updateTime(n);
          				}
          				else
        				{
        					cl=1;
        				}
          			}
        		
        		else if(c.equalsIgnoreCase("WN"))
        		{
        			bo:
         	    		 for(i=0;i<=7;i++)
         	    		  {
         	    			  for(j=0;j<=7;j++)
         	    			  {
         	    				  if(b[i][j]==b1)
         	    				  {
         	    					  r2=i;
         	    					  c2=j;
         	    					  break bo;
         	    				  }
         	    			  }
         	    		  }
         				if((Math.abs(r1-r2)==1 && c1!=c2) && (r2<r1))
                         {
          					
         					b[r2][c2].setIcon(sic);
         					b[r1][c1].setIcon(null);
         					cl=1;
         					n=2;
         					if(r2==0)
         					{
         						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
         					}
         					jp.updateTime(n);
         				}
         				else
        				{
        					cl=1;
        				}
         			}
        		}
	    	}
	    
	    else if(im1==im[3])
	    {
	    	if(cl==1)
	    	{
//	    		bo:
//	    		 for(i=0;i<=7;i++)
//	    		  {
//	    			  for(j=0;j<=7;j++)
//	    			  {
//	    				  if(b[i][j]==b1)
//	    				  {
//	    					  r1=i;
//	    					  c1=j;
//	    					  c="BQ";
//	    					  cl=2;
//	    					  sic=im1;
//	    					  break bo;
//	    				  }
//	    			  }
//	    		  }
	    	}
	    	else
	    	{
	    		if(c.equalsIgnoreCase("WE"))
        		{
        			bo:
        	    		 for(i=0;i<=7;i++)
        	    		  {
        	    			  for(j=0;j<=7;j++)
        	    			  {
        	    				  if(b[i][j]==b1)
        	    				  {
        	    					  r2=i;
        	    					  c2=j;
        	    					  break bo;
        	    				  }
        	    			  }
        	    		  }
        			
        				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
        				{
        					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
        					{
        						if(c1>c2)
        						{
        							for(i=c2+1;i<=c1-1;i++)
        							{
        								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
        								if(ci!=null)
        								{
        									break;
        								}
        							}
        							if(i==c1)
        							{
        								b[r2][c2].setIcon(sic);
        		    					b[r1][c1].setIcon(null);
        		    					cl=1;
        		    					n=2;
        		    					jp.updateTime(n);
        							}
        						}
        						else
        						{
        							for(i=c1+1;i<=c2-1;i++)
        							{
        								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
        								if(ci!=null)
        								{
        									break;
        								}
        							}
        							if(i==c2)
        							{
        								b[r2][c2].setIcon(sic);
        		    					b[r1][c1].setIcon(null);
        		    					cl=1;
        		    					n=2;
        		    					jp.updateTime(n);
        							}
        							
        						}
        					}
        					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
        					{
        						if(r1>r2)
        						{

        							for(i=r2+1;i<=r1-1;i++)
        							{
        								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
    								if(ci!=null)
    								{
    		     						break;
    								}
        							}
        							if(i==r1)
        							{
        								b[r2][c2].setIcon(sic);
        		    					b[r1][c1].setIcon(null);
        		    					cl=1;
        		    					n=2;
        		    					jp.updateTime(n);
        							}
        						}
        						else
        						{
        							for(i=r1+1;i<=r2-1;i++)
        							{
        								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
        								if(ci!=null)
        								{
        									break;
        								}
        							}
        							if(i==r2)
        							{
        								b[r2][c2].setIcon(sic);
        		    					b[r1][c1].setIcon(null);
        		    					cl=1;
        		    					n=2;
        		    					jp.updateTime(n);
        							}
        						}
        					}
        					
        				}
        				else
        				{
        					cl=1;
        				}
        			}
        		
        		else if(c.equalsIgnoreCase("WH"))
        		{
        			bo:
       	    		 for(i=0;i<=7;i++)
       	    		  {
       	    			  for(j=0;j<=7;j++)
       	    			  {
       	    				  if(b[i][j]==b1)
       	    				  {
       	    					  r2=i;
       	    					  c2=j;
       	    					  break bo;
       	    				  }
       	    			  }
       	    		  }
       			
       			
       				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
       				{
       					b[r2][c2].setIcon(sic);
       					b[r1][c1].setIcon(null);
       					cl=1;
       					n=2;
       					jp.updateTime(n);
       				}
       				else
    				{
    					cl=1;
    				}
       			}
        		
        		else if(c.equalsIgnoreCase("WC"))
        		{
        			bo:
       	    		 for(i=0;i<=7;i++)
       	    		  {
       	    			  for(j=0;j<=7;j++)
       	    			  {
       	    				  if(b[i][j]==b1)
       	    				  {
       	    					  r2=i;
       	    					  c2=j;
       	    					  break bo;
       	    				  }
       	    			  }
       	    		  }
       			
       			
        			if((Math.abs(r1-r2)==Math.abs(c1-c2)))
       				{
       					if(r1<r2 && c1>c2)
       					{
       						
       						int cc=c1,m=0;
       						for(i=r1;i<=r2;i++)
       						{
       							if(b[i][cc].getIcon()!=null)
       							{
       								m+=1;
       								if(m>2)
       								break;
       							}
       							cc-=1;
       						}
       						if(m==2)
       						{
       							b[r2][c2].setIcon(sic);
       		   					b[r1][c1].setIcon(null);
       		   					cl=1;
       		   					n=2;
       		   					jp.updateTime(n);
       						}
       					}
       					else if(r2>r1 && c2>c1)
       					{
       			            	int cc=c1,m=0;
       	   						for(i=r1;i<=r2;i++)
       	   						{
       	   							if(b[i][cc].getIcon()!=null)
       	   							{
       	   							m+=1;
       								if(m>2)
       								break;
       	   							}
       	   							cc+=1;
       	   						}
       	   						if(m==2)
       	   						{
       	   							b[r2][c2].setIcon(sic);
       	   		   					b[r1][c1].setIcon(null);
       	   		   					cl=1;
       	   		   					n=2;
       	   		   					jp.updateTime(n);
       	   						}
       					}
       					else if(r2<r1 && c2<c1)
       					{
       						int cc=c2,m=0;
    	   						for(i=r2;i<=r1;i++)
    	   						{
    	   							if(b[i][cc].getIcon()!=null)
    	   							{
    	   								m+=1;
           								if(m>2)
           								break;
    	   							}
    	   							cc+=1;
    	   						}
    	   						if(m==2)
    	   						{
    	   							b[r2][c2].setIcon(sic);
    	   		   					b[r1][c1].setIcon(null);
    	   		   					cl=1;
    	   		   					n=2;
    	   		   					jp.updateTime(n);
    	   						}
       					}
       					else if(r2<r1 && c2>c1)
       					{
       						int cc=c2,m=0;
    	   						for(i=r2;i<=r1;i++)
    	   						{
    	   							if(b[i][cc].getIcon()!=null)
    	   							{
    	   								m+=1;
           								if(m>2)
           								break;
    	   							}
    	   							cc-=1;
    	   						}
    	   						if(m==2)
    	   						{
    	   							b[r2][c2].setIcon(sic);
    	   		   					b[r1][c1].setIcon(null);
    	   		   					cl=1;
    	   		   					n=2;
    	   		   					jp.updateTime(n);
    	   						}
       					}
       					
       				}
       				else
    				{
    					cl=1;
    				}
       			}
       			
        		else if(c.equalsIgnoreCase("WQ"))
        		{
        			bo:
          	    		 for(i=0;i<=7;i++)
          	    		  {
          	    			  for(j=0;j<=7;j++)
          	    			  {
          	    				  if(b[i][j]==b1)
          	    				  {
          	    					  r2=i;
          	    					  c2=j;
          	    					  break bo;
          	    				  }
          	    			  }
          	    		  }
          			
        			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    				{
    					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
    					{
    						if(c1>c2)
    						{
    							for(i=c2+1;i<=c1-1;i++)
    							{
    								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
    								if(ci!=null)
    								{
    									break;
    								}
    							}
    							if(i==c1)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    						else
    						{
    							for(i=c1+1;i<=c2-1;i++)
    							{
    								ImageIcon ci=(ImageIcon)b[r2][i].getIcon();
    								if(ci!=null)
    								{
    									break;
    								}
    							}
    							if(i==c2)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    							
    						}
    					}
    					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    					{
    						if(r1>r2)
    						{

    							for(i=r2+1;i<=r1-1;i++)
    							{
    								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
								if(ci!=null)
								{
		     						break;
								}
    							}
    							if(i==r1)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    						else
    						{
    							for(i=r1+1;i<=r2-1;i++)
    							{
    								ImageIcon ci=(ImageIcon)b[i][c2].getIcon();
    								if(ci!=null)
    								{
    									break;
    								}
    							}
    							if(i==r2)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    					}
    					
    				}
          				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
           				{
           					if(r1<r2 && c1>c2)
           					{
           						
           						int cc=c1,m=0;
           						for(i=r1;i<=r2;i++)
           						{
           							if(b[i][cc].getIcon()!=null)
           							{
           								m+=1;
           								if(m>2)
           								break;
           							}
           							cc-=1;
           						}
           						if(m==2)
           						{
           							b[r2][c2].setIcon(sic);
           		   					b[r1][c1].setIcon(null);
           		   					cl=1;
           		   					n=2;
           		   					jp.updateTime(n);
           						}
           					}
           					else if(r2>r1 && c2>c1)
           					{
           			            	int cc=c1,m=0;
           	   						for(i=r1;i<=r2;i++)
           	   						{
           	   							if(b[i][cc].getIcon()!=null)
           	   							{
           	   							m+=1;
           								if(m>2)
           								break;
           	   							}
           	   							cc+=1;
           	   						}
           	   						if(m==2)
           	   						{
           	   							b[r2][c2].setIcon(sic);
           	   		   					b[r1][c1].setIcon(null);
           	   		   					cl=1;
           	   		   					n=2;
           	   		   					jp.updateTime(n);
           	   						}
           					}
           					else if(r2<r1 && c2<c1)
           					{
           						int cc=c2,m=0;
        	   						for(i=r2;i<=r1;i++)
        	   						{
        	   							if(b[i][cc].getIcon()!=null)
        	   							{
        	   								m+=1;
               								if(m>2)
               								break;
        	   							}
        	   							cc+=1;
        	   						}
        	   						if(m==2)
        	   						{
        	   							b[r2][c2].setIcon(sic);
        	   		   					b[r1][c1].setIcon(null);
        	   		   					cl=1;
        	   		   					n=2;
        	   		   					jp.updateTime(n);
        	   						}
           					}
           					else if(r2<r1 && c2>c1)
           					{
           						int cc=c2,m=0;
        	   						for(i=r2;i<=r1;i++)
        	   						{
        	   							if(b[i][cc].getIcon()!=null)
        	   							{
        	   								m+=1;
               								if(m>2)
               								break;
        	   							}
        	   							cc-=1;
        	   						}
        	   						if(m==2)
        	   						{
        	   							b[r2][c2].setIcon(sic);
        	   		   					b[r1][c1].setIcon(null);
        	   		   					cl=1;
        	   		   					n=2;
        	   		   					jp.updateTime(n);
        	   						}
           					}
           					
           				}
          				else
        				{
        					cl=1;
        				}
          				
          			}
        		
        		else if(c.equalsIgnoreCase("WK"))
        		{
        			bo:
          	    		 for(i=0;i<=7;i++)
          	    		  {
          	    			  for(j=0;j<=7;j++)
          	    			  {
          	    				  if(b[i][j]==b1)
          	    				  {
          	    					  r2=i;
          	    					  c2=j;
          	    					  break bo;
          	    				  }
          	    			  }
          	    		  }
          			
          			
          				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
          				{
          					b[r2][c2].setIcon(sic);
          					b[r1][c1].setIcon(null);
          					cl=1;
          					n=2;
          					jp.updateTime(n);
          				}
          				else
        				{
        					cl=1;
        				}
          			}
        		
        		else if(c.equalsIgnoreCase("WN"))
        		{
        			bo:
         	    		 for(i=0;i<=7;i++)
         	    		  {
         	    			  for(j=0;j<=7;j++)
         	    			  {
         	    				  if(b[i][j]==b1)
         	    				  {
         	    					  r2=i;
         	    					  c2=j;
         	    					  break bo;
         	    				  }
         	    			  }
         	    		  }
         				if((Math.abs(r1-r2)==1 && c1!=c2) && (r2<r1))
                         {
          					
         					b[r2][c2].setIcon(sic);
         					b[r1][c1].setIcon(null);
         					cl=1;
         					n=2;
         					if(r2==0)
         					{
         						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
         					}
         					jp.updateTime(n);
         				}
         				else
        				{
        					cl=1;
        				}
         			}
        		}
	    	}
	    	
	    else if(im1==im[4])
	    {
	    	if(cl==1)
	    	{
//	    		bo:
//	    		 for(i=0;i<=7;i++)
//	    		  {
//	    			  for(j=0;j<=7;j++)
//	    			  {
//	    				  if(b[i][j]==b1)
//	    				  {
//	    					  r1=i;
//	    					  c1=j;
//	    					  c="BK";
//	    					  cl=2;
//	    					  sic=im1;
//	    					  break bo;
//	    				  }
//	    			  }
//	    		  }
	    	}
	    	else
	    	{
	    		if(c.equalsIgnoreCase("WE"))
	    		{
	    			bo:
	    	    		 for(i=0;i<=7;i++)
	    	    		  {
	    	    			  for(j=0;j<=7;j++)
	    	    			  {
	    	    				  if(b[i][j]==b1)
	    	    				  {
	    	    					  r2=i;
	    	    					  c2=j;
	    	    					  break bo;
	    	    				  }
	    	    			  }
	    	    		  }
	    		
	    				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
	    				{
	    					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
	    					{
	    						if(c1>c2)
	    						{
	    							for(i=c2+1;i<=c1-1;i++)
	    							{
	    								if(b[r1][i].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==c1)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    		    					 jp.resultWindow("CheckMate",1);
	    							}
	    						}
	    						else
	    						{
	    							for(i=c1+1;i<=c2-1;i++)
	    							{
	    								if(b[r1][i].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==c2)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    		    					 jp.resultWindow("CheckMate",1);
	    							}
	    							
	    						}
	    					}
	    					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
	    					{
	    						if(r1>r2)
	    						{
	    							for(i=r2+1;i<=r1-1;i++)
	    							{
	    								if(b[i][c1].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==r1)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    		    					 jp.resultWindow("CheckMate",1);
	    							}
	    						}
	    						else
	    						{
	    							for(i=r1+1;i<=r2-1;i++)
	    							{
	    								if(b[i][c1].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==r2)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    		    					 jp.resultWindow("CheckMate",1);
	    							}
	    						}
	    					}
	    					
	    				}
	    				else
	    				{
	    					cl=1;
	    				}
	    			}
	    		else if(c.equalsIgnoreCase("WH"))
	    		{
	    			bo:
	   	    		 for(i=0;i<=7;i++)
	   	    		  {
	   	    			  for(j=0;j<=7;j++)
	   	    			  {
	   	    				  if(b[i][j]==b1)
	   	    				  {
	   	    					  r2=i;
	   	    					  c2=j;
	   	    					  break bo;
	   	    				  }
	   	    			  }
	   	    		  }
	   			
	   				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
	   				{
	   					b[r2][c2].setIcon(sic);
	   					b[r1][c1].setIcon(null);
	   					cl=1;
	   					n=2;
	   					jp.updateTime(n);
   					 jp.resultWindow("CheckMate",1);
	   				}
	   				else
					{
						cl=1;
					}
	   			}
	    		
	    		else if(c.equalsIgnoreCase("WC"))
	    		{
	    			bo:
	   	    		 for(i=0;i<=7;i++)
	   	    		  {
	   	    			  for(j=0;j<=7;j++)
	   	    			  {
	   	    				  if(b[i][j]==b1)
	   	    				  {
	   	    					  r2=i;
	   	    					  c2=j;
	   	    					  break bo;
	   	    				  }
	   	    			  }
	   	    		  }
	   			
	   			
	   				if((Math.abs(r1-r2)==Math.abs(c1-c2)))
	   				{
	   					if(r1<r2 && c1>c2)
	   					{
	   						int cc=c1,m=0;
	   						for(i=r1;i<=r2;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
	   								if(m>2)
	   								break;
	   							}
	   							cc-=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=2;
	   		   					jp.updateTime(n);
		    					 jp.resultWindow("CheckMate",1);
	   						}
	   					}
	   					else if(r2>r1 && c2>c1)
	   					{
	   			            	int cc=c1,m=0;
	   	   						for(i=r1;i<=r2;i++)
	   	   						{
	   	   							if(b[i][cc].getIcon()!=null)
	   	   							{
	   	   							m+=1;
	   								if(m>2)
	   								break;
	   	   							}
	   	   							cc+=1;
	   	   						}
	   	   						if(m==2)
	   	   						{
	   	   							b[r2][c2].setIcon(sic);
	   	   		   					b[r1][c1].setIcon(null);
	   	   		   					cl=1;
	   	   		   					n=2;
	   	   		   					jp.updateTime(n);
   		    					 jp.resultWindow("CheckMate",1);
	   	   						}
	   					}
	   					else if(r2<r1 && c2<c1)
	   					{
	   						int cc=c2,m=0;
		   						for(i=r2;i<=r1;i++)
		   						{
		   							if(b[i][cc].getIcon()!=null)
		   							{
		   								m+=1;
		   								if(m>2)
		   								break;
		   							}
		   							cc+=1;
		   						}
		   						if(m==2)
		   						{
		   							b[r2][c2].setIcon(sic);
		   		   					b[r1][c1].setIcon(null);
		   		   					cl=1;
		   		   					n=2;
		   		   					jp.updateTime(n);
   		    					 jp.resultWindow("CheckMate",1);
		   						}
	   					}
	   					else if(r2<r1 && c2>c1)
	   					{
	   						int cc=c2,m=0;
		   						for(i=r2;i<=r1;i++)
		   						{
		   							if(b[i][cc].getIcon()!=null)
		   							{
		   								m+=1;
		   								if(m>2)
		   								break;
		   							}
		   							cc-=1;
		   						}
		   						if(m==2)
		   						{
		   							b[r2][c2].setIcon(sic);
		   		   					b[r1][c1].setIcon(null);
		   		   					cl=1;
		   		   					n=2;
		   		   					jp.updateTime(n);
   		    					 jp.resultWindow("CheckMate",1);
		   						}
	   					}
	   					
	   				}
	   				else
					{
						cl=1;
					}
	   			}
	   			
	    		else if(c.equalsIgnoreCase("WQ"))
	    		{
	    			bo:
	      	    		 for(i=0;i<=7;i++)
	      	    		  {
	      	    			  for(j=0;j<=7;j++)
	      	    			  {
	      	    				  if(b[i][j]==b1)
	      	    				  {
	      	    					  r2=i;
	      	    					  c2=j;
	      	    					  break bo;
	      	    				  }
	      	    			  }
	      	    		  }
	      			
	      			
	    			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    				{
    					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
    					{
    						if(c1>c2)
    						{
    							for(i=c2+1;i<=c1-1;i++)
    							{
    								if(b[r1][i].getIcon()!=null)
    								{
    									break;
    								}
    							}
    							if(i==c1)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
   		    					 jp.resultWindow("CheckMate",1);
    							}
    						}
    						else
    						{
    							for(i=c1+1;i<=c2-1;i++)
    							{
    								if(b[r1][i].getIcon()!=null)
    								{
    									break;
    								}
    							}
    							if(i==c2)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
   		    					 jp.resultWindow("CheckMate",1);
    							}
    							
    						}
    					}
    					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    					{
    						if(r1>r2)
    						{
    							for(i=r2+1;i<=r1-1;i++)
    							{
    								if(b[i][c1].getIcon()!=null)
    								{
    									break;
    								}
    							}
    							if(i==r1)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
   		    					 jp.resultWindow("CheckMate",1);
    							}
    						}
    						else
    						{
    							for(i=r1+1;i<=r2-1;i++)
    							{
    								if(b[i][c1].getIcon()!=null)
    								{
    									break;
    								}
    							}
    							if(i==r2)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
   		    					 jp.resultWindow("CheckMate",1);
    							}
    						}
    					}
    					
    				}
	      				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
		   				{
		   					if(r1<r2 && c1>c2)
		   					{
		   						int cc=c1,m=0;
		   						for(i=r1;i<=r2;i++)
		   						{
		   							if(b[i][cc].getIcon()!=null)
		   							{
		   								m+=1;
		   								if(m>2)
		   								break;
		   							}
		   							cc-=1;
		   						}
		   						if(m==2)
		   						{
		   							b[r2][c2].setIcon(sic);
		   		   					b[r1][c1].setIcon(null);
		   		   					cl=1;
		   		   					n=2;
		   		   					jp.updateTime(n);
   		    					 jp.resultWindow("CheckMate",1);
		   						}
		   					}
		   					else if(r2>r1 && c2>c1)
		   					{
		   			            	int cc=c1,m=0;
		   	   						for(i=r1;i<=r2;i++)
		   	   						{
		   	   							if(b[i][cc].getIcon()!=null)
		   	   							{
		   	   							m+=1;
		   								if(m>2)
		   								break;
		   	   							}
		   	   							cc+=1;
		   	   						}
		   	   						if(m==2)
		   	   						{
		   	   							b[r2][c2].setIcon(sic);
		   	   		   					b[r1][c1].setIcon(null);
		   	   		   					cl=1;
		   	   		   					n=2;
		   	   		   					jp.updateTime(n);
	    		    					 jp.resultWindow("CheckMate",1);
		   	   						}
		   					}
		   					else if(r2<r1 && c2<c1)
		   					{
		   						int cc=c2,m=0;
			   						for(i=r2;i<=r1;i++)
			   						{
			   							if(b[i][cc].getIcon()!=null)
			   							{
			   								m+=1;
			   								if(m>2)
			   								break;
			   							}
			   							cc+=1;
			   						}
			   						if(m==2)
			   						{
			   							b[r2][c2].setIcon(sic);
			   		   					b[r1][c1].setIcon(null);
			   		   					cl=1;
			   		   					n=2;
			   		   					jp.updateTime(n);
	    		    					 jp.resultWindow("CheckMate",1);
			   						}
		   					}
		   					else if(r2<r1 && c2>c1)
		   					{
		   						int cc=c2,m=0;
			   						for(i=r2;i<=r1;i++)
			   						{
			   							if(b[i][cc].getIcon()!=null)
			   							{
			   								m+=1;
			   								if(m>2)
			   								break;
			   							}
			   							cc-=1;
			   						}
			   						if(m==2)
			   						{
			   							b[r2][c2].setIcon(sic);
			   		   					b[r1][c1].setIcon(null);
			   		   					cl=1;
			   		   					n=2;
			   		   					jp.updateTime(n);
	    		    					 jp.resultWindow("CheckMate",1);
			   						}
		   					}
		   					
		   				}
	      				else
	    				{
	    					cl=1;
	    				}
	      				
	      			}
	    		
	    		else if(c.equalsIgnoreCase("WK"))
	    		{
	    			bo:
	      	    		 for(i=0;i<=7;i++)
	      	    		  {
	      	    			  for(j=0;j<=7;j++)
	      	    			  {
	      	    				  if(b[i][j]==b1)
	      	    				  {
	      	    					  r2=i;
	      	    					  c2=j;
	      	    					  break bo;
	      	    				  }
	      	    			  }
	      	    		  }
	      		
	      				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
	      				{
	      					b[r2][c2].setIcon(sic);
	      					b[r1][c1].setIcon(null);
	      					cl=1;
	      					n=2;
	      					jp.updateTime(n);
	    					 jp.resultWindow("CheckMate",1);
	      				}
	      				else
	    				{
	    					cl=1;
	    				}
	      			}
	    		
	    		else if(c.equalsIgnoreCase("WN"))
	    		{
	    			bo:
	     	    		 for(i=0;i<=7;i++)
	     	    		  {
	     	    			  for(j=0;j<=7;j++)
	     	    			  {
	     	    				  if(b[i][j]==b1)
	     	    				  {
	     	    					  r2=i;
	     	    					  c2=j;
	     	    					  break bo;
	     	    				  }
	     	    			  }
	     	    		  }
	     			
	     				if((Math.abs(r1-r2)==1 && c1!=c2) && r1<r2)
	     				{
	     					b[r2][c2].setIcon(sic);
	     					b[r1][c1].setIcon(null);
	     					cl=1;
	     					n=2;
	     					if(r2==0)
	     					{
	     						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
	     					}
	     					jp.updateTime(n);
	    					 jp.resultWindow("CheckMate",1);
	     				}
	     				else
	    				{
	    					cl=1;
	    				}
	     			}
	    		}
	    	}
	    	
	    
	    else if(im1==im[5])
	    {
	    	if(cl==1)
	    	{
//	    		bo:
//	    		 for(i=0;i<=7;i++)
//	    		  {
//	    			  for(j=0;j<=7;j++)
//	    			  {
//	    				  if(b[i][j]==b1)
//	    				  {
//	    					  r1=i;
//	    					  c1=j;
//	    					  c="BN";
//	    					  cl=2;
//	    					  sic=im1;
//    					  System.out.println("ab");
//	    					  break bo;
//	    				  }
//	    			  }
//	    		  }
	    		
	    	}
	    	else
	    	{
	    		if(c.equalsIgnoreCase("WE"))
        		{
        			bo:
        	    		 for(i=0;i<=7;i++)
        	    		  {
        	    			  for(j=0;j<=7;j++)
        	    			  {
        	    				  if(b[i][j]==b1)
        	    				  {
        	    					  r2=i;
        	    					  c2=j;
        	    					  break bo;
        	    				  }
        	    			  }
        	    		  }
        			
        				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
        				{
        					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
        					{
        						if(c1>c2)
        						{
        							for(i=c2+1;i<=c1-1;i++)
        							{
        								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
        								if(ci!=null)
        								{
        									break;
        								}
        							}
        							if(i==c1)
        							{
        								b[r2][c2].setIcon(sic);
        		    					b[r1][c1].setIcon(null);
        		    					cl=1;
        		    					n=2;
        		    					jp.updateTime(n);
        							}
        						}
        						else
        						{
        							for(i=c1+1;i<=c2-1;i++)
        							{
        								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
        								if(ci!=null)
        								{
        									break;
        								}
        							}
        							if(i==c2)
        							{
        								b[r2][c2].setIcon(sic);
        		    					b[r1][c1].setIcon(null);
        		    					cl=1;
        		    					n=2;
        		    					jp.updateTime(n);
        							}
        							
        						}
        					}
        					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
        					{
        						if(r1>r2)
        						{

        							for(i=r2+1;i<=r1-1;i++)
        							{
        								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
    								if(ci!=null)
    								{
    		     						break;
    								}
        							}
        							if(i==r1)
        							{
        								b[r2][c2].setIcon(sic);
        		    					b[r1][c1].setIcon(null);
        		    					cl=1;
        		    					n=2;
        		    					jp.updateTime(n);
        							}
        						}
        						else
        						{
        							for(i=r1+1;i<=r2-1;i++)
        							{
        								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
        								if(ci!=null)
        								{
        									break;
        								}
        							}
        							if(i==r2)
        							{
        								b[r2][c2].setIcon(sic);
        		    					b[r1][c1].setIcon(null);
        		    					cl=1;
        		    					n=2;
        		    					jp.updateTime(n);
        							}
        						}
        					}
        					
        				}
        				else
        				{
        					cl=1;
        				}
        			}
        		
        		else if(c.equalsIgnoreCase("WH"))
        		{
        			bo:
       	    		 for(i=0;i<=7;i++)
       	    		  {
       	    			  for(j=0;j<=7;j++)
       	    			  {
       	    				  if(b[i][j]==b1)
       	    				  {
       	    					  r2=i;
       	    					  c2=j;
       	    					  break bo;
       	    				  }
       	    			  }
       	    		  }
       			
       			
       				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
       				{
       					b[r2][c2].setIcon(sic);
       					b[r1][c1].setIcon(null);
       					cl=1;
       					n=2;
       					jp.updateTime(n);
       				}
       				else
    				{
    					cl=1;
    				}
       			}
        		
        		else if(c.equalsIgnoreCase("WC"))
        		{
        			bo:
       	    		 for(i=0;i<=7;i++)
       	    		  {
       	    			  for(j=0;j<=7;j++)
       	    			  {
       	    				  if(b[i][j]==b1)
       	    				  {
       	    					  r2=i;
       	    					  c2=j;
       	    					  break bo;
       	    				  }
       	    			  }
       	    		  }
       			
        			if((Math.abs(r1-r2)==Math.abs(c1-c2)))
       				{
       					if(r1<r2 && c1>c2)
       					{
       						
       						int cc=c1,m=0;
       						for(i=r1;i<=r2;i++)
       						{
       							if(b[i][cc].getIcon()!=null)
       							{
       								m+=1;
       								if(m>2)
       								break;
       							}
       							cc-=1;
       						}
       						if(m==2)
       						{
       							b[r2][c2].setIcon(sic);
       		   					b[r1][c1].setIcon(null);
       		   					cl=1;
       		   					n=2;
       		   					jp.updateTime(n);
       						}
       					}
       					else if(r2>r1 && c2>c1)
       					{
       			            	int cc=c1,m=0;
       	   						for(i=r1;i<=r2;i++)
       	   						{
       	   							if(b[i][cc].getIcon()!=null)
       	   							{
       	   							m+=1;
       								if(m>2)
       								break;
       	   							}
       	   							cc+=1;
       	   						}
       	   						if(m==2)
       	   						{
       	   							b[r2][c2].setIcon(sic);
       	   		   					b[r1][c1].setIcon(null);
       	   		   					cl=1;
       	   		   					n=2;
       	   		   					jp.updateTime(n);
       	   						}
       					}
       					else if(r2<r1 && c2<c1)
       					{
       						int cc=c2,m=0;
    	   						for(i=r2;i<=r1;i++)
    	   						{
    	   							if(b[i][cc].getIcon()!=null)
    	   							{
    	   								m+=1;
           								if(m>2)
           								break;
    	   							}
    	   							cc+=1;
    	   						}
    	   						if(m==2)
    	   						{
    	   							b[r2][c2].setIcon(sic);
    	   		   					b[r1][c1].setIcon(null);
    	   		   					cl=1;
    	   		   					n=2;
    	   		   					jp.updateTime(n);
    	   						}
       					}
       					else if(r2<r1 && c2>c1)
       					{
       						int cc=c2,m=0;
    	   						for(i=r2;i<=r1;i++)
    	   						{
    	   							if(b[i][cc].getIcon()!=null)
    	   							{
    	   								m+=1;
           								if(m>2)
           								break;
    	   							}
    	   							cc-=1;
    	   						}
    	   						if(m==2)
    	   						{
    	   							b[r2][c2].setIcon(sic);
    	   		   					b[r1][c1].setIcon(null);
    	   		   					cl=1;
    	   		   					n=2;
    	   		   					jp.updateTime(n);
    	   						}
       					}
       					
       				}
       				else
    				{
    					cl=1;
    				}
       			}
       			
        		else if(c.equalsIgnoreCase("WQ"))
        		{
        			bo:
          	    		 for(i=0;i<=7;i++)
          	    		  {
          	    			  for(j=0;j<=7;j++)
          	    			  {
          	    				  if(b[i][j]==b1)
          	    				  {
          	    					  r2=i;
          	    					  c2=j;
          	    					  break bo;
          	    				  }
          	    			  }
          	    		  }
          			
        			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    				{
    					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
    					{
    						if(c1>c2)
    						{
    							for(i=c2+1;i<=c1-1;i++)
    							{
    								ImageIcon ci=(ImageIcon)b[r1][i].getIcon();
    								if(ci!=null)
    								{
    									break;
    								}
    							}
    							if(i==c1)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    						else
    						{
    							for(i=c1+1;i<=c2-1;i++)
    							{
    								ImageIcon ci=(ImageIcon)b[r2][i].getIcon();
    								if(ci!=null)
    								{
    									break;
    								}
    							}
    							if(i==c2)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    							
    						}
    					}
    					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    					{
    						if(r1>r2)
    						{

    							for(i=r2+1;i<=r1-1;i++)
    							{
    								ImageIcon ci=(ImageIcon)b[i][c1].getIcon();
								if(ci!=null)
								{
		     						break;
								}
    							}
    							if(i==r1)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    						else
    						{
    							for(i=r1+1;i<=r2-1;i++)
    							{
    								ImageIcon ci=(ImageIcon)b[i][c2].getIcon();
    								if(ci!=null)
    								{
    									break;
    								}
    							}
    							if(i==r2)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    					}
    					
    				}
          				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
           				{
           					if(r1<r2 && c1>c2)
           					{
           						
           						int cc=c1,m=0;
           						for(i=r1;i<=r2;i++)
           						{
           							if(b[i][cc].getIcon()!=null)
           							{
           								m+=1;
           								if(m>2)
           								break;
           							}
           							cc-=1;
           						}
           						if(m==2)
           						{
           							b[r2][c2].setIcon(sic);
           		   					b[r1][c1].setIcon(null);
           		   					cl=1;
           		   					n=2;
           		   					jp.updateTime(n);
           						}
           					}
           					else if(r2>r1 && c2>c1)
           					{
           			            	int cc=c1,m=0;
           	   						for(i=r1;i<=r2;i++)
           	   						{
           	   							if(b[i][cc].getIcon()!=null)
           	   							{
           	   							m+=1;
           								if(m>2)
           								break;
           	   							}
           	   							cc+=1;
           	   						}
           	   						if(m==2)
           	   						{
           	   							b[r2][c2].setIcon(sic);
           	   		   					b[r1][c1].setIcon(null);
           	   		   					cl=1;
           	   		   					n=2;
           	   		   					jp.updateTime(n);
           	   						}
           					}
           					else if(r2<r1 && c2<c1)
           					{
           						int cc=c2,m=0;
        	   						for(i=r2;i<=r1;i++)
        	   						{
        	   							if(b[i][cc].getIcon()!=null)
        	   							{
        	   								m+=1;
               								if(m>2)
               								break;
        	   							}
        	   							cc+=1;
        	   						}
        	   						if(m==2)
        	   						{
        	   							b[r2][c2].setIcon(sic);
        	   		   					b[r1][c1].setIcon(null);
        	   		   					cl=1;
        	   		   					n=2;
        	   		   					jp.updateTime(n);
        	   						}
           					}
           					else if(r2<r1 && c2>c1)
           					{
           						int cc=c2,m=0;
        	   						for(i=r2;i<=r1;i++)
        	   						{
        	   							if(b[i][cc].getIcon()!=null)
        	   							{
        	   								m+=1;
               								if(m>2)
               								break;
        	   							}
        	   							cc-=1;
        	   						}
        	   						if(m==2)
        	   						{
        	   							b[r2][c2].setIcon(sic);
        	   		   					b[r1][c1].setIcon(null);
        	   		   					cl=1;
        	   		   					n=2;
        	   		   					jp.updateTime(n);
        	   						}
           					}
           					
           				}
          				else
        				{
        					cl=1;
        				}
          				
          			}
        		
        		else if(c.equalsIgnoreCase("WK"))
        		{
        			bo:
          	    		 for(i=0;i<=7;i++)
          	    		  {
          	    			  for(j=0;j<=7;j++)
          	    			  {
          	    				  if(b[i][j]==b1)
          	    				  {
          	    					  r2=i;
          	    					  c2=j;
          	    					  break bo;
          	    				  }
          	    			  }
          	    		  }
          			
          			
          				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
          				{
          					b[r2][c2].setIcon(sic);
          					b[r1][c1].setIcon(null);
          					cl=1;
          					n=2;
          					jp.updateTime(n);
          				}
          				else
        				{
        					cl=1;
        				}
          			}
        		
        		else if(c.equalsIgnoreCase("WN"))
        		{
        			bo:
         	    		 for(i=0;i<=7;i++)
         	    		  {
         	    			  for(j=0;j<=7;j++)
         	    			  {
         	    				  if(b[i][j]==b1)
         	    				  {
         	    					  r2=i;
         	    					  c2=j;
         	    					  break bo;
         	    				  }
         	    			  }
         	    		  }
         				if((Math.abs(r1-r2)==1 && c1!=c2) && r2<r1)
                         {
          					
         					b[r2][c2].setIcon(sic);
         					b[r1][c1].setIcon(null);
         					cl=1;
         					n=2;
         					if(r2==0)
         					{
         						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
         					}
         					jp.updateTime(n);
         				}
         				else
        				{
        					cl=1;
        				}
         			}
        		}
	    	}
	    if(im1==im[6])
	    {
	    	 if(cl==1)
	     	{
	     		bo:
	     		 for(i=0;i<=7;i++)
	     		  {
	     			  for(j=0;j<=7;j++)
	     			  {
	     				  if(b[i][j]==b1)
	     				  {
	     					  r1=i;
	     					  c1=j;
	     					  c="WE";
	     					  sic=im1;
	     					  cl=2;
	     					  break bo;
	     				  }
	     			  }
	     		  }
	     	}
	     	else
	     	{
	     		if(c.equalsIgnoreCase("BE"))
	    		{
	    			bo:
	    	    		 for(i=0;i<=7;i++)
	    	    		  {
	    	    			  for(j=0;j<=7;j++)
	    	    			  {
	    	    				  if(b[i][j]==b1)
	    	    				  {
	    	    					  r2=i;
	    	    					  c2=j;
	    	    					  break bo;
	    	    				  }
	    	    			  }
	    	    		  }
	    				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
	    				{
	    					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
	    					{
	    						if(c1>c2)
	    						{
	    							for(i=c2+1;i<=c1-1;i++)
	    							{
	    								if(b[r1][i].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==c1)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    							}
	    						}
	    						else
	    						{
	    							for(i=c1+1;i<=c2-1;i++)
	    							{
	    								if(b[r1][i].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==c2)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    							}
	    							
	    						}
	    					}
	    					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
	    					{
	    						if(r1>r2)
	    						{
	    							for(i=r2+1;i<=r1-1;i++)
	    							{
	    								if(b[i][c1].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==r1)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    							}
	    						}
	    						else
	    						{
	    							for(i=r1+1;i<=r2-1;i++)
	    							{
	    								if(b[i][c2].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==r2)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    							}
	    						}
	    					}
	    					
	    				}
	    				else
	    				{
	    					cl=1;
	    				}
	    			}
	    		
	    		else if(c.equalsIgnoreCase("BH"))
	    		{
	    			bo:
	   	    		 for(i=0;i<=7;i++)
	   	    		  {
	   	    			  for(j=0;j<=7;j++)
	   	    			  {
	   	    				  if(b[i][j]==b1)
	   	    				  {
	   	    					  r2=i;
	   	    					  c2=j;
	   	    					  break bo;
	   	    				  }
	   	    			  }
	   	    		  }
	   			
	   			
	   				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
	   				{
	   					b[r2][c2].setIcon(sic);
	   					b[r1][c1].setIcon(null);
	   					cl=1;
	   					n=2;
	   					jp.updateTime(n);
	   				}
	   				else
    				{
    					cl=1;
    				}
	   			}
	    		
	    		else if(c.equalsIgnoreCase("BC"))
	    		{
	    			bo:
	   	    		 for(i=0;i<=7;i++)
	   	    		  {
	   	    			  for(j=0;j<=7;j++)
	   	    			  {
	   	    				  if(b[i][j]==b1)
	   	    				  {
	   	    					  r2=i;
	   	    					  c2=j;
	   	    					  break bo;
	   	    				  }
	   	    			  }
	   	    		  }
	   			
	   			
	   				if((Math.abs(r1-r2)==Math.abs(c1-c2)))
	   				{
	   					if(r1<r2 && c1>c2)
	   					{
	   						int cc=c1,m=0;
	   						for(i=r1;i<=r2;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
	   								if(m>2)
	   								break;
	   							}
	   							cc-=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=2;
	   		   					jp.updateTime(n);
	   						}
	   					}
	   					else if(r2>r1 && c2>c1)
	   					{
	   			            	int cc=c1,m=0;
	   	   						for(i=r1;i<=r2;i++)
	   	   						{
	   	   							if(b[i][cc].getIcon()!=null)
	   	   							{
	   	   							m+=1;
	   								if(m>2)
	   								break;
	   	   							}
	   	   							cc+=1;
	   	   						}
	   	   						if(m==2)
	   	   						{
	   	   							b[r2][c2].setIcon(sic);
	   	   		   					b[r1][c1].setIcon(null);
	   	   		   					cl=1;
	   	   		   					n=2;
	   	   		   					jp.updateTime(n);
	   	   						}
	   					}
	   					else if(r2<r1 && c2<c1)
	   					{
	   						int cc=c2,m=0;
		   						for(i=r2;i<=r1;i++)
		   						{
		   							if(b[i][cc].getIcon()!=null)
		   							{
		   								m+=1;
    	   								if(m>2)
    	   								break;
		   							}
		   							cc+=1;
		   						}
		   						if(m==2)
		   						{
		   							b[r2][c2].setIcon(sic);
		   		   					b[r1][c1].setIcon(null);
		   		   					cl=1;
		   		   					n=2;
		   		   					jp.updateTime(n);
		   						}
	   					}
	   					else if(r2<r1 && c2>c1)
	   					{
	   						int cc=c2,m=0;
		   						for(i=r2;i<=r1;i++)
		   						{
		   							if(b[i][cc].getIcon()!=null)
		   							{
		   								m+=1;
    	   								if(m>2)
    	   								break;
		   							}
		   							cc-=1;
		   						}
		   						if(m==2)
		   						{
		   							b[r2][c2].setIcon(sic);
		   		   					b[r1][c1].setIcon(null);
		   		   					cl=1;
		   		   					n=2;
		   		   					jp.updateTime(n);
		   						}
	   					}
	   					
	   				}
	   				else
    				{
    					cl=1;
    				}
	   			}
	   			
	    		else if(c.equalsIgnoreCase("BQ"))
	    		{
	    			bo:
	      	    		 for(i=0;i<=7;i++)
	      	    		  {
	      	    			  for(j=0;j<=7;j++)
	      	    			  {
	      	    				  if(b[i][j]==b1)
	      	    				  {
	      	    					  r2=i;
	      	    					  c2=j;
	      	    					  break bo;
	      	    				  }
	      	    			  }
	      	    		  }
	      			
	    			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    				{
    					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
    					{
    						if(c1>c2)
    						{
    							for(i=c2+1;i<=c1-1;i++)
    							{
    								if(b[r1][i].getIcon()!=null)
    								{
    									break;
    								}
    							}
    							if(i==c1)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    						else
    						{
    							for(i=c1+1;i<=c2-1;i++)
    							{
    								if(b[r1][i].getIcon()!=null)
    								{
    									break;
    								}
    							}
    							if(i==c2)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    							
    						}
    					}
    					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    					{
    						if(r1>r2)
    						{
    							for(i=r2+1;i<=r1-1;i++)
    							{
    								if(b[i][c1].getIcon()!=null)
    								{
    									break;
    								}
    							}
    							if(i==r1)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    						else
    						{
    							for(i=r1+1;i<=r2-1;i++)
    							{
    								if(b[i][c2].getIcon()!=null)
    								{
    									break;
    								}
    							}
    							if(i==r2)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    					}
    					
    				}
	      				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
		   				{
		   					if(r1<r2 && c1>c2)
		   					{
		   						int cc=c1,m=0;
		   						for(i=r1;i<=r2;i++)
		   						{
		   							if(b[i][cc].getIcon()!=null)
		   							{
		   								m+=1;
		   								if(m>2)
		   								break;
		   							}
		   							cc-=1;
		   						}
		   						if(m==2)
		   						{
		   							b[r2][c2].setIcon(sic);
		   		   					b[r1][c1].setIcon(null);
		   		   					cl=1;
		   		   					n=2;
		   		   					jp.updateTime(n);
		   						}
		   					}
		   					else if(r2>r1 && c2>c1)
		   					{
		   			            	int cc=c1,m=0;
		   	   						for(i=r1;i<=r2;i++)
		   	   						{
		   	   							if(b[i][cc].getIcon()!=null)
		   	   							{
		   	   							m+=1;
		   								if(m>2)
		   								break;
		   	   							}
		   	   							cc+=1;
		   	   						}
		   	   						if(m==2)
		   	   						{
		   	   							b[r2][c2].setIcon(sic);
		   	   		   					b[r1][c1].setIcon(null);
		   	   		   					cl=1;
		   	   		   					n=2;
		   	   		   					jp.updateTime(n);
		   	   						}
		   					}
		   					else if(r2<r1 && c2<c1)
		   					{
		   						int cc=c2,m=0;
			   						for(i=r2;i<=r1;i++)
			   						{
			   							if(b[i][cc].getIcon()!=null)
			   							{
			   								m+=1;
	    	   								if(m>2)
	    	   								break;
			   							}
			   							cc+=1;
			   						}
			   						if(m==2)
			   						{
			   							b[r2][c2].setIcon(sic);
			   		   					b[r1][c1].setIcon(null);
			   		   					cl=1;
			   		   					n=2;
			   		   					jp.updateTime(n);
			   						}
		   					}
		   					else if(r2<r1 && c2>c1)
		   					{
		   						int cc=c2,m=0;
			   						for(i=r2;i<=r1;i++)
			   						{
			   							if(b[i][cc].getIcon()!=null)
			   							{
			   								m+=1;
	    	   								if(m>2)
	    	   								break;
			   							}
			   							cc-=1;
			   						}
			   						if(m==2)
			   						{
			   							b[r2][c2].setIcon(sic);
			   		   					b[r1][c1].setIcon(null);
			   		   					cl=1;
			   		   					n=2;
			   		   					jp.updateTime(n);
			   						}
		   					}
    	   				}
	      				else
	    				{
	    					cl=1;
	    				}
	      				
	      			}
	    		
	    		else if(c.equalsIgnoreCase("BK"))
	    		{
	    			bo:
	      	    		 for(i=0;i<=7;i++)
	      	    		  {
	      	    			  for(j=0;j<=7;j++)
	      	    			  {
	      	    				  if(b[i][j]==b1)
	      	    				  {
	      	    					  r2=i;
	      	    					  c2=j;
	      	    					  break bo;
	      	    				  }
	      	    			  }
	      	    		  }
	      			
	      			
	      				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
	      				{
	      					b[r2][c2].setIcon(sic);
	      					b[r1][c1].setIcon(null);
	      					cl=1;
	      					n=2;
	      					jp.updateTime(n);
	      				}
	      				else
	    				{
	    					cl=1;
	    				}
	      			}
	    		
	    		else if(c.equalsIgnoreCase("BN"))
	    		{
	    			bo:
	     	    		 for(i=0;i<=7;i++)
	     	    		  {
	     	    			  for(j=0;j<=7;j++)
	     	    			  {
	     	    				  if(b[i][j]==b1)
	     	    				  {
	     	    					  r2=i;
	     	    					  c2=j;
	     	    					  break bo;
	     	    				  }
	     	    			  }
	     	    		  }
	     				if((Math.abs(r1-r2)==1 && c1!=c2) && r2>r1)
	     				{
	     					b[r2][c2].setIcon(sic);
	     					b[r1][c1].setIcon(null);
	     					cl=1;
	     					n=2;
	     					if(r2==0)
	     					{
	     						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
	     					}
	     					jp.updateTime(n);
	     				}
	     				else
	    				{
	    					cl=1;
	    				}
	     			}
	     	}
	     	}
	     	
	    else if(im1==im[7])
	    {

	    	if(cl==1)
	    	{
	    		bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r1=i;
	    					  c1=j;
	    					  c="WC";
	    					  cl=2;
	    					  sic=im1;
	    					  break bo;
	    				  }
	    			  }
	    		  }
	    	}
	    	else
	    	{
	    		if(c.equalsIgnoreCase("BE"))
	    		{
	    			bo:
	    	    		 for(i=0;i<=7;i++)
	    	    		  {
	    	    			  for(j=0;j<=7;j++)
	    	    			  {
	    	    				  if(b[i][j]==b1)
	    	    				  {
	    	    					  r2=i;
	    	    					  c2=j;
	    	    					  break bo;
	    	    				  }
	    	    			  }
	    	    		  }
	    		
	    			if(c.equalsIgnoreCase("BE"))
		    		{
		    			bo:
		    	    		 for(i=0;i<=7;i++)
		    	    		  {
		    	    			  for(j=0;j<=7;j++)
		    	    			  {
		    	    				  if(b[i][j]==b1)
		    	    				  {
		    	    					  r2=i;
		    	    					  c2=j;
		    	    					  break bo;
		    	    				  }
		    	    			  }
		    	    		  }
		    				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
		    				{
		    					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
		    					{
		    						if(c1>c2)
		    						{
		    							for(i=c2+1;i<=c1-1;i++)
		    							{
		    								if(b[r1][i].getIcon()!=null)
		    								{
		    									break;
		    								}
		    							}
		    							if(i==c1)
		    							{
		    								b[r2][c2].setIcon(sic);
		    		    					b[r1][c1].setIcon(null);
		    		    					cl=1;
		    		    					n=2;
		    		    					jp.updateTime(n);
		    							}
		    						}
		    						else
		    						{
		    							for(i=c1+1;i<=c2-1;i++)
		    							{
		    								if(b[r1][i].getIcon()!=null)
		    								{
		    									break;
		    								}
		    							}
		    							if(i==c2)
		    							{
		    								b[r2][c2].setIcon(sic);
		    		    					b[r1][c1].setIcon(null);
		    		    					cl=1;
		    		    					n=2;
		    		    					jp.updateTime(n);
		    							}
		    							
		    						}
		    					}
		    					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
		    					{
		    						if(r1>r2)
		    						{
		    							for(i=r2+1;i<=r1-1;i++)
		    							{
		    								if(b[i][c1].getIcon()!=null)
		    								{
		    									break;
		    								}
		    							}
		    							if(i==r1)
		    							{
		    								b[r2][c2].setIcon(sic);
		    		    					b[r1][c1].setIcon(null);
		    		    					cl=1;
		    		    					n=2;
		    		    					jp.updateTime(n);
		    							}
		    						}
		    						else
		    						{
		    							for(i=r1+1;i<=r2-1;i++)
		    							{
		    								if(b[i][c2].getIcon()!=null)
		    								{
		    									break;
		    								}
		    							}
		    							if(i==r2)
		    							{
		    								b[r2][c2].setIcon(sic);
		    		    					b[r1][c1].setIcon(null);
		    		    					cl=1;
		    		    					n=2;
		    		    					jp.updateTime(n);
		    							}
		    						}
		    					}
		    					
		    				}
		    				else
		    				{
		    					cl=1;
		    				}
		    			}
		    		
		    		else if(c.equalsIgnoreCase("BH"))
		    		{
		    			bo:
		   	    		 for(i=0;i<=7;i++)
		   	    		  {
		   	    			  for(j=0;j<=7;j++)
		   	    			  {
		   	    				  if(b[i][j]==b1)
		   	    				  {
		   	    					  r2=i;
		   	    					  c2=j;
		   	    					  break bo;
		   	    				  }
		   	    			  }
		   	    		  }
		   			
		   			
		   				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
		   				{
		   					b[r2][c2].setIcon(sic);
		   					b[r1][c1].setIcon(null);
		   					cl=1;
		   					n=2;
		   					jp.updateTime(n);
		   				}
		   				else
	    				{
	    					cl=1;
	    				}
		   			}
		    		
		    		else if(c.equalsIgnoreCase("BC"))
		    		{
		    			bo:
		   	    		 for(i=0;i<=7;i++)
		   	    		  {
		   	    			  for(j=0;j<=7;j++)
		   	    			  {
		   	    				  if(b[i][j]==b1)
		   	    				  {
		   	    					  r2=i;
		   	    					  c2=j;
		   	    					  break bo;
		   	    				  }
		   	    			  }
		   	    		  }
		   			
		   			
		    			if((Math.abs(r1-r2)==Math.abs(c1-c2)))
		   				{
		   					if(r1<r2 && c1>c2)
		   					{
		   						int cc=c1,m=0;
		   						for(i=r1;i<=r2;i++)
		   						{
		   							if(b[i][cc].getIcon()!=null)
		   							{
		   								m+=1;
		   								if(m>2)
		   								break;
		   							}
		   							cc-=1;
		   						}
		   						if(m==2)
		   						{
		   							b[r2][c2].setIcon(sic);
		   		   					b[r1][c1].setIcon(null);
		   		   					cl=1;
		   		   					n=2;
		   		   					jp.updateTime(n);
		   						}
		   					}
		   					else if(r2>r1 && c2>c1)
		   					{
		   			            	int cc=c1,m=0;
		   	   						for(i=r1;i<=r2;i++)
		   	   						{
		   	   							if(b[i][cc].getIcon()!=null)
		   	   							{
		   	   							m+=1;
		   								if(m>2)
		   								break;
		   	   							}
		   	   							cc+=1;
		   	   						}
		   	   						if(m==2)
		   	   						{
		   	   							b[r2][c2].setIcon(sic);
		   	   		   					b[r1][c1].setIcon(null);
		   	   		   					cl=1;
		   	   		   					n=2;
		   	   		   					jp.updateTime(n);
		   	   						}
		   					}
		   					else if(r2<r1 && c2<c1)
		   					{
		   						int cc=c2,m=0;
			   						for(i=r2;i<=r1;i++)
			   						{
			   							if(b[i][cc].getIcon()!=null)
			   							{
			   								m+=1;
	    	   								if(m>2)
	    	   								break;
			   							}
			   							cc+=1;
			   						}
			   						if(m==2)
			   						{
			   							b[r2][c2].setIcon(sic);
			   		   					b[r1][c1].setIcon(null);
			   		   					cl=1;
			   		   					n=2;
			   		   					jp.updateTime(n);
			   						}
		   					}
		   					else if(r2<r1 && c2>c1)
		   					{
		   						int cc=c2,m=0;
			   						for(i=r2;i<=r1;i++)
			   						{
			   							if(b[i][cc].getIcon()!=null)
			   							{
			   								m+=1;
	    	   								if(m>2)
	    	   								break;
			   							}
			   							cc-=1;
			   						}
			   						if(m==2)
			   						{
			   							b[r2][c2].setIcon(sic);
			   		   					b[r1][c1].setIcon(null);
			   		   					cl=1;
			   		   					n=2;
			   		   					jp.updateTime(n);
			   						}
		   					}
		   					
		   				}
		   				else
	    				{
	    					cl=1;
	    				}
		   			}
		   			
		    		else if(c.equalsIgnoreCase("BQ"))
		    		{
		    			bo:
		      	    		 for(i=0;i<=7;i++)
		      	    		  {
		      	    			  for(j=0;j<=7;j++)
		      	    			  {
		      	    				  if(b[i][j]==b1)
		      	    				  {
		      	    					  r2=i;
		      	    					  c2=j;
		      	    					  break bo;
		      	    				  }
		      	    			  }
		      	    		  }
		      			
		    			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
	    				{
	    					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
	    					{
	    						if(c1>c2)
	    						{
	    							for(i=c2+1;i<=c1-1;i++)
	    							{
	    								if(b[r1][i].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==c1)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    							}
	    						}
	    						else
	    						{
	    							for(i=c1+1;i<=c2-1;i++)
	    							{
	    								if(b[r1][i].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==c2)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    							}
	    							
	    						}
	    					}
	    					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
	    					{
	    						if(r1>r2)
	    						{
	    							for(i=r2+1;i<=r1-1;i++)
	    							{
	    								if(b[i][c1].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==r1)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    							}
	    						}
	    						else
	    						{
	    							for(i=r1+1;i<=r2-1;i++)
	    							{
	    								if(b[i][c2].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==r2)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    							}
	    						}
	    					}
	    					
	    				}
		      				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
			   				{
			   					if(r1<r2 && c1>c2)
			   					{
			   						int cc=c1,m=0;
			   						for(i=r1;i<=r2;i++)
			   						{
			   							if(b[i][cc].getIcon()!=null)
			   							{
			   								m+=1;
			   								if(m>2)
			   								break;
			   							}
			   							cc-=1;
			   						}
			   						if(m==2)
			   						{
			   							b[r2][c2].setIcon(sic);
			   		   					b[r1][c1].setIcon(null);
			   		   					cl=1;
			   		   					n=2;
			   		   					jp.updateTime(n);
			   						}
			   					}
			   					else if(r2>r1 && c2>c1)
			   					{
			   			            	int cc=c1,m=0;
			   	   						for(i=r1;i<=r2;i++)
			   	   						{
			   	   							if(b[i][cc].getIcon()!=null)
			   	   							{
			   	   							m+=1;
			   								if(m>2)
			   								break;
			   	   							}
			   	   							cc+=1;
			   	   						}
			   	   						if(m==2)
			   	   						{
			   	   							b[r2][c2].setIcon(sic);
			   	   		   					b[r1][c1].setIcon(null);
			   	   		   					cl=1;
			   	   		   					n=2;
			   	   		   					jp.updateTime(n);
			   	   						}
			   					}
			   					else if(r2<r1 && c2<c1)
			   					{
			   						int cc=c2,m=0;
				   						for(i=r2;i<=r1;i++)
				   						{
				   							if(b[i][cc].getIcon()!=null)
				   							{
				   								m+=1;
		    	   								if(m>2)
		    	   								break;
				   							}
				   							cc+=1;
				   						}
				   						if(m==2)
				   						{
				   							b[r2][c2].setIcon(sic);
				   		   					b[r1][c1].setIcon(null);
				   		   					cl=1;
				   		   					n=2;
				   		   					jp.updateTime(n);
				   						}
			   					}
			   					else if(r2<r1 && c2>c1)
			   					{
			   						int cc=c2,m=0;
				   						for(i=r2;i<=r1;i++)
				   						{
				   							if(b[i][cc].getIcon()!=null)
				   							{
				   								m+=1;
		    	   								if(m>2)
		    	   								break;
				   							}
				   							cc-=1;
				   						}
				   						if(m==2)
				   						{
				   							b[r2][c2].setIcon(sic);
				   		   					b[r1][c1].setIcon(null);
				   		   					cl=1;
				   		   					n=2;
				   		   					jp.updateTime(n);
				   						}
			   					}
			   					
			   				}
		      				else
		    				{
		    					cl=1;
		    				}
		      				
		      			}
		    		
		    		else if(c.equalsIgnoreCase("BK"))
		    		{
		    			bo:
		      	    		 for(i=0;i<=7;i++)
		      	    		  {
		      	    			  for(j=0;j<=7;j++)
		      	    			  {
		      	    				  if(b[i][j]==b1)
		      	    				  {
		      	    					  r2=i;
		      	    					  c2=j;
		      	    					  break bo;
		      	    				  }
		      	    			  }
		      	    		  }
		      			
		      			
		      				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
		      				{
		      					b[r2][c2].setIcon(sic);
		      					b[r1][c1].setIcon(null);
		      					cl=1;
		      					n=2;
		      					jp.updateTime(n);
		      				}
		      				else
		    				{
		    					cl=1;
		    				}
		      			}
		    		
		    		else if(c.equalsIgnoreCase("BN"))
		    		{
		    			bo:
		     	    		 for(i=0;i<=7;i++)
		     	    		  {
		     	    			  for(j=0;j<=7;j++)
		     	    			  {
		     	    				  if(b[i][j]==b1)
		     	    				  {
		     	    					  r2=i;
		     	    					  c2=j;
		     	    					  break bo;
		     	    				  }
		     	    			  }
		     	    		  }
		     				if((Math.abs(r1-r2)==1 && c1!=c2) && r2>r1)
		     				{
		     					b[r2][c2].setIcon(sic);
		     					b[r1][c1].setIcon(null);
		     					cl=1;
		     					n=2;
		     					if(r2==0)
		     					{
		     						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
		     					}
		     					jp.updateTime(n);
		     				}
		     				else
		    				{
		    					cl=1;
		    				}
		     			}
		     	}
	    	}
	    }
	    else if(im1==im[8])
	    {

	    	if(cl==1)
	    	{
	    		bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r1=i;
	    					  c1=j;
	    					  c="WH";
	    					  cl=2;
	    					  sic=im1;
	    					  break bo;
	    				  }
	    			  }
	    		  }
//	    		System.out.println("zz");
	    	}
	    	else
	    	{
	    		if(c.equalsIgnoreCase("BE"))
	    		{
	    			bo:
	    	    		 for(i=0;i<=7;i++)
	    	    		  {
	    	    			  for(j=0;j<=7;j++)
	    	    			  {
	    	    				  if(b[i][j]==b1)
	    	    				  {
	    	    					  r2=i;
	    	    					  c2=j;
	    	    					  break bo;
	    	    				  }
	    	    			  }
	    	    		  }
	    				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
	    				{
	    					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
	    					{
	    						if(c1>c2)
	    						{
	    							for(i=c2+1;i<=c1-1;i++)
	    							{
	    								if(b[r1][i].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==c1)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    							}
	    						}
	    						else
	    						{
	    							for(i=c1+1;i<=c2-1;i++)
	    							{
	    								if(b[r1][i].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==c2)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    							}
	    							
	    						}
	    					}
	    					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
	    					{
	    						if(r1>r2)
	    						{
	    							for(i=r2+1;i<=r1-1;i++)
	    							{
	    								if(b[i][c1].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==r1)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    							}
	    						}
	    						else
	    						{
	    							for(i=r1+1;i<=r2-1;i++)
	    							{
	    								if(b[i][c2].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==r2)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    							}
	    						}
	    					}
	    					
	    				}
	    				else
	    				{
	    					cl=1;
	    				}
	    			}
	    		
	    		else if(c.equalsIgnoreCase("BH"))
	    		{
	    			bo:
	   	    		 for(i=0;i<=7;i++)
	   	    		  {
	   	    			  for(j=0;j<=7;j++)
	   	    			  {
	   	    				  if(b[i][j]==b1)
	   	    				  {
	   	    					  r2=i;
	   	    					  c2=j;
	   	    					  break bo;
	   	    				  }
	   	    			  }
	   	    		  }
	   			
	   			
	   				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
	   				{
	   					b[r2][c2].setIcon(sic);
	   					b[r1][c1].setIcon(null);
	   					cl=1;
	   					n=2;
	   					jp.updateTime(n);
	   				}
	   				else
    				{
    					cl=1;
    				}
	   			}
	    		
	    		else if(c.equalsIgnoreCase("BC"))
	    		{
	    			bo:
	   	    		 for(i=0;i<=7;i++)
	   	    		  {
	   	    			  for(j=0;j<=7;j++)
	   	    			  {
	   	    				  if(b[i][j]==b1)
	   	    				  {
	   	    					  r2=i;
	   	    					  c2=j;
	   	    					  break bo;
	   	    				  }
	   	    			  }
	   	    		  }
	   			
	   			
	    			if((Math.abs(r1-r2)==Math.abs(c1-c2)))
	   				{
	   					if(r1<r2 && c1>c2)
	   					{
	   						int cc=c1,m=0;
	   						for(i=r1;i<=r2;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
	   								if(m>2)
	   								break;
	   							}
	   							cc-=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=2;
	   		   					jp.updateTime(n);
	   						}
	   					}
	   					else if(r2>r1 && c2>c1)
	   					{
	   			            	int cc=c1,m=0;
	   	   						for(i=r1;i<=r2;i++)
	   	   						{
	   	   							if(b[i][cc].getIcon()!=null)
	   	   							{
	   	   							m+=1;
	   								if(m>2)
	   								break;
	   	   							}
	   	   							cc+=1;
	   	   						}
	   	   						if(m==2)
	   	   						{
	   	   							b[r2][c2].setIcon(sic);
	   	   		   					b[r1][c1].setIcon(null);
	   	   		   					cl=1;
	   	   		   					n=2;
	   	   		   					jp.updateTime(n);
	   	   						}
	   					}
	   					else if(r2<r1 && c2<c1)
	   					{
	   						int cc=c2,m=0;
		   						for(i=r2;i<=r1;i++)
		   						{
		   							if(b[i][cc].getIcon()!=null)
		   							{
		   								m+=1;
    	   								if(m>2)
    	   								break;
		   							}
		   							cc+=1;
		   						}
		   						if(m==2)
		   						{
		   							b[r2][c2].setIcon(sic);
		   		   					b[r1][c1].setIcon(null);
		   		   					cl=1;
		   		   					n=2;
		   		   					jp.updateTime(n);
		   						}
	   					}
	   					else if(r2<r1 && c2>c1)
	   					{
	   						int cc=c2,m=0;
		   						for(i=r2;i<=r1;i++)
		   						{
		   							if(b[i][cc].getIcon()!=null)
		   							{
		   								m+=1;
    	   								if(m>2)
    	   								break;
		   							}
		   							cc-=1;
		   						}
		   						if(m==2)
		   						{
		   							b[r2][c2].setIcon(sic);
		   		   					b[r1][c1].setIcon(null);
		   		   					cl=1;
		   		   					n=2;
		   		   					jp.updateTime(n);
		   						}
	   					}
	   					
	   				}
	   				else
    				{
    					cl=1;
    				}
	   			}
	   			
	    		else if(c.equalsIgnoreCase("BQ"))
	    		{
	    			bo:
	      	    		 for(i=0;i<=7;i++)
	      	    		  {
	      	    			  for(j=0;j<=7;j++)
	      	    			  {
	      	    				  if(b[i][j]==b1)
	      	    				  {
	      	    					  r2=i;
	      	    					  c2=j;
	      	    					  break bo;
	      	    				  }
	      	    			  }
	      	    		  }
	      			
	    			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    				{
    					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
    					{
    						if(c1>c2)
    						{
    							for(i=c2+1;i<=c1-1;i++)
    							{
    								if(b[r1][i].getIcon()!=null)
    								{
    									break;
    								}
    							}
    							if(i==c1)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    						else
    						{
    							for(i=c1+1;i<=c2-1;i++)
    							{
    								if(b[r1][i].getIcon()!=null)
    								{
    									break;
    								}
    							}
    							if(i==c2)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    							
    						}
    					}
    					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    					{
    						if(r1>r2)
    						{
    							for(i=r2+1;i<=r1-1;i++)
    							{
    								if(b[i][c1].getIcon()!=null)
    								{
    									break;
    								}
    							}
    							if(i==r1)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    						else
    						{
    							for(i=r1+1;i<=r2-1;i++)
    							{
    								if(b[i][c2].getIcon()!=null)
    								{
    									break;
    								}
    							}
    							if(i==r2)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    					}
    					
    				}
	      				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
		   				{
		   					if(r1<r2 && c1>c2)
		   					{
		   						int cc=c1,m=0;
		   						for(i=r1;i<=r2;i++)
		   						{
		   							if(b[i][cc].getIcon()!=null)
		   							{
		   								m+=1;
		   								if(m>2)
		   								break;
		   							}
		   							cc-=1;
		   						}
		   						if(m==2)
		   						{
		   							b[r2][c2].setIcon(sic);
		   		   					b[r1][c1].setIcon(null);
		   		   					cl=1;
		   		   					n=2;
		   		   					jp.updateTime(n);
		   						}
		   					}
		   					else if(r2>r1 && c2>c1)
		   					{
		   			            	int cc=c1,m=0;
		   	   						for(i=r1;i<=r2;i++)
		   	   						{
		   	   							if(b[i][cc].getIcon()!=null)
		   	   							{
		   	   							m+=1;
		   								if(m>2)
		   								break;
		   	   							}
		   	   							cc+=1;
		   	   						}
		   	   						if(m==2)
		   	   						{
		   	   							b[r2][c2].setIcon(sic);
		   	   		   					b[r1][c1].setIcon(null);
		   	   		   					cl=1;
		   	   		   					n=2;
		   	   		   					jp.updateTime(n);
		   	   						}
		   					}
		   					else if(r2<r1 && c2<c1)
		   					{
		   						int cc=c2,m=0;
			   						for(i=r2;i<=r1;i++)
			   						{
			   							if(b[i][cc].getIcon()!=null)
			   							{
			   								m+=1;
	    	   								if(m>2)
	    	   								break;
			   							}
			   							cc+=1;
			   						}
			   						if(m==2)
			   						{
			   							b[r2][c2].setIcon(sic);
			   		   					b[r1][c1].setIcon(null);
			   		   					cl=1;
			   		   					n=2;
			   		   					jp.updateTime(n);
			   						}
		   					}
		   					else if(r2<r1 && c2>c1)
		   					{
		   						int cc=c2,m=0;
			   						for(i=r2;i<=r1;i++)
			   						{
			   							if(b[i][cc].getIcon()!=null)
			   							{
			   								m+=1;
	    	   								if(m>2)
	    	   								break;
			   							}
			   							cc-=1;
			   						}
			   						if(m==2)
			   						{
			   							b[r2][c2].setIcon(sic);
			   		   					b[r1][c1].setIcon(null);
			   		   					cl=1;
			   		   					n=2;
			   		   					jp.updateTime(n);
			   						}
		   					}
		   					
		   				}
	      				else
	    				{
	    					cl=1;
	    				}
	      				
	      			}
	    		
	    		else if(c.equalsIgnoreCase("BK"))
	    		{
	    			bo:
	      	    		 for(i=0;i<=7;i++)
	      	    		  {
	      	    			  for(j=0;j<=7;j++)
	      	    			  {
	      	    				  if(b[i][j]==b1)
	      	    				  {
	      	    					  r2=i;
	      	    					  c2=j;
	      	    					  break bo;
	      	    				  }
	      	    			  }
	      	    		  }
	      			
	      			
	      				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
	      				{
	      					b[r2][c2].setIcon(sic);
	      					b[r1][c1].setIcon(null);
	      					cl=1;
	      					n=2;
	      					jp.updateTime(n);
	      				}
	      				else
	    				{
	    					cl=1;
	    				}
	      			}
	    		
	    		else if(c.equalsIgnoreCase("BN"))
	    		{
	    			bo:
	     	    		 for(i=0;i<=7;i++)
	     	    		  {
	     	    			  for(j=0;j<=7;j++)
	     	    			  {
	     	    				  if(b[i][j]==b1)
	     	    				  {
	     	    					  r2=i;
	     	    					  c2=j;
	     	    					  break bo;
	     	    				  }
	     	    			  }
	     	    		  }
	     				if((Math.abs(r1-r2)==1 && c1!=c2) && r2>r1)
	     				{
	     					b[r2][c2].setIcon(sic);
	     					b[r1][c1].setIcon(null);
	     					cl=1;
	     					n=2;
	     					if(r2==0)
	     					{
	     						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
	     					}
	     					jp.updateTime(n);
	     				}
	     				else
	    				{
	    					cl=1;
	    				}
	     			}
	    		}
	    }
	    else if(im1==im[9])
	    {
	      	if(cl==1)
	    	{
	    		bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r1=i;
	    					  c1=j;
	    					  c="WQ";
	    					  cl=2;
	    					  sic=im1;
	    					  break bo;
	    				  }
	    			  }
	    		  }
	    	}
	    	else
	    	{
	    		if(c.equalsIgnoreCase("BE"))
	    		{
	    			bo:
	    	    		 for(i=0;i<=7;i++)
	    	    		  {
	    	    			  for(j=0;j<=7;j++)
	    	    			  {
	    	    				  if(b[i][j]==b1)
	    	    				  {
	    	    					  r2=i;
	    	    					  c2=j;
	    	    					  break bo;
	    	    				  }
	    	    			  }
	    	    		  }
	    				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
	    				{
	    					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
	    					{
	    						if(c1>c2)
	    						{
	    							for(i=c2+1;i<=c1-1;i++)
	    							{
	    								if(b[r1][i].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==c1)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    							}
	    						}
	    						else
	    						{
	    							for(i=c1+1;i<=c2-1;i++)
	    							{
	    								if(b[r1][i].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==c2)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    							}
	    							
	    						}
	    					}
	    					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
	    					{
	    						if(r1>r2)
	    						{
	    							for(i=r2+1;i<=r1-1;i++)
	    							{
	    								if(b[i][c1].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==r1)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    							}
	    						}
	    						else
	    						{
	    							for(i=r1+1;i<=r2-1;i++)
	    							{
	    								if(b[i][c2].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==r2)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    							}
	    						}
	    					}
	    					
	    				}
	    				else
	    				{
	    					cl=1;
	    				}
	    			}
	    		
	    		else if(c.equalsIgnoreCase("BH"))
	    		{
	    			bo:
	   	    		 for(i=0;i<=7;i++)
	   	    		  {
	   	    			  for(j=0;j<=7;j++)
	   	    			  {
	   	    				  if(b[i][j]==b1)
	   	    				  {
	   	    					  r2=i;
	   	    					  c2=j;
	   	    					  break bo;
	   	    				  }
	   	    			  }
	   	    		  }
	   			
	   			
	   				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
	   				{
	   					b[r2][c2].setIcon(sic);
	   					b[r1][c1].setIcon(null);
	   					cl=1;
	   					n=2;
	   					jp.updateTime(n);
	   				}
	   				else
    				{
    					cl=1;
    				}
	   			}
	    		
	    		else if(c.equalsIgnoreCase("BC"))
	    		{
	    			bo:
	   	    		 for(i=0;i<=7;i++)
	   	    		  {
	   	    			  for(j=0;j<=7;j++)
	   	    			  {
	   	    				  if(b[i][j]==b1)
	   	    				  {
	   	    					  r2=i;
	   	    					  c2=j;
	   	    					  break bo;
	   	    				  }
	   	    			  }
	   	    		  }
	   			
	   			
	    			if((Math.abs(r1-r2)==Math.abs(c1-c2)))
	   				{
	   					if(r1<r2 && c1>c2)
	   					{
	   						int cc=c1,m=0;
	   						for(i=r1;i<=r2;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
	   								if(m>2)
	   								break;
	   							}
	   							cc-=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=2;
	   		   					jp.updateTime(n);
	   						}
	   					}
	   					else if(r2>r1 && c2>c1)
	   					{
	   			            	int cc=c1,m=0;
	   	   						for(i=r1;i<=r2;i++)
	   	   						{
	   	   							if(b[i][cc].getIcon()!=null)
	   	   							{
	   	   							m+=1;
	   								if(m>2)
	   								break;
	   	   							}
	   	   							cc+=1;
	   	   						}
	   	   						if(m==2)
	   	   						{
	   	   							b[r2][c2].setIcon(sic);
	   	   		   					b[r1][c1].setIcon(null);
	   	   		   					cl=1;
	   	   		   					n=2;
	   	   		   					jp.updateTime(n);
	   	   						}
	   					}
	   					else if(r2<r1 && c2<c1)
	   					{
	   						int cc=c2,m=0;
		   						for(i=r2;i<=r1;i++)
		   						{
		   							if(b[i][cc].getIcon()!=null)
		   							{
		   								m+=1;
    	   								if(m>2)
    	   								break;
		   							}
		   							cc+=1;
		   						}
		   						if(m==2)
		   						{
		   							b[r2][c2].setIcon(sic);
		   		   					b[r1][c1].setIcon(null);
		   		   					cl=1;
		   		   					n=2;
		   		   					jp.updateTime(n);
		   						}
	   					}
	   					else if(r2<r1 && c2>c1)
	   					{
	   						int cc=c2,m=0;
		   						for(i=r2;i<=r1;i++)
		   						{
		   							if(b[i][cc].getIcon()!=null)
		   							{
		   								m+=1;
    	   								if(m>2)
    	   								break;
		   							}
		   							cc-=1;
		   						}
		   						if(m==2)
		   						{
		   							b[r2][c2].setIcon(sic);
		   		   					b[r1][c1].setIcon(null);
		   		   					cl=1;
		   		   					n=2;
		   		   					jp.updateTime(n);
		   						}
	   					}
	   					
	   				}
	   				else
    				{
    					cl=1;
    				}
	   			}
	   			
	    		else if(c.equalsIgnoreCase("BQ"))
	    		{
	    			bo:
	      	    		 for(i=0;i<=7;i++)
	      	    		  {
	      	    			  for(j=0;j<=7;j++)
	      	    			  {
	      	    				  if(b[i][j]==b1)
	      	    				  {
	      	    					  r2=i;
	      	    					  c2=j;
	      	    					  break bo;
	      	    				  }
	      	    			  }
	      	    		  }
	      			
	    			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    				{
    					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
    					{
    						if(c1>c2)
    						{
    							for(i=c2+1;i<=c1-1;i++)
    							{
    								if(b[r1][i].getIcon()!=null)
    								{
    									break;
    								}
    							}
    							if(i==c1)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    						else
    						{
    							for(i=c1+1;i<=c2-1;i++)
    							{
    								if(b[r1][i].getIcon()!=null)
    								{
    									break;
    								}
    							}
    							if(i==c2)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    							
    						}
    					}
    					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    					{
    						if(r1>r2)
    						{
    							for(i=r2+1;i<=r1-1;i++)
    							{
    								if(b[i][c1].getIcon()!=null)
    								{
    									break;
    								}
    							}
    							if(i==r1)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    						else
    						{
    							for(i=r1+1;i<=r2-1;i++)
    							{
    								if(b[i][c2].getIcon()!=null)
    								{
    									break;
    								}
    							}
    							if(i==r2)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    					}
    					
    				}
	      				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
		   				{
		   					if(r1<r2 && c1>c2)
		   					{
		   						int cc=c1,m=0;
		   						for(i=r1;i<=r2;i++)
		   						{
		   							if(b[i][cc].getIcon()!=null)
		   							{
		   								m+=1;
		   								if(m>2)
		   								break;
		   							}
		   							cc-=1;
		   						}
		   						if(m==2)
		   						{
		   							b[r2][c2].setIcon(sic);
		   		   					b[r1][c1].setIcon(null);
		   		   					cl=1;
		   		   					n=2;
		   		   					jp.updateTime(n);
		   						}
		   					}
		   					else if(r2>r1 && c2>c1)
		   					{
		   			            	int cc=c1,m=0;
		   	   						for(i=r1;i<=r2;i++)
		   	   						{
		   	   							if(b[i][cc].getIcon()!=null)
		   	   							{
		   	   							m+=1;
		   								if(m>2)
		   								break;
		   	   							}
		   	   							cc+=1;
		   	   						}
		   	   						if(m==2)
		   	   						{
		   	   							b[r2][c2].setIcon(sic);
		   	   		   					b[r1][c1].setIcon(null);
		   	   		   					cl=1;
		   	   		   					n=2;
		   	   		   					jp.updateTime(n);
		   	   						}
		   					}
		   					else if(r2<r1 && c2<c1)
		   					{
		   						int cc=c2,m=0;
			   						for(i=r2;i<=r1;i++)
			   						{
			   							if(b[i][cc].getIcon()!=null)
			   							{
			   								m+=1;
	    	   								if(m>2)
	    	   								break;
			   							}
			   							cc+=1;
			   						}
			   						if(m==2)
			   						{
			   							b[r2][c2].setIcon(sic);
			   		   					b[r1][c1].setIcon(null);
			   		   					cl=1;
			   		   					n=2;
			   		   					jp.updateTime(n);
			   						}
		   					}
		   					else if(r2<r1 && c2>c1)
		   					{
		   						int cc=c2,m=0;
			   						for(i=r2;i<=r1;i++)
			   						{
			   							if(b[i][cc].getIcon()!=null)
			   							{
			   								m+=1;
	    	   								if(m>2)
	    	   								break;
			   							}
			   							cc-=1;
			   						}
			   						if(m==2)
			   						{
			   							b[r2][c2].setIcon(sic);
			   		   					b[r1][c1].setIcon(null);
			   		   					cl=1;
			   		   					n=2;
			   		   					jp.updateTime(n);
			   						}
		   					}
		   					
		   				}
	      				else
	    				{
	    					cl=1;
	    				}
	      				
	      			}
	    		
	    		else if(c.equalsIgnoreCase("BK"))
	    		{
	    			bo:
	      	    		 for(i=0;i<=7;i++)
	      	    		  {
	      	    			  for(j=0;j<=7;j++)
	      	    			  {
	      	    				  if(b[i][j]==b1)
	      	    				  {
	      	    					  r2=i;
	      	    					  c2=j;
	      	    					  break bo;
	      	    				  }
	      	    			  }
	      	    		  }
	      			
	      			
	      				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
	      				{
	      					b[r2][c2].setIcon(sic);
	      					b[r1][c1].setIcon(null);
	      					cl=1;
	      					n=2;
	      					jp.updateTime(n);
	      				}
	      				else
	    				{
	    					cl=1;
	    				}
	      			}
	    		
	    		else if(c.equalsIgnoreCase("BN"))
	    		{
	    			bo:
	     	    		 for(i=0;i<=7;i++)
	     	    		  {
	     	    			  for(j=0;j<=7;j++)
	     	    			  {
	     	    				  if(b[i][j]==b1)
	     	    				  {
	     	    					  r2=i;
	     	    					  c2=j;
	     	    					  break bo;
	     	    				  }
	     	    			  }
	     	    		  }
	     				if((Math.abs(r1-r2)==1 && c1!=c2) && r2>r1)
	     				{
	     					b[r2][c2].setIcon(sic);
	     					b[r1][c1].setIcon(null);
	     					cl=1;
	     					n=2;
	     					if(r2==0)
	     					{
	     						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
	     					}
	     					jp.updateTime(n);
	     				}
	     				else
	    				{
	    					cl=1;
	    				}
	     			}
	     	}
	    }
	    else if(im1==im[10])
	    {
	    	if(cl==1)
	    	{
	    		bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r1=i;
	    					  c1=j;
	    					  c="WK";
	    					  cl=2;
	    					  sic=im1;
	    					  break bo;
	    				  }
	    			  }
	    		  }
	    	}
	    	else
	    	{
	    		if(c.equalsIgnoreCase("BE"))
	    		{
	    			bo:
	    	    		 for(i=0;i<=7;i++)
	    	    		  {
	    	    			  for(j=0;j<=7;j++)
	    	    			  {
	    	    				  if(b[i][j]==b1)
	    	    				  {
	    	    					  r2=i;
	    	    					  c2=j;
	    	    					  break bo;
	    	    				  }
	    	    			  }
	    	    		  }
	    		
	    				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
	    				{
	    					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
	    					{
	    						if(c1>c2)
	    						{
	    							for(i=c2+1;i<=c1-1;i++)
	    							{
	    								if(b[r1][i].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==c1)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    		    					 jp.resultWindow("CheckMate",2);
	    							}
	    						}
	    						else
	    						{
	    							for(i=c1+1;i<=c2-1;i++)
	    							{
	    								if(b[r2][i].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==c2)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    		    					 jp.resultWindow("CheckMate",2);
	    							}
	    							
	    						}
	    					}
	    					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
	    					{
	    						if(r1>r2)
	    						{
	    							for(i=r2+1;i<=r1-1;i++)
	    							{
	    								if(b[i][c1].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==r1)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    		    					 jp.resultWindow("CheckMate",2);
	    							}
	    						}
	    						else
	    						{
	    							for(i=r1+1;i<=r2-1;i++)
	    							{
	    								if(b[i][c1].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==r2)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    		    					 jp.resultWindow("CheckMate",2);
	    							}
	    						}
	    					}
	    					
	    				}
	    				else
	    				{
	    					cl=1;
	    				}
	    			}
	    		else if(c.equalsIgnoreCase("BH"))
	    		{
	    			bo:
	    	    		 for(i=0;i<=7;i++)
	    	    		  {
	    	    			  for(j=0;j<=7;j++)
	    	    			  {
	    	    				  if(b[i][j]==b1)
	    	    				  {
	    	    					  r2=i;
	    	    					  c2=j;
	    	    					  break bo;
	    	    				  }
	    	    			  }
	    	    		  }
	    			
	    				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
	    				{
	    					b[r2][c2].setIcon(sic);
	    					b[r1][c1].setIcon(null);
	    					cl=1;
	    					n=2;
	    					jp.updateTime(n);
	    					 jp.resultWindow("CheckMate",2);
	    				}
	    				else
	    			{
	    				cl=1;
	    			}
	    			}
	    		
	    		else if(c.equalsIgnoreCase("BC"))
	    		{
	    			bo:
	    	    		 for(i=0;i<=7;i++)
	    	    		  {
	    	    			  for(j=0;j<=7;j++)
	    	    			  {
	    	    				  if(b[i][j]==b1)
	    	    				  {
	    	    					  r2=i;
	    	    					  c2=j;
	    	    					  break bo;
	    	    				  }
	    	    			  }
	    	    		  }
	    			
	    			
	    				if((Math.abs(r1-r2)==Math.abs(c1-c2)))
	    				{
	    					if(r1<r2 && c1>c2)
	    					{
	    						int cc=c1,m=0;
	    						for(i=r1;i<=r2;i++)
	    						{
	    							if(b[i][cc].getIcon()!=null)
	    							{ 
	    								m+=1;
	    								if(m>2)
	    								break;
	    							}
	    							cc-=1;
	    						}
	    						if(m==2)
	    						{
	    							b[r2][c2].setIcon(sic);
	    		   					b[r1][c1].setIcon(null);
	    		   					cl=1;
	    		   					n=2;
	    		   					jp.updateTime(n);
	    		   				 jp.resultWindow("CheckMate",2);
	    						}
	    					}
	    					else if(r2>r1 && c2>c1)
	    					{
	    			            	int cc=c1,m=0;
	    	   						for(i=r1;i<=r2;i++)
	    	   						{
	    	   							if(b[i][cc].getIcon()!=null)
	    	   							{
	    	   								m+=1;
		    								if(m>2)
		    								break;
	    	   							}
	    	   							cc+=1;
	    	   						}
	    	   						if(m==2)
	    	   						{
	    	   							b[r2][c2].setIcon(sic);
	    	   		   					b[r1][c1].setIcon(null);
	    	   		   					cl=1;
	    	   		   					n=2;
	    	   		   					jp.updateTime(n);
	    	   		   				 jp.resultWindow("CheckMate",2);
	    	   						}
	    					}
	    					else if(r2<r1 && c2<c1)
	    					{
	    						int cc=c2,m=0;
	       						for(i=r2;i<=r1;i++)
	       						{
	       							if(b[i][cc].getIcon()!=null)
	       							{
	       								m+=1;
	    								if(m>2)
	    								break;
	       							}
	       							cc+=1;
	       						}
	       						if(m==2)
	       						{
	       							b[r2][c2].setIcon(sic);
	       		   					b[r1][c1].setIcon(null);
	       		   					cl=1;
	       		   					n=2;
	       		   					jp.updateTime(n);
	       		   				 jp.resultWindow("CheckMate",2);
	       						}
	    					}
	    					else if(r2<r1 && c2>c1)
	    					{
	    						int cc=c2,m=0;
	       						for(i=r2;i<=r1;i++)
	       						{
	       							if(b[i][cc].getIcon()!=null)
	       							{
	       								m+=1;
	    								if(m>2)
	    								break;
	       							}
	       							cc-=1;
	       						}
	       						if(m==2)
	       						{
	       							b[r2][c2].setIcon(sic);
	       		   					b[r1][c1].setIcon(null);
	       		   					cl=1;
	       		   					n=2;
	       		   					jp.updateTime(n);
	       		   				 jp.resultWindow("CheckMate",2);
	       						}
	    					}
	    					
	    				}
	    				else
	    			{
	    				cl=1;
	    			}
	    			}
	    			
	    		else if(c.equalsIgnoreCase("BQ"))
	    		{
	    			bo:
	      	    		 for(i=0;i<=7;i++)
	      	    		  {
	      	    			  for(j=0;j<=7;j++)
	      	    			  {
	      	    				  if(b[i][j]==b1)
	      	    				  {
	      	    					  r2=i;
	      	    					  c2=j;
	      	    					  break bo;
	      	    				  }
	      	    			  }
	      	    		  }
	      			
	      			
	    			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    				{
    					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
    					{
    						if(c1>c2)
    						{
    							for(i=c2+1;i<=c1-1;i++)
    							{
    								if(b[r1][i].getIcon()!=null)
    								{
    									break;
    								}
    							}
    							if(i==c1)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    		    					 jp.resultWindow("CheckMate",2);
    							}
    						}
    						else
    						{
    							for(i=c1+1;i<=c2-1;i++)
    							{
    								if(b[r2][i].getIcon()!=null)
    								{
    									break;
    								}
    							}
    							if(i==c2)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    		    					 jp.resultWindow("CheckMate",2);
    							}
    							
    						}
    					}
    					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    					{
    						if(r1>r2)
    						{
    							for(i=r2+1;i<=r1-1;i++)
    							{
    								if(b[i][c1].getIcon()!=null)
    								{
    									break;
    								}
    							}
    							if(i==r1)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    		    					 jp.resultWindow("CheckMate",2);
    							}
    						}
    						else
    						{
    							for(i=r1+1;i<=r2-1;i++)
    							{
    								if(b[i][c1].getIcon()!=null)
    								{
    									break;
    								}
    							}
    							if(i==r2)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    		    					 jp.resultWindow("CheckMate",2);
    							}
    						}
    					}
    					
    				}
	      				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
	    				{
	    					if(r1<r2 && c1>c2)
	    					{
	    						int cc=c1,m=0;
	    						for(i=r1;i<=r2;i++)
	    						{
	    							if(b[i][cc].getIcon()!=null)
	    							{ 
	    								m+=1;
	    								if(m>2)
	    								break;
	    							}
	    							cc-=1;
	    						}
	    						if(m==2)
	    						{
	    							b[r2][c2].setIcon(sic);
	    		   					b[r1][c1].setIcon(null);
	    		   					cl=1;
	    		   					n=2;
	    		   					jp.updateTime(n);
	    		   				 jp.resultWindow("CheckMate",2);
	    						}
	    					}
	    					else if(r2>r1 && c2>c1)
	    					{
	    			            	int cc=c1,m=0;
	    	   						for(i=r1;i<=r2;i++)
	    	   						{
	    	   							if(b[i][cc].getIcon()!=null)
	    	   							{
	    	   								m+=1;
		    								if(m>2)
		    								break;
	    	   							}
	    	   							cc+=1;
	    	   						}
	    	   						if(m==2)
	    	   						{
	    	   							b[r2][c2].setIcon(sic);
	    	   		   					b[r1][c1].setIcon(null);
	    	   		   					cl=1;
	    	   		   					n=2;
	    	   		   					jp.updateTime(n);
	    	   		   				 jp.resultWindow("CheckMate",2);
	    	   						}
	    					}
	    					else if(r2<r1 && c2<c1)
	    					{
	    						int cc=c2,m=0;
	       						for(i=r2;i<=r1;i++)
	       						{
	       							if(b[i][cc].getIcon()!=null)
	       							{
	       								m+=1;
	    								if(m>2)
	    								break;
	       							}
	       							cc+=1;
	       						}
	       						if(m==2)
	       						{
	       							b[r2][c2].setIcon(sic);
	       		   					b[r1][c1].setIcon(null);
	       		   					cl=1;
	       		   					n=2;
	       		   					jp.updateTime(n);
	       		   				 jp.resultWindow("CheckMate",2);
	       						}
	    					}
	    					else if(r2<r1 && c2>c1)
	    					{
	    						int cc=c2,m=0;
	       						for(i=r2;i<=r1;i++)
	       						{
	       							if(b[i][cc].getIcon()!=null)
	       							{
	       								m+=1;
	    								if(m>2)
	    								break;
	       							}
	       							cc-=1;
	       						}
	       						if(m==2)
	       						{
	       							b[r2][c2].setIcon(sic);
	       		   					b[r1][c1].setIcon(null);
	       		   					cl=1;
	       		   					n=2;
	       		   					jp.updateTime(n);
	       		   				 jp.resultWindow("CheckMate",2);
	       						}
	    					}
	    					
	    				}
	      				else
	    				{
	    					cl=1;
	    				}
	      				
	      			}
	    		
	    		else if(c.equalsIgnoreCase("BK"))
	    		{
	    			bo:
	      	    		 for(i=0;i<=7;i++)
	      	    		  {
	      	    			  for(j=0;j<=7;j++)
	      	    			  {
	      	    				  if(b[i][j]==b1)
	      	    				  {
	      	    					  r2=i;
	      	    					  c2=j;
	      	    					  break bo;
	      	    				  }
	      	    			  }
	      	    		  }
	      		
	      				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
	      				{
	      					b[r2][c2].setIcon(sic);
	      					b[r1][c1].setIcon(null);
	      					cl=1;
	      					n=2;
	      					jp.updateTime(n);
	      					 jp.resultWindow("CheckMate",2);
	      				}
	      				else
	    				{
	    					cl=1;
	    				}
	      			}
	    		
	    		else if(c.equalsIgnoreCase("BN"))
	    		{
	    			bo:
	     	    		 for(i=0;i<=7;i++)
	     	    		  {
	     	    			  for(j=0;j<=7;j++)
	     	    			  {
	     	    				  if(b[i][j]==b1)
	     	    				  {
	     	    					  r2=i;
	     	    					  c2=j;
	     	    					  break bo;
	     	    				  }
	     	    			  }
	     	    		  }
	     			
	     				if((Math.abs(r1-r2)==1 && c1!=c2) && r2>r1)
	     				{
	     					b[r2][c2].setIcon(sic);
	     					b[r1][c1].setIcon(null);
	     					cl=1;
	     					n=2;
	     					if(r2==0)
	     					{
	     						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
	     					}
	     					jp.updateTime(n);
	     					 jp.resultWindow("CheckMate",2);
	     				}
	     				else
	    				{
	    					cl=1;
	    				}
	     			}
	    		}
	    }
	    else if(im1==im[11])
	    {
	    	if(cl==1)
	    	{
	    		bo:
	    		 for(i=0;i<=7;i++)
	    		  {
	    			  for(j=0;j<=7;j++)
	    			  {
	    				  if(b[i][j]==b1)
	    				  {
	    					  r1=i;
	    					  c1=j;
	    					  c="WN";
	    					  cl=2;
	    					  sic=im1;
	    					  break bo;
	    				  }
	    			  }
	    		  }
//	    		System.out.println("cl=11");
	    	}
	    	else
	    	{
	    		if(c.equalsIgnoreCase("BE"))
	    		{
	    			bo:
	    	    		 for(i=0;i<=7;i++)
	    	    		  {
	    	    			  for(j=0;j<=7;j++)
	    	    			  {
	    	    				  if(b[i][j]==b1)
	    	    				  {
	    	    					  r2=i;
	    	    					  c2=j;
	    	    					  break bo;
	    	    				  }
	    	    			  }
	    	    		  }
	    				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
	    				{
	    					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
	    					{
	    						if(c1>c2)
	    						{
	    							for(i=c2+1;i<=c1-1;i++)
	    							{
	    								if(b[r1][i].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==c1)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    							}
	    						}
	    						else
	    						{
	    							for(i=c1+1;i<=c2-1;i++)
	    							{
	    								if(b[r1][i].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==c2)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    							}
	    							
	    						}
	    					}
	    					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
	    					{
	    						if(r1>r2)
	    						{
	    							for(i=r2+1;i<=r1-1;i++)
	    							{
	    								if(b[i][c1].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==r1)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    							}
	    						}
	    						else
	    						{
	    							for(i=r1+1;i<=r2-1;i++)
	    							{
	    								if(b[i][c2].getIcon()!=null)
	    								{
	    									break;
	    								}
	    							}
	    							if(i==r2)
	    							{
	    								b[r2][c2].setIcon(sic);
	    		    					b[r1][c1].setIcon(null);
	    		    					cl=1;
	    		    					n=2;
	    		    					jp.updateTime(n);
	    							}
	    						}
	    					}
	    					
	    				}
	    				else
	    				{
	    					cl=1;
	    				}
	    			}
	    		
	    		else if(c.equalsIgnoreCase("BH"))
	    		{
	    			bo:
	   	    		 for(i=0;i<=7;i++)
	   	    		  {
	   	    			  for(j=0;j<=7;j++)
	   	    			  {
	   	    				  if(b[i][j]==b1)
	   	    				  {
	   	    					  r2=i;
	   	    					  c2=j;
	   	    					  break bo;
	   	    				  }
	   	    			  }
	   	    		  }
	   			
	   			
	   				if((Math.abs(r1-r2)==2 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==2))
	   				{
	   					b[r2][c2].setIcon(sic);
	   					b[r1][c1].setIcon(null);
	   					cl=1;
	   					n=2;
	   					jp.updateTime(n);
	   				}
	   				else
    				{
    					cl=1;
    				}
	   			}
	    		
	    		else if(c.equalsIgnoreCase("BC"))
	    		{
	    			bo:
	   	    		 for(i=0;i<=7;i++)
	   	    		  {
	   	    			  for(j=0;j<=7;j++)
	   	    			  {
	   	    				  if(b[i][j]==b1)
	   	    				  {
	   	    					  r2=i;
	   	    					  c2=j;
	   	    					  break bo;
	   	    				  }
	   	    			  }
	   	    		  }
	   			
	   			
	    			if((Math.abs(r1-r2)==Math.abs(c1-c2)))
	   				{
	   					if(r1<r2 && c1>c2)
	   					{
	   						int cc=c1,m=0;
	   						for(i=r1;i<=r2;i++)
	   						{
	   							if(b[i][cc].getIcon()!=null)
	   							{
	   								m+=1;
	   								if(m>2)
	   								break;
	   							}
	   							cc-=1;
	   						}
	   						if(m==2)
	   						{
	   							b[r2][c2].setIcon(sic);
	   		   					b[r1][c1].setIcon(null);
	   		   					cl=1;
	   		   					n=2;
	   		   					jp.updateTime(n);
	   						}
	   					}
	   					else if(r2>r1 && c2>c1)
	   					{
	   			            	int cc=c1,m=0;
	   	   						for(i=r1;i<=r2;i++)
	   	   						{
	   	   							if(b[i][cc].getIcon()!=null)
	   	   							{
	   	   							m+=1;
	   								if(m>2)
	   								break;
	   	   							}
	   	   							cc+=1;
	   	   						}
	   	   						if(m==2)
	   	   						{
	   	   							b[r2][c2].setIcon(sic);
	   	   		   					b[r1][c1].setIcon(null);
	   	   		   					cl=1;
	   	   		   					n=2;
	   	   		   					jp.updateTime(n);
	   	   						}
	   					}
	   					else if(r2<r1 && c2<c1)
	   					{
	   						int cc=c2,m=0;
		   						for(i=r2;i<=r1;i++)
		   						{
		   							if(b[i][cc].getIcon()!=null)
		   							{
		   								m+=1;
    	   								if(m>2)
    	   								break;
		   							}
		   							cc+=1;
		   						}
		   						if(m==2)
		   						{
		   							b[r2][c2].setIcon(sic);
		   		   					b[r1][c1].setIcon(null);
		   		   					cl=1;
		   		   					n=2;
		   		   					jp.updateTime(n);
		   						}
	   					}
	   					else if(r2<r1 && c2>c1)
	   					{
	   						int cc=c2,m=0;
		   						for(i=r2;i<=r1;i++)
		   						{
		   							if(b[i][cc].getIcon()!=null)
		   							{
		   								m+=1;
    	   								if(m>2)
    	   								break;
		   							}
		   							cc-=1;
		   						}
		   						if(m==2)
		   						{
		   							b[r2][c2].setIcon(sic);
		   		   					b[r1][c1].setIcon(null);
		   		   					cl=1;
		   		   					n=2;
		   		   					jp.updateTime(n);
		   						}
	   					}
	   					
	   				}
	   				else
    				{
    					cl=1;
    				}
	   			}
	   			
	    		else if(c.equalsIgnoreCase("BQ"))
	    		{
	    			bo:
	      	    		 for(i=0;i<=7;i++)
	      	    		  {
	      	    			  for(j=0;j<=7;j++)
	      	    			  {
	      	    				  if(b[i][j]==b1)
	      	    				  {
	      	    					  r2=i;
	      	    					  c2=j;
	      	    					  break bo;
	      	    				  }
	      	    			  }
	      	    		  }
	      			
	    			if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0) || (Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    				{
    					if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)!=0))
    					{
    						if(c1>c2)
    						{
    							for(i=c2+1;i<=c1-1;i++)
    							{
    								if(b[r1][i].getIcon()!=null)
    								{
    									break;
    								}
    							}
    							if(i==c1)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    						else
    						{
    							for(i=c1+1;i<=c2-1;i++)
    							{
    								if(b[r1][i].getIcon()!=null)
    								{
    									break;
    								}
    							}
    							if(i==c2)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    							
    						}
    					}
    					else if((Math.abs(r1-r2)!=0 && Math.abs(c1-c2)==0))
    					{
    						if(r1>r2)
    						{
    							for(i=r2+1;i<=r1-1;i++)
    							{
    								if(b[i][c1].getIcon()!=null)
    								{
    									break;
    								}
    							}
    							if(i==r1)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    						else
    						{
    							for(i=r1+1;i<=r2-1;i++)
    							{
    								if(b[i][c2].getIcon()!=null)
    								{
    									break;
    								}
    							}
    							if(i==r2)
    							{
    								b[r2][c2].setIcon(sic);
    		    					b[r1][c1].setIcon(null);
    		    					cl=1;
    		    					n=2;
    		    					jp.updateTime(n);
    							}
    						}
    					}
    					
    				}
	      				else if((Math.abs(r1-r2)==Math.abs(c1-c2)))
		   				{
		   					if(r1<r2 && c1>c2)
		   					{
		   						int cc=c1,m=0;
		   						for(i=r1;i<=r2;i++)
		   						{
		   							if(b[i][cc].getIcon()!=null)
		   							{
		   								m+=1;
		   								if(m>2)
		   								break;
		   							}
		   							cc-=1;
		   						}
		   						if(m==2)
		   						{
		   							b[r2][c2].setIcon(sic);
		   		   					b[r1][c1].setIcon(null);
		   		   					cl=1;
		   		   					n=2;
		   		   					jp.updateTime(n);
		   						}
		   					}
		   					else if(r2>r1 && c2>c1)
		   					{
		   			            	int cc=c1,m=0;
		   	   						for(i=r1;i<=r2;i++)
		   	   						{
		   	   							if(b[i][cc].getIcon()!=null)
		   	   							{
		   	   							m+=1;
		   								if(m>2)
		   								break;
		   	   							}
		   	   							cc+=1;
		   	   						}
		   	   						if(m==2)
		   	   						{
		   	   							b[r2][c2].setIcon(sic);
		   	   		   					b[r1][c1].setIcon(null);
		   	   		   					cl=1;
		   	   		   					n=2;
		   	   		   					jp.updateTime(n);
		   	   						}
		   					}
		   					else if(r2<r1 && c2<c1)
		   					{
		   						int cc=c2,m=0;
			   						for(i=r2;i<=r1;i++)
			   						{
			   							if(b[i][cc].getIcon()!=null)
			   							{
			   								m+=1;
	    	   								if(m>2)
	    	   								break;
			   							}
			   							cc+=1;
			   						}
			   						if(m==2)
			   						{
			   							b[r2][c2].setIcon(sic);
			   		   					b[r1][c1].setIcon(null);
			   		   					cl=1;
			   		   					n=2;
			   		   					jp.updateTime(n);
			   						}
		   					}
		   					else if(r2<r1 && c2>c1)
		   					{
		   						int cc=c2,m=0;
			   						for(i=r2;i<=r1;i++)
			   						{
			   							if(b[i][cc].getIcon()!=null)
			   							{
			   								m+=1;
	    	   								if(m>2)
	    	   								break;
			   							}
			   							cc-=1;
			   						}
			   						if(m==2)
			   						{
			   							b[r2][c2].setIcon(sic);
			   		   					b[r1][c1].setIcon(null);
			   		   					cl=1;
			   		   					n=2;
			   		   					jp.updateTime(n);
			   						}
		   					}
		   					
		   				}
	      				else
	    				{
	    					cl=1;
	    				}
	      				
	      			}
	    		
	    		else if(c.equalsIgnoreCase("BK"))
	    		{
	    			bo:
	      	    		 for(i=0;i<=7;i++)
	      	    		  {
	      	    			  for(j=0;j<=7;j++)
	      	    			  {
	      	    				  if(b[i][j]==b1)
	      	    				  {
	      	    					  r2=i;
	      	    					  c2=j;
	      	    					  break bo;
	      	    				  }
	      	    			  }
	      	    		  }
	      			
	      			
	      				if((Math.abs(r1-r2)==0 && Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==0) || (Math.abs(r1-r2)==1 && Math.abs(c1-c2)==1))
	      				{
	      					b[r2][c2].setIcon(sic);
	      					b[r1][c1].setIcon(null);
	      					cl=1;
	      					n=2;
	      					jp.updateTime(n);
	      				}
	      				else
	    				{
	    					cl=1;
	    				}
	      			}
	    		
	    		else if(c.equalsIgnoreCase("BN"))
	    		{
	    			bo:
	     	    		 for(i=0;i<=7;i++)
	     	    		  {
	     	    			  for(j=0;j<=7;j++)
	     	    			  {
	     	    				  if(b[i][j]==b1)
	     	    				  {
	     	    					  r2=i;
	     	    					  c2=j;
	     	    					  break bo;
	     	    				  }
	     	    			  }
	     	    		  }
	     				if((Math.abs(r1-r2)==1 && c1!=c2) && r2>r1)
	     				{
	     					b[r2][c2].setIcon(sic);
	     					b[r1][c1].setIcon(null);
	     					cl=1;
	     					n=2;
	     					if(r2==0)
	     					{
	     						po.show(this, b[r2][c2].getX(), b[r2][c2].getY());
	     					}
	     					jp.updateTime(n);
	     				}
	     				else
	    				{
	    					cl=1;
	    				}
	     			}
	     	}
	    }
	    }
}

