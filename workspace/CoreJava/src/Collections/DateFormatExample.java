package Collections;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {

	public static void main(String[] args) {
		String str = "8/11/2017";
		Date d = new Date(str);
		SimpleDateFormat dt =  new SimpleDateFormat("MMM/dd/YYYY");
		String formattedDate = dt.format(d);
	System.out.println(formattedDate);

	}

}
