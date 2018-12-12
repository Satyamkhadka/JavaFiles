import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyPanel
{
	public JPanel generatePanel(Country c)
	{
	JPanel country_panel=new JPanel();
	country_panel.setLayout(new FlowLayout());
	JLabel name=new JLabel(c.name);
	JLabel area=new JLabel(c.area+"");
	country_panel.add(name);country_panel.add(area); country_panel.setVisible(true);
	return country_panel;
	}
}