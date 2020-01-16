package lambdaexpression;

import java.util.ArrayList;


public class SortingArrayListWithString {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Shreyansh");
		list.add("Arvind");
		list.add("Sarfaraz");
		list.add("Shahid");
		list.add("Sarjit");
		list.add("Abhishek");
		list.add("Aman");

		list.forEach(i -> System.out.println(i + " "));

		list.sort((i1, i2) -> i1.compareTo(i2)); // ascending order sorting

		list.sort((i1, i2) -> i2.compareTo(i1)); // descendiong order sorting

		System.out.println("list " + list);
		/*
		 * Collections.sort(list);
		 * 
		 * System.out.println(list);
		 */

		// list.sort(Comparator.naturalOrder());

		// System.out.println(list);

		/*
		 * Collections.sort(list, String::compareToIgnoreCase);
		 * 
		 * System.out.println(list);
		 */

	}
}
