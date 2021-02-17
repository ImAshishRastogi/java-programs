public class IsInterface {
	public static void main(String... s) throws Exception {
		Class clazz = int.class;
		 Class ar = int[].class;
		 Class c = java.io.Serializable.class;
		 
		 boolean isInterface = clazz.isPrimitive();
		 boolean isInterface1 = c.isInterface();
		 boolean isInterface2 = ar.isArray();
		 
		 System.out.println("Is Primitive :" + isInterface);
         System.out.println("Is Interface :"+ isInterface1);
         System.out.println("Is Array :" + isInterface2);
	}
}