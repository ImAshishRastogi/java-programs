class Emp
{
static String cname="TSC";
String name;
int salary;
void get(String s1,int s2)
{
name= s1;
salary= s2;
}
void show()
{
System.out.println(cname+"\n"+salary+"\n"+name);
}
public static void main(String...s)
{
Emp e1=new Emp();
//System.out.println(e1);
e1.get("Ashish", 95000);
e1.show();

Emp e2=new Emp();
e2.get("basant", 95000);
e2.show();

System.out.println(Emp.cname);

}

}