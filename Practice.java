package com.prac;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Practice {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		cal.add(Calendar.DATE, 0);
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd"); 
		for (int i = 0; i < 7; i++) {
			Date curd = cal.getTime();
		    System.out.println(sdf.format(curd));
		    cal.add(Calendar.DATE, 1);
		}

	}

}
