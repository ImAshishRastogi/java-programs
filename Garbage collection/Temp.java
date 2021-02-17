class Demo
{
	int x=10;
	int y=20;
	public void finalize() throws Throwable
	{
		System.out.println("finalize method");
	}
static void show()
{
	Demo d1=new Demo();
	//display();
	System.out.println("show");
}
static void display()
{
	Demo d2=new Demo();
	System.out.println("display");
}
}
class Temp
{
	public static void main(String... s) throws Exception
	{
		Demo d=new Demo();
		//d.show();
		//System.out.println(d.x);
		//System.out.println(d.y);
		//d=null;
		//System.out.println(d.x);
		//Demo dd=new Demo();
		//d=dd;
		//System.out.println(d.x);
		//System.out.println(dd.x); 
		//for(int i=0;i<2000;i++)
		//new Demo();
		System.gc();
		//d.finalize();
		//System.out.println(d.x);
	}
}