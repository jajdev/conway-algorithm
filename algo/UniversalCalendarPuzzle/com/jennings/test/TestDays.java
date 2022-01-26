package com.jennings.test;

import com.jennings.algo.DayOfWeekFinder;

public class TestDays {
	public static void main(String[] args) {
		DayOfWeekFinder algorithm = new DayOfWeekFinder();
		
		// Positive Test Cases
		algorithm.calculateDayOfWeek(12, 26, 1937); // Sunday
		algorithm.calculateDayOfWeek( 7, 13, 2305); // Thursday
		algorithm.calculateDayOfWeek( 4, 12, 1861); // Friday
		algorithm.calculateDayOfWeek( 7,  4, 1776); // Thursday
		algorithm.calculateDayOfWeek( 7, 20, 1969); // Sunday	
		algorithm.calculateDayOfWeek( 1,  6, 1984); // Friday
		algorithm.calculateDayOfWeek(10, 19, 1902); // Sunday
		algorithm.calculateDayOfWeek( 4,  5, 2063); // Thursday
		algorithm.calculateDayOfWeek( 8, 18, 2154); // Sunday

		// First day of each Month in 2022 Test
		for (int m = 1; m < 13; m++) {
			algorithm.calculateDayOfWeek(m, 1, 2022);
		}
		
		// General Negative Test Cases
		algorithm.calculateDayOfWeek( 12, 31, 1499);
		algorithm.calculateDayOfWeek(  1,  1, 3000);
		algorithm.calculateDayOfWeek(  0, 15, 1999);
		algorithm.calculateDayOfWeek( 13, 31, 2020);
		algorithm.calculateDayOfWeek(  1,  0, 1980);
		
		// Last day of each Month Positive and Negative Test Cases
		algorithm.calculateDayOfWeek(  1, 31, 1980);
		algorithm.calculateDayOfWeek(  1, 32, 1980);		
		algorithm.calculateDayOfWeek(  2, 28, 1981);
		algorithm.calculateDayOfWeek(  2, 29, 1981);
		algorithm.calculateDayOfWeek(  2, 29, 1980);
		algorithm.calculateDayOfWeek(  2, 30, 1980);
		algorithm.calculateDayOfWeek(  3, 31, 1980);
		algorithm.calculateDayOfWeek(  3, 32, 1980);
		algorithm.calculateDayOfWeek(  4, 30, 1980);
		algorithm.calculateDayOfWeek(  4, 31, 1980);
		algorithm.calculateDayOfWeek(  5, 31, 1980);
		algorithm.calculateDayOfWeek(  5, 32, 1980);
		algorithm.calculateDayOfWeek(  6, 30, 1980);
		algorithm.calculateDayOfWeek(  6, 31, 1980);
		algorithm.calculateDayOfWeek(  7, 31, 1980);
		algorithm.calculateDayOfWeek(  7, 32, 1980);
		algorithm.calculateDayOfWeek(  8, 31, 1980);
		algorithm.calculateDayOfWeek(  8, 32, 1980);
		algorithm.calculateDayOfWeek(  9, 30, 1980);
		algorithm.calculateDayOfWeek(  9, 31, 1980);
		algorithm.calculateDayOfWeek( 10, 31, 1980);
		algorithm.calculateDayOfWeek( 10, 32, 1980);		
		algorithm.calculateDayOfWeek( 11, 30, 1980);
		algorithm.calculateDayOfWeek( 11, 31, 1980);
		algorithm.calculateDayOfWeek( 12, 31, 1980);
		algorithm.calculateDayOfWeek( 12, 32, 1980);
	}
}
