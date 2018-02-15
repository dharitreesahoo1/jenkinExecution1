package Strings;

public class CheckIfStringContainsOnlyNumber {
	public static boolean checkStringContainsOnlyNumbers(String str)
	{
		boolean status =false;
		for(int i=0;i<str.length();i++)
		{
			char  ch = str.charAt(i);
			if(!Character.isDigit(ch))
			{
				status = false;
				break;
				
			}
			status = true;
		}
	return status;
	}

	public static void main(String[] args) {
		
		boolean status = checkStringContainsOnlyNumbers("123");
		System.out.println(status);
	}

}
