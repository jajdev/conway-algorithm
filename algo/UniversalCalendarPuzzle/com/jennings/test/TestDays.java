package com.jennings.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.jennings.algo.DayOfWeekFinder;

public class TestDays {
	
	private static DayOfWeekFinder algorithm;
	
	@BeforeAll
	public static void beforeAll() {
		algorithm = new DayOfWeekFinder();
	}
	
	@Test
	@DisplayName("Positive Test Cases")
	public void calculateDayOfWeek_PositiveTestCases() {
		Assertions.assertEquals(algorithm.calculateDayOfWeek(12, 26, 1937), 0);
		Assertions.assertEquals(algorithm.calculateDayOfWeek( 7, 13, 2305), 4);
		Assertions.assertEquals(algorithm.calculateDayOfWeek( 4, 12, 1861), 5); // Friday
		Assertions.assertEquals(algorithm.calculateDayOfWeek( 7,  4, 1776), 4); // Thursday
		Assertions.assertEquals(algorithm.calculateDayOfWeek( 7, 20, 1969), 0); // Sunday	
		Assertions.assertEquals(algorithm.calculateDayOfWeek( 1,  6, 1984), 5); // Friday
		Assertions.assertEquals(algorithm.calculateDayOfWeek(10, 19, 1902), 0); // Sunday
		Assertions.assertEquals(algorithm.calculateDayOfWeek( 4,  5, 2063), 4); // Thursday
		Assertions.assertEquals(algorithm.calculateDayOfWeek( 8, 18, 2154), 0); // Sunday
	}
	
	@Test
	@DisplayName("Negative Test Cases")
	public void calculateDayOfWeek_NegativeTestCases() {
		Assertions.assertEquals(algorithm.calculateDayOfWeek( 12, 31, 1499), -1);
		Assertions.assertEquals(algorithm.calculateDayOfWeek(  1,  1, 3000), -1);
		Assertions.assertEquals(algorithm.calculateDayOfWeek(  0, 15, 1999), -1);
		Assertions.assertEquals(algorithm.calculateDayOfWeek( 13, 31, 2020), -1);
		Assertions.assertEquals(algorithm.calculateDayOfWeek(  1,  0, 1980), -1);
	}
	
	@Test
	@DisplayName("Test First Day of each Month in 2022")
	public void calculateDayOfWeek_FirstDayOfEachMonth(){
		int[] firstDayofEachMonth = new int[13];
		for (int m = 1; m < 13; m++) {
			firstDayofEachMonth[m] = algorithm.calculateDayOfWeek(m, 1, 2022);
		}
		Assertions.assertEquals(firstDayofEachMonth[1], 6);
		Assertions.assertEquals(firstDayofEachMonth[2], 2);
		Assertions.assertEquals(firstDayofEachMonth[3], 2);
		Assertions.assertEquals(firstDayofEachMonth[4], 5);
		Assertions.assertEquals(firstDayofEachMonth[5], 0);
		Assertions.assertEquals(firstDayofEachMonth[6], 3);
		Assertions.assertEquals(firstDayofEachMonth[7], 5);
		Assertions.assertEquals(firstDayofEachMonth[8], 1);
		Assertions.assertEquals(firstDayofEachMonth[9], 4);
		Assertions.assertEquals(firstDayofEachMonth[10], 6);
		Assertions.assertEquals(firstDayofEachMonth[11], 2);
		Assertions.assertEquals(firstDayofEachMonth[12], 4);
	}
	
	@Test
	@DisplayName("Test Last Day of each Month in 1980")
	public void calculateDayOfWeek_LastDayOfEachMonth() {
		Assertions.assertEquals(algorithm.calculateDayOfWeek(  1, 31, 1980), 4);
		Assertions.assertEquals(algorithm.calculateDayOfWeek(  1, 32, 1980), -1);		
		Assertions.assertEquals(algorithm.calculateDayOfWeek(  2, 28, 1981), 6);
		Assertions.assertEquals(algorithm.calculateDayOfWeek(  2, 29, 1981), -1);
		Assertions.assertEquals(algorithm.calculateDayOfWeek(  2, 29, 1980), 5);
		Assertions.assertEquals(algorithm.calculateDayOfWeek(  2, 30, 1980), -1);
		Assertions.assertEquals(algorithm.calculateDayOfWeek(  3, 31, 1980), 1);
		Assertions.assertEquals(algorithm.calculateDayOfWeek(  3, 32, 1980), -1);
		Assertions.assertEquals(algorithm.calculateDayOfWeek(  4, 30, 1980), 3);
		Assertions.assertEquals(algorithm.calculateDayOfWeek(  4, 31, 1980), -1);
		Assertions.assertEquals(algorithm.calculateDayOfWeek(  5, 31, 1980), 6);
		Assertions.assertEquals(algorithm.calculateDayOfWeek(  5, 32, 1980), -1);
		Assertions.assertEquals(algorithm.calculateDayOfWeek(  6, 30, 1980), 1);
		Assertions.assertEquals(algorithm.calculateDayOfWeek(  6, 31, 1980), -1);
		Assertions.assertEquals(algorithm.calculateDayOfWeek(  7, 31, 1980), 4);
		Assertions.assertEquals(algorithm.calculateDayOfWeek(  7, 32, 1980), -1);
		Assertions.assertEquals(algorithm.calculateDayOfWeek(  8, 31, 1980), 0);
		Assertions.assertEquals(algorithm.calculateDayOfWeek(  8, 32, 1980), -1);
		Assertions.assertEquals(algorithm.calculateDayOfWeek(  9, 30, 1980), 2);
		Assertions.assertEquals(algorithm.calculateDayOfWeek(  9, 31, 1980), -1);
		Assertions.assertEquals(algorithm.calculateDayOfWeek( 10, 31, 1980), 5);
		Assertions.assertEquals(algorithm.calculateDayOfWeek( 10, 32, 1980), -1);		
		Assertions.assertEquals(algorithm.calculateDayOfWeek( 11, 30, 1980), 0);
		Assertions.assertEquals(algorithm.calculateDayOfWeek( 11, 31, 1980), -1);
		Assertions.assertEquals(algorithm.calculateDayOfWeek( 12, 31, 1980), 3);
		Assertions.assertEquals(algorithm.calculateDayOfWeek( 12, 32, 1980), -1);
	}
}
