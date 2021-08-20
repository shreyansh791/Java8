package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumofList {
	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		int sum = integerList.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum is " + sum);

		Integer sumUsingReduce = integerList.stream().reduce(0, (a, b) -> (a + b));
		System.out.println("Sum is " + sumUsingReduce);

		Integer sumUsingReduce1 = integerList.stream().reduce(0, Integer::sum);
		System.out.println("Sum is " + sumUsingReduce1);

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		Integer sum1 = integers.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println("Sum is " + sum1);
	}
}
