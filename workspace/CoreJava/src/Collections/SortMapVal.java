package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");
		
		Set<Entry<Integer, String>> set = hm.entrySet();
		List <Entry<Integer, String>> lst =  new ArrayList<Entry<Integer, String>>(set);
		Collections.sort(lst,new Comparator<Entry<Integer, String>>(){

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		
		for(Map.Entry<Integer, String> val:lst)
		{
			System.out.println(val.getKey() +"" + val.getValue());
		}
	}
	

}
