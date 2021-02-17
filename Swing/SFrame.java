import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class SFrame 
{
	JFrame f;
	JButton b;
	Button b1;
	JTextField jt;
	SFrame(String s)
	{
		f=new JFrame(s);
		jt=new JTextField();
		jt.setBounds(150,40,100,100);
		b=new JButton("Swing");
		b1=new Button("awt");
		b.setBounds(40,40,100,100);
		b1.setBounds(40,150,50,50);
		Container c=f.getContentPane();
		c.add(jt);
		c.add(b);
		c.add(b1);
		b.addActionListener(new ActionListener()
		{
			public  void actionPerformed(ActionEvent e)
	{
		jt.setText("Swing");
	}
		});
		b1.addActionListener(new ActionListener()
		{
			public  void actionPerformed(ActionEvent e)
	{
		jt.setText("awt");
	}
		});
		c.setLayout(null);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(400,400);
		f.setVisible(true);
	}
	
	public static void main(String...args)
	{
		new SFrame("Swing Frame");
	}
}