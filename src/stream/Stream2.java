package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {
	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		list.add("Shreyansh");
		list.add("Sarfaraz");
		list.add("Shahid");
		list.add("Arbind");
		list.add("Venkatesh");

		// forEach()

		list.forEach(i -> System.out.println(i));

		// filter()
		list = list.stream().filter(i -> i.length() > 7).collect(Collectors.toList());
		System.out.println(list.size());



		// count()
		long count = list.stream().filter(i -> i.length() > 7).count();
		System.out.println(count);

		// sorted()
		list = list.stream().filter(i -> i.length() > 7).sorted().collect(Collectors.toList());

		System.out.println(list);

	}
}
