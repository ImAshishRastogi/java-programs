class Spacecount
{
Spacecount(String s1)
{
int l=s1.length();
int count=0;
for(int i=0;i<l;i++)
{
if(s1.charAt(i)==' ')
count++;
}
System.out.println("SPACE COUNT IS= "+count);

}
public static void main(String...s)
{
new Spacecount("My name is ashish rastogi");
}
}