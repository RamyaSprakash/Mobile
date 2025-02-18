package normal;

public class Revnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int f=0,b=0;
int n=1234;
while(n>0)
{
	b=n%10;
	n=n/10;
	f=(f*10)+b;
}
System.out.println(f);
	}

}
