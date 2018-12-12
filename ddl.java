/*<applet code="GraphicsFirst.class" width="350" height="350">*/
import java.applet.*;
import java.awt.*;

public class ddl extends Applet{

	public void paint(Graphics g){
		double x,y,x1,y1,x2,y2,dx,dy;
		int steps;

		x1=0;y1=0;x2=300;y2=400;
		dx=x2-x1; dy=y2-y1;
		steps= (dx>dy)?(int)dx:(int)dy;
		x=x1;y=y1;
		double xinc=dx/steps; double yinc=dy/steps;
		for(int k=steps;k<=steps;steps++){
			g.drawLine((int)x,(int)y,(int)x,(int)y);
			x+=xinc; y+=yinc;
		}
	}
}