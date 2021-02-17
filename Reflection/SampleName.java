import java.lang.reflect.*;
import java.awt.*;
class SampleName 
{
	public static void printName( Object o)
    {
      Class c = o.getClass();
      System.out.println(c.getName());
	}
    public static void printName(String s)
	{
     try
	 {
       Class c = Class.forName(s);
       System.out.println(c.getName());
       StringBuffer sb = (StringBuffer)	c.newInstance();
       System.out.println(sb.length());
	   System.out.println(sb.capacity());
     }
    catch(Exception e)
    {
      System.out.println(e);
	}
	}
    public static void printName1(String s)
	{
		try
		{
			Class c = Class.forName(s);
			System.out.println(c.getName());
            Temp sb = (Temp) c.newInstance();
			sb.show();
		}
		catch(Exception e)
		{
			System.out.println(e);
        }
	}
	public static void main(String... s)
	{
		Button b = new Button("OK");
		printName(b);
		printName("java.lang.StringBuffer");
		printName("java.awt.Frame");    // CLass Cast Exception
		printName1("Temp");
		Class c = java.lang.Thread.class;
		System.out.println(c.getName());
}
}
class Temp {
	 Temp()
	 {
		 System.out.println("Default Constructor");
	 }
	 void show()
	 {
		 System.out.println("Show Method of Temp");
}
}




		
			