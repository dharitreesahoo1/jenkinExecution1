package Strings;

public class ReverseStringWithoutLoop {

	public static void main(String[] args) {
		String str = "Dharitree";
		char[] arr = str.toCharArray();
		char temp;
		for(int i=0;i<str.length()/2;i++)
		{
			temp = arr[i];
			arr[i] = arr[str.length()-i-1];
			arr[str.length()-i-1] = temp;
		}
		System.out.println(arr);
	}

}
