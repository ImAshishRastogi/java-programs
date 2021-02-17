import java.util.concurrent.Semaphore;
public class HRManager
{
	public static void main(String...args)
	{
		Semaphore questionPaperPool=new Semaphore(2);
		TechLead techLead1=new TechLead(questionPaperPool,"Amit TL");
		TechLead techLead2=new TechLead(questionPaperPool,"Sachin TL");
		TechLead techLead3=new TechLead(questionPaperPool,"Dinesh TL");
		TechLead techLead4=new TechLead(questionPaperPool,"Gaurav TL");
		
		techLead1.start();
		techLead2.start();
		techLead3.start();
		techLead4.start();
		
		System.out.println("No work for HR Manager");
	}
}

class TechLead extends Thread
{
	Semaphore questionPaperPool;
	public TechLead(Semaphore questionPaperPool,String name)
	{
		super(name);
		this.questionPaperPool=questionPaperPool;
	}
	@Override
	public void run()
	{
		try{
			System.out.println(Thread.currentThread().getName()+ " waiting for test question paper");
			//Acquiring one test question paper
			questionPaperPool.acquire();
			System.out.println(Thread.currentThread().getName()+" acquired test paper");
			System.out.println(Thread.currentThread().getName()+" Conducting test");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" Test done giving back the paper");
			//giving back the acquired question paper
			questionPaperPool.release();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}