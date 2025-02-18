package sorting;

public class Insertion {

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
		for(int i=1;i<n;i++)
		{
			int t=a[i];
			int j=i-1;
			while(j>=0 && a[j]>t)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=t;
		}
	}

}
