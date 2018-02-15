package Strings;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "d@@haritree%^&**sahoo";
		char[] arr = str.toCharArray();
		
		int l= 0;
		int r=  arr.length-1;
		
		while(l<r)
		{
			if(!Character.isAlphabetic(arr[l]))
			{
				l++;
			}else if(!Character.isAlphabetic(arr[r]))
			{
				r--;
			}else{
				char temp =  arr[l];
				arr[l] =  arr[r];
				arr[r]=temp;
				l++;
				r--;
			}
		}
		
		System.out.println(new String(arr));
		
		
	}
	
}
