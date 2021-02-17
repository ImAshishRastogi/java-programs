import java.util.*;
import javax.swing.JFrame;
class Task extends TimerTask
{
	int count=0;
	//run is a abstract method  that define task performed at scheduling time
	public void run()
	{
		//if(count==0)
		//	System.exit(0);
		JFrame f = new JFrame();
		f.setSize(250,250);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		count++;
	}
}
class TaskScheduling
{
		public static void main(String...args)
		{
			Timer timer=new Timer();
			int delay=5000;
			int period=1000;
			timer.scheduleAtFixedRate(new Task(),delay,period);
		}
}