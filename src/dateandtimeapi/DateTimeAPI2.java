package dateandtimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI2 {
	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);
		String s = String.valueOf(date);
		System.out.println(s.substring(4).replaceAll("-", "").replaceAll(":", ""));
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String date1 = date.format(dtf);
		String date6 = dtf.format(date);
		System.out.println(date6);
		System.out.println("date 1   " + date1);

		LocalDateTime date2 = date.plusDays(1);
		String date3 = date2.format(dtf);
		System.out.println("date 3      " + date3);

		LocalDate date4 = LocalDate.parse(date3, dtf);
		System.out.println(date4);

	}
}
