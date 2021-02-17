class StringB
{
	public static void main(String... args)
	{
		//StringBuffer sb=new StringBuffer();
		//StringBuffer sb=new StringBuffer(20);
		StringBuffer sb=new StringBuffer("ducat");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		StringBuffer sb1=sb.append("12345678901234567");
		System.out.println("After append 17 char");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb1=sb.append("12345678901234567890123");
		System.out.println("After append 23 char");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		System.out.println("After append 1 char");
		sb.append("q");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
	}
}