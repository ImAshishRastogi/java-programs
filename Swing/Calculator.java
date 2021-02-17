import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculator extends JFrame
{
	JButton b[][]=new JButton[6][4];
	String c[][] ;
	Label jl;
	Calculator(String s)
	{
		super(s);
		//Container content = getContentPane();
		WindowUtilities.setNativeLookAndFeel();
		c =new String[][]{ {"%","sqrt","x^2","1/x"},{"CE","C","back","/"},{"9","8","7","*"},{"4","5","6","-"},{"1","2","3","+"}, {"+/-","0",".","="} };
		jl =new Label("0",Label.RIGHT);
		jl.setBounds(5,5,240,70);
		jl.setBackground(Color.blue);
		add(jl);
		Outer o=new Outer(this);
		for(int k=0,j=90   ;k<6;   k++,j+=58)
			for(int l=0,i=10     ;l<4;   l++,i+=58)
			{
				b[k][l]=new JButton(c[k][l]);
				b[k][l].setBounds(i,j,55,50);
				b[k][l].addActionListener(o);
				b[k][l].setBackground(Color.red);
				add(b[k][l]);
			}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setSize(270,480);
		setVisible(true);
	}
	public static void main(String... args)
	{
		new Calculator("Calculator");
	}
}
class Outer implements ActionListener
{
	Calculator t;
	Outer(Calculator t)
	{
		this.t=t;
	}
	public void actionPerformed(ActionEvent e)
	{
		
		String s=t.jl.getText();
		if(e.getSource()==t.b[1][2])//backspace
		{
			if(t.jl.getText().length()==1)
				t.jl.setText("0");
			else if(t.jl.getText().length()>1)
			{
				String s1=s.substring(0,s.length()-1);
				t.jl.setText(s1);
			}
			else{}
		}
		else
		{
		for(int i=2;i<6;i++)
			for(int j=0;j<3;j++)
		if(e.getSource()==t.b[i][j] && e.getSource()!=t.b[5][0])//  0-9 & '.'
		{
			if(s=="0")
			s="";	
	
			s+=t.c[i][j];
			t.jl.setText(s);
		}
		}
		
		
		
	}
}
