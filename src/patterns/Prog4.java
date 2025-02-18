package patterns;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

/*

*****
****
***
**
*


i

 
 11111
2222
333
44
5

j

54321
5432
543
54
5
*/