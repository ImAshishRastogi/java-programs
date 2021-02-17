class Wordcount
{
Wordcount(String s1)
{
s1=s1+" ";
int l=s1.length();
int count=0;
for(int i=0;i<l;i++)
{
if(s1.charAt(i)!=' '&&s1.charAt(i+1)==' ')
count++;
}
System.out.println("WORD COUNT IS= "+count);
}
public static void main(String...s)
{
new Wordcount("My  name is ashish");
}
}