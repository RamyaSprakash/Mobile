package normal;

public class MyNme {

	public static void main(String[] args) {
		
		int n=123;
		int f=0 ,b=0;
		while(n>0)
		{
			b=n%10;
			f=(f*10)+b;
			n=n/10;
		}
		System.out.println(f);
	}

}
