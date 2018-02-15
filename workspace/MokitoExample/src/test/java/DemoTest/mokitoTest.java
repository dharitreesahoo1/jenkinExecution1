package DemoTest;

import org.junit.Assert;
import org.junit.Test;

import mockitoDemo.Library;

public class mokitoTest {
	
		@Test
		public void checkAddBook()
		{
			Library lib = new Library();
			int currentbooksCount = lib.getTotalBooks();
			lib.AddBook(currentbooksCount-1, "Katinkar C++", 500);
			int currentbooksCountNew = lib.getTotalBooks();
			Assert.assertNotEquals(currentbooksCount, currentbooksCountNew);
			
		}
		@Test
		public void checkDeleteBook()
		{
			
		}
		


}
