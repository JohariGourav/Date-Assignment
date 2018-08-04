//Date class to accept 2 dates and compute the difference
package com.cg.datedifference;

import java.time.LocalDate;
import java.time.Period;

public class Date {

	private int day, month, year;

	// C'tor with args
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Date() {

	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	// method to check whether a date is smaller than other
	public boolean isSmaller(Date date) {

		if (date.year < year)
			return true;
		else if (date.year == year) {
			if (date.month < month)
				return true;
			else if (date.month == month) {
				if (date.day < day)
					return true;
				else
					return false;
			} else
				return false;
		} else
			return false;
	}

	// method to find out the difference of days,months and years in 2 dates
	public int[] diff(Date d1, Date d2) {

		int[] dateGap = new int[3];

		LocalDate previous = LocalDate.of(d1.year, d1.month, d1.day);
		System.out.println(previous);
		LocalDate current = LocalDate.of(d2.year, d2.month, d2.day);
		System.out.println(current);

		if (d1.year > d2.year) {
			Period age = Period.between(current, previous);
			dateGap[0] = age.getDays();
			dateGap[1] = age.getMonths();
			dateGap[2] = age.getYears();
		}

		else {
			Period age = Period.between(previous, current);
			dateGap[0] = age.getDays();
			dateGap[1] = age.getMonths();
			dateGap[2] = age.getYears();
		}
		return dateGap;
	}

}
