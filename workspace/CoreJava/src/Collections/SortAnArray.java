package Collections;

import java.util.Arrays;
import java.util.Comparator;

public class SortAnArray {

	public static void main(String[] args) {
		Integer arr[] = { 234, 567, 890, 321 };

		Arrays.sort(arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer num1, Integer num2) {
				if (num1 % 10 > num2%10) {
					return 1;
				} else if (num1 % 10 < num2 % 10)
					return -1;
				return 0;
			}

		});
		for (int a : arr) {
			System.out.println(a);
		}

	}

}
