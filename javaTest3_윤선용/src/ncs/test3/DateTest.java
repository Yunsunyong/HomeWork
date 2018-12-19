package ncs.test3;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateTest {

	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar(1987,4,27);
		Calendar cal1 = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy'년' MM'월' dd'일' E'요일'");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy'년' MM'월' dd'일'");
		
		String str = sdf.format(cal.getTime());
		System.out.println("생일 : " + str);
		
		String st1 = sdf1.format(cal1.getTime());
		System.out.println("현재 : " + st1);
				
		int i = cal1.get(cal1.YEAR) - cal.get(cal.YEAR);
		System.out.println("나이 : " + i +"세");
	}

}
