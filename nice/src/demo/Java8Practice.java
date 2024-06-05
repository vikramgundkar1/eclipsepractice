package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Practice {
	public static void main(String[] args) {

//. Filter and Collect Names Starting with a Given Letter

		List<String> ls = Arrays.asList("Vikram", "Ashok", "Gundkar");

		ls.stream().filter(s -> s.toLowerCase().startsWith("v")).collect(Collectors.toList())
				.forEach(System.out::println);

//. Sum of Squares
		List<Integer> lsq = Arrays.asList(1, 2, 37, 41, 5, 2, 1, 1, 6, 34, 9, 67);
		List<?> lp = Arrays.asList(1, 2, 37, 41, 5, 2, 1, 1, 6, 34, 9, 67, "vikram");
		lp.size();

		int sum = lsq.stream().map(a -> a * a).mapToInt(Integer::intValue).sum();
		System.out.println(sum);

//Convert Strings to Uppercase

		ls.stream().map(b -> b.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);

// Find First Element Matching a Condition

		Optional<Integer> f = lsq.stream().filter(c -> c > 10).findFirst();
		System.out.println(f.get());

//Sort a List of Objects

//Group By Attribute

		Map<Integer, Long> map = lsq.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);

//Flatten a List of Lists

		List<? extends Object> m = Stream.of(ls, lsq).flatMap(List::stream).collect(Collectors.toList());
		System.out.println(m);

//Check for Palindrome
		List<String> lpp = Arrays.asList("vikram", "radar", "paper", "level", "civic");
		lpp.stream().filter(t -> t.equalsIgnoreCase(new StringBuilder(t).reverse().toString()))
				.collect(Collectors.toList()).forEach(System.out::println);

// Count Occurrences of a Character
		String s = "vikram ashok gundkar";
		// Stream.of(s.toCharArray()).collect(Collectors.groupingBy(Function.identity(),
		// Collectors.counting()));
		List<char[]> o = Arrays.asList(s.toCharArray());
		// .stream().collect(Collectors.groupingBy(Function.identity(),
		// Collectors.counting()));

		long charcount = ls.stream().map(y -> y.toLowerCase()).flatMapToInt(CharSequence::chars).filter(r -> r == 'a')
				.count();
		System.out.println(charcount);

// Find factorial of each number in List
		List<Integer> lsf = Arrays.asList(1, 2, 3, 4, 31);
		System.out.println("Factorials");
		lsf.stream().map(num -> {
			int res = 1;
			for (int i = 1; i <= num; i++) {
				res = res * i;
			}
			return res;

		}).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("++++++++++++++");
		List<Integer> intlist = new ArrayList<Integer>();
		List<String> slist = new ArrayList<String>();
		slist.add("vikram");
		slist.add("ashok");
		slist.add("gundkar");
		
		Iterator<String> it1=slist.iterator();
		
		while(it1.hasNext())
		{
			String element=it1.next();
			if(element.equals("ashok"))
			{
				it1.remove();
			}
		}
		
		System.out.println(slist);
		intlist.add(1);
		intlist.add(2);
		intlist.add(3);
		intlist.add(4);
		System.out.println(intlist.size());
		System.out.println(intlist);
		Iterator<Integer> it=intlist.iterator();
		while(it.hasNext())
		{
			
			int element=it.next();
			if(element==3)
			{
				it.remove();
			}
		}
		System.out.println(intlist.size());
		System.out.println(intlist);
		

	}
}
