package practice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sample {
	
	public static int factorial(int a)
	{
		if(a==0)
			return 1;
		return a*factorial(a-1);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(Sample.factorial(4));
		
		List<Double> list=new ArrayList<Double>();
		list.add(23.0);
		list.add(2.0);
		list.add(4.0);
		list.add(23.0);
		list.add(22.0);
		list.add(4.0);
		list.add(22.0);
		list.add(22.0);
		
	Map<Double, Long> m = list.stream().filter(x-> Collections.frequency(list, x)>1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
	System.out.println(m);
		Map<Double, Long> map=new HashMap<Double, Long>();
		
		map=list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(map);
		Object sum = list.stream().mapToDouble(Double::doubleValue).sum();
				
		Object s = java.time.LocalDate.now();
		
		System.out.println(LocalDateTime.now());
	
	}

}
