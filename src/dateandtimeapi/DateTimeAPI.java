package dateandtimeapi;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeAPI {
	public static void main(String[] args) {
		// Java8 API
		LocalDate date = LocalDate.now();
		System.out.println("Today's Date = " + date);

		int day = date.getDayOfMonth();
		System.out.println("day = " + day);

		int month = date.getMonthValue();
		System.out.println("month = " + month);

		int year = date.getYear();
		System.out.println("year = " + year);

		String completeDate = "" + month + "-" + day + "-" + year;
		System.out.println(completeDate);

		LocalTime time = LocalTime.now();
		System.out.println("Current Time " + time);

		System.out.println(time.getHour());

		System.out.println(time.getMinute());

		System.out.println(time.getSecond());

		System.out.println(time.getNano());


	}
}
