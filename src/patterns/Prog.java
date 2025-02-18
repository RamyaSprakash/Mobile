package patterns;

import java.util.LinkedHashSet;

public class Prog {

	public static void main(String[] args) {

		String s="Ramya";
		rem(s);
	}
	
	public static void rem(String s)
	{
		LinkedHashSet<Character> l=new LinkedHashSet();
		for(int i=0;i<s.length();i++)
		{
			l.add(s.charAt(i));
		}
		System.out.println(l);
	}
	}


