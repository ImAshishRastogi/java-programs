
class SingleArray
{
	int Max(int x[])
	{
	int max=0;
	for(int i=0;i<x.length;i++)
	{
	if(x[i]>max)
	max=x[i];
	}
	return max;
	}

	int Min(int x[])
	{
	int min=100000000;
	for(int i=0;i<x.length;i++)
	{
	if(x[i]<min)
	min=x[i];
	}
	return min;
	}

	void sort(int x[])
	{
		MergeSort(x,0,x.length-1);
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
	
	void Traverse(int x[])
	{
		for(int i=0;i<x.length;i++)
		System.out.print( x[i]+" ");
	}

	void mergesort(int x[],int y[])
	{
		int l=x.length+y.length;
		int z[]=new int[l];
		int k=0;
		for(int i=0;i<x.length;i++)
		{
			z[k]=x[i];
			k++;
		}
		for(int i=0;i<y.length;i++)
		{
			z[k]=y[i];
			k++;
		}
		MergeSort(z,0,l-1);
		Traverse(z);
	}
	
	void intersection(int x[],int y[])
	{
		int z[]=new int[1000000];
		int k=0;
		MergeSort(x,0,x.length-1);
		MergeSort(y,0,y.length-1);
		for(int i=0;i<x.length;i++)
		{
			
			for(int j=0;j<y.length;j++)
			{
				if(x[i]==y[i])
				{
				z[k]=x[i];
				k++;
				break;
				}
			}
		}
		for(int i=0;i<k;i++)
		System.out.print(" "+z[i]);
	}
	
	/*int binary(int x[], int item)
	{
		int start=0;
		int end=x.length-1;
		int mid,flag=0;
		for(int i=start;i<=end;i++)
		{
			mid=(start+end)/2;
			if(item<x[mid])
				end=mid-1;
			else if(item>x[mid])
				start=mid+1;
			else if(item==x[mid])
			{
				flag=1;
				break;
			}
		}
		return flag;
	}*/
	
	void union(int x[],int y[])
	{
		int z[]=new int[1000000];
		int k=0;
		MergeSort(x,0,x.length-1);
		MergeSort(y,0,y.length-1);
		for(int i=0;i<x.length;i++)
		{
			
			for(int j=0;j<y.length;j++)
			{
				if(x[i]!=y[i])
				{
				z[k]=x[i];
				k++;
				z[k]=y[i];
				k++;
				break;
				}
				else
				{
					z[k]=x[i];
					k++;
					break;
				}
			}
		}
		for(int i=0;i<k;i++)
		System.out.print(" "+z[i]);
	}
	
	void reverse(int x[])
	{
		for (int i = 0; i < x.length / 2; i++) {
         int temp = x[i];
         x[i] = x[x.length - 1 - i];
		x[x.length - 1 - i] = temp;
		}
	}

	void merge(int x[],int y[])
	{
		int l=x.length+y.length;
		int z[]=new int[l];
		int k=0;
		for(int i=0;i<x.length;i++)
		{
			z[k]=x[i];
			k++;
		}
		for(int i=0;i<y.length;i++)
		{
			z[k]=y[i];
			k++;
		}
		Traverse(z);
	}

	void shift(int x[])
	{
		System.out.println("before shifting: ");
		Traverse(x);
		int k=0,l=0;
		for(int i=0;i<x.length;i++)
			if(x[i]<0)
			k++;
			else
			l++;
		int n[]=new int[k];
		int p[]=new int[l];
		k=0;
		l=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]<0)
			{n[k]=x[i];
			k++;}
			else
			{p[l]=x[i];
			l++;
			}
		}
		MergeSort(n,0,k-1);
		MergeSort(p,0,l-1);
		reverse(n);
		System.out.println("\nafter shifting: ");
		merge(n,p);
	}
	

	void FrequencyCount(int x[])
	{
		int max=0;
		int index=0;
		for(int i=0;i<x.length;i++)
		{
			int count=0;
			for(int j=0;j<x.length;j++)
				if(x[i]==x[j])
					count++;
				
			if(count>max)
			{
				max=count;
				index=i;
			}
		}
		System.out.println("index: "+(index+1)+"\nelement: "+x[index]+"\ncount: "+max);
	}

	void FirstNonRapeatingElement(int x[])
	{
		int index=0;
		for(int i=0;i<x.length;i++)
		{
			int count=0;
			for(int j=0;j<x.length;j++)
				if(x[i]==x[j])
				{
					count=1;
					break;
				}
				
			if(count==0)
			{
				index=i;
				break;
			}
		}
		System.out.println("index: "+(index+1)+"\nelement: "+x[index]);
	}

public static void main(String... s)
{
	int x[]=new int[]{10,2,75,34,98,245,63,84,45};
	int y[]=new int[]{41,56,9,123,245,56,175,45,41,56 ,2};
	int arr[]=new int []{-2,-3,-4,-1,0,1,4,3,2};
	SingleArray sa=new SingleArray();
	//int result=sa.Max(x);
	//System.out.println("MAX: "+sa.Max(x));
	//System.out.println("MIN: "+sa.Min(x));
	//System.out.println("SORT OF ARRAY's ELEMENTS:");
	//sa.sort(x);
	//System.out.println("\nMERGESORT OF TWO ARRAYS:");
	//sa.mergesort(x,y);
	//System.out.println("\nINTERSECTION: ");
	//sa.intersection(new int[]{2,4,42,52,65,75,85},new int[]{2,5,63,75,85,95,102});
	//System.out.println("\nUNION: ");
	//sa.union(x,y);
	//System.out.println("\nShift: ");
	//sa.shift(arr);
	//System.out.println("\nFrequency Count: ");
	//sa.FrequencyCount(y);
	System.out.println("\nFirst Non repeating element: ");
	sa.FirstNonRapeatingElement(y);
	//System.out.println("\nBinary to Decimal: ");
	
	//System.out.println("\nMax in a row: ");
	
	//System.out.println("\nNumber to word: ");
	
	//System.out.println("\nprint diagonal wise: ");
	
	//System.out.println("\nsequnce diagonal wise: ");
	
	//System.out.println("\nprint triangle wise: ");
	
	//System.out.println("\nlcm: ");
	
	//System.out.println("\nHcf: ");
	
	//System.out.println("\n3rd largest value in array: ");
	
}
}
