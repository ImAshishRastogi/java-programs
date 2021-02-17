import java.io.BufferedInputStream;
import java.io.FileInputStream;
public class BStream
{
	public static void main(String...args)
	{
		String srcFile="Demo.txt";
		try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream(srcFile)))
		{
			//Read one byte at a time and display it
			byte byteData;
			while((byteData=(byte)bis.read())!=-1)
				System.out.print((char)byteData);
		}catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}
}