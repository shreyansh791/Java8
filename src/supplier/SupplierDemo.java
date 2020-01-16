package supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		Supplier<Date> s = () -> new Date();
		Date d3 = s.get();
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());

		Date d2 = new Date();
		System.out.println(d2);
	}
}
