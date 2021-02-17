import java.awt.*;
import java.awt.event.*;
class EventDemo implements ActionListener
{
Frame F;
TextField tf;
Button b,b1;
EventDemo(String s)
{
 	F=new Frame(s);
	b=new Button("ok");
	b.setBounds(20,100,40,40);
	b1=new Button("cancel");
	b1.setBounds(20,180,40,40);
	//Outer o=new Outer(this);
	b.addActionListener(
	new ActionListener()
	{ 
	public void actionPerformed(ActionEvent e)
	{	tf.setText("oh yes");}
	}
	);
	b1.addActionListener(new ActionListener()
	{ public void actionPerformed(ActionEvent e)
{	tf.setText("oh no");}});
	
	F.add(b);
	F.add(b1);
	tf=new TextField();
	tf.setBounds(20,40,100,40);
	F.add(tf);
	
	F.setLayout(null);
	F.setSize(400,400);
	F.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{

	if(e.getSource()==b)
	tf.setText("done");
	if(e.getSource()==b1)
	tf.setText("not done");
}
public static void main(String...s)
{
	new EventDemo("Event demo");
}
}

class Outer implements ActionListener
{
EventDemo f;
Outer(EventDemo f)
{
this.f=f;
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==f.b)
f.tf.setText("YES");
if(e.getSource()==f.b1)
f.tf.setText("NO");
}
}
