package dateandtimeapi;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatterJava8 {
	public static void main(String[] args) {
		String dob = "April 30, 2020";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
		LocalDate parsedDate = LocalDate.parse(dob, dtf);
		DateTimeFormatter reqFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		dob = reqFormat.format(parsedDate);
		System.out.println("Date of Birth - " + dob);
	}
}