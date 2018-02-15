package mockitoDemo;

import java.awt.List;
import java.util.ArrayList;

public class Library {
	static int  count=1;
	public static ArrayList<Book> BookList = new ArrayList<Book>();

	private static void DisplayBooks() 
	
	{
		for(int i=0;i<BookList.size();i++)
		{
			BookList.get(i).Print();
		}
	}
	public   int getTotalBooks()
	{
		System.out.println(count-1);
		return count-1;
	}

	public  void AddBook(int index, String title, int price)
		{
			BookList.add(new Book(index, title, price));
			count= count+1;
		}
	
	public static void findBookByTitle(String strTitle)
	{
		boolean bln=false;
		for(int i=0;i<BookList.size();i++)
		{
			if (BookList.get(i).getTitle().equals(strTitle))
			{
				System.out.println("Available");
				bln =  true;
				break;
			}
		}
		if(bln == false)
		{
			System.out.println("Not Available");
		}
	}
		
				public static void main(String[] args) {
		
					//AddBook(count-1, "dharitree",300);
					//AddBook(count-1, "dharitree1",300);
					//AddBook(count-1, "dharitree2",300);
					///AddBook(count-1, "dharitree3",300);
					//sAddBook(count-1, "dharitree4",300);
					//DisplayBooks();
					//getTotalBooks();
					//findBookByTitle("dharitree678");
					
				
				}

}
