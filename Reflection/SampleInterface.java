import java.lang.reflect.*;
import java.awt.*;
import java.io.*;
class SampleInterface {
	public static void printInterfaces(Object o)
	{
		Class c = o.getClass();
		Class inter[]= c.getInterfaces();
		for(int i = 0; i< inter.length; i++)
		{
			System.out.println(inter[i].getName());
			if(inter[i].getName().equals("java.io.Serializable"))
			{
				System.out.println("My Parent Class Interface is Serializable");
			}
		}
	}
	public static void main(String... s) 
	{
		t t1 = new t();
		printInterfaces(t1);
    }
}
   interface a1 {}
   interface a2 {}
   interface a3 {}
   class t implements a1,a2,Serializable,a3 {}
   
