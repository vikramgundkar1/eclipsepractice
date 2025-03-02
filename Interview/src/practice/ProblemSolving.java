package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProblemSolving {

	int id;
	String name;
	int age;
	String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public ProblemSolving(int id, String name, int age, String city) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public ProblemSolving(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {

		String s = "ashokkumar";

		String d = "";

		for (int i = 0; i <= s.length() - 1; i++) {
			int count = 1;
			for (int j = i + 1; j <= s.length() - 1; j++) {

				if (s.charAt(i) == s.charAt(j)) {
					count++;

					if (count > 1) {
						System.out.println(s.charAt(i) + " " + count);
					}

				}

			}

		}
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('a', 2);
		map.put('b', 1);
		map.put('c', 6);
		map.put('d', 8);

		System.out.println(map.get('b'));

		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		for (int i = 0; i <= s.length() - 1; i++) {
			if (!hmap.containsKey(s.charAt(i))) {
				hmap.put(s.charAt(i), 1);
			} else {
				hmap.put(s.charAt(i), hmap.get(s.charAt(i)) + 1);
			}
		}

		System.out.println(hmap);

		System.out.println("------------------");

		for (int i = 0; i <= s.length(); i++) {
			if ((s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) != -1)) {
				System.out.println(s.charAt(i) + " is the first non repeating character");
				break;
			}

		}

		System.out.println("------------------");

//removing integer from the array
		int rint[] = { 1, 2, 3, 4, 5, 2, 4, 6, 2 };
		int val = 2;

		System.out.println("Before removing " + Arrays.toString(rint));

		int count = 0;
		for (int i = 0; i <= rint.length - 1; i++) {

			if (rint[i] == val) {
				count++;
			}
		}
		System.out.println(count);

		int newarray[] = new int[rint.length - count];
		int k = 0;
		for (int i = 0; i <= rint.length - 1; i++) {
			if (rint[i] != val) {
				newarray[k] = rint[i];
				k++;
			}
		}
		System.out.println("After removing " + val + " is" + Arrays.toString(newarray));

		System.out.println("Removing duplicate elements from an array");

		int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 4, 6, 8 };

		HashSet<Integer> hs = new HashSet<Integer>();

		for (int i = 0; i <= ar.length - 1; i++) {

			hs.add(ar[i]);

		}
		System.out.println(hs);

		System.out.println("Removing duplicate elements from the list using stream");
		Set<Integer> ns = new HashSet<Integer>();

		List<Integer> l = new ArrayList();
		l.add(1);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(1);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(9);
		System.out.println("IUYTRRERTYUUUUYTRTYRUYT");
		System.out.println(l);
		List<Integer> u = l.stream().filter(m -> ns.add(m)).collect(Collectors.toList());
		System.out.println(u);

		System.out.println("Shecking frequency of elements from array");
		int ar1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 4, 6, 8 };

		HashMap<Integer, Integer> it = new HashMap<Integer, Integer>();

		for (int i = 0; i <= ar1.length - 1; i++) {
			if (it.containsKey(ar1[i])) {
				it.put(ar1[i], it.get(ar1[i]) + 1);
			} else {
				it.put(ar1[i], 1);

			}
		}
//		
//		List<Integer> listOfArray=Arrays.asList(ar1);
//		listOfArray.stream().filter(m-> Collections.frequency(u, listOfArray)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
//using stream
		
		
		
	

		System.out.println("finding max and min from list");
		List<Integer> l1 = new ArrayList();
		l1.add(1);
		l1.add(34);
		l1.add(4);
		l1.add(56);
		l1.add(18);
		l1.add(3);
		l1.add(49);
		l1.add(55);
		l1.add(92);

		Integer min = l1.stream().sorted().skip(1).findFirst().get();
		System.out.println(min);
		int max = l1.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().orElse(null);
		System.out.println(max);

		List<ProblemSolving> psl = new ArrayList<ProblemSolving>();

		psl.add(new ProblemSolving(1, "Vikram", 21, "Pune"));
		psl.add(new ProblemSolving(2, "Rushi", 25, "Mumbai"));
		psl.add(new ProblemSolving(3, "Om", 10, "Mumbai"));
		psl.add(new ProblemSolving(4, "kar", 89, "Mumbai"));
		psl.add(new ProblemSolving(5, "Vikram", 85));

		psl.stream().filter(kp -> kp.age > 50).forEach(employee -> System.out
				.println("Id is" + employee.getId() + "name is" + employee.getName() + "age is" + employee.getAge()));

		System.out.println("Finding 2nd largest elements from linkedlist");

		List<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(3);
		ll.add(12);
		ll.add(34);
		ll.add(61);
		ll.add(73);
		ll.add(1);
		ll.add(33);
		ll.stream().distinct().sorted(Collections.reverseOrder()).forEach(System.out::println);

		List<String> abc = new ArrayList<String>();
		abc.add("Vikram");
		abc.add("Ashok");
		abc.add("Gundkar");
		System.out.println(abc);
		boolean kjh = abc.removeIf(value -> value.equals("Vikram"));
		System.out.println(abc);

		System.out.println("Updating city");
		psl.stream().filter(f ->

		{
			if (f.getCity() == "Mumbai") {
				f.setCity("Delhi");
				return true;
			} else {
				return false;
			}

		}).forEach(em -> System.out.println(em.getId() + " " + em.getName() + " " + em.getAge() + " " + em.getCity()));

		System.out.println("finding 2nd largest from array");

		int arr5[] = { 1, 2, 3, 6, 8, 9, 3, 5, 2, 66, 8, 9, 4 };

		// Arrays.sort(arr5);
		Arrays.sort(arr5, 5, 13);
		//Arrays.sort
		System.out.println(Arrays.toString(arr5));

		System.out.println(arr5[arr5.length - 2]);

		List<Integer> linteger = new ArrayList<Integer>();
		linteger.add(1);
		linteger.add(5);
		linteger.add(1);
		linteger.add(7);
		linteger.add(7);
		linteger.add(2);
		linteger.add(7);

		System.out.println(linteger.get(0));

		HashMap<Integer, Integer> it1 = new HashMap<Integer, Integer>();

		for (int i = 0; i <= linteger.size() - 1; i++) {
			if (linteger.get(i) % 2 != 0) {

				if (!it1.containsKey(linteger.get(i))) {
					it1.put(linteger.get(i), 1);
				} else {
					//it1.put(linteger.get(i), it1.get(i)+1);
				}

			}
			else
			{
				System.out.println();
			}

		}
		System.out.println(it1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
