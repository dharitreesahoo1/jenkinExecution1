package corejavaProgramming;

public class replaceNumberInString {
	public  static String replaceDigit(String s)
	{
		//Replace numbers with nothing
		//String s1 = s.replaceAll("[0-9]", "");
		//REplace nondigit with nothing
		String s1 = s.replaceAll("[^0-9]", "");
		return s1;
	}
	
	public static void main(String[] args) {
		String str = replaceDigit("dharitree123");
		System.out.println(str);
		
	}

}
