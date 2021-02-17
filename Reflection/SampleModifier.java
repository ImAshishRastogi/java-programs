import java.lang.reflect.*;
import java.awt.*;
 
 class SampleModifier {
	 public static void printModifier(Object o) throws Exception {
			  Class c = Class.forName("java.awt.Graphics");
		  // Class c = o.getClass();
		  int m = c.getModifiers();
		  if(Modifier.isPublic(m))
		  {
			  System.out.println("public");
		  }
           if(Modifier.isAbstract(m))
		  {
			  System.out.println("abstract");
		  }
		  if(Modifier.isFinal(m))
		  {
			  System.out.println("final");
		  }
		  
		  
	 }
	 public static void main(String[] agrs) 
	 {
		 String a = new String("This");
           try{
			   printModifier(a);
	          }
             catch(Exception e)
			 {
               e.printStackTrace();
			 }
	 }			 
 }	 