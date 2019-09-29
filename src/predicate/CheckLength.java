package predicate;

import java.util.function.Predicate;

public class CheckLength {
	public static void main(String[] args) {
		printNameStartsWithS("Shreyansh");
	}

	public static void printNameStartsWithS(String name) {
		Predicate<String> p = s -> s.charAt(0) == 'S';
		// p = p.negate(); // Returns a predicate that represents the logical negation
		// of thispredicate
		if (p.test(name)) {
			System.out.println(name);
		}
		else {
			System.out.println("else" + name);
		}
		}
	}

