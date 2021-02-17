/*public static String.copyValueOf(char[] data)
	public static String.copyVlaueOf(char[] data,int offset,int count)
*/

public class CopyVaueOf
{
	public static void main(String... args)
	{
		char[] str1={'h','e','l','l','o',' ','w','o','r','l','d'};
		String str2="";
		str2=String.copyValueOf(str1);
		System.out.println(str2);
		str2=String.copyValueOf(str1,2,6);
		System.out.println(str2);
	}
}