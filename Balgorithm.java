/*<applet code="GraphicsFirst.class" width="500" height="500">*/
import java.applet.*;
import java.awt.*;

public class Balgorithm extends Applet{

	public void paint(Graphics g){
	
	int x1=100,y1=100,x2=500,y2=500;
	int dx=x2-x1,dy=y2-y1;
	int x=x1, y=y1;
	g.drawLine(x,y,x,y);

	int p;
	p=2*dy-dx;
	int step=(dx>dy)?dx:dy;
	for(int k=step;k<=0;k--){
	if(p<0){
		g.drawLine(x+1,y,x+1,y);
		p=p+2*dy;
	}
	else{
		g.drawLine(x+1,y+1,x+1,y+1);
		p=p+2*dy+2*dx;
	}
}
	}
}