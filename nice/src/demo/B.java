package demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class B extends A {

	Integer num = 20;

	public void display() throws FileNotFoundException   {

		System.out.println("In Child class");

	}
	

	
	public static void main(String[] args) {

		A a = new B();
		A aa=new A();
		
		
		
		
	

		B b = new B();
		

		String s = new String("abc");
		s = "xyz";
		s = "poi";
		System.out.println(s);

		int[] arr = { 1, 2, 7, 9, 6 };
		int sum = 8;

		for (int i = 0; i <= arr.length - 2; i++) {

			for (int j = i + 1; j <= arr.length - 1; j++) {

				if (arr[i] + arr[j] == sum) {
					System.out.println(arr[i] + "+" + arr[j]);
				}

			}
		}
		int[] arr1= {1,1,2};
		String p = "MERCER";
		
		System.out.println(getData("MERCER", 3, arr1));
		
		List<Integer> li=Arrays.asList(88,2,3,88,33,87,34,87);
		
		Integer maxxx = li.stream().max(Integer::compare).orElseThrow(()-> new RuntimeException("List is Empty"));
		
		li.stream().filter(f-> f==maxxx).collect(Collectors.toList()).forEach(System.out::println);
		
		//li.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
//		Optional<Integer> op = li.stream().max(Comparator.naturalOrder());
//		if(op.isPresent())
//		{System.out.println(op.get());}
		
		
		List<Integer> li1=Arrays.asList(56,3,5,6,5);
		List<Integer> li2=Arrays.asList(88,2,3,88,33,87,34,87);
		
		
		Stream.of(li,li1,li2).flatMap(List::stream).collect(Collectors.toList()).forEach(System.out::println);
		
		
		
		

	}
	public static StringBuilder getData(String input, int count, int[] arr) {
		StringBuilder sb = new StringBuilder(input);

		for (int i = 0; i < count; i++) {

			if (arr[i] == 1) {
				char temp = sb.charAt(0);
				sb.setCharAt(0, sb.charAt(arr.length - 1));
				sb.setCharAt(arr.length - 1, temp);
				System.out.println(sb);

			}

			if (arr[i] == 2) {

				int middle = sb.length() / 2;

				String first = sb.substring(0, middle);
				String last = sb.substring(middle, sb.length());

				sb = new StringBuilder(last + first);
				System.out.println(sb);

			}

		}

		return sb;

	}


}
