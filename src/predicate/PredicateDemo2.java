package predicate;

import java.util.function.Predicate;

public class PredicateDemo2 {
	public static void main(String[] args) {

		boolean b = checkLen("abcde");
		System.out.println(b);

	}

	public static boolean checkLen(String value) {

		Predicate<String> ref = s -> s.length() > 5;
		ref.negate();
		return ref.test(value);

	}
}
