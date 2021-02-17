public class StartsWith
{
	public static void main(String... args)
	{
		String s=new String("Welcome to Tutorial of String");
		System.out.println(s.startsWith("Welcome"));
		System.out.println(s.startsWith("Tutorials"));
		System.out.println(s.startsWith("Tutorials",11));
		
	}
}