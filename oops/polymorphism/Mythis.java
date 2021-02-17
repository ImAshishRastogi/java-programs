class Mythis
{
	int x=10;
	void get(int x)
	{
		System.out.println(this+"get");
		System.out.println(this.x);
		System.out.println(x);
		
	}
	public static void main(String[] s)
	{
		Mythis t=new Mythis();
		System.out.println(t+"main");
		t.get(16);
		
	}
}