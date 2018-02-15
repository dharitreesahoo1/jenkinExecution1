import java.util.Calendar;

public class Calender1 {

	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println(cal.HOUR_OF_DAY);
		System.out.println(cal.getTimeZone());
		long time1=System.currentTimeMillis();
		System.out.println(time1-time);
		
		


	}

}
