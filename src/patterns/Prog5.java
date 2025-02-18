package patterns;

public class Prog5 {

	
/*
    *
   **
  ***
 ****
*****
*

i

    1
   22
  333
 4444
55555


    1
   21
  321
 4321
54321


 */
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=5;j>=1;j--)
			{
				if(i>=j)
				{
				System.out.print(j);
			}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
