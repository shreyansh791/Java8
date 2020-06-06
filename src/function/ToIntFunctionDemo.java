package function;

import java.util.function.IntFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class ToIntFunctionDemo {
	public static void main(String[] args) {
		ToIntFunction<String> function = i -> i.length();

		System.out.println(function.applyAsInt("Shreyansh"));

		ToDoubleFunction<Integer> function1 = i -> Math.sqrt(i);

		System.out.println(function1.applyAsDouble(9));

		IntFunction<String> function2 = i -> String.valueOf(i * 10);
		System.out.println(function2.apply(10));
	}
}
