import java.util.concurrent.CyclicBarrier;
public class HRManager 
{
	public static void main(String...args)
	{
		CyclicBarrier cyclicBarrier=new CyclicBarrier(3);
		TechLead techLead1=new TechLead(cyclicBarrier,"lalu");
		TechLead techLead2=new TechLead(cyclicBarrier,"rabari");
		TechLead techLead3=new TechLead(cyclicBarrier,"meesa");
		
		techLead1.start();
		techLead2.start();
		techLead3.start();
		System.out.println("NO work for HR manager");
		
	}
}
class TechLead extends Thread
{
	CyclicBarrier cyclicBarrier;
	public TechLead(CyclicBarrier cyclicBarrier,String name)
	{
		super(name);
		this.cyclicBarrier=cyclicBarrier;
	}
	
	@Override
	
	public void run()
	{
		try{
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" recruited developer");
			System.out.println(Thread.currentThread().getName()+" waitng for other to complete" );
			cyclicBarrier.await();
			System.out.println("All finished recruiting "+ Thread.currentThread().getName()+" gives offer letter to candidate");
		}catch(Exception e){e.printStackTrace();}
	}
}