public class GetChars
{
	public static void main(String... args)
	{
		String str1=new String("Welcome to tutorials of String.");
		char[] ch=ne0w char[7];
		char c[]=str1.toCharArray();
		try{
			str1.getChars(2,9,ch,0);
			System.out.print("Copied value= ");
			for(int i=0;i<ch.length;i++)
			{
				System.out.print(ch[i]);
			}
			System.out.println();
			for(int i=0;i<c.length;i++)
				System.out.print(c[i]);
		}catch(Exception e)
		{
			System.out.println("Raised Exception!!!");
		}
	}
}