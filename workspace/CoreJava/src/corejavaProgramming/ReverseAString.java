package corejavaProgramming;

public class ReverseAString {
	
	public static String reverseString(String s)
	{
		String result = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			result = result+s.charAt(i);
		}
		return result;
		
	}
	public static void main(String[] args) {
		String s = reverseString("dharitree");
		System.out.println(s);
		
	}

}
