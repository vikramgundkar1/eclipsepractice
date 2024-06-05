package interiewinfosys;

import java.util.Arrays;

public class Customer {

	public static void main(String[] args) {

//		int[] s=new int ['A'];
//		System.out.println(Arrays.toString(s));
//		
		int arr[] = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4, 6, 8, 9, 8, 7, 6, 5, 6, 7, 8, 9, 10, 11, 12 };

		int decreaseCount = 0;
		int increaseCount = 0;

		for (int i = 1; i <= arr.length - 2; i++) {

			if (arr[i + 1] < arr[i] && arr[i - 1] < arr[i]) {
				decreaseCount++;

			}

			if (arr[i + 1] > arr[i] && arr[i - 1] > arr[i]) {
				increaseCount++;

			}

		}
		System.out.println("decreaseCount= " + decreaseCount);
		System.out.println("increaseCount= " + increaseCount);
		int total = decreaseCount + increaseCount;
		System.out.println("Total change in direction= " + total);

	}

}
