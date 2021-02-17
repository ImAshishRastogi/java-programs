import java.io.*;
class MyByteArray
{
	public static void main(String...args) throws IOException
	{
		ByteArrayOutputStream fw=new ByteArrayOutputStream();
		String s="India is a good country. jldkaslkjdas";
		byte ch[]=s.getBytes();
		fw.write(ch);
		fw.writeTo(new FileOutputStream("Demo1.txt"));
		fw.writeTo(new FileOutputStream("Demo2.txt"));
		System.out.println(fw.toString());
		byte z[]=fw.toByteArray();
		fw.close();
		ByteArrayInputStream fr=new ByteArrayInputStream(z);
		int i=0;
		while((i=fr.read())!=-1)
			System.out.print((char)i);
		fr.close();
	}
}