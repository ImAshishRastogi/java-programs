class EqualsTo
{
public static void main(String...s)
{
	String s1= new String("This is really not immuatble");
	String s2=new String ("This is really not immutable");
	String s3=new String ("tHIS IS really NOT IMMUTABLE");
	String s4=s1;
	boolean r;
	r=s1.equals(s2);
	System.out.println("Returned value: ");
	System.out.println(r);
	r=s1.equals(s3);
	System.out.println(r);
	r=s1.equals(s4);
		System.out.println(r);
}
}