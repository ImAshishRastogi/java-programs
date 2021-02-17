import java.io.File;
public class CRD
{
	public static void main(String...args) throws Exception
	{
		File newFile=new File("my_new_File.txt");
		printFileDetails(newFile);
		//create a new file
		boolean fileCreated=newFile.createNewFile();
		if(!fileCreated)
			System.out.println(newFile +"couldn't be created.");
		printFileDetails(newFile);
		//delete the new file
		newFile.delete();
		System.out.println("after deleting the new file:");
		printFileDetails(newFile);
		
		//recreate the file
		newFile.createNewFile();
		
		printFileDetails(newFile);
		
		//lets tell the JVM to delete this file on exit
		newFile.deleteOnExit();
		
		System.out.println("After using deleteOnExit() method");
		printFileDetails(newFile);
		
		//create a file & rename it
		File firstFile=new File("my_first_File.txt");
		File secondFile=new File("my_second_file.txt");
		
		fileCreated=firstFile.createNewFile();
		if(fileCreated||firstFile.exists())
		{
			printFileDetails(firstFile);
			printFileDetails(secondFile);
			
			boolean renamedFlag=firstFile.renameTo(secondFile);
			if(!renamedFlag)
				System.out.println("couldn't reanme: "+ firstFile);
			
			printFileDetails(firstFile);
			printFileDetails(secondFile);
		}
		}
		public static void printFileDetails(File f)
		{
			System.out.println("Absolute Path= "+f.getAbsoluteFile());
			System.out.println("File exists= "+f.exists());
		}
}