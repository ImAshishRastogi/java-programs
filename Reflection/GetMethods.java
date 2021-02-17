import java.lang.reflect.Method;

class GetMethods {
   private double div(int a, int b){
	   return (a/b);   // unsafe operation since value of b can not be 0
   }
}
class Main{
	public static void main(String... s) throws Exception{
		GetMethods m1 = new GetMethods();
		Class clazz = m1.getClass();
        Method method = clazz.getDeclaredMethod("div", int.class, int.class);
         method.setAccessible(true);
         System.out.println("Method Name : " + method.getName());		 
		Double z = (Double) method.invoke(m1,10,5);
		System.out.println(z.doubleValue());
	}
}