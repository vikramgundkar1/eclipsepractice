package newpackage;

public class Practice {
	public static void main(String[] args) {
		
		String s="mystring";
		String newstring="";
		for(int j=0;j<=s.length()-1;j++)
		{
			if(!(newstring.contains(s.charAt(j)))
			{	int count=1;
			newstring=newstring+s.charAt(j);
				for(int k=j+1;k<=s.length()-1;k++)
				{
					if(s.charAt(j)==s.charAt(k))
					{	
						count++;
					}
				}
				
				System.out.println(s.charAt(j)+" "+count);
				
			}
			
		}
		
		 
				
				
		
		
	}

}
