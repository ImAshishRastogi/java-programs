class Redirection
{
	public static void main(String...args)
	{
		//System.out.println("Redirection test for out");
		
		/*after compile redirect
		java Redirection>abc.txt(override)
		java Redirection>>abc.txt(append)
		*/
		
		System.err.println("Redirection test for err");
		
		/*after compile redirect
		java Redirection 2>abc.txt(override)
		java Redirection 2>>abc.txt(append)
		*/
	}
}