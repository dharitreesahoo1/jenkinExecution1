
public class DeleteDuplicate {

	public static void main(String[] args) {
		String s = "dharitree";
		String sNew = "";
		char[] arr = s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			char ch =  arr[i];
			if(sNew.indexOf(ch)<1)
			{
				sNew =  sNew + ch;
			}
		}
		System.out.println(sNew);
	}

}
