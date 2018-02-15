package Collections;

import java.util.HashMap;

public class FirstNonrepeatedCharacterInAString {

	public static void main(String[] args) {
		String str = "MissesDDharitreeM qsahoo";
		char[] arr = str.toCharArray();
		HashMap<Character,Integer>map =  new HashMap<Character,Integer>();
		for(Character ch:arr)
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}else{
				map.put(ch,1);
			}
		
		}
		for(Character ch:arr)
		{
			if(map.get(ch)==1)
			{
				System.out.println(ch);
				break;
			}
		}
		

	}

}
