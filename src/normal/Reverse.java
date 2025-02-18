package normal;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Ramya";
for(int i=s.length()-1;i>=0;i--)
{
	System.out.print(s.charAt(i));
}
	
//string to array  using split method based on delimeter
	//String[] sh=s.split();
	System.out.println();
for(int i=0;i<s.length();i++)
{
	System.out.println(s.charAt(i));
}
	}	
}

