package lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortingArrayList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(20);
		list.add(14);
		list.add(23);
		list.add(11);
		list.add(98);
		// list.removeIf(i -> i % 2 == 0);
		System.out.println(list);
		// descending order
		Collections.sort(list, (i1, i2) -> (i1 > i2) ? 1 : (i1 < i2) ? -1 : 0);
		System.out.println(list);
	}
}
