class Temp
{
	int x=10;
	int y=20;
	//void show(int x,Temp z)
	void show(int x)
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(this);
		
		
		//System.out.println(z.x);
		//System.out.println(z.y);
		//System.out.println(this.x);
		
		
	}
	public static void main(String[] s)
	{
		Temp t=new Temp();
		//t.show(50,t);
		t.show(30);
		//System.out.println(t.x);
		
	}
}