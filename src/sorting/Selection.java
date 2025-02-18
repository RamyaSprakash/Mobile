package sorting;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,5,6,7,9,2,4,10,7,18};
		//System.out.println(a.length);
		sort(a);
		for(int a1:a)
		{
			System.out.print(a1+" ");
		}

	}
public static void sort(int a[])
{
	int n=a.length;
	for(int i=0;i<n-1;i++)
	{
		int min=i;
		for(int j=i+1;j<n;j++)
		{
			if(a[j]<a[min])
			{
				min=j;
			}
		}
		if(min!=i) {
			int t=a[i];
		a[i]=a[min];
		a[min]=t;
	}
	}
}
}
