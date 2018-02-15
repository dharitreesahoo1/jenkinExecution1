package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList lst = new ArrayList();
		lst.add(123);
		lst.add(345);
		lst.add(678);
		lst.add(654);
		//Collections.sort(lst);
		//Collections.reverse(lst);
		ListIterator it = lst.listIterator();
		System.out.println();
	Enumeration e = Collections.enumeration(lst);
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
		
		

	}

}
