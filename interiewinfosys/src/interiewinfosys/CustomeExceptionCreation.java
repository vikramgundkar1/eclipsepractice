package interiewinfosys;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class CustomeExceptionCreation {

	public static void checkValue(int age) {

		if (age > 18)
		{
			System.out.println("This is valid voter");
		}
		else
		{
			throw new CustomeException("This is not valid voter");
		}
			

	}
	
	
	public static void main(String[] args) {

		
		
		//CustomeExceptionCreation.checkValue(17);
		try {
			checkValue(3);

		}

		catch (CustomeException e) {
			System.out.println(e.getMessage());
		}

		int z = 4321;
		int res = 0;
		int rem = 0;

		while (z > 0) {
			rem = z % 10;
			res = res * 10 + rem;
			z = z / 10;

		}
		System.out.println(res);
		
		int[] arr= {1,2,3,4,2,4,5};
		
	//	Map<Integer, Integer> m = Arrays.asList(arr).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		

	}

}
