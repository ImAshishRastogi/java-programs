class MyAuto
{
	public static void main(String... s)
	{
		try(Demo d=new Demo();
		Demo1 d1=new Demo1();)
		{
			int x=10/0;
			d.show();
			d1.show1();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class Demo implements AutoCloseable
{
	void show()
	{
		System.out.println("Show");
	}
	
	public void close()
	{
		System.out.println("close from Demo");
	}
}

class Demo1 implements AutoCloseable
{
	void show1()
	{
		System.out.println("Show1");
	}
	
	public void close()
	{
		System.out.println("close from Demo1");
	}
}