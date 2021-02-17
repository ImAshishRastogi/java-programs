class AllDataTypes
{
 public static void main(String... s) {
	 Class c1 = int.class;
	 System.out.println(c1.getName());
    Class c2 = char.class;
	 System.out.println(c2.getName());
    Class c3 = float.class;
	 System.out.println(c3.getName());
 }
}
 class IsInterface {
	public static void main(String... s) throws Exception {
		Class clazz = int.class;
		 Class ar = int[].class;
		 Class c = java.io.Serializable.class;
		 
		 boolean isInterface = clazz.isPrimitive();
		 boolean isInterface1 = c.isInterface();
		 boolean isInterface2 = ar.isArray();
		 
		 System.out.println("Is Primitive :" + isInterface);
         System.out.println("Is Primitive :"+ isInterface1);
         System.out.println("Is Primitive :" + isInterface2);
	}
}

	