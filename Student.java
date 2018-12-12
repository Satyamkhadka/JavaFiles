import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

interface FeeChangedListener{
	public void onFeeChange(String message);
}

class StudentDetails{

	private String name;
	private String add;
	private int fee;
	private FeeChangedListener a;
	public void addValue(String name, String add)
	{
		this.fee=10000;
		this.name=name;
		this.add=add;
	}

	public void setFeeListener(FeeChangedListener a)
	{
		this.a=a;
		//System.out.println("debug: : set object flag");
	}

	public void changeFee(int change_amt){
			

		if(a!=null)
		{
			this.fee=+change_amt;
			a.onFeeChange("fee has been increased");
		}
	}
}

class Student {
	
static StudentDetails one=new StudentDetails();
		public static void main(String[] args) {

			JFrame o = new JFrame();
			o.setSize(800,1200);
			o.setLayout(new FlowLayout());
			JLabel header= new JLabel("insert name and address");
			JTextField name= new JTextField(30);
			JTextField add= new JTextField(30);
			JButton submit=new JButton("submit");
			JLabel show = new JLabel("fee item");
			JLabel details = new JLabel("");
			JButton increase= new JButton("Increase fee");
			JTextField incamt= new JTextField(5);
			o.setVisible(true);
			

			o.add(header); o.add(name); o.add(add); o.add(submit); //o.add(show); o.add(details);

			submit.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
				String nam=name.getText(), addr=add.getText();
					one.addValue(nam,addr); 
				//na=nam; addre=addr;
				o.remove(header); o.remove(name); o.remove(add); o.remove(submit);
				o.add(details);
				details.setText("name:: "+nam+ " address : "+ addr );
				o.add(increase);
				o.add(incamt);
			}
			});
			increase.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent a){
					int increase_amt= Integer.parseInt(incamt.getText());

					one.changeFee(increase_amt);
				}
			});
			one.setFeeListener(new FeeChangedListener(){
				public void onFeeChange(String message)
				{
					o.add(show);
				show.setText(message);
				}
			});
		
		}
}