import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class BLayout implements ActionListener
{
JFrame f;
JPanel jp;
JButton b[];
CardLayout cl;
JTextField jt[];
JTextField tf;
BLayout(String s)
{
jp=new JPanel();
jp.setBounds(50,50,100,100);
tf=new JTextField();
//tf.setBounds(10,10,100,10);
//f.add(tf);
cl=new CardLayout();
//jp.setLayout(cl);	
f=new JFrame("swing");
b=new JButton[5];
jt=new JTextField[5];
String s1[]={"north","south","east","west","center"};
String x[]={BorderLayout.NORTH,BorderLayout.SOUTH,BorderLayout.EAST,BorderLayout.WEST,BorderLayout.CENTER};
for(int i=0;i<b.length;i++)
{
b[i]=new JButton(s1[i]);
jt[i]=new JTextField(s1[i]);
b[i].addActionListener(this);
//jp.add(b[i],x[i]);
f.add(b[i],x[i]);
}
//f.add(jp);
//jp.setLayout(new GridLayout(b.length,0));//WindowConstants
///jp.setLayout(new FlowLayout(FlowLayout.CENTER));
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(400,400);
//f.pack();
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
cl.next(jp);
}
public static void main(String s[])
{

new BLayout("second frame");

}
}


//Container c=f.getContentPane();
//c.add(jt);
//c.add(b);
//c.add(b1);
//jp=new JPanel();
//cl=new CardLayout();
//jp.setLayout(cl);


