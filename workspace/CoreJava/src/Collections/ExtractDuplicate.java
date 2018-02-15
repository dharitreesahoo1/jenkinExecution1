package Collections;

import java.util.HashSet;
import java.util.Set;

public class ExtractDuplicate {
	public static String  extractDuplicateAndPrint(String str)
	{
		
		String ExpectedString = "";
		Set hashSet = new HashSet();
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(!hashSet.add(arr[i]))
			{
				ExpectedString = ExpectedString + arr[i];
			}
		}
		return ExpectedString;

	}

	public static void main(String[] args) {
		String str = extractDuplicateAndPrint("Dharitree sahoo");
		System.out.println(str);
	}

}
