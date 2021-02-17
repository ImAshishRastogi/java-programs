import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Test
{
	JFrame f;
	JTextField jt;
	Jpanel jp,jp1;
	JButton jb;
	Test(String s)
	{
		f=new JFrame(s);
		jp=new JPanel();
		jp1=new JPanel();
		jt=new JTextField();
		
//f.setLayout(new GridLayout(2,2));//WindowConstants
//f.setLayout(new FlowLayout(FlowLayout.CENTER));
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(400,400);
//f.pack();
f.setVisible(true);
	}
	
	public static void main(String...args)
	{
	new Test("check");	
	}
}