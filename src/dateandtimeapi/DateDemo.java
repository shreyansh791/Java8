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
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd_MM_yyyy");
		LocalDate now = LocalDate.now();
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
