package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class JustPractice {
	public static void main(String[] args) {
		// Writing program to find fibonnaci series 0,1,1,2,3,5,8,13,21
		int[] arr = new int[10];
		arr[0] = 0;
		arr[1] = 1;

		for (int i = 2; i <= arr.length - 1; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}

		System.out.println(Arrays.toString(arr));

		String ss1 = "silent";
		String ss2 = "listen";
		String ss3 = "siletn";
		String ss4 = "ilsten";
		String ss5 = "silent";
		String ss6 = "ltsien";

		List<String> lstring = Arrays.asList("silent", "kiv", "listen", "vik", "siletn", "ilsten", "silent", "ltsien");
		HashMap<String, List<String>> map1 = new HashMap<String, List<String>>();

		for (int i = 0; i <= lstring.size() - 1; i++) {
			String originalString = lstring.get(i);

			char[] arr3 = lstring.get(i).toCharArray();
			Arrays.sort(arr3);
			String key = String.valueOf(arr3);
			if (!map1.containsKey(key)) {
				List<String> original = new ArrayList<String>();
				original.add(originalString);
				map1.put(key, original);
			} else {
				map1.get(key).add(originalString);
			}

		}
		System.out.println(map1);
		int max = 1;
		List<String> longestList = null;

		for (Map.Entry<String, List<String>> entry : map1.entrySet()) {
			int count = entry.getValue().size();
			if (count > max) {
				max = count;
				longestList = entry.getValue();
			}
		}

		System.out.println(max + "and list is" + longestList);

		// Check if a Number is Prime
		int p = 11;
		if (p == 0 || p == 1) {
			System.out.println("given number " + p + " is not prime");
		}

		else if (p == 2) {
			System.out.println("given number " + p + " is prime");
		} else if (p > 2) {
			for (int i = 2; i <= p / 2; i++) {
				if (p % i == 0) {
					System.out.println("given number " + p + " is not prime");
					break;
				}

			}

		}

		// largest element in an array
		int arrll[] = { 1, 3, 5, 5, 9, 78, 5, 3, 4, 3, 56, 78, 5, 23, 4, 5, 67, 54 };

		Arrays.sort(arrll);

		System.out.println(arrll[arrll.length - 2]);

		List<Integer> ilist = Arrays.asList(1, 3, 6, 9, 6, 55, 2, 1, 4, 55, 7, 9, 0, 4);
		
		Optional<Integer> maxx = ilist.stream().sorted(Collections.reverseOrder()).findFirst();
		if (maxx.isPresent()) {
			int maxvalue = maxx.get();
			ilist.stream().filter(k -> k == maxvalue).collect(Collectors.toList()).forEach(System.out::println);

		}
		int[] ert=new int[-2];
		//int f=ert[-3];
		
		
	}
}
