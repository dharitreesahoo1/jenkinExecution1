package corejavaProgramming;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCount {
	
	public void countDuplicateCh(String str)
	{
		HashMap<Character,Integer>charMap = new HashMap<Character,Integer>();
		char[] arr = str.toCharArray();
		for(Character ch:arr)
		{
			if(charMap.containsKey(ch))
			{
				charMap.put(ch,charMap.get(ch)+1);
			}
			else
			{
				charMap.put(ch,1);
			}
		}
		
		Set<Character> keys = charMap.keySet();
		for(Character key:keys)
		{
			if(charMap.get(key)>1)
			{
				System.out.println(key+"---------------"+charMap.get(key));
			}
		}
	}

	public static void main(String[] args) 
	{
		DuplicateCount obj= new DuplicateCount();
		obj.countDuplicateCh("dharitreesahoo");
	}

}
