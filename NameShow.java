import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class NameShow extends JFrame
{
	JLabel wel; JButton btn; JTextField tex; JLabel sh;
	public NameShow()
	{
		setLayout(new FlowLayout());
		wel= new JLabel("Type something there");
		tex=new JTextField(30);
		btn=new JButton("Show Below");
		sh= new JLabel(" ");
		add(wel); add(tex); add(btn);
		setVisible(true);
		setBounds(200,200,200,200);
	
	btn.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
			String textFromBox= tex.getText();
			sh.setText(textFromBox);
			add(sh);
		}
});
	}
	public static void main(String[] args)
	{
		new NameShow();

	}
}
