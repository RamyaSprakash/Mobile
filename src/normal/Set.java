package normal;

public class Set {
static void  evenorodd(int[] a)
{
	int i;
	for( i=0;i<a.length-1;i++)
	{
		if(a[i]%2==0)
		{
			System.out.println(a[i]);
		}
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,5,6,8,9};
evenorodd( a);

	}
	
}
