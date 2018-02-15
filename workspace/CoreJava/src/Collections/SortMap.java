package Collections;

import java.util.*;
import java.util.Map.Entry;

public class SortMap {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");

		Set<Entry<Integer, String>> set = hm.entrySet();
		List<Entry<Integer, String>> lst = new ArrayList<Entry<Integer, String>>(set);

		Collections.sort(lst, new Comparator<Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> val1, Entry<Integer, String> val2) {

				return val1.getValue().compareTo(val2.getValue());
			}

		});

		Map<Integer, String> result = new LinkedHashMap<Integer, String>();
		for (Entry<Integer, String> entry : lst) {
			result.put(entry.getKey(), entry.getValue());
		}
		
		for(Map.Entry<Integer,String> entry:result.entrySet())
		{
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
	
	

}
