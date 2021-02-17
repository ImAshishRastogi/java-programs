import java.io.*;
class MyStreamTokenizer
{
	public static void main(String...args)throws IOException,FileNotFoundException
	{
		FileInputStream fin=new FileInputStream("abc11.txt");
		InputStreamReader ir=new InputStreamReader(fin);
		StreamTokenizer st=new StreamTokenizer(ir);
		st.eolIsSignificant(true);
		st.wordChars(33,255);
		st.whitespaceChars(0,32);
		int token=0;
		int count=0;
		while(true)
		{
			token=st.nextToken();
			if(token==StreamTokenizer.TT_EOF)
				break;
			if(token==StreamTokenizer.TT_NUMBER)
				System.out.println("Number: "+ st.nval);
			if(token==StreamTokenizer.TT_WORD)
				System.out.println("Word: "+st.sval);
			count++;
		}
		System.out.println("Number of word: "+ --count);
	}
}