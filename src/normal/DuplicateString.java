package normal;

public class DuplicateString {
	public static void main(String[] args) {
	 String[] a= {"Ramya","Ammu","Ramya","gfgfg","Ammu"};
	 int c;
	 for(int i=0;i<a.length;i++)
	 {
		 c=0;
		 for(int j=i+1;j<a.length;j++)
		 {
			 if(a[i]==a[j])
			 {
				 c++;
			 }
		 }
		 if(c>0)
		 {
			 System.out.println(a[i]);
		 }
	 }
	}
}
