package programs;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {

		
		/*
		 * Date todaydate = new Date(); // System.out.println(todaydate);
		 * 
		 * LocalDateTime
		 * tomorowDAte=LocalDateTime.from(todaydate.toInstant()).plusDays(1);
		 * 
		 * System.out.println(tomorowDAte);
		 * 
		 * 
		 * Calendar c = Calendar.getInstance(); c.setTime(todaydate);
		 * c.add(Calendar.DATE, 7); todaydate=c.getTime();
		 * 
		 * System.out.println(todaydate);
		 * 
		 * SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY"); String date =
		 * sdf.format(todaydate); System.out.println(date.toString());
		 */
		 
		
		startDAte();
		returnDate();
		tomorrowDate();

	}

	public static void startDAte() {
		Date todaydate = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(todaydate);
		c.add(Calendar.DATE, 1);
		todaydate = c.getTime();
		
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		 String date =
		 sdf.format(todaydate); 
		 System.out.println(date);

		

	}
	
	public static void returnDate()
	{
		Date todaydate = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(todaydate);
		c.add(Calendar.DATE, 7);
		todaydate = c.getTime();
		
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		 String date =
		 sdf.format(todaydate); 
		 System.out.println(date);
		

		
	}
	
	public static void tomorrowDate()
	{
		Date todaydate = new Date();
		
		Date tomorrow = new Date(todaydate.getTime()+(1000 * 60 * 60 * 24));
		System.out.println(tomorrow);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		String date=sdf.format(tomorrow);
		System.out.println(date);
		
		
	}

}
