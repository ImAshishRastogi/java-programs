import java.io.*;
class MyFileWriter
{
	public static void main(String... args) throws IOException
	{
		FileOutputStream fw=new FileOutputStream("Demo.txt");
		//FileOutputStream fw=new FileOutputStream("Demo.txt",true);
		//FileOutputStream fw=new FileOutputStream(new File("H:\\test\\Demo.txt"));
		//FileOutputStream fw=new FileOutputStream(new File("H:\test\Demo.txt"),true);
		String s="India is a good Country abjasbajshdbauyddbshyajdsdasjlbdjacysdacshdascydasbcdhascbd ascdbadydkacdaybydjakdbasdh ";
		byte ch[]=s.getBytes();
		//fw.write(ch);
		for(int i=0;i<ch.length;i++)
			fw.write(ch[i]);
		fw.close();
		System.out.println("File Created SuccessFully");
	}
}
class MyFileReader
{
	public static void main(String...args) throws IOException
	{
		//FileInputStream fr=new FileInputStream("Demo.txt");
		FileInputStream fr=new FileInputStream(new File("H:\\test\\Demo.txt"));
		int i=0;
		while((i=fr.read())!=-1)
			System.out.print((char)i);
		fr.close();
		
	}
}
class MyFileReader1
{
	public static void main(String...args) throws IOException
	{
		FileInputStream fr=new FileInputStream("Demo.txt");
		byte b[]=new byte[fr.available()];
		fr.read(b);
		String s=new String(b);
		System.out.print(s);
	}
}