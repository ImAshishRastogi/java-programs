class RunSync
{
	public static void main(String...args)
	{
		Shared st=new Shared();
		Thread1 st1=new Thread1(st,"one");
		Thread2 st2=new Thread2(st,"two");
	}
}