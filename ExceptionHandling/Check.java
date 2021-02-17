class Check
{
	void show()
	{
		int x=10/0;
	}
	
	void display()
	{
		show();
	}
	void xyz()
	{
		display();
	}
	public static void main(String... s)
	{
		Check c=new Check();
		try
		{
			c.xyz();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}