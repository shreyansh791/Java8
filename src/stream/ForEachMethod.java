package stream;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethod {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		/* list.forEach(i -> System.out.println(i)); */
		list.stream().map(i -> i * 2).forEach(System.out::println);
	}
}
