package Strings;

import java.util.HashMap;

public class ExtractDuplicateCharacterFromString {

	public static void main(String[] args) {
		String str = "Dharitree sahooooo";
		HashMap<Character,Integer>map= new HashMap<Character,Integer>();
		char[] arr = str.toCharArray();
		for(Character ch:arr)
		{
			if (map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}else
			{
				map.put(ch,1);
			}
		}
		System.out.println(map);
		for(Character key1:map.keySet())
		{
			if(map.get(key1) > 1)
			{
				System.out.println("Character  " +key1+"-------------"+"No of time present "+map.get(key1));
			}
			
		}

	}

}
