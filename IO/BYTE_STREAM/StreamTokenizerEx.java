import java.io.StringReader;
import java.io.IOException;
import java.io.StreamTokenizer;

import static java.io.StreamTokenizer.TT_EOF;
import static java.io.StreamTokenizer.TT_NUMBER;
import static java.io.StreamTokenizer.TT_WORD;

class StreamTokenizerEx
{
	public static void main(String...args) throws IOException
	{
		String str="This is a tset,200 which is simple 50";
		StringReader sr=new StringReader(str);
		StreamTokenizer st=new StreamTokenizer(sr);
		try{
			while(st.nextToken()!=TT_EOF)
			{
			switch(st.ttype)
			{
				case TT_NUMBER:
				System.out.println("Number Value: "+st.nval);
				break;
				case TT_WORD:
				System.out.println("String Value: "+st.sval);
				break;
			}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}