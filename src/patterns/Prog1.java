package patterns;

/*
* * * * * 
* * * * *
* * * * *
* * * * *
* * * * *
*/



//print i                  print j

/*
 1 1 1 1 1             1 2 3 4 5
 2 2 2 2 2             1 2 3 4 5
 3 3 3 3 3             1 2 3 4 5
 4 4 4 4 4             1 2 3 4 5
 5 5 5 5 5             1 2 3 4 5
 */

public class Prog1 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
