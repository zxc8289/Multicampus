package test5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainClass {

	public static void main(String[] args) {
		SimpleDateFormat Date1 = new SimpleDateFormat ("yyyy/MM/dd");
		   Calendar calendar = Calendar.getInstance();
		   Date nowDate =calendar.getTime();
		   String formattedDate = Date1.format(nowDate);// 현재 시간
		   System.out.println(formattedDate);
	}

}
