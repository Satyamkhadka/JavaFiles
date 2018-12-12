import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Radio extends JFrame implements ActionListener
{
	JLabel wel; JRadioButton btn; JTextField tex; JLabel sh; JRadioButton btn1; JRadioButton showk;
	public Radio()
	{
		setLayout(new FlowLayout());
		wel= new JLabel("Type something there");
		tex=new JTextField(30);
		btn=new JRadioButton("Sum");
		btn1=new JRadioButton("Product");
		showk=new JRadioButton("show kcmit");
		sh= new JLabel(" ");
		add(wel); add(tex); add(btn);add(btn1);
		add(showk);
	btn.addActionListener(this);
	btn1.addActionListener(this);
	showk.addActionListener(this);
add(sh);
		ButtonGroup operator = new ButtonGroup();
		operator.add(btn); operator.add(btn1);operator.add(showk);
		setVisible(true);
		setBounds(400,400,400,400);
	}

	public void actionPerformed(ActionEvent ae)
		{

			String text=tex.getText();
			String[] inp= text.split(",");
			int length= inp.length;
			int res=btn.isSelected()?0:1;
			boolean error=false;
			int temp;
			if(!showk.isSelected())
			{
				for(int i=0;i<length;i++)
				{
					try{
						temp=Integer.parseInt(inp[i]);
					}
					catch(Exception e)
					{
						error=true;
						break;
					}
					if(btn.isSelected())
					res+=temp;
					else 
						res*=temp;
				}
			}
			else if(showk.isSelected())
			{
				String kc="kcmit";
				String tosh="<html>";
				for(int j =0; j<kc.length();j++)
				{
					for(int k=0;k<=j;k++)
					 tosh+=kc.charAt(k);
				tosh+="<br>";
				}
				tosh+="<html>";
				sh.setText(tosh);
					error=true;
			}
			if(!error)
				sh.setText(Integer.toString(res));
		}


	public static void main(String[] args)
	{
		new Radio();

	}
}
// homework debug this 
// kcmit print
// simplify 