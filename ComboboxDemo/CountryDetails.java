import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CountryDetails extends JFrame implements ItemListener
{
static JFrame countryFrame;
JComboBox combo_box;
public void details()
{
	String country_names[]={"Nepal","India","China","China2"};
	combo_box= new JComboBox(country_names);
	//mathi.setEditable(false);
	JPanel header_card = new JPanel(new FlowLayout());
	header_card.add(combo_box);
	combo_box.addItemListener(this);
countryFrame.add(header_card);
}

public void itemStateChanged(ItemEvent e)
{
	String toShow= (String)e.getItem();
	Country sh=new Country(toShow);
	MyPanel pan=new MyPanel();
	JPanel showPanel=new JPanel();
	showPanel=pan.generatePanel(sh);
	countryFrame.add(showPanel);
	countryFrame.add(new JLabel("hello"));


}
public static void startAllThis()
{
	countryFrame = new JFrame();
	countryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	countryFrame.setVisible(true);
	countryFrame.add(new JLabel("hello"));
	CountryDetails c=new CountryDetails();
	c.details();
       
        countryFrame.pack();
        countryFrame.setVisible(true);
}
public static void main(String[] args) {
	
	startAllThis();
}

}