import java.awt.*;
import java.awt.event.*;
class MyFrame //extends Frame
{
	Frame f;
	Button b;
	TextField tf;
	Label l,l1;
	MyFrame(String s,int i,int j)
	{
		f=new Frame(s);
		l=new Label("Enter the value:");
		l.setBounds(40,40,80,20);
		f.add(l);
		l1=new Label("");
		l1.setBounds(240,40,80,20);
		f.add(l1);
		tf=new TextField();
		tf.setBounds(150,40,80,20);
		f.add(tf);
		b=new Button("OK");
		b.setBounds(40,100,50,20);
		f.add(b);
		
		/*f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				f.dispose();
			}
		});
		*/
		f.addWindowListener(new WindowEventListener());
		f.addMouseListener(new MouseEventListener(this));
		tf.addKeyListener(new KeyEventListener(this));
		
		Toolkit t=f.getToolkit();
		Dimension screensize=t.getScreenSize();
		int width=screensize.width*8/10;
		int height=screensize.height*8/10;
		f.setBounds(width/8,height/8,width,height);
		f.setLayout(null);
		//super(s);
		//f.setSize(i,j);
		f.setVisible(true);
	}
	public static void main(String... args)
	{
		new MyFrame("MF",600,600);
		//new MyFrame("SF",400,400);
		/*Frame f=new Frame("via main");
		f.setSize(400,400);
		f.setVisible(true);*/
			
	}
}


class WindowEventListener extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}
class MouseEventListener extends MouseAdapter
{
	MyFrame mf;
	MouseEventListener(MyFrame f)
	{
		this.mf=f;
	}
	public void mouseClicked(MouseEvent e)
	{
		mf.tf.setText("Mouse Event");
		mf.f.setBackground(Color.RED);
	}
}
class KeyEventListener extends KeyAdapter
{
		MyFrame t;
	KeyEventListener(MyFrame f)
	{
		this.t=f;
	}
	 public void keyPressed(KeyEvent e) {  
		char c=e.getKeyChar();
		if( (c>='a' && c<='z')||(c>='A' && c<='Z')  )
		{
					System.out.println(e.getKeyChar());
					t.l1.setText("");
					t.l1.setBackground(Color.WHITE);
		}
		else
		{
			t.l1.setText("invalid");
			t.l1.setBackground(Color.RED);
		}
    }  
	/*public void keyTyped(KeyEvent e)
	{
		char c=e.getKeyChar();
		if( (c>='a' && c<='z')||(c>='A' && c<='Z')  )
		{
					System.out.println(e.getKeyChar());
					t.l1.setText("");
					t.l1.setBackground(Color.WHITE);
		}
		else
		{
			t.l1.setText("invalid");
			t.l1.setBackground(Color.RED);
			String s;
			s=""+t.tf.getText();
			t.tf.setText(s);
		}

	}*/
	
}