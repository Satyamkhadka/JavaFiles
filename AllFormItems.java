import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AllFormItems extends JFrame
{
	JLabel wel;
	JTextField tex;
	JLabel interest;
	JCheckBox front;
	JCheckBox back;
	JLabel choose;
	JRadioButton money;
	JRadioButton somebrains;
	
	JComboBox rate;
	JButton submit; 
	JLabel sh;
	public AllFormItems()
	{
		pack();
		setLayout(new FlowLayout()); //eightfourtyone
		wel = new JLabel(" welcome! please enter following details @");
		tex= new JTextField(35);
		tex.setText("Enter name Here!");
		interest = new JLabel("select your intersts!");
		front=new JCheckBox("Front-end development");
		back=new JCheckBox("Back-end development");
		choose = new JLabel("choose your preference");
		money = new JRadioButton("I will have Money",true);
		somebrains= new JRadioButton("Guess i'll settle with Some brain",true);
		ButtonGroup choose_group= new ButtonGroup();
		choose_group.add(money);
		choose_group.add(somebrains);

		String[] opt= new String[]{"select one number from 0 to 10","0","1","2","3","4","5","6","7","8","9","10"};
		rate= new JComboBox(opt);
		submit= new JButton("click to know yourself!");
		sh=new JLabel("enter details@");
		add(wel);add(tex);add(interest);add(front);add(back);add(choose);add(money);add(somebrains);add(rate);add(submit);add(sh);
		setVisible(true);

		submit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				String name=tex.getText();
				String career="want to become";
				if(front.isSelected()){
					if(back.isSelected())
						career+=" Full stack developer";
					else
						career+=" Front-end developer";
				}
				else{
					if(back.isSelected())
						career+=" Back-end developer";
					else
						career+=" NOTHING!!!";
				}

				String pref;
				if(money.isSelected())
					pref="you want money because you know you already have brains!";
				else
					pref="you want brains.. people want more of what they dont have.. in your case it is brain!! haha!";
				String rating;
				rating="On the basis of ATTRACTIVENESS this program's algorithm  rates you "+ rate.getItemAt(rate.getSelectedIndex()) +" out of ten.. Good LUCK";

				sh.setText("your name is "+ name+ " and "+career+ "and "+ pref + rating + "and have a good day thankyou!");
			}
		}); 
	}

	public static void main(String[] args) {
		
		new AllFormItems();
	}
}