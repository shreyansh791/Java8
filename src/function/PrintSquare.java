package function;

import java.util.function.IntFunction;

public class PrintSquare {
	public static void main(String[] args) {
		// Integer is return type
		IntFunction<Integer> function = i -> i * i;

		System.out.println(function.apply(10));

	}
}
