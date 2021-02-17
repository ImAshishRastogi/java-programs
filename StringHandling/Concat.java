class Concat
{
	 public static void main(String...args)
	{
	String s1="Good";
	String s2=s1+" Morning";
	String s3=10+20+s1+30+40+"Morning"+50+60;
	System.out.print("Return value: ");
	System.out.println(s1);
	System.out.print("Return value: ");
	System.out.println(s2);
	System.out.print("Return value: ");
	System.out.println(s3);
	
	s1="good";
	s2=s1.concat("morning");
	System.out.print("Return value: ");
	System.out.println(s2);
	s1="I";
	s3=s1.concat(" am").concat(" good").concat(" boy.s");
	System.out.print("Return value: ");
	System.out.println(s3);
	}
}