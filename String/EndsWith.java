/*public boolean endsWith(String suffix)
*/

public class EndsWith
{
	public static void main(String... args)
	{
	String str=new String("This is really not immutable!!");
	boolean ret;
	ret=str.endsWith("immutable!!");
	System.out.println(ret);
	ret=str.endsWith("immu");
	System.out.println(ret);
	}
}