class Outer
{
	int x=10;
	static int y=20;
	My display()
	{
		return(new My()
					{
						public void show()
						{
							System.out.println(x);
							System.out.println(y);
						}
					});
	}
	public static void main(String... s)
	{
		Outer o=new Outer();
		My m=o.display();
		m.show();
	}
}

interface My
{
	void show();
}