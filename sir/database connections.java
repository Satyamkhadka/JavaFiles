package javadatabase;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*; 
public class ui_person extends JFrame implements ActionListener{
	JLabel lname,lgender,laddress,lcontact;
	JTextField tname,tgender,taddress,tcontact;
	JButton btn;
	int i=3; 
	int id=5;
	public ui_person() {
		lname=new JLabel("Name");lname.setBounds(40,40,100,25);
		lgender=new JLabel("Gender");lgender.setBounds(40,70,100,25);
		laddress=new JLabel("Address");laddress.setBounds(40,100,100,25);
		lcontact=new JLabel("Contact");lcontact.setBounds(40,130,100,25);
		tname=new JTextField(30);tname.setBounds(130,40,100,25);
		tgender=new JTextField(30);tgender.setBounds(130,70,100,25);
		taddress=new JTextField(30);taddress.setBounds(130,100,100,25);
		tcontact=new JTextField(30);tcontact.setBounds(130,130,100,25);
		btn = new JButton("Click Me!");btn.setBounds(130,170,100,25);
		add(lname);add(tname);
		add(lgender);add(tgender);
		add(laddress);add(taddress);
		add(lcontact);add(tcontact);
		add(btn);
		setLayout(null);
		setSize(500,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		try{  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/fmis","root","");  
			  
			Statement stmt=con.createStatement();  
			String name=tname.getText();
			String gender=tgender.getText();
			String address=taddress.getText();
			String contact=tcontact.getText();
			id = i+51;
			stmt.execute("insert into person(pid,name,gender,address,contactno) values("+id+",'"+name+"','"+gender+
					"','"+address+"','"+contact+"')");
			con.close();  
			++i;
			}catch(Exception e){ System.out.println(e);}  
			} 
	public static void main(String[] op) {
		ui_person u = new ui_person(); 
	}
	}


package javadatabase;
import java.sql.*;  
public class MysqlCon {
	public static void main(String[] javaaa) {
	try{  
		  
		System.out.println("Displaying Records");
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/fmis","root","");    
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from person");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		stmt.execute("insert into person(pid,name,gender,address,contactno) values(46,'Keenu','M','California','33333')");
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  
}
