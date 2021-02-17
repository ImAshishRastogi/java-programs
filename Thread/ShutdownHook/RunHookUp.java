import java.awt.*;
import javax.swing.*;
class ShutdownHooks implements Runnable
{
	public void run()
	{
		System.out.println("...Shutdown Hook started....");
		System.out.println("...Application shutting down...");
		try
		{
			Thread.sleep(1000*5);
		}catch(Exception e){}
	}
}
public class RunHookUp
{
	public static void main(String...args)
	{
		Runtime runTime=Runtime.getRuntime();
		ShutdownHooks hook=new ShutdownHooks();
		//registering the shutdown hook
		runTime.addShutdownHook(new Thread(hook));
		//int x=10/0;
		JFrame testFrame=new JFrame("test frame");
		testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		testFrame.setSize(400,400);
		testFrame.setVisible(true);
		System.out.println("hello");
	}
}