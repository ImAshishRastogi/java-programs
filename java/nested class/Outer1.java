//Local nested class
class Outer1
{
	int x=10;
	static int y=20;
	My display()
	{
		class Inner implements My
		{
			public void show()
			{
				System.out.println(x);
				System.out.println(y);
			}
		}
		//Inner i=new Inner();
		//i.show();
		My z=new Inner();
		return z;
	}
	public static void main(String s[])
	{
		Outer1 o=new Outer1();
		//o.display();
		My m=o.display();
		m.show();
		
	}
}

interface My
{
	void show();
}