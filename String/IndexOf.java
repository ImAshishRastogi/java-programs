/*public int indexOf(int ch)
public int indexOf(int ch,int fromIndex)
int indexOf(String str)
int indexOf(String str,int fromIndex)
*/

public class IndexOf
{
	public static void main(String... args)
	{
		String str=new String("Welcome to Tutorials.");
		String substr1=new String("Tutorials");
		String substr2=new String("Sutorials");
		System.out.println("Found Index");
		System.out.println(str.indexOf('o'));
		System.out.println(str.indexOf('o',5));
		System.out.println(str.indexOf(substr1));
		System.out.println(str.indexOf(substr1,12));
		System.out.println(str.indexOf(substr2));
	}
}