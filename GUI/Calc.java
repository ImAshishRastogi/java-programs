import java.awt.*;
class Calc
{
Frame F;
Button div,add,sub,mul,dot,equal,per,sqr,log,num1,num2,num3,num4,num5,num6,num7,num8,num9,num0,del;
Label l;
TextField tf;
Calc(String s)
{
F= new Frame(s);
//l=new Label("Enter the number");
//l.setBounds(30,30,80,10);
//F.add(l);
tf = new TextField();
tf.setBounds(10,30,250,80);
F.add(tf);
F.setResizable(false);
per=new Button("%");
per.setBounds(20,120,50,50);
F.add(per);
sqr=new Button("^2");
sqr.setBounds(80,120,50,50);
F.add(sqr);
log=new Button("log");
log.setBounds(140,120,50,50);
F.add(log);
del=new Button("del");
del.setBounds(200,120,50,50);
F.add(del);


num7=new Button("7");
num7.setBounds(20,180,50,50);
F.add(num7);
num8=new Button("8");
num8.setBounds(80,180,50,50);
F.add(num8);
num9=new Button("9");
num9.setBounds(140,180,50,50);
F.add(num9);
add=new Button("+");
add.setBounds(200,180,50,50);
F.add(add);


num4=new Button("4");
num4.setBounds(20,240,50,50);
F.add(num4);
num5=new Button("5");
num5.setBounds(80,240,50,50);
F.add(num5);
num6=new Button("6");
num6.setBounds(140,240,50,50);
F.add(num6);
sub=new Button("-");
sub.setBounds(200,240,50,50);
F.add(sub);

num1=new Button("1");
num1.setBounds(20,300,50,50);
F.add(num1);
num2=new Button("2");
num2.setBounds(80,300,50,50);
F.add(num2);
num3=new Button("3");
num3.setBounds(140,300,50,50);
F.add(num3);
mul=new Button("*");
mul.setBounds(200,300,50,50);
F.add(mul);

dot=new Button(".");
dot.setBounds(20,360,50,50);
F.add(dot);
num0=new Button("0");
num0.setBounds(80,360,50,50);
F.add(num0);
equal=new Button("=");
equal.setBounds(140,360,50,50);
F.add(equal);
div=new Button("/");
div.setBounds(200,360,50,50);
F.add(div);

F.setLayout(null);
F.setSize(330,420);
F.setVisible(true);
}
public static void main(String...s)
{
new Calc("Calculator");
}
}