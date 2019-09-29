package lambdaexpression;

import java.util.LinkedHashMap;

public class IteratingHashMap {
	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("1", "Shreyansh");
		map.put("2", "Abhishek");
		map.put("3", "Manisha");
		map.put("4", "Aurobinda");
		map.put("5", "Sarfaraz");
		map.put("6", "Shashank");
		
		/*
		 * Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
		 * 
		 * while (iterator.hasNext()) {
		 * 
		 * Map.Entry<String, String> mapEntry = iterator.next();
		 * System.out.println(mapEntry.getKey());
		 * System.out.println(mapEntry.getValue());
		 * 
		 * }
		 */
		// Using Java8 Syntax
		map.remove("1");
		/*
		 * map.entrySet().stream().forEach(entry -> { if (entry.getKey() == "1") {
		 * 
		 * 
		 * } });
		 */
		/*
		 * map.entrySet().stream().forEach(entry -> {
		 * System.out.println(entry.getValue()); });
		 */

		map.entrySet().stream().forEach(entry -> {
			System.out.println(entry.getKey() + "   " + entry.getValue());
		});

	}
}
