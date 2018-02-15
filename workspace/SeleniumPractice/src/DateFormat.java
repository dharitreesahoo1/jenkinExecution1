import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) throws ParseException {
		String selectDate = "10/09/217";
		Date d = new Date(selectDate);
		SimpleDateFormat dt = new SimpleDateFormat("MMM-dd-YYYY");
		String expectedDate = dt.format(d);
		System.out.println(expectedDate);
		
		
	

	}

}
