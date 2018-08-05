package dateandtimeapi;

import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeAPI2 {
	public static void main(String[] args) {
		// Java8 API
		LocalDateTime date = LocalDateTime.now();
		System.out.println("Today's Date = " + date);

		System.out.println(date.getDayOfMonth());
		System.out.println(date.getMonthValue());

		// representing some date

		LocalDateTime ldt = LocalDateTime.of(1991, Month.AUGUST, 14, 11, 40);

		System.out.println(ldt);

		// ldt = ldt.plusMonths(6);
		ldt = ldt.plusDays(1);
		System.out.println(ldt);

	}
}
