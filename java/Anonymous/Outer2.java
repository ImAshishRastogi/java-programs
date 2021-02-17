class Outer2
{
	public static void main(String... s)
	{
		My m=new My()
				{
					public void show()
					{
						System.out.println("show");
						//System.out.println(y);
					}
				};
				m.show();
	}
	
}
interface My
{
	void show();
}