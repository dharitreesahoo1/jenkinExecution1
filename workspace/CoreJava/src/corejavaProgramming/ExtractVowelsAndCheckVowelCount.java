package corejavaProgramming;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

public class ExtractVowelsAndCheckVowelCount {
	public static String extractVowel(String str)
	{
		String vowels = "aeiou";
		String vowelsPresent = "";
		char[] arr = str.toCharArray();
		for(char ch:arr)
		{
		if(vowels.indexOf(ch)>=0)
		{
			vowelsPresent =vowelsPresent+ch;
		}
		}
		return vowelsPresent;
		
	}

	public static void main(String[] args) {
		String s = extractVowel("Dharitree");
		System.out.println(s);

	}

}
