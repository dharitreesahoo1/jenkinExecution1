package Strings;

public class ReverseASentence {
	public static String reverseASentence(String sentence)
	{
		String[] arr = sentence.split(" ");
		String reverseSentence = "";
		for(int i=arr.length-1;i>=0;i--)
		{
			String word = arr[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseSentence=reverseSentence+reverseWord+" ";
		}
		return reverseSentence;
	}

	public static void main(String[] args) {
		
		String s = reverseASentence("dharitree sahoo");
		System.out.println(s);
	}

}
