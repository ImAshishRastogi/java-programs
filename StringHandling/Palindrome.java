class Palindrome
{
Palindrome(String s1)
{
int l=s1.length();
String s2="";

for(int i=l-1;i>=0;i--)
{
s2=s2+s1.charAt(i);
}
int m=s2.length();
System.out.println(s1+l+"\n"+s2+m+"\n");
if()
System.out.println("yes");
else
System.out.println("no");
}
public static void main(String...s)
{
new Palindrome("nitin");
}
}