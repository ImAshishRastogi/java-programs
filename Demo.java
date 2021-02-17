class Demo
{
	int x = getX();
	int getX()
	{
		System.out.println(x + " via function");
		return 10;
	}
	Demo()
	{
		System.out.println(this.x +"via corstructor");
	}
	public static void main(String... s)
	{
	//System.out.println("HELLO JAVA FROM DEMO");
	//String z[]={"aaa"};
	//Demo1.main(z);
	new Demo();
	}
}
