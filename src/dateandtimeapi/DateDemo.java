package dateandtimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateDemo {
	public static void main(String[] args) {

		// Java8 API
		System.out.println(new DateDemo().getDate());
		System.out.println(new DateDemo().getDateAndTime());
	}

	private String getDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate now = LocalDate.now();
		LocalDate plusDays = now.plusDays(1);
		LocalDate plusDays1 = plusDays.plusMonths(2);
		String nextDay1 = dtf.format(plusDays1);
		System.out.println("Date after adding months is " + nextDay1);
		String nextDay = dtf.format(plusDays);
		System.out.println("Date after adding one day is " + nextDay);
		String todaysDate = dtf.format(now);
		return todaysDate;
	}

	private String getDateAndTime() {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Today's Date = " + now);

		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("MMddHHmmssSS");

		String format = pattern.format(now);
		System.out.println(format);
		return format;
	}
}
