package normal;

public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int y=2014;
/*if((y%4==0 && y%100!=0) ||(y%400==0))
{
	System.out.println("leap year");
}
else
{
	System.out.println("not a leap year");
}*/

if(y%4==0)
{
	if(y%100==0)
	{
		if(y%400==0)
		{
			System.out.println(" leap year");
		}
		else 
		{
			System.out.println("not a leap year");
		}
	}
	else 
	{
		System.out.println("leap year");
	}
}

else {
	System.out.println("not a leap year");
}
	}

}
