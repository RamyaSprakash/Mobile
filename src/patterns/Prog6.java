package patterns;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=5;i>=1;i--)
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
/*
*****
 ****
  ***
   **
    *
    
 55555
 4444
  333
   22
    1

54321
 4321
  321
   21
    1

   
   
*/