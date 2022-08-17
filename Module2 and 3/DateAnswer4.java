import java.time.format.*;
import java.time.*;
public class DateAnswer4 {

	public static void main(String[] args) {
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println("Before fomatting the day is "+ldt.toString());
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");
		String formateofdate=ldt.format(dtf);
		System.out.println("First two digits year then two digits month then two digits of date and in time hours then minutes and seconds "+formateofdate);
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formateofdate2=ldt.format(dtf2);
		System.out.println("First four digits year then two digits month then two digits of date and in time hours then minutes and seconds "+formateofdate2);
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd-MM-yyyy mm:HH:ss");
		String formateofdate3=ldt.format(dtf3);
		System.out.println("First two digits for date then two digits for month then four digits for year and in time minutes then hour and seconds "+formateofdate3);
	}

}
