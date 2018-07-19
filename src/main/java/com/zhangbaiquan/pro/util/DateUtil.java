package com.zhangbaiquan.pro.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	private static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	public static String getMaxDay(String date) {
		Date date1=null;
		Date date2=null;
		try {
			date1=sdf.parse(date);
			Calendar cal=Calendar.getInstance();
			cal.setTimeInMillis(date1.getTime());
			int maxDay=cal.getActualMaximum(Calendar.DATE);
			cal.set(Calendar.DATE, maxDay);
			date2=cal.getTime();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sdf.format(date2);
	}
	public static Date String2Date(String str){
		Date date=null;
		try {
			date=sdf.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	public static String Date2String(Date date){
		return sdf.format(date);
	}
}
