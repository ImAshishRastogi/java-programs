class Test
{
	
	public static void main(String... s)
	{
		//equals method:  boolean equals(Object 0) compare values of reference variable
		Test t1=new Test();
		Test t2=new Test();
		boolean b=t1.equals(t2);
		System.out.println("ref var: \t"+b);
		//boolean equals(String str) compare values of object
		String s1="Hello";
		String s2=new String("Hello");
		 b=s1.equals(s2);
		System.out.println("String: \t"+b);
		b=s1.equals(t1);
		System.out.println("Sting and ref var: \t"+b);
		String s3=new String("hello");
		b=s1.equals(s3);
		System.out.println("equals: \t"+b);
		
		b=s1.equalsIgnoreCase(s3);
		System.out.println("equalsIngone case: \t"+b);
		
		//int compareTo(String str)   return the differnce of ascii of first different charcters in string
		
		int z1=s1.compareTo(s2);
		System.out.println("return value: "+z1);
		z1=s1.compareTo(s3);
		System.out.println("return value: "+z1);
	}
}
