import java.awt.*;
import java.awt.event.*;

class TwoInOne implements ActionListener
{
	Frame f;
	Button b1,b2;
	Label l;
	TextField tf;
	TwoInOne(String s)
	{
		f=new Frame(s);
		l=new Label("click to display:");
		l.setBounds(40,40,100,20);
		f.add(l);
		tf=new TextField();
		tf.setBounds(150,40,50,20);
		f.add(tf);
		b1=new Button("OK");
		b1.setBounds(40,100,50,50);
		b2=new Button("CANCEL");
		b2.setBounds(120,100,50,50);
		
		
		Outer o=new Outer(this);
		b1.addActionListener(o); //outer listener
		b2.addActionListener(o);
		/*b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					tf.setText("ashish");
			}
		});
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					tf.setText("rajat");
			}
		});*/
		//b1.addActionListener(this); //inner listener
		//b2.addActionListener(this); //inner listener
		
		f.add(b1);
		f.add(b2);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			tf.setText("ok");
		}
		if(ae.getSource()==b2)
		{
			tf.setText("cancel");
		}
	}
	public static void main(String... args)
	{
		new TwoInOne("My Frame");
	}
}


class Outer implements ActionListener 
{
	TwoInOne t;
	Outer(TwoInOne t)
	{
		this.t=t;
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==t.b1)
		t.tf.setText("YES");
		if(e.getSource()==t.b2)
			t.tf.setText("NO");
			
	}
}