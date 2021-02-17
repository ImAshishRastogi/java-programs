import java.awt.*;
import java.awt.event.*;
class Calc extends Frame
{
	Button b[][]=new Button[6][4];
	String c[][] ;
	TextField tf ;
	Calc(String s)
	{
		super(s);
		c =new String[][]{ {"%","rt","x^2","1/x"},{"CE","C","<","/"},{"9","8","7","*"},{"4","5","6","-"},{"1","2","3","+"}, {"+/-","0",".","="} };
		tf =new TextField();
		tf.setBounds(20,40,230,70);
		add(tf);
		Outer o=new Outer(this);
		for(int k=0,j=120   ;k<6;   k++,j+=60)
			for(int l=0,i=20     ;l<4;   l++,i+=60)
			{
				b[k][l]=new Button(c[k][l]);
				b[k][l].setBounds(i,j,50,50);
				b[k][l].addActionListener(o);
				add(b[k][l]);
			}
			
		/*	addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });*/
		Close cl=new Close(this); 
		addWindowListener(cl);
		
		setLayout(null);
		setSize(270,480);
		setVisible(true);
	}
	public static void main(String... args)
	{
		new Calc("Calculator");
	}
}
class Outer implements ActionListener
{
	Calc t;
	static String s="";
	Outer(Calc t)
	{
		this.t=t;
	}
	public void actionPerformed(ActionEvent e)
	{
		for(int i=0;i<6;i++)
			for(int j=0;j<4;j++)
		if(e.getSource()==t.b[i][j])
		{
			String s;
			s=""+t.tf.getText();
			s+=t.c[i][j];
		t.tf.setText(s);
		
		}	
	}
}
class Close extends WindowAdapter
{
	Calc t;
	Close(Calc t)
	{
		this.t=t;
	}
	public void windowClosing(WindowEvent e)
	{
		t.dispose();
	}
}