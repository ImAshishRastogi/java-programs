import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.*;
import java.util.*;

public class ZipFiles1
{
	public static void main(String...args)
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("G:\\java programs\\IO\\test.zip");
			ZipOutputStream zos=new ZipOutputStream(fos);
			String file1Name="first.txt";
			String file2Name="second.txt";
			String file3Name="third.txt";
			String file4Name="fourth.txt";
			addtoZipFile(file1Name,zos);
			addtoZipFile(file2Name,zos);
			addtoZipFile(file3Name,zos);
			addtoZipFile(file4Name,zos);
			zos.close();
			fos.close();
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void addtoZipFile(String fileName,ZipOutputStream zos) throws IOException,FileNotFoundException
	{
		System.out.println("Writing "+fileName+" to zipfile");
		//File file=new File(fileName);
		FileInputStream fis=new FileInputStream(fileName);
		//FileInputStream fis=new FileInputStream(file);
		
		ZipEntry zipEntry=new ZipEntry(fileName);
		zos.putNextEntry(zipEntry);
		
		byte[] bytes=new byte[fis.available()];
		
		fis.read(bytes);
		zos.write(bytes);
		zos.closeEntry();
		fis.close();
	}
}