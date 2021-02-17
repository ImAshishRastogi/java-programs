import java.util.concurrent.locks.ReentrantLock;
class TechLead extends Thread
{
	ReentrantLock questionPaper;
	String name;
	TechLead(ReentrantLock questionPaper,String name)
	{
		super(name);
		this.questionPaper=questionPaper;
	}
	public void run()
	{
		System.out.println(getName()+"  is waiting for question Paper");
		
		questionPaper.lock();
		
		System.out.println(getName()+" takes the question Paper");
		System.out.println(getName()+" start taking test");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println(getName()+ "is inturrupted");
			}
			System.out.println(getName()+" has taken the test");
			System.out.println(getName()+" return the question paper");
			
			questionPaper.unlock();
	}
}
public class MainHR
{
	public static void main(String...args)
	{
		ReentrantLock questionPaper=new ReentrantLock();
		new TechLead(questionPaper,"LALU").start();
		new TechLead(questionPaper,"MANMOHAN").start();
		new TechLead(questionPaper,"NITIN").start();
		System.out.println("HR completes his work");
	}
}