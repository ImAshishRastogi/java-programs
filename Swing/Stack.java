import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Stack 
{
	int size=10;
	String stack[]=new String[size];
	int tos=-1;
	String emp="<html><FONT color=red>Stack is empty</FONT></html>";
	String full="<html><FONT color=red>Stack is full</FONT></html>";
	String pushSuc="<html><FONT color=green>Pushed Successfully.</FONT></html>";
	JFrame f;
	JButton push,pop;
	JTextArea out;
	JTextField inp;
	JLabel jl,status;
	Stack(String s)
	{
		try{
		f=new JFrame(s+"[size="+size+"]");
		push=new JButton("push");
		pop=new JButton("pop");
		inp=new JTextField("");
		inp.setHorizontalAlignment(JTextField.RIGHT);
		jl=new JLabel("enter number to push");
		out=new JTextArea("",stack.length,1);
		status=new JLabel();
		
		out.setBounds(210,10,100,300);
		inp.setBounds(10,10,50,20);
		jl.setBounds(70,10,200,20);
		push.setBounds(10,40,70,30);
		pop.setBounds(90,40,70,30);
		status.setBounds(10,80,200,20);
		
		push.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try{
				String item=inp.getText();
				System.out.println("item"+item);
				if(item.length()==0)
				{status.setText(
			"<html><<FONT COLOR=RED>Warning:</FONT>"+
			"please enter the number"+
			"</html>");
			}
				else{
			if(!overflow())
		{
			tos++;
			item=item.trim();
			inp.setText("");
			stack[tos]=item;
			out.insert(stack[tos]+"\n",0);
			status.setText(pushSuc);
			System.out.println("Pushed Successfully");
			System.out.println("tos: "+(tos));
			for(int i=tos;i>=0;i--)
			{
				
				System.out.println(stack[i]);
			}
			
		}
		else
		{
			status.setText(full);
			System.out.println("Stack is Full");
		}			
			}
		}catch(Exception ex)
		{}
			}
		});
		
		pop.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
		{
		try{
			if(!underflow())
			{
				status.setText("element "+stack[tos]+ " is poped.");
				tos--;
				System.out.println("tos: "+(tos));
				out.setText("");
			for(int i=tos;i>=0;i--)
			{
				out.append(stack[i]+"\n");
				System.out.println(stack[i]);
			}
			}else{
				status.setText(emp);
				System.out.println("Stack is empty");
			}
		}catch(Exception ex){}
		}
		});
		
		if(tos==-1)
			status.setText(emp);
		
		
		f.add(status);
		f.add(out);
		f.add(jl);	
		f.add(inp);
		f.add(push);
		f.add(pop);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(400,400);
		//f.pack();
		f.setVisible(true);
		}
		catch(Exception e)
		{System.out.println(e);}
		
	}
	boolean overflow()
	{
		return (tos==size-1);
	}
	boolean underflow()
	{
		return (tos==-1);
	}
	
	
	public static void main(String...args)
	{
		new Stack("Stack Operation");
	}
}
