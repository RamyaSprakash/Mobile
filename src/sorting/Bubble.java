package sorting;

public class Bubble {

	public static void main(String[] args) {
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
		int f=0;
		for(int j=0;j<n-i-1;j++)
		{
			if(a[j]>a[j+1])
			{
				int t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
				f=1;
			}
		}
		if(f==0)
		{
			break;
		}
	}

	
}
}

