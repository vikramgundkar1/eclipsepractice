package exception;

import java.util.Arrays;

public class ServiceClass extends CustomeExeception{

	
	
	public static void reverseString(char[] s) {

        char[] t=new char[s.length];
        int j=0;
        
    for(int i=s.length-1;i>=0;i--)
    {
        t[j]=s[i];
        j++;
    }
    System.out.println(Arrays.toString(t));
    
}

	public ServiceClass(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public static String EligibilityException(int age) {
		
		
		
		 
		 
		
		
		
		
		
		
		
		char[] s= {'h','e', 'l', 'l', 'o'};
		
		reverseString(s);
		
		
		
		if (age < 18) {
			throw new CustomeExeception("The voter age is below 18");
		}
		System.out.println("Person is eligible for vote");

		return "Person is eligible for vote";
	}

	public static void main(String[] args) {
		
		try
		{
			ServiceClass.EligibilityException(15);
		}
		catch(CustomeExeception e)
		{
			System.out.println("Found Custome Exception"+ e.getMessage());
		}
		
		
		

	}

}
