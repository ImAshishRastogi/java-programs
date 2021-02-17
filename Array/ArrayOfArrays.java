class ArrayOfArrays
{
	
	int max1(int x[][])
	{
		int max=0;
		for(int i=0;i<x.length;i++)
			for(int j=0;j<x[i].length;j++)
				if(max<x[i][j])
					max=x[i][j];
		return max;
	}
	
	int min1(int x[][])
	{
		int min=1000000;
		for(int i=0;i<x.length;i++)
			for(int j=0;j<x[i].length;j++)
				if(min>x[i][j])
					min=x[i][j];
				return min;
	}
	
	void sort1(int x[][])
	{
		int z[]=new int[100000000];
		int k=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				z[k]=x[i][j];
				k++;
			}
		}
		MergeSort(z,0,k-1);
		k=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				x[i][j]=z[k];
				k++;
			}
		}
		
		Traverse(x);
	}

	void MergeSort(int x[],int first,int last)
{
	if(first<last)
	{
		int mid=(first+last)/2;
		MergeSort(x,first,mid);
		MergeSort(x,mid+1,last);
		merging(x,first,mid,last);
	}
}
	void merging(int x[],int first,int mid,int last)
	{
	int i=first,j=mid+1,k=0;
	int b[]=new int[x.length];
	
	while(i<=mid && j<=last)
	{
		if(x[i]>x[j])
		{
			b[k]=x[j];
			j++;
		}
		else
		{
			b[k]=x[i];
			i++;
		}
		k++;
	}
	
	while(i<=mid)
	{
		b[k]=x[i];
			i++;
			k++;
	}
	while(j<=last)
	{
		b[k]=x[j];
			j++;
			k++;
	}
	
	for(i=first,k=0;i<=last;i++,k++)
	{
		x[i]=b[k];
	}
	}

	void Traverse(int x[][])
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print( x[i][j]+" ");
			}
			System.out.println();
		}
	}

	void matrixadd(int x[][],int y[][])
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				x[i][j]=x[i][j]+y[i][j];
			}
		}
		
		Traverse(x);
	}

	void matrixmul(int x[][],int y[][])
	{
		int c[][]=new int[x.length][x[0].length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				c[i][j]=0;
					for(int k=0;k<x[i].length;k++)
							c[i][j]=c[i][j]+x[i][k]*y[k][j];
			}
		}
		
		Traverse(c);
	}

	void MatrixTranspose(int x[][])
	{
		int c[][]=new int[x.length][x[0].length];
		for(int i=0;i<x.length;i++)
			for(int j=0;j<x[i].length;j++)
				c[i][j]=x[j][i];
			
			Traverse(c);
	}

	void MatrixSum(int x[][])
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
			for(int j=0;j<x[i].length;j++)
				sum=sum+x[i][j];
			
			System.out.println(sum);
	}

	void TriangleAsum(int x[][])
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=i;j<x[i].length;j++)
			{
				sum=sum+x[i][j];
			}
		}
		
		System.out.println(sum);
	}

	void TriangleBsum(int x[][])
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				sum=sum+x[i][j];
			}
		}
		
		System.out.println(sum);
	}

	void TriangleAmax(int x[][])
	{
			int max=0;
		for(int i=0;i<x.length;i++)
			for(int j=i;j<x[i].length;j++)
				if(max<x[i][j])
					max=x[i][j];
				
				System.out.println(max);
	}

	void TriangleBmax(int x[][])
	{
			int max=0;
		for(int i=0;i<x.length;i++)
			for(int j=0;j<=i;j++)
				if(max<x[i][j])
					max=x[i][j];
				
				System.out.println(max);
	}

	void TriangleAmin(int x[][])
	{
			int min=1000000000;
		for(int i=0;i<x.length;i++)
			for(int j=i;j<x[i].length;j++)
				if(min>x[i][j])
					min=x[i][j];
				
				System.out.println(min);
	}

	void TriangleBmin(int x[][])
	{
			int min=100000000;
		for(int i=0;i<x.length;i++)
			for(int j=0;j<=i;j++)
				if(min>x[i][j])
					min=x[i][j];
				
				System.out.println(min);
	}

	public static void main(String... s)
	{
		int x[][]=new int[][]{{10,5,25},{20,30,40},{100,60,95}};
		int y[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int z[][]=new int [][]{{9,8,7},{4,5,6},{2,3,1}};
		/*ArrayOfArrays a=new ArrayOfArrays();
		System.out.println("MAX: "+a.max1(x));
		System.out.println("MIN "+a.min1(new int[][]{{10,15,25},{20,30,40},{50,60,95}}));
		System.out.println("SORT:");
		a.sort1(z);
		System.out.println("ADDITION OF MATRIX:");
		a.matrixadd(new int[][]{{10,5,25},{20,30,40},{100,60,95}},new int[][]{{1,2,3},{4,5,6},{7,8,9}});
		System.out.println("MULTIPLICATION OF MATRIX:");
		a.matrixmul(new int[][]{{10,5,25},{20,30,40},{100,60,95}},new int[][]{{1,2,3},{4,5,6},{7,8,9}});
		System.out.println("TRANSPOSE OF MATRIX:");
		a.MatrixTranspose(new int[][]{{10,5,25},{20,30,40},{100,60,95}});
		System.out.println("SUM OF ELEMENTS:");
		a.MatrixSum(new int[][]{{10,5,25},{20,30,40},{100,60,95}});*/
		
		//a.TriangleAsum(x);
		
		//a.TriangleBsum(x);
		
		//a.TriangleAmax(x);
		
		//a.TriangleBmax(x);
		
		//a.TriangleAmin(x);
		
		//a.TriangleBmin(x);
		
		
	}
}