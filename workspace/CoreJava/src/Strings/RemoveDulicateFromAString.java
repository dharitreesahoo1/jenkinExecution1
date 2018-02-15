package Strings;

public class RemoveDulicateFromAString {
//This program finds the duplicate character and print once.
//eg. I/P->Bangalore op->Banglore
	public static void main(String[] args) {
		String str = "Bangalore";
		String ExpectedString = "";
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			char ch = arr[i];
			if(!(ExpectedString.indexOf(ch)>=0))
			{
				ExpectedString=ExpectedString+ch;
			}
				
		}
		
		System.out.println(ExpectedString);

	}

}
