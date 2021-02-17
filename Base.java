class Base extends Dada
{
int x=50;
	//void show()
	//{
	//System.out.println("BASE");
	//}
}
class Dada
{
	int x=70;
}
class Child extends Base
{
int x=20;
	void show()
	{
	System.out.println(super.x);
	System.out.println(x);
	System.out.println(((Dada)this).x);
	}
	

public static void main(String... s)
{
Child c=new Child();
c.show();
}
}

