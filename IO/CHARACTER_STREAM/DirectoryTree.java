import java.io.File;
class DirectoryTree
{
	public static void main(String...args)
	{
		File file=new File(args[0]);
		if(!file.exists())
		{
			System.out.println(args[0]+"doesn't exist");
			return;
		}
		tree(args[0]);
	}
	public static void tree(String filename)
	{
		File file=new File(filename);
		if(!file.isDirectory())
		{
			System.out.println(filename);
			return;
		}
		String files[]=file.list();
		for(int i=0;i<files.length;i++)
			tree(filename+file.separator+files[i]);
	}
}