import java.awt.*;
class Demoframe
{
Frame F;
Button b;
Label l;
TextField tf;
Demoframe(String s)
{
F= new Frame(s);
l=new Label("Enter the number");
l.setBounds(30,30,80,10);
F.add(l);
tf = new TextField();
tf.setBounds(150,40,50,20);
F.add(tf);
b=new Button("ok");
b.setBounds(40,100,50,50);
F.add(b);
F.setLayout(null);
F.setSize(600,600);
F.setVisible(true);
}
public static void main(String...s)
{
Demoframe d=new Demoframe("FIRST FRAME");
}
}