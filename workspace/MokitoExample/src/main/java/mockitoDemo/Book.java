/**
 * 
 */
package mockitoDemo;

/**
 * @author home
 *
 */
public class Book {

	/**
	 * 
	 */
	int ID;
	String Title;
	int Price;   
	
	public Book(int id, String title, int price) {
		// TODO Auto-generated constructor stub
		ID = id;
		Title = title;
		Price = price;
	
	}
	
	public void Print()
	{		
		System.out.println(Title);
	}
	
	public String  getTitle()
	{
		return Title;
		
	}

}


