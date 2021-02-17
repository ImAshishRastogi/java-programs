import java.io.*;
import java.util.*;

class MyStringTokenizer
{
	public static void main(String...args)throws IOException
	{
		String s="country=india;capital=delhi;country=japan;capital=tokyo;";
		StringTokenizer st=new StringTokenizer(s,"=;");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}