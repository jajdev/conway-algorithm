package com.jennings.algo;

import java.util.Arrays;
import java.util.List;

public class DayOfWeekFinder {
	static final int[] CENTURY_DOOMSDAY = new int[]{ 2, 0, 5, 3 };
	static final int[] MONTH_DOOMSDAY = new int[]{ -1, 3, 0, 0, 4, 2, 6, 4, 1, 5, 3, 0, 5 };
	static final List<Integer> MONTH_31DAYS = Arrays.asList( 1, 3, 5, 7, 8, 10, 12 );
	static final List<Integer> MONTH_30DAYS = Arrays.asList( 4, 6, 9, 11 );
	
	public void calculateDayOfWeek(int month, int day, int year) {
		if (!isValidDate(month, day, year)) {
			usage();
			return;			
		}
		int result = findAnchorDay(year) + ((year % 100) / 12) + ((year % 100) % 12) + (((year % 100) % 12) / 4);
		result = (result + day - findDoomsdayByMonth(month, isLeapYear(year))) % 7;		
		printDayOfWeek(month, day, year, result);
	}

	/* Anchor Day for each century:
	 * 1500 		1600 		1700 		1800
	 * 1900 		2000 		2100 		2200
	 * 2300 		2400 		2500 		2600
	 * WEDNESDAY 	TUESDAY 	SUNDAY 		FRIDAY
	*/
	public int findAnchorDay(int year) {
		return (CENTURY_DOOMSDAY[(year / 100) % 4]);
	}

	/* Doomsday by Month (Leap Year doomsday in parenthesis)
	 * 1/3 (1/4) 2/28 (2/29) 3/14 4/4 5/9 6/6 7/11 8/8 9/5 10/10 11/7 12/12
	*/
	public int findDoomsdayByMonth(int month, boolean leapYear){
		int doomsdayDate = 0;
		if (leapYear && (month == 1 || month == 2)) {
			doomsdayDate = MONTH_DOOMSDAY[month] + 1;
		} else {
			doomsdayDate = MONTH_DOOMSDAY[month];
		}
		return doomsdayDate;
	}
	
	public boolean isLeapYear(int year){
		if (year % 4 != 0) {
			return false;
		} else if (year % 100 != 0) {
			return true;
		} else if (year % 400 != 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean isValidDate(int month, int day, int year) {
		if (year < 1500 || year > 2999 || month < 1 || month > 13 || day < 1) {
			return false;
		} else if (MONTH_31DAYS.contains(month)) {
			if (day > 31) { return false; }
		} else if (MONTH_30DAYS.contains(month)) {
			if (day > 30) { return false; }
		} else if ((day > 29 && isLeapYear(year)) || (day > 28 && !isLeapYear(year))) {
			return false;
		}
		return true;
	}
	
	public static void printDayOfWeek(int month, int day, int year, int dayOfWeek) {
		System.out.print(month + "-" + day + "-" + year + " is a ");
		switch (dayOfWeek) {
		case 0 :
			System.out.println("Sunday!");
			break;
		case 1 :
			System.out.println("Monday!");
			break;
		case 2 :
			System.out.println("Tuesday!");
			break;
		case 3 :
			System.out.println("Wednesday!");
			break;
		case 4 :
			System.out.println("Thursday!");
			break;
		case 5 :
			System.out.println("Friday!");
			break;
		case 6 :
			System.out.println("Saturday!");
			break;
		default:
			System.out.println("Error!");
			break;
		}
	}
	
	public static void usage() {
		System.out.println("Use a valid date between 1/1/1500 and 12/31/2999");
	}
}
