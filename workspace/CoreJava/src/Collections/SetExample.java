package Collections;

import java.util.HashSet;

import java.util.Iterator;


public class SetExample {

	public static void main(String[] args) {
		HashSet hs =  new HashSet();
		hs.add("A");
		hs.add("AB");
		hs.add("ABC");
		//System.out.println(hs);
		//Since its not a string type set we cant use for loop here.
		Iterator it =hs.iterator();
		for(int i=0;i<hs.size();i++)
		{
			System.out.println(it.next());
		}
		
		HashSet <String>hs1 =  new HashSet<String>();
		hs1.add("A");
		hs1.add("AB");
		hs1.add("ABC");
		//System.out.println(hs);
		//Since its a string type set we can use for loop here.
		for(String s:hs1)
		{
			System.out.println(s);
		}

	}

}
