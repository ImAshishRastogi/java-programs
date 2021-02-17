import java.lang.reflect.*;
import java.awt.*;

class SamplePackage {
   static void printPackage(Object o) {
	   
	   Class c = o.getClass();
       Package p = c.getPackage();
	   System.out.println(p.getName());
   }
   public static void main(String... s)
   {
	   String t = new String("Rajat");
	   printPackage(t);
   }
}

	   