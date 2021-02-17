class MergeSort
{
MergeSort()
{
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
	int i=first,j=mid+1,b[x.length],k=0;
	
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
			i++
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
}
public static void main(String... s)
{
	new MergeSort();
}
}