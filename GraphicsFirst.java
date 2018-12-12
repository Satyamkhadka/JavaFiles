/*<applet code="GraphicsFirst.class" width="350" height="350">
import java.applet.*;
import java.awt.*;
<applet code="GraphicsFirst.class" width="350" height="350">
public class GraphicsFirst extends Applet{
  public void paint(Graphics g){
    double x1=0,y1=0,x2=150,y2=250;
    double dx= x2-x1, dy=y2-y1;
    int steps;
    steps=(dx > dy)?(int)dx : (int)dy;
    double x=x1,y=y1;
    g.drawLine((int)x,(int)y,(int)x,(int)y);
    double xinc= dx/steps,yinc=dy/steps;
    for(int k=0;k<=steps;steps++)
    {
        x+=Math.round(xinc); y=+Math.round(yinc);
        g.drawLine((int)x,(int)y,(int)x,(int)y);
    }
    g.drawLine(0,0,250,250);
    }

    public static void main(String[] args) {

    }
  }


 import java.io.*;
import java.awt.*;
import java.applet.*;
import java.util.*;
public class GraphicsFirst extends Applet
{
public void paint(Graphics g)
{
double dx,dy,steps,x,y,k;
double xc,yc;
double x1=200,y1=500,x2=600,y2=200;
dx=x2-x1;
dy=y2-y1;
if(Math.abs(dx)>Math.abs(dy))
steps=Math.abs(dx);
else
steps=Math.abs(dy);
xc=(dx/steps);
yc=(dy/steps);
x=x1;
y=y1;
g.fillOval(200,500,5,5);
for(k=1;k<=steps;k++)
{
x=x+xc;
y=y+yc;
g.fillOval((int)x,(int)y,5,5);
}
}
}

import java.awt.*;
import javax.swing.JFrame;
import java.util.Scanner;
import java.lang.*;
public class DDA extends Canvas
{
   static int  x0, y0,x1,y1;
    DDA(int x0,int y0,int x1,int y1)
 {
       this.x0=x0;
   this.y0=y0;
   this.x1=x1;
   this.y1=y1;
 }
 public void paint(Graphics g)
 {
    int dx,dy;
  float Xinc,Yinc,x,y,steps;
  dy=y1-y0;
  dx=x1-x0;
  g.fillOval(x0,y0,10,10);
  if(dy>dx)
  {
   steps=Math.abs(dy);
  }
  else
  {
   steps=Math.abs(dx);
  }
  x=x0;
  y=y0;
  Yinc=dy/steps;
  Xinc=dx/steps;
  while(steps!=0)
  {

   steps--;
    x=x+Xinc;
           y=y+Yinc;
              
   g.fillOval(Math.round(x),Math.round(y),10,10);
                
  }
  
 }
 
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter first end x0 and y0");
       int x0=sc.nextInt();
   int y0=sc.nextInt();
   System.out.println("Enter last end x1 and y1");
   int x1=sc.nextInt();
   int y1=sc.nextInt();
   DDA d=new DDA(x0,y0,x1,y1);
   JFrame f=new JFrame();
   f.add(d);
   f.setSize(800,800);
   f.setVisible(true);
 }
}*/

/*<applet code="GraphicsFirst.class" width="500" height="500">*/




/*// bresenhams algorithm working both way for positive as well as negetive slopes**** yeah
import java.applet.*;
import java.awt.*;

public class GraphicsFirst extends Applet{

	public void paint(Graphics g){
	
	int x,y,x1=0,y1=0,x2=550,y2=550;
	if(x1>x2)
		{ x=x2;y=y2;}
	else 
		{ x=x1; y=y1;}
	float slope= ((x2-x1)/(y2-y1));
	int dx=Math.abs(x2-x1),dy=Math.abs(y2-y1);
	
	System.out.println(slope);
	int step=(dx>dy)?dx:dy;
	if(Math.abs(slope)>1 )
	{
		dx=Math.abs(dx);
		g.drawLine(x,y,x,y);
		System.out.println("negetive!!");
		int p;
		p=2*dx-dy;
		
		for(int k=0;k<=step;k++){
		if(p<0){
			y++;
			g.drawLine(x,y,x,y);
			
			p=p+(2*dx);
		}
		else{
			x++;y--;
			g.drawLine(x,y,x,y);
			p=p+(2*dx)-(2*dy);

	}
		}
	}
		else {

	g.drawLine(x,y,x,y);

	int p;
	p=(2*dy)-dx;
	
	for(int k=0;k<=step;k++){
	if(p<0){
		x++;
		g.drawLine(x,y,x,y);
		
		p=p+(2*dy);
	}
	else{
		x++;y++;
		g.drawLine(x,y,x,y);
		p=p+(2*dy)-(2*dx);
		
	}
	}
		}
		
		
		
}
	}
*/



import java.applet.*;
import java.awt.*;

public class GraphicsFirst extends Applet{

	public void paint(Graphics g){
		int rds=30,x=30,y=30;
		int[][] coods=new int[200][2];
		coods[0][0]=30;coods[0][1]=30+rds;
		x+=30;y+=30;
		float p=(5/4)-rds;
		int k=0;
		int length=0;
		while(coods[k][1]==coods[k][0] || coods[k][1]>coods[k][0])
		{
			k++;
			coods[k][0]=coods[k-1][0]+1;
			if(p<0)
			{
			coods[k][1]=coods[k-1][1];
			p=p+(2*coods[k][0])+1;
			}
			else
			{
			coods[k][1]=coods[k-1][1]-1;
			p=p+(2*coods[k][0])+1-(2*coods[k][1]);
			}
			length++;
		}
		
		while(length>=0)
		{
			g.drawLine(   coods[length][0]+x,   coods[length][1]+y,   coods[length][0]+x,   coods[length][1]);
			g.drawLine(   coods[length][0]+x,-1*coods[length][1]+y,   coods[length][0]+x,-1*coods[length][1]);
			g.drawLine(-1*coods[length][0]+x,   coods[length][1]+y,-1*coods[length][0]+x,   coods[length][1]);
			g.drawLine(-1*coods[length][0]+x,-1*coods[length][1]+y,-1*coods[length][0]+x,-1*coods[length][1]);
			
			g.drawLine(   coods[length][1]+x,   coods[length][0]+y,   coods[length][1]+x,   coods[length][0]+y);
			g.drawLine(   coods[length][1]+x,-1*coods[length][0]+y,   coods[length][1]+x,-1*coods[length][0]+y);
			g.drawLine(-1*coods[length][1]+x,   coods[length][0]+y,-1*coods[length][1]+x,   coods[length][0]+y);
			g.drawLine(-1*coods[length][1]+x,-1*coods[length][0]+y,-1*coods[length][1]+x,-1*coods[length][0]+y);
			
			
			System.out.print(length+"---->"); System.out.println(coods[length][0]+" ,"+coods[length][1]);
			length--;
		}
	}

	public static void main(String[] args) {
		
	}
}