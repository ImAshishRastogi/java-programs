class Charcount
{
Charcount(String s1)
{
 int count=0;
int l=s1.length();
for(int i=0;i<l;i++)
{
if((s1.charAt(i)>='A'&& s1.charAt(i)<='Z')||(s1.charAt(i)>='a'&& s1.charAt(i)<='z'))
count++;
}
System.out.println("CHAR COUNT IS= "+count);
}
public static void main(String...s)
{
new Charcount("My name is ashish");
}
}