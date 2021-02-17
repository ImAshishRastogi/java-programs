class Split2
{
	public static void main(String... args)
	{
		String str=new String("Welcome-to-Tutorials-of-string");
		System.out.println("Returned value");
		String s[]=str.split("-",2);
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
		s=str.split("-",3);
		System.out.println("\nReturned value");
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
		System.out.println("\nReturned value");
		s=str.split("-",0);
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
		System.out.println("\nReturned value");

		s=str.split("-");
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
		
		String str1=str.replace('-',' ');
				System.out.println("\nReturned value");

		s=str1.split(" ");
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
		
		
		
	}
}