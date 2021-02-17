class Temp1 extends Throwable
{
	public static void main(String... s)
	{
		/*try
		{
			throw new My("invalid");
		}
		catch(My e)
		{
			System.out.println(e);
		}*/
		
		int a=10;
		int b=0;
		My m=new My();
		try
		{
		int r=m.div(a,b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
	}
}


class My extends Throwable
{
	int div(int x,int y) throws ArithmeticException
	{
		return x/y;
	}
	
	/*My(String s)
	{
		super(s);
	}*/
}