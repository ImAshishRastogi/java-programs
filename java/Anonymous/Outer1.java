class Outer1
{
	int x=10;
	static int y=20;
	void display(My m)
	{
		m.show();
	}
	public static void main(String... s)
	{
	Outer1 o=new Outer1();
	o.display(new My()
				{
					public void show()
					{
						System.out.println("show");
						//System.out.println(y);
					}
				});
	}
}

interface My
{
	void show();
}