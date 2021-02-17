//PipedReader & PipedWriter
import java.io.*;
class Poutput implements Runnable
{
	PipedWriter pw;
	Poutput(PipedWriter pw)
	{
		this.pw=pw;
	}
	public void run()
	{
		for(int i=65;i<=91;i++)
		{
			try
			{
				pw.write(i);
				Thread.sleep(1000);
			}catch(Exception e)
			{
			}
		}
	}
}
class Pinput implements Runnable
{
	PipedReader pr;
	Pinput(PipedReader pr)
	{
		this.pr=pr;
	}
	public void run()
	{
		int z=0;
		for(int i=65;i<=91;i++)
		{
			try{
				z=pr.read();
			}catch(Exception e){}
			System.out.print((char)z);
		}
	}
}

class Prun
{
	public static void main(String...args) throws IOException
	{
		PipedWriter pout=new PipedWriter();
		PipedReader pin=new PipedReader();
		pout.connect(pin);
		Poutput po=new Poutput(pout);
		Pinput pi=new Pinput(pin);
		Thread t1=new Thread(po);
		Thread t2=new Thread(pi);
		t1.start();
		t2.start();
	}
}