package function;

import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;

public class DoubleFunctionDemo {
	public static void main(String[] args) {
		DoubleFunction<Integer> ref = d -> (int) d * 10;
		System.out.println(ref.apply(10.76));
		DoubleToIntFunction ref1 = d -> (int) d * 10;
		System.out.println(ref1.applyAsInt(5.76));
	}
}
