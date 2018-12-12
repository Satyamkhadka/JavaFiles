import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame
{
	JLabel des;
	JTextField input_one;
	JTextField input_two;
	JButton plus;
	JButton minus;
	JButton divide;
	JButton multiply;
	JButton reset;
	JLabel result;

	public Calculator()
	{
		setLayout(new FlowLayout());
		setBounds(400,400,400,400);
		des= new JLabel("enter two number");
		input_one= new JTextField(4);
		input_two= new JTextField(4);
		plus= new JButton("+");
		minus=new JButton("-");
		divide= new JButton("/");
		multiply= new JButton("X");
		reset= new JButton("reset");
		result= new JLabel();
		setVisible(true);
		add(des);
		add(input_one);
		add(input_two);
		add(plus);
		add(minus);
		add(divide);
		add(multiply);
		add(reset);
		add(result);
		plus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				int res=Integer.parseInt(input_one.getText())+Integer.parseInt(input_two.getText());
				result.setText(Integer.toString(res));
			}
		});

		minus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				int res=Integer.parseInt(input_one.getText())-Integer.parseInt(input_two.getText());
				result.setText(Integer.toString(res));
			}
		});

		divide.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				float res=Integer.parseInt(input_one.getText())/Integer.parseInt(input_two.getText());
				result.setText(Float.toString(res));
			}
		});

		multiply.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			
			{
				int res=Integer.parseInt(input_one.getText())*Integer.parseInt(input_two.getText());
				result.setText(Integer.toString(res));
			}
		});

		reset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				input_one.setText("");
				input_two.setText("");
				result.setText("cleared!");
			}
		});
	}
	public static void main(String[] args) {
		new Calculator();
	}
}