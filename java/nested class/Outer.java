class Outer
{
	int x=10;
	static int y=20;
	//static class Inner
	class Inner
	{
		int x=50;
		 void show()
		{
			System.out.println(x);
			System.out.println(y);
			System.out.println(Outer.this.x);
		}
	}
	public static void main(String s[])
	{
		Outer o=new Outer();
		//System.out.println(o.x);
		Outer.Inner i=o.new  Inner();    //for non static
		//Outer.Inner i=o.new Outer.Inner(); //error
		//Outer.Inner i=new Outer.Inner(); //static nested class
		i.show();
	}
}

class Temp extends Outer
{
	public static void main(String s[])
	{
		Temp o=new Temp();
		Temp.Inner i=o.new Inner();
		i.show();
	}
}
