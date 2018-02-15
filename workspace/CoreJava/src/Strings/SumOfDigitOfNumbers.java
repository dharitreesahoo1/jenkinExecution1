package Strings;

public class SumOfDigitOfNumbers {

	public static void main(String[] args) {
		String str = "Rama10isgoing6Tomarket56";
		String s1 = str.replaceAll("\\D", "");
		System.out.println(s1);
		int number = Integer.parseInt(s1);
		int sum=0;
		while(number>0)
		{
			int r = number%10;
			sum =sum+r;
			number = number/10;
			
		}
		System.out.println(sum);
	
		

	}

}
