//TestDate class with main method to check difference b/w 2 dates
package com.cg.datedifference;

import java.util.*;

public class TestDateDiff {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Date d1 = new Date(12, 3, 1956);
		Date d2 = new Date();

		int day, month, year;
		int[] dateGap = new int[3];

		System.out.println("Enter 2nd date(dd-mm-yy --> one by one) for difference");
		System.out.println("Enter day");
		day = scanner.nextInt();
		System.out.println("Enter month");
		month = scanner.nextInt();
		System.out.println("Enter year");
		year = scanner.nextInt();

		d2.setDay(day);
		d2.setMonth(month);
		d2.setYear(year);
		System.out.println(d1 + " " + d2);
		dateGap = d1.diff(d1, d2);
		d1.toString();
		d2.toString();

		System.out.println("Difference b/w dates is ");
		System.out.print(dateGap[0] + " days " + dateGap[1] + " months " + dateGap[2] + " years");

	}

}
