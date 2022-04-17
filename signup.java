import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
class signup
{
  JFrame fr;
  JLabel l1,l2,l3;
  JTextField t1;
  JPasswordField t2;
  JButton b1,b2;
  signup()
  {
     fr=new JFrame("sign up window");
	 fr.setVisible(true);
	 fr.setLayout(null);
	 fr.getContentPane().setBackground(Color.gray);
	 fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 fr.setSize(350,350);
	 b2=new JButton("Cancel"); 
	 b2.setBounds(160,230,80,30);
	 fr.add(b2);
	 l2=new JLabel("  user Id");
	 fr.add(l2);
	 l2.setBounds(40,140,80,30);
	 l3=new JLabel(" Password");
	 fr.add(l3);
	 l3.setBounds(40,180,80,30);
	 t1=new JTextField("");
	 fr.add(t1);
	 t1.setBounds(140,140,160,30);
	 t2=new JPasswordField("");
	 fr.add(t2);
	 t2.setBounds(140,180,160,30);
	 b1=new JButton("Submit");
	 fr.add(b1);
	 b1.setBounds(60,230,80,30);
	 ImageIcon ct=new ImageIcon("C:/Users/sonal/Pictures/coll/user.png");
	 Image im=ct.getImage().getScaledInstance(120,100,Image.SCALE_DEFAULT);
	 ImageIcon im1=new ImageIcon(im);
	 l1=new JLabel(im1);
	 fr.add(l1);
	 l1.setBounds(100,30,120,100);
	
	 Border b=BorderFactory.createTitledBorder("");
	 Font fo=new Font("serif",Font.BOLD,15);
	
	
	 l2.setForeground(Color.green);
	 l3.setForeground(Color.green);
	 b1.setBackground(Color.yellow);
	 b1.setForeground(Color.blue);
	 b1.setFont(fo);
	 b2.setBackground(Color.yellow);
	 b2.setForeground(Color.blue);
	 b2.setFont(fo);
	 t1.setBackground(Color.green);
	 t1.setForeground(Color.black);
	 t1.setFont(fo);
	 t2.setBackground(Color.green);
	 t2.setForeground(Color.black);
	 t2.setFont(fo);
	 l2.setBorder(b);
	 l3.setBorder(b);
	 l2.setFont(fo);
	 l3.setFont(fo);
	 
   }
   public static void main(String ar[])
   {
     new signup();
	}
}
