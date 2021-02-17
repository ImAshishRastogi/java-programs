import java.lang.reflect.*;
import java.awt.*;

class SampleFIeld {
	public static void printField(Object o) throws Exception
	{
		Class c = o.getClass();
		Field f[] = c.getFields();
		for(int i = 0; i< f.length;i++)
		{
			System.out.println("");
			Class type = f[i].getType();
			System.out.println(type.getName());
			System.out.println(""+ f[i].getName());
	    }
    }
 public static void main(String s[]) {
	 //color c = new color(1,1,1);
	  Temp c = new Temp();
	  try{
		printField(c);
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
    } 
 }
class Temp {
	public int x;
	public float y;
	public long z;
	public char c;
	public short s;
	public boolean v;
	float f;
}

	
	