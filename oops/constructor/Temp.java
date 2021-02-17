class Temp
{
	int x;
	int y;
	Temp()
	{
		System.out.println("default");
		 x=10;
		 y=20;
	}
	void show()
	{
		System.out.println("show");
		System.out.println(x);
		System.out.println(y);
		
	}
	public static void main(String[] s)
	{
		Temp t=new Temp();
		//new Temp();
		t.show();
	}
}