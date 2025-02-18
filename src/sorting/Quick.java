package sorting;

public class Quick {

	public static void main(String[] args) {
		//int a[]= {12,5,6,7,9,2,4,10,7,18};
		int a[]= {5,16,6,8,15};
		//System.out.println(a.length);
		int m=0;
		int n=a.length-1;
		sort(a,m,n);
		for(int a1:a)
		{
			System.out.print(a1+" ");
		}
	}
public static void sort(int a[],int low,int high)
{
	int loc=partition(a,low,high);
	if(low<loc-1)
	{
		sort(a,low,loc-1);
	}
	if(loc<high)
	{
		sort(a,loc,high);
	}
			
}

public static int partition (int a[],int low,int high)
{
	int pivot=a[(low+high)/2];
	//System.out.println(pivot);
	while(low<=high)
	{
		while(a[low]<pivot)
		{
			low++;
		}
		while(a[high]>pivot)
		{
			high--;
		}
		if(low<=high)
		{
			int t=a[low];
			a[low]=a[high];
			a[high]=t;
			low++;
			high--;
		}
	}
	return low;
}
}
