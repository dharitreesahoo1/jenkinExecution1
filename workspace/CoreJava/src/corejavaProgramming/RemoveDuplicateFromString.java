package corejavaProgramming;

public class RemoveDuplicateFromString {
	public static String removeDuplicate(String str)
	{
		String ExpectedStr = "";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(!ExpectedStr.contains(String.valueOf(ch)))
			{
				ExpectedStr = ExpectedStr+String.valueOf(ch);
			}
		}
		return ExpectedStr;
			
	}

	public static void main(String[] args) {
		String str = removeDuplicate("Dharitree");
		System.out.println(str);

	}

}
