class ContentEquals  //used for comparerision b/w value of object of string and stringbuffer class
{
	public static void main(String... args)
	{
		String str1="Not immutable";
		String str2="String are immutable";
		StringBuffer str3=new StringBuffer("Not immutable");
		boolean res=str1.contentEquals(str3);
		System.out.println(res);
		res=str2.contentEquals(str3);
		System.out.println(res);
	}
}