import java.io.*;
import java.util.*;

class MyScanner1
{
	public static void main(String...args)throws IOException
	{
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		float f1=s.nextFloat();
		long l1=s.nextLong();
		double d=s.nextDouble();
		System.out.println(i+f1+l1+d);
	}
}