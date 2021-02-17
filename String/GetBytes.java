public class GetBytes
{
	public static void main(String ... args)
	{
		String str1= new String("Welcome to tutorials of String.");
		try{
			byte[] b=str1.getBytes();
			for(int i=0;i<b.length;i++)
			{
				System.out.println(b[i]);
			}
		}catch(Exception e)
		{
			System.out.println("Unsupported character set!!!!");
		}
	}
}