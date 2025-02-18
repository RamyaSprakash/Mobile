package normal;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0,b=1;
System.out.print(a+" "+ b);
for(int i=2;i<7;i++)
{
	int c=a+b;
	System.out.print(" "+c+ " ");
	a=b;
	b=c;
	
}

	}

}
