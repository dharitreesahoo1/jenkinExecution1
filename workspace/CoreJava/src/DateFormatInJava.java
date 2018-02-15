import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatInJava {

	public static void main(String[] args) {
		String d = "August/04/17";
		Date todayDate =  new Date(d);
		//System.out.println(todayDate);
		SimpleDateFormat dt = new SimpleDateFormat("MM/dd/yyyy");
		String formattedDate = dt.format(todayDate);
		System.out.println(formattedDate);


	}

}
