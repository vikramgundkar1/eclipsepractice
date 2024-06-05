package litmusseven;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 6, 9, 4, 6, 33, 77, 4, 21, 3);

		Integer s = list.stream().max(Integer::compare).get();
		Integer min = list.stream().min(Integer::compare).get();

		Integer max = list.stream().sorted().findFirst().get();
		Integer minn = list.stream().sorted(Collections.reverseOrder()).findFirst().get();

		List<String> slist = Arrays.asList("Vikram", "Ashok", "Gundkar", "Prakas");

		long count = slist.stream().filter(o -> o.toLowerCase().startsWith("A")).count();

		Map<Integer, Long> m = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(m);

		Set<Integer> set = new HashSet<Integer>();
		list.stream().filter(q -> !set.add(q)).collect(Collectors.toList()).forEach(System.out::println);

		int sumeven = list.stream().filter(j -> j % 2 == 0).mapToInt(Integer::intValue).sum();
		int sumodd = list.stream().filter(k -> k % 2 != 0).mapToInt(Integer::intValue).sum();

		String st = "vikramashokgundkar";

		long chatcount = st.chars().filter(d -> d == 'a').count();
		System.out.println(chatcount);

		System.out.println(sumeven + " " + sumodd + " ");

		int p = 8675;

		char[] digits = String.valueOf(p).toCharArray();

		int i;
		for (i = digits.length - 2; i >= 0; i--) {

			if (digits[i] < digits[i + 1]) {
				break;
			}
		}

		if (i == -1) {
			System.out.println("This is a highest number");
		}
		else if( p <= 0)
		{
			System.out.println("This is not valid number");
		}

		else {

			char temp = digits[i + 1];
			digits[i + 1] = digits[i];

			digits[i] = temp;

			// Arrays.sort(digits, i, digits.length-1);
			System.out.println(Arrays.toString(digits));

			int imh = Integer.parseInt(String.valueOf(digits));
			System.out.println(imh);
		}

	}

}
