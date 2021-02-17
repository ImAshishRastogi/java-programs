class Format
{
	public static void main(String... args)
	{
		float f=2.4f;
		int i=10;
		String s="HINDUSTAN";
		System.out.printf("The value of the float variable is =%f ,while the value of integer variable is = %d and the string is=%s",f,i,s);
		String fs=String.format("The value of the float variable is =%f,while the value of integer variable is = %d and the string is=%s",f,i,s);
		System.out.println("\n"+fs);
	}
}