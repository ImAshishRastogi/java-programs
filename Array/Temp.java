class Temp
{
	int function(int x[])
	{
		 int temp=0;
		int max=0;
		int h=0;
		for(int i=0;i<x.length;i++)
		if(max<x[i])
		{
			max=x[i];
			h=i;
		}
		while(x[h]>0)
		{
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%2!=0)
			{
				x[i]-=1;
				temp++;
			}
		}
		if(x[h]%2==0 && x[h]>0)
		{
		half(x);
		temp++;
		}
		}
		return temp;
	}
	
	void half(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>0)
			x[i]/=2;
		}
	}
	public static void main(String... s)
	{
		Temp t=new Temp();
		System.out.println(t.function(new int[]{100,200,300}));
	}
}
