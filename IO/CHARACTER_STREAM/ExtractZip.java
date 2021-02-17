import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.Enumeration;

public class ExtractZip
{
	public static void main(String... args)
	{
		try
		{
			ZipFile zipFile=new ZipFile("G:\\java programs\\IO\\test.zip");
			Enumeration enu=zipFile.entries();
			
			while(enu.hasMoreElements())
			{
				ZipEntry zipEntry=(ZipEntry)enu.nextElement();
				String name=zipEntry.getName();
				System.out.println("name= "+name);
				
				InputStream is=zipFile.getInputStream(zipEntry);
				
				FileOutputStream fos=new FileOutputStream("G:\\java programs\\IO\\"+name);
				//File file=new File(name);
				//File file=new File("G:\\java programs\\IO\\"+name);
				//FileOutputStream fos=new FileOutputStream(fos);
				int length;
				while((length=is.read())!=-1)
					fos.write(length);
				
				is.close();
				fos.close();
			}
			zipFile.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}