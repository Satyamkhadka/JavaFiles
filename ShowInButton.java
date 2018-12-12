import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ShowInButton extends JFrame
{
	JLabel label;
	JTextField text;
	JButton btn;

	public ShowInButton()
	{
		setLayout(new FlowLayout());
		setBounds(400,400,400,400);
		label= new JLabel("enter some text");
		text= new JTextField(10);
		btn= new JButton("click here");
		JLabel jb= new JLabel("waiting for user to type...");		
		setVisible(true);
		add(label);
		add(text);
		add(btn);
		add(jb);
		btn.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent ae)
			{
				String data= text.getText();
				btn.setText(data);
				jb.setText("edited button to show: "+data);
			}
		});
	}

	public static void main(String[] args) {
		
		new ShowInButton();
	}
}