public class EqualsIgnoreCase
{
	public static void main(String... args)
	{
		String str1=new String("This is really not immutable");
		String str2=new String("THIS IS REALLY NOT IMMUTABLE");
		String str3=new String("This is REALLY Not immUTABLE.");
		String str4=str2;
		boolean ret;
		ret=str1.equals(str2);
		System.out.println(ret);
		ret=str1.equals(str3);
		System.out.println(ret);
		ret=str1.equalsIgnoreCase(str3);
		System.out.println(ret);
		ret=str1.equalsIgnoreCase(str4);
		System.out.println(ret);
	}
}