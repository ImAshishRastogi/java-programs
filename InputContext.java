import java.io.*;
class InputContext
{
	public static void main(String []args)throws IOException
	{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		int n=Integer.parseInt(br.readLine());
		System.out.println("input number is "+n);
	}
}