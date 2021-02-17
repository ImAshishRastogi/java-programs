class MyThread extends Thread
{
	public MyThread()
	{
		setDaemon(true);
	}
	public void run()
	{
	/*	try{
			Thread.sleep(1000);
		}catch(Exception e)
		{}
		*/
	for(int i=1;i<=10;i++)
		System.out.println("counting: "+i);
	}
}
public class YieldExample
{
	public static void main(String...args)
	{
		MyThread t=new MyThread();
		t.start();
		Thread.yield();
		System.out.println(Thread.currentThread().getName());
	}
}