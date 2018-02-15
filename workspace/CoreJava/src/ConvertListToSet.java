import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertListToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst= new ArrayList<Integer>();
		lst.add(1);
		lst.add(1);
		lst.add(1);
		lst.add(4);
		lst.add(2);
		Set<Integer> st1=  new HashSet<Integer>(lst);
		System.out.println(st1);
		

	}

}
