package Strings;

public class TotalNoOfOccurOfGivenCharInaString {
	public static int occurenceOfCharcter(String ch,String str)
	{
		String str1 = str.replaceAll(ch, "");
		int len1 = str.length();
		int len2 = str1.length();
		int no = len1-len2;
		return no;
		
	}

	public static void main(String[] args) {
		
		int No = occurenceOfCharcter("e","Dharitree");
		System.out.println("Occurence of the given character is " + No);

	}

}
