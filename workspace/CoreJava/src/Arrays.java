
public class Arrays {
	public static void addArrays(int[] ...arr)
	{
		for(int[] eachArray:arr)
		{
			for(int eachItem:eachArray)
			{
				System.out.println(eachItem);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr1= {234,567,654};
		int[] arr2= {237,564,655};
		//String[] arr2 = {"anc","def","gfr"};
		addArrays(arr1,arr2);

	}



}
