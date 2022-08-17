import java.util.*;
import java.text.*;
public class DateAnswer3 {

	public static void main(String[] args) {
		Date d=new Date();
		Locale locationFrench=new Locale("fr","ch");
		//System.out.println(locationFrench);
		DateFormat french = DateFormat.getDateInstance(DateFormat.FULL, locationFrench);
        System.out.println("The time in French is " + french.format(d));
	}

}
