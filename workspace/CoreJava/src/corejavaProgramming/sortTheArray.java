package corejavaProgramming;

public class sortTheArray {

	public static void main(String[] args) {
		int []arr = {2,4,8,9,2};
		int temp = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
		

}
}

