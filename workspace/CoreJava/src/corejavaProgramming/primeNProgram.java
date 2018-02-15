package corejavaProgramming;

public class primeNProgram {

	public static void main(String[] args) {
		int n=17;
		int m=n/2;
		boolean flag=true;
		for(int i=2;i<m;i++)
		{
			if(n%i==0)
			{
				System.out.println("Number is not prime");
				flag=false;
				break;
				
			}
		}
		if(flag==true)
		{
			System.out.println("Number is prime");
		}
		

	}

}
