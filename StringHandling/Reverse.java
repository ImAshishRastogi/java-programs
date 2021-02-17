class Reverse
{
Reverse(String s1)
{
int l=s1.length();
String s2="";
for(int i=l-1;i>=0;i--)
{
s2=s2+ s1.charAt(i);
}
System.out.print("STRING: "+s1+"\nREVERSE STRING: "+s2);
}
public static void main(String...s)
{
new Reverse("string tutorial");
}
}