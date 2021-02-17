//making demo class immutable 


//**note:- because String Objects are immutable they can be shared  **
class Demo
{
	private Demo()
	{
		
	}
	
	void show()
	{
		System.out.println("Hello from Demo");
	}
	public static Demo getInstance()
	{
		return new Demo();
	}
}
class Temp 
{
	Temp()
	{
				//Demo d=Demo.getInstance();
		//d.show();
		//System.out.println("Hello".length()); //String literal  ("hello") are kept in String Constant pool
		
		/*String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");
		String s5=s3.intern();//method to allocate memory in String constant pool
		String s4=new String("Hello");
		String s6=s4.intern();
		if(s1==s2)
		{
			System.out.println("Same");
		}
		if(s3!=s4)
		{
			System.out.println("Not same");
		}
		if(s5==s6)
		{
			System.out.println("same");
		}*/
		
		//creating object of string class via constructor
		
		/*char ch[]={'d','u','c','a','t'};
		String str=new String(ch);//String(char array)
		System.out.println(str);
		String st=new String(ch,2,3);//String(char array,int intial index,int no.of element)
		System.out.println(st);*/
		
		/*byte b[]={65,66,67,68,69};
		String st1=new String(b);//String(byte array);
		System.out.println(st1);
		String st2=new String(b,1,2);//String(byte array,int intial index,int no of element)
		System.out.println(st2);*/
		
		//Method in String
		
		String str1="Hello";
		/*char ch1[]=str1.toCharArray();//convert String to character type array
		for(int i=0;i<ch1.length;i++)
			System.out.println(ch1[i]);
		*/
		/*String str2="ABCD";
		byte b1[]=str2.getBytes();//convert String to byte type array
		for(int i=0;i<b1.length;i++)
			System.out.println(b1[i]);
		*/
		/*for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);//return char type single particular element from String
			System.out.println(ch);
		}*/
		
		/*String str2=str1.toUpperCase();
		String str3=str1.toLowerCase();
		System.out.println(str2+" "+str3);
		*/
		
		//String str4="   India is a good country.   ";
		//System.out.println(str4+" "+str4.length());
		//String str5=str4.trim();//trim the leading and ending spaces
		//System.out.println(str5+" "+str5.length());
		
		/*String str6=str5.substring(10);//substring(int ) return new string from index 10 to its last index 
		System.out.println(str6);
		String str7=str5.substring(0,7);//substring(int intial index,int no of element)
		System.out.println(str7);
		*/
		
		/*String m="India";
		int z=m.indexOf('i');//indexOf('char') return the index of particular character
		System.out.println(z);
		int z1=m.indexOf('i',3);//indexOf('char',int index) return the index of particular character after a index(3) passed in this function
		System.out.println(z1);
		int z2=str5.indexOf("good");//indexOf("word") return the index of word
		System.out.println(z2);
		*/
		String n=String.valueOf(10);
		n=n+20;
		System.out.println(n);
	}
	
	
	
	public static void main(String... s)
	{
		new Temp();
	}
}