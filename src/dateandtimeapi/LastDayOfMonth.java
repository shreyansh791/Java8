package dateandtimeapi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class LastDayOfMonth {
	public static void main(String[] args) {

		// java8
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate end = YearMonth.from(LocalDate.now()).atEndOfMonth();
		String today = dtf.format(end);
		System.out.println(today);

		// java7
		Calendar cal = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String date = df.format(new Date());
		System.out.println(date);
		int res = cal.getActualMaximum(Calendar.DATE);
		System.out.println(date.replace(date.substring(0, 2), "" + res));

	}
}
