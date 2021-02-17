class Dada
{
	int x=50;
	String s="Dada";
	void show()
	//Dada() 
	{
		System.out.println(s);
	}
	// Dada(int y)
	// {
	// 	System.out.println(y);
	// }
}
class Base 
{
	int x=30;
	String s="Base";
	// private void show()
	// final void show()		//to stop function overriding 
	void show()
	// Base show()
	//Base()
	{
		//super(5);
		System.out.println(s);
		//super.show();
		// return new Base();
	}
}
class child extends Base
{
	int x=20;
	String s="child";
	protected void show()
	// void show()
	// child show()
	//child()
	{
		System.out.println(s);
		//System.out.println(x+s);  // data hiding
		//System.out.println(this.x+this.s);
		//System.out.println(super.x+super.s);
		//System.out.println(((Dada)this).x+((Dada)this).s);
		//System.out.println(((Base)this).x+((Base)this).s);
		//super.show();
		// return new child();
	}
	// child(int x)
	// {
	// 	System.out.println(x);
	// }
	
	public static void main(String... s)
	{
		child c=new child();		//comilation time binding
		Base b=new child();   		//run time binding/dynamic binding
		// Dada d = new child();
		b.show();//overriding
		// c.show();//overriding
		// System.out.println(d.x+d.s);
		// System.out.println(((Dada)b).x+((Dada)b).s);
		// System.out.println(((Dada)c).x+((Dada)c).s);
		
		// System.out.println(b.x+b.s);
		// System.out.println(((Base)c).x+((Base)c).s);
		// System.out.println(((Base)d).x+((Base)d).s);
		
		// System.out.println(c.x+c.s);
		// System.out.println(((child)b).x+((child)b).s);
		// System.out.println(((child)d).x+((child)d).s);
		// //new child();  //constructor in inheritance
		//new child(10);		//constructor in inheritance
	}
}
class A
{
}
class B extends A
{
}