package Collections;

import java.util.ArrayList;
import java.util.*;

public class SortAString {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("Mumbai");
		lst.add("Delhi");
		lst.add("Kolkata");
		lst.add("Bangalore");
		Collections.sort(lst);
		//Collections.sort(lst, new Comparator<String>() {
/*
			@Override
			public int compare(String str1, String str2) {
				int l1 = str1.length();
				int l2 = str2.length();

				if (l1 > l2) {
					return 1;
				} else if (l1 < l2) {
					return -1;
				}

				return 0;
			}

		});*/

		for (String str : lst) {
			System.out.println(str);
		}

	}

}
