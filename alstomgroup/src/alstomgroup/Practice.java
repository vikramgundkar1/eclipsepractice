package alstomgroup;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice {

	public static void main(String[] args) {

		String s = "the sun rise on east side";

		String[] arr = s.split(" ");
		System.out.println(Arrays.toString(arr));
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i <= arr.length - 1; i++) {
			sb.append(Character.toUpperCase(arr[i].charAt(0)));
			sb.append(arr[i].substring(1));
			sb.append(" ");

		}
		System.out.println(sb);

		String s1 = "AAABBCDDAA";
		StringBuilder sb1 = new StringBuilder();
		char currentChar = s1.charAt(0);
		int k = 0;
		for (int i = 0; i <= s1.length() - 1; i++) {

			if (s1.charAt(i) == currentChar) {
				k++;
			} else {
				sb1.append(k);
				sb1.append(currentChar);
				currentChar = s1.charAt(i);
				k = 1;
			}

		}
		sb1.append(k).append(currentChar);

		System.out.println(sb1);

		ArrayDeque q = new ArrayDeque();
		q.offer(1);
		q.offer(2);
		q.offer(5);
		q.offer(6);
		q.offer(3);
		q.offer(4);

		System.out.println(q);

		q.poll();
		q.poll();
		q.poll();
		System.out.println("After removal");

		System.out.println(q);

		// find the anagrams of string

		String b = "tea";
		char[] arrr = b.toCharArray();
		Arrays.sort(arrr);

		String c = "tae";
		char[] arrr1 = c.toCharArray();
		Arrays.sort(arrr1);

		if (Arrays.equals(arrr, arrr1)) {
			System.out.println("true");
		}

		// System.out.println(Arrays.toString(arrr));

		// System.out.println(sorted.toString());

		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);

		l.stream().mapToInt(Integer::intValue).average();

		List<String> ls = Arrays.asList("vikram", "ashok");
		ls.stream().map(t -> t.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);

		String sp = "abcdbcd";

		for (int i = 0; i <= sp.length() - 1; i++) {
			if (sp.indexOf(sp.charAt(i), sp.indexOf(sp.charAt(i)) + 1) != -1) {
				System.out.println("First  repeating character is " + sp.charAt(i));
				break;
			}
			

		}
		
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		for (int i = 0; i <= sp.length() - 1; i++) {
			
			
			if(!map.containsKey(sp.charAt(i)))
			{
				map.put(sp.charAt(i), 1);
			}
			
			else
			{
				map.put(sp.charAt(i), map.get(sp.charAt(i))+1);
			}

			
			
		}
		System.out.println(map);
		
		

	}

}
