package codingproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class JavaCodingProblems {
	// longest substring without repeatating character

	//

	// Find the number of ways the person can climb the staires having restriction
	// is at atime he can climb 1 or 2 steps only
	public int numberOfWaysToClmbSteps(int step) {

		if (step == 1) {
			return 1;
		}
		if (step == 2) {
			return 2;
		}

		int arr[] = new int[step];
		arr[0] = 1;
		arr[1] = 2;

		for (int i = 2; i <= step - 1; i++) {

			arr[i] = arr[i - 1] + arr[i - 2];
		}

		return arr[step - 1];

	}

// find the highest anagram of string as an output for the given string having space. e.g 

	public String[] findingHighestNuberOfAnagram(String s) {
		s = "eat ate tan nat ban tea";
		String[] arr = s.split(" ");

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j <= arr[i].length() - 1; j++) {

			}
		}

		return null;
	}

	public static void main(String[] args) {

		JavaCodingProblems j = new JavaCodingProblems();
		String sarr[] = { "Vikram", "Ashok", "Gundkar" };
		System.out.println(Arrays.toString(sarr));
		String s = "eat ate tan nat ban tea";
		String[] arr = s.split(" ");
		List<String> list = Arrays.asList(arr);

		List<String> sortedList = new ArrayList();

		System.out.println(list);

		for (int i = 0; i <= list.size() - 1; i++) {

			Arrays.sort(list.get(i).toCharArray());

		}
		StringBuilder sb=new StringBuilder();
		
		

		// System.out.println(Arrays.sort(null));
		System.out.println(j.numberOfWaysToClmbSteps(5));

		
		
		
		
		
		// Remove Nth Node From End of List

		List<Integer> list1 = new ArrayList<Integer>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		

		Iterator<Integer> it = list1.iterator();
		
		while (it.hasNext()) {
				  int z = it.next();
			if(z==3)
			{
				it.remove();
			}
				
						
			
		}
		System.out.println(list1);

	}
}


