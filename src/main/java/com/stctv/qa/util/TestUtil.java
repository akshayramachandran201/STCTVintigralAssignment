package com.stctv.qa.util;

import java.text.DecimalFormat;

public class TestUtil {
	
	public static long PAGE_LOAD_TIMEOUT = 60;
	public static long IMPLICIT_WAIT = 60;
	public static String LOGINPAGETITLE = "stc tv - Watch Online movies, series & live TV | Enjoy Free Trial";
	

	public static String convertTodecimal(float number) {

		

		DecimalFormat df = new DecimalFormat("#0.0");

		String fnumber = df.format(number);
		
		return fnumber;

		}
}
