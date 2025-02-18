package normal;

public class ArrayPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,3,4,6,7};

for(int i=0;i<a.length;i++)
{
	int c=0;
	for(int j=1;j<=a[i];j++)
	{
		
		if(a[i]%j==0)
			c++;
	}
	if(c==2)
	{
		System.out.print(a[i] +" ");
	}
}
	}

}
