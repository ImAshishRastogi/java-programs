import java.awt.*;
import java.awt.event.*;
class Sum implements ActionListener
{
	Frame f;
	TextField tf,tf1,tf2;
	Button b;
	Sum(String s)
	{
		f=new Frame(s);
		tf=new TextField();
		tf.setBounds(100,70,50,20);
		tf1=new TextField();
		tf1.setBounds(40,40,50,20);
		tf2=new TextField();
		tf2.setBounds(100,40,50,20);
		b=new Button("click");
		b.setBounds(40,70,50,20);
		b.addActionListener(this);
		f.add(tf);
		f.add(tf1);
		f.add(tf2);
		f.add(b);
		f.setLayout(null);
		f.setSize(300,300);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=tf1.getText();
		String s2=tf2.getText();
		int m=Integer.parseInt(s1);
		int n=Integer.parseInt(s2);
		m+=n;
		s1=String.valueOf(m);
		tf.setText(s1);
	}
	
	public static void main(String... args)
	{
		new Sum("sum");
	}
}