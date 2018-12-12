import java.applet.*;
import java.awt.*;

public class GraphicsFirst extends Applet{

	public void paint(Graphics g){
		int rds=6,x1=0,y1=0;
		int[][] coods=new int[50][2];
		coods[0][0]=x1;coods[0][1]=y1;
		int p=1-rds;
		int k=0;
		int length=0;
		while(coods[k][1]==coods[k][0] || coods[k][0]>coods[k][0])
		{
			k++;
			if(p<0)
			{
			coods[k][0]=coods[k-1][0]+1;
			coods[k][1]=coods[k-1][1];
			p=p+(2*coods[k][0])+1;
			}
			else
			{
			coods[k][0]=coods[k-1][0]+1;
			coods[k][1]=coods[k-1][1]-1;
			p=p+(2*coods[k][0])+1-(coods[k][1]);
			}
			length++;
		}
		while(length!=0)
		{
			g.drawLine(coods[length][0],coods[length][1],coods[length][0],coods[length][1]);
		}
	}

	public static void main(String[] args) {
		
	}
}