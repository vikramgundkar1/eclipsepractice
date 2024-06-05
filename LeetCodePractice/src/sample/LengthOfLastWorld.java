 package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LengthOfLastWorld {

	public static void main(String[] args) {
		
		
		String S="Java";
		S.concat(" SE 6");
		S.replace('6', '7');
		System.out.println(S);
		System.out.println("*********");

		String s = "Vikram Asok Gundkar";

		String[] array = s.split(" ");
		int lengthlast = array[2].length();
		System.out.println(lengthlast);

		int base = 4;
		int power = 2;

		for (int i = 1; i <= 2; i++) {

		}

		System.out.println(base);

		List<String> names = Arrays.asList("Amazon", "GCP", "yut");

		Map<Integer, List<String>> map = names.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(map);

		String[] list = { "Vikram", " ", "Ashok", " ", "Gundkar" };

		List<String> newlist = Arrays.asList(list);
		String fullname = newlist.stream().collect(Collectors.joining());
		System.out.println(fullname);

//1. Write a Java program to calculate the average of a list of integers using streams.

		int[] listofInteger = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		List<int[]> lint = Arrays.asList(listofInteger);
		lint.forEach(System.out::println);

		List<Integer> listadd = new ArrayList<Integer>();
		listadd.add(5);
		listadd.add(6);
		listadd.add(1);
		listadd.add(2);
		listadd.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

// removing duplicate array

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 3, 1, 2, 3, 4 };

		List<Integer> l = new ArrayList<Integer>();

		for (int i = 0; i <= arr.length - 1; i++) {
			if (!l.contains(arr[i])) {
				l.add(arr[i]);
			} else {
				System.out.println("This is the first duplicate number " + arr[i]);
				break;
			}

		}
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 3, 1, 2, 3, 4 };
		System.out.println("_______________");
		Arrays.stream(arr1).distinct().forEach(System.out::println);

		int arr2[] = { 1, 2, 3, 8, 3, 1, 2, 3, 4 };
		System.out.println("UUUUUUUUUUUUUUUUUUU");
		System.out.println(arr2);
		System.out.print(Arrays.toString(arr2));

		List<int[]> zbc = Arrays.asList(arr2);
		System.out.println("UUUUUUUUUUUUUUUUUUU");

		zbc.stream().distinct().forEach(System.out::println);

		List<String> slist = Arrays.asList("Vikram", "Ashok", "Gundkar", "Vik");

		long sr = slist.stream().filter(w -> w.startsWith(String.valueOf('V'))).count();
		System.out.println(sr);

//		6. Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.		

		List<String> listofstring = Arrays.asList("My", "name", "is", "Don");

		List<String> sorlist = listofstring.stream().sorted().collect(Collectors.toList());
		System.out.println(sorlist);

//Write a Java program to find the maximum and minimum values in a list of integers using streams.		

		List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Integer mx = li.stream().min(Integer::compare).orElse(0);
		System.out.println(mx);
		
//Write a Java program to find the second smallest and largest elements in a list of integers using streams.		
		
		Integer secondsmallest = li.stream().distinct().sorted().skip(1).findFirst().orElse(null);
		System.out.println("second smallest "+secondsmallest);
		
		
		Integer secondlargest = li.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
		
		System.out.println("second largest "+secondlargest);
		
		
		Stream<String> stream= Stream.empty();
		
		
		String z="VikramAshokVik";
		Map<Character, Integer> map1=new HashMap<Character, Integer>();
		
		for(int i=0;i<=z.length()-1;i++)
		{
			if(map1.containsKey(z.charAt(i)))
			{
				map1.put(z.charAt(i), map1.get(z.charAt(i))+1);
			}
			else
			{
				map1.put(z.charAt(i), 1);
			}
			
			
		}
		System.out.println("11111111111111");
		System.out.println(map1);
		System.out.println("11111111111111");
		
			
		

//		 double average = lint.stream()
//			      .mapToDouble(Integer::doubleValue)
//			      .average()
//			      .orElse(0.0);

//		System.out.println(average);

// Write a Java program to convert a list of strings to uppercase or lowercase using streams.

		String name = "VKRAM ASHOK GUNDKAR";

		List<String> listname = Arrays.asList(name);
		List<String> lower = listname.stream().map(y -> y.toLowerCase()).collect(Collectors.toList());
		System.out.println(lower);
		
//3. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.

		// lint.stream().filter(i -> i % 2==0).mapToInt(Integer::intValue).sum();

	}

}
