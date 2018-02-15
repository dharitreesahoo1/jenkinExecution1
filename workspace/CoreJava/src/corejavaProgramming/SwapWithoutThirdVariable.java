package corejavaProgramming;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		int a = 30;
		
		int b=40;
		int c;
		a=  a+b;
		b= a-b;
		a= a-b;
		System.out.println(a);
		System.out.println(b);

	}

}
