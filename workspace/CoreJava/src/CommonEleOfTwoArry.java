import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;

public class CommonEleOfTwoArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {234,567,765};
		int[] arr2 = {234,568,768};
		
		HashSet<int[]> set = new HashSet<>(Arrays.asList(arr1));
		HashSet<int[]> set1 = new HashSet<>(Arrays.asList(arr2));
		set.retainAll(set1);
		
		for(int[] e:set)
		{
			System.out.println(e);
		}
	}

}
