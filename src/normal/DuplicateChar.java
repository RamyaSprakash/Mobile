package normal;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name="Ramya Prakashy";
        int c;
        char[] ch=name.toCharArray();
       
        for(int i=0;i<ch.length;i++)
        {
        	 c=0;
        	  for(int j=i+1;j<ch.length;j++)
        	  {
        		  if(ch[i]==ch[j]  && ch[j]!=' ')
        		  {
        			  c++;
        		  }
        	  }
        	  if(c>0)
              {
              	System.out.println(ch[i]);
              }  
        }
        

	}
// && ch[j]!=' '   && ch[i]!='0'
	
	
	
	
}
