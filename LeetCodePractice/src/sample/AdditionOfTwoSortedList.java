package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AdditionOfTwoSortedList {

	public static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {

		System.out.println(list1);

		for (Integer i : list2) {
			list1.add(i);
		}
		Collections.sort(list1);
		System.out.println(list1);
//Removing the duplicates 

		Set<Integer> sl = new HashSet<Integer>(list1);
		System.out.println(sl);
		return list1;

	}

	public static void main(String[] args) {
		List list1 = new ArrayList();

		List list2 = new ArrayList();
		list1.add(1);
		list1.add(4);
		list2.add(2);
		list2.add(3);
		list2.add(1);
		list2.add(4);

		mergeTwoLists(list1, list2);

//Longest substring without repeating character...............................

		String s = "abcabcbb";

		for (int i = 0; i <= s.length() - 1; i++) {

		}

///reverse integer..................................

		int x = 123456;
		int rem = 0;
		int result;

		while (x > 0) {

			rem = rem * 10 + x % 10;
			x = x / 10;

		}
		System.out.println(rem);
////String to integer.............................

		String number = "123466";
		int integerNumber = Integer.parseInt(number);
		System.out.println(integerNumber);
////// To check palindrome number......................

		int y = 121;
		int rem1 = 0;
		while (y > 0) {
			rem1 = rem1 * 10 + y % 10;
			y = y / 10;
		}
		System.out.println(y + " " + rem1);
		if (121 == rem1) {
			System.out.println("Given number is palindrome number");
		} else {
			System.out.println("Given number is not palindrome number");
		}

//Find index of first occurance of string

		String c = "Vikram Ashok GVundkar";

		System.out.println(c.indexOf('a'));
		System.out.println("------------");
		System.out.println(c.indexOf('a', c.indexOf('a') + 1));

/// Find first non repating chracter from string
		c.toLowerCase();
		String store = "";

		for (int i = 0; i <= c.length() - 1; i++) {
			if (c.indexOf(c.charAt(i), c.indexOf(c.charAt(i)) + 1) == -1)

			{
				System.out.println(c.charAt(i) + " is the first non repeating character");
				break;
			}

		}
/////// Converting Integer to String
		int f=911;
		String value=String.valueOf(f);
		
		System.out.println(value);
		int arrrr[]= {1,2,3,4,5,6,7,8,9,2,4,6,8};
		Set<Integer> s2=new HashSet<Integer>();
		
		
		List<Integer> lintd=new ArrayList<Integer>();
		
		
		
		Set<Integer> ans = lintd.stream().filter(p-> !s2.add(p)).collect(Collectors.toSet());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(ans);
		
		
////Finding squre root
		
		int s1=16;
		int sroot= (int) Math.sqrt(s1);
		System.out.println(sroot);
		System.out.println(Math.multiplyExact(2, 10));
		
	}
}
