class Emp
{
	int age;
	void get(int age) throws AgeException
	{
		if(age<18)
		{
			throw new AgeException("Invalid AGE");
			/*try
			{
				throw new AgeException("Invalid AGE");
			}
			catch(AgeException e)
			{
				System.out.println(e);
			}*/
		}
		else
		{
			this.age=age;
		}
	}
	public static void main(String... s)
	{
		Emp e=new Emp();
		try
		{
		e.get(10);
		}
		catch(AgeException t)
		{
			//System.out.println(t);
			t.printStackTrace();
		}
	}
}
class AgeException extends Exception
{
	String s;
	AgeException(String s)
	{
		//super(s);
		this.s=s;
	}
	public String toString()
	{
		return s;
	}
}

