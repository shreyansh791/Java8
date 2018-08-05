package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		list.forEach(System.out::println); // printing..

		List list1 = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());

		List list2 = list.stream().filter(i -> i > 1).collect(Collectors.toList());

		List list3 = list.stream().map(i -> i * 2).collect(Collectors.toList());

		System.out.println(list1);

		System.out.println(list2);
		System.out.println(list3);

	}
}
