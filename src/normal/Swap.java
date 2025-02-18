package normal;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5;
int b=6;
int t=0;
t=a;
a=b;
b=t;
System.out.println(a);
System.out.println(b);

a=a+b;
b=a-b;
a=a-b;
System.out.println(b);
System.out.println(a);
	}

}
