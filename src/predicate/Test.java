package predicate;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		// final HashSet<Character> hs = new HashSet<>();
		final HashMap<Character, Integer> map = new HashMap<>();

		// Predicate<Character> predicate = input -> !hs.contains(input);
		Predicate<Character> predicate = input -> map.get(input) == null;

		String alphabets = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string ");

		String userInput = sc.nextLine();
		sc.close();

		System.out.println("You entered: " + userInput);

		userInput = userInput.replaceAll(" ", "");


		for (Character c : userInput.toCharArray())
			map.put(c, 1);

		System.out.println("Missing Alphabets - ");


		IntStream intStream = alphabets.chars();

		Stream<Character> characterStream = intStream.mapToObj(c -> (char) c);

		characterStream.filter(predicate).forEach(System.out::print);

	}
}