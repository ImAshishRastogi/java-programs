class Temp
{
	int Show()
	{
		try
		{
			return 20;
		}
		catch(Exception e)
		{}
		finally
		{
			return 40;
		}
	}
	
	public static void main(String... s)
	{
		Temp t=new Temp();
		try
		{
		//System.exit(0);
		int x=10/s.length;
		System.out.println(x);
		int z[]=new int[s.length];
		z[10]=1000;
		System.out.println("This message will not be printed");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("This will be printed");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{System.out.println(e);}
		
		//catch(ArithmeticException|ArrayIndexOutOfBoundsException e)
		//{System.out.println(e);}
		
		//catch(Error e)
		// {System.out.println(e);}
		
		//catch(Throwable e)
		//{System.out.println(e);}
		finally
		{
			System.out.println("finally block will always be printed");
		}
		//System.out.println(t.Show());
	}
}
class Demo
{
	public static void main(String... s)
	{
	try
	{
		try
		{
		int x=10/s.length;
		System.out.println(x);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		try
		{
		int z[]=new int[s.length];
		z[10]=1000;
		}
		catch(ArithmeticException|ArrayIndexOutOfBoundsException e)
		{System.out.println(e);}
	}
	catch(Exception e)
	{System.out.println(e);}
	}
}
