package normal;

import java.util.LinkedHashSet;

public class Removedup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Ramya";
 removedup(s);

	}
	
	public  static void removedup(String s) {
		
		
		
		LinkedHashSet<Character> l=new LinkedHashSet<>();
			for(int i=0;i<s.length();i++)
			{
				l.add(s.charAt(i));
			}
			 for(Character ch:l)
			 {
				 System.out.println(ch);
			 }
			
	}
	

	}

	

