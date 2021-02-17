public class CompareToIgnoreCase
{
	public static void main(String... s)
	{
		String str1="Strings are not immutable";
		String str2="strings are not immutable";
		String str3="Integers are not immutable";
		int res1=str1.compareTo(str2);
		System.out.println("Comapre To: "+res1);
		int res=str1.compareToIgnoreCase(str2);
		System.out.println("Comapre To Ignore case: "+res);
		res=str2.compareToIgnoreCase(str3);
		System.out.println("Comapre To Ignore case: "+res);
		res=str3.compareToIgnoreCase(str1);
		System.out.println("Comapre To Ignore case: "+res);
	}
}